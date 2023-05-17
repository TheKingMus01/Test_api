# Set the base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file to the container
COPY target/test_api-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot application will be running on
EXPOSE 8080

# Set the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
