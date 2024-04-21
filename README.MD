#first i create the spring boot application.
#then i used maven build tool to create the jar application.
#then i create the docker file to create the docker image.
#to create the docker image docker build -t mydockerimagez:v1 .
#then check the docker images
#then docker run -d -p 8000:8888 mydockerimagez:v1
#then we can login into the docker cantioner by using the  belwo commands 
#docker -it exec mynameofcontainer bash.


How to use Java spring boot application with github actions , AWS coodebuild , ECR and ECS.

#First we need to create  the spring boot application.
#Then push it into the git hub repo.
#We need to create the ECR.
#We need to add Dockerfile in the root dic and buildspec.yml in the root dic.
#Then we need to create the AWS Code build. (I the service role we need to give the permission as EC2container poweraccess).
#The we need to create the ECS.
1st we need to create the task and create the culster , then create the excute the task.
