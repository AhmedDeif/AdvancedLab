class User < ActiveRecord::Base

  has_many :has_tasks_assigned, :class_name => 'Task', :foreign_key => 'assignee_id', dependent: :destroy
    has_many :assigned_tasks_to, :class_name => 'Task', :foreign_key => 'assigner_id', dependent: :destroy
    has_many :created_by, :class_name => 'Event', :foreign_key => 'creator_id', dependent: :destroy
    has_many :comments , dependent: :destroy
    
  def self.from_omniauth(auth)
    where(provider: auth.provider, uid: auth.uid).first_or_initialize do |user|
      user.provider = auth.provider
      user.uid = auth.uid
      user.name = auth.info.name
      user.oauth_token = auth.credentials.token
      user.oauth_expires_at = Time.at(auth.credentials.expires_at)
      user.save!
    end
  end

  def self.authenticate(fbtoken)

      user = FbGraph2::User.me(fbtoken).fetch(fields: [:name,:email, :fname, :lname, :id , :picture, :gender])
      uid = user.identifier
      name = user.name
      fname = user.fname
      lname = user.lname
      email = user.email
      photo = user.picture.url
      gender = user.gender

      my_user = find_by(uid: uid)
      
      if my_user.present?
        my_user
      else
        create(
        provider: "facebook",
        uid: uid,
        name: name,
        email: email,
        photo: picture
         # first_name: first_name
         # last_name: last_name
         # username: username
         # gender:gender
         # location: location
        )
        find_by(uid: uid)
      end
    end

    
    def self.check_if_present(token)
      my_user = find_by(token: token)
      if my_user.present?
        my_user
      else
        create(
          token: token
          )
      end
    end

    
    def self.sign_in_from_omniauth(auth)
    user = find_by(provider: auth['provider'], uid: auth['uid'])

    if user.nil?
      user = create_user_from_omniauth(auth)
    end

    user
  end

    def self.create_user_from_omniauth(auth)
    create(
      provider: auth['provider'],
      uid: auth['uid'],
      name: auth['info']['name'],
      email: auth['info']['email'],
      photo: auth['info']['image'],
      first_name: auth['info']['first_name'],
      last_name: auth['info']['last_name'],
      username: auth['info']['nickname'],
      gender: auth['info']['gender'],
      location: auth['info']['locale']
    )
  end
end