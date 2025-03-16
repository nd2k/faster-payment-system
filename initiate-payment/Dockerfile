# Étape 1 : Construction de l'application
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY /library/pom.xml ./library/pom.xml
COPY /initiate-payment/pom.xml ./initiate-payment/pom.xml
RUN mvn dependency:go-offline
COPY /initiate-payment/src/ ./src/
RUN mvn clean package -DskipTests=true

FROM eclipse-temurin:21
RUN mkdir /app
COPY --from=builder /app/target/*.jar /app/initiate-payment.jar
ENV SERVER_PORT=8080
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/initiate-payment.jar"]


# Copier le pom.xml principal et les modules nécessaires
#COPY pom.xml .
#COPY library library
#COPY initiate-payment/pom.xml initiate-payment/pom.xml
#COPY initiate-payment/src initiate-payment/src
#COPY initiate-payment/target/initiate-payment-1.0-SNAPSHOT.jar app/initiate-payment.jar

# Construire uniquement le module initiate-payment (et ses dépendances)
#RUN mvn clean package -pl initiate-payment -am -DskipTests

# Étape 2 : Exécution de l'application avec une image légère
#FROM eclipse-temurin:21-jre
#WORKDIR /app

# Copier le JAR depuis l'étape de build
#COPY --from=builder /app/initiate-payment/target/initiate-payment-*.jar app.jar

# Exposer le port
#EXPOSE 8080

# Lancer l'application
#ENTRYPOINT ["java", "-jar", "/app/initiate-payment.jar"]
