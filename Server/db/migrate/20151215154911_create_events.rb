class CreateEvents < ActiveRecord::Migration
  def change
    create_table :events do |t|
      t.string :title
      t.string :description
      t.string :place
      t.timestamp :time

      t.timestamps null: false
    end
  end
end
