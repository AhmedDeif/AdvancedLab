class UserController < ApplicationController
before_action :set_task, only: [:show, :edit, :update, :destroy]
protect_from_forgery with: :null_session


def getAllTasks
    userID= User.find(params[:id])
    @tasks= Task.where(assignee_id: => userID.id)
end

	def new
		    @user = User.new
	end
	def edit
  end
  def show
  end
  # get the id of the user you want to add to the current committee.
  def addToCommittee
    # user_id = the id of the user I want to add.
    userx = User.find(params[:user_id])
    #inherit the same committee from the user who added that person.Known for his id ; :id
    userx.committee = User.find(params[:id]).committee
  end

  def removeFromCommittee
    userx = User.find(params[:user_id])
    userx.committee = nil
  end
  
  def create
    @user = User.new(task_params)
 
    respond_to do |format|
      if @user.save
        format.html { redirect_to @user, notice: 'User was successfully created.' }
        format.json { render :show, status: :created, location: @user }
      else
        format.html { render :new }
        format.json { render json: @user.errors, status: :unprocessable_entity }
      end
    end
  end

  def update
    respond_to do |format|
      if @user.update(task_params)
        format.html { redirect_to @user, notice: 'User was successfully updated.' }
        format.json { render :show, status: :ok, location: @user }
      else
        format.html { render :edit }
        format.json { render json: @user.errors, status: :unprocessable_entity }
      end
    end
  end

# DELETE /tasks/1
  # DELETE /tasks/1.json
  def destroy
    @user.destroy
    respond_to do |format|
      format.html { redirect_to tasks_url, notice: 'user was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  def getCommitteeTasks
    @committeeName = User.find(params[:id]).committee
    @users = User.all
    @users.each do |user|
      if user.committee == @committeeName
        user.getAllTasks
      end
  end

  
end
