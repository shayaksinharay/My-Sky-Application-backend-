# Use Eclipse Temurin Java 21 as base image
FROM eclipse-temurin:21-jdk

# Set working directory inside the container
WORKDIR /app

# Copy Maven project files
COPY pom.xml .
COPY src ./src

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the application
RUN mvn clean package -DskipTests

# Expose port (change if your Spring Boot app uses a different port)
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "target/My-Sky-Application-backend-0.0.1-SNAPSHOT.jar"]