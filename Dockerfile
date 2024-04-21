FROM openjdk:17-jdk-slim
MAINTAINER AkhilReddy
COPY target/docker-0.0.1-SNAPSHOT.jar /home/docker-0.0.1-SNAPSHOT.jar
EXPOSE 8888
CMD ["java","-jar","/home/docker-0.0.1-SNAPSHOT.jar"]