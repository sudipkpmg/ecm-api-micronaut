FROM openjdk:14-alpine
COPY target/ecm-api-micronaut-*.jar ecm-api-micronaut.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "ecm-api-micronaut.jar"]