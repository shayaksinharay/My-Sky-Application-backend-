# Use Maven to build the app
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the jar (skip tests to speed up)
RUN mvn clean package -DskipTests

# Use a lightweight Java runtime
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the built jar file from builder stage
COPY --from=build /app/target/skyapp-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose port (commonly 8080)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
