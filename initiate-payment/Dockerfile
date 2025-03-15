# Étape 1 : Construction de l'application
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app

# Copier les fichiers nécessaires
COPY pom.xml ./
COPY src ./src

# Construire l'application
RUN mvn clean package -DskipTests

# Étape 2 : Exécution de l'application avec une image légère
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copier le JAR depuis l'étape de build
COPY --from=builder /app/target/initiate-payment-*.jar app.jar

# Exposer le port
EXPOSE 8080

# Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
