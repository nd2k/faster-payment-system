# Étape 1 : Construction de l'application
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app

# Copier uniquement le module initiate-payment et la config parent
COPY ../pom.xml ./pom.xml
COPY ../library ./library
COPY ./pom.xml ./initiate-payment/pom.xml
COPY ./src ./initiate-payment/src

# Construire uniquement le module initiate-payment (et ses dépendances)
RUN mvn clean package -pl initiate-payment -am -DskipTests

# Étape 2 : Exécution de l'application avec une image légère
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copier le JAR depuis l'étape de build
COPY --from=builder /app/initiate-payment/target/initiate-payment-*.jar app.jar

# Exposer le port
EXPOSE 8080

# Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
