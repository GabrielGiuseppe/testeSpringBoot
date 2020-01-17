FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade
RUN mkdir -p /usr/local/dockerize
ADD teste-0.0.1-SNAPSHOT.jar /usr/local/dockerize/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh