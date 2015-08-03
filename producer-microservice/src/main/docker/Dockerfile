FROM java:8
VOLUME /tmp
ADD mongostore-microservice-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
#ENV MONGODB_PORT ${MONGO_PORT_27017_TCP_PORT}
#ENV MONGODB_HOST ${MONGO_PORT_27017_TCP_ADDR}
EXPOSE 9002
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
