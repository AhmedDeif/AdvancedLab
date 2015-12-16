class SessionsController < ApplicationController

	# def create
 # 		user = User.from_omniauth(env["omniauth.auth"])
 # 		session[:user_id] = user.id
 # 		redirect_to root_path
 # 	end

 	def destroy
 		session[:user_id] = nil 
 		redirect_to root_path
 	end

 	def create
 		@user = User.check_if_present(token)
 		session[:user_token] = @user.token
 	end

end