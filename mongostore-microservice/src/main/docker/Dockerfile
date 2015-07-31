FROM java:8
VOLUME /tmp
ADD producer-microservice-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
#ENV MONGODB_PORT ${MONGO_PORT_27017_TCP_PORT}
#ENV MONGODB_HOST ${MONGO_PORT_27017_TCP_ADDR}
ENV MONGODB_PORT 27017
ENV MONGODB_HOST 10.0.2.15
#ENV MONGODB_HOST localhost
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
