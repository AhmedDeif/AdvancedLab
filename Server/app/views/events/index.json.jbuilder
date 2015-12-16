json.array!(@events) do |event|
  json.extract! event, :id, :title, :description, :place, :time
  json.url event_url(event, format: :json)
end
