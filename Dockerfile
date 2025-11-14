# Imagen ligera con Java 17 (recomendado para Spring Boot 3.x)
FROM eclipse-temurin:17-jdk-alpine

# Directorio dentro del contenedor
WORKDIR /app

# Copia el jar generado por Eclipse (carpeta target)
COPY target/*.jar app.jar

# Expone el puerto típico de Spring Boot
EXPOSE 8080

# Ejecuta la app
ENTRYPOINT ["java", "-jar", "app.jar"]