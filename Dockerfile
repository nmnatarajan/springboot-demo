FROM openjdk:8-jre-alpine

EXPOSE 8080
#
COPY ./build/libs/springboot-demo-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "springboot-demo-1.0-SNAPSHOT.jar"]