FROM openjdk:17-ea-jdk

COPY ./build/libs/SpringDocker-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 5503

ENTRYPOINT ["java", "-jar", "/app.jar"]