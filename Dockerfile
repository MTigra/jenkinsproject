FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /opt/app
CMD ["java", "-jar", "/opt/app/japp.jar"]
