first i create the spring boot application.
then i used maven build tool to create the jar application.
then i create the docker file to create the docker image.
to create the docker image docker build -t mydockerimagez:v1 .
then check the docker images
then docker run -d -p 8000:8888 mydockerimagez:v1
then we can login into the docker cantioner by using the  belwo commands 
docker -it exec mynameofcontainer bash.
