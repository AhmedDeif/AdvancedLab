class CreateEvents < ActiveRecord::Migration
  def change
    create_table :events do |t|
      t.string :title
      t.string :description
      t.string :committee
      t.string :place
      t.string :privacy
      t.timestamp :time
      t.timestamp :endtime

      t.timestamps null: false
    end
  end
end
