json.array!(@events) do |event|
  json.extract! event, :id, :title, :description, :committee, :place, :privacy, :time, :endtime
  json.url event_url(event, format: :json)
end
