FROM adoptopenjdk/openjdk11:alpine
MAINTAINER Walter Heitor
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
ENTRYPOINT ["java","-jar","/app.jar"]
#ENTRYPOINT ["java","Xmx512m","-Dserver.port=${PORT}","-jar","/app.jar"]