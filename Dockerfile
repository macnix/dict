FROM openjdk:8-jdk-alpine
ADD target/dict.jar dict.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dict.jar"]