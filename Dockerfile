FROM openjdk:11-jre-slim
COPY target/loan-application-service-1.0-SNAPSHOT.jar loan-application-service.jar
ENTRYPOINT ["java", "-jar", "/loan-application-service.jar"]