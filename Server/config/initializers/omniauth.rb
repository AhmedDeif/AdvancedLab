OmniAuth.config.logger = Rails.logger

Rails.application.config.middleware.use OmniAuth::Builder do
  provider :facebook, '1700342830179848', 'e2871810f5a485b7e078d79c46269e62', {:client_options => {:ssl => {:ca_file => Rails.root.join("cacert.pem").to_s}}}
end