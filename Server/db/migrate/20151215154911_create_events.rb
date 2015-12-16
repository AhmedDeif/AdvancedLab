class CreateEvents < ActiveRecord::Migration
  def change
    create_table :events do |t|
      t.string :title
      t.string :description
      t.string :place
      t.timestamp :time
      t.integer :creator_id
      t.foreign_key :creator_id
      t.timestamps null: false
    end
  end
end
