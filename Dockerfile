# Use Maven to build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use a lightweight JDK image for running the app
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the built JAR from the builder image
COPY --from=build /app/target/salary-budget-app-0.0.1-SNAPSHOT.jar app.jar

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
