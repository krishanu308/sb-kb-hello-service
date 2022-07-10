FROM openjdk:11

EXPOSE 9002

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} hello-service.jar

ENTRYPOINT ["java","-jar","/hello-service.jar"]