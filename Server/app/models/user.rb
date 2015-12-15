class User < ActiveRecord::Base

  has_many :has_tasks_assigned, :class_name => 'Task', :foreign_key => 'assignee_id', dependent: :destroy
    has_many :assigned_tasks_to, :class_name => 'Task', :foreign_key => 'assigner_id', dependent: :destroy
    has_many :created_by, :class_name => 'Event', :foreign_key => 'creator_id', dependent: :destroy
    
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
end