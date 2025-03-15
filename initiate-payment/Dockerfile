# Use an official Maven image as a parent image
FROM openjdk:21-jdk-slim

# Copy everything...
COPY . ./

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/initiate-payment/target/initiate-payment-1.0-SNAPSHOT.jar"]