class CreateUsers < ActiveRecord::Migration
  def change
    create_table :users do |t|
      t.string :provider
      t.string :uid
      t.string :name
      t.string :oauth_token
      t.datetime :oauth_expires_at
      t.string :email
      t.time :dateOfBirth
      t.string :country
      t.string :committee
      t.string :city
      t.string :gender
      t.timestamps null: false
    end
  end
end
