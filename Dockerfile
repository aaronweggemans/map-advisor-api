#
# Build
#
FROM arm64v8/eclipse-temurin:22-jre-alpine
COPY target/*.jar app.jar

# Expose to port
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]