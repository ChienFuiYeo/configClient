FROM java:8-jdk
WORKDIR /app
RUN chmod 777 /app
EXPOSE 8887
COPY target/configClient.jar /app/configClient.jar
CMD ["/bin/sh", "-c", "java $JAVA_OPTS -jar /app/configClient.jar --spring.profiles.active=dev"]