class UserController < ApplicationController
	def getAllTasks
		userID= session[:user_id]
		@tasks= Task.where(assignee_id: => userID)
	end
	def new
		    @user = User.new
	end
	def edit
  end

  def create
    @user = User.new(task_params)

    respond_to do |format|
      if @task.save
        format.html { redirect_to @task, notice: 'User was successfully created.' }
        format.json { render :show, status: :created, location: @task }
      else
        format.html { render :new }
        format.json { render json: @task.errors, status: :unprocessable_entity }
      end
    end
  end

  def update
    respond_to do |format|
      if @user.update(task_params)
        format.html { redirect_to @user, notice: 'User was successfully updated.' }
        format.json { render :show, status: :ok, location: @task }
      else
        format.html { render :edit }
        format.json { render json: @task.errors, status: :unprocessable_entity }
      end
    end
  end


end
