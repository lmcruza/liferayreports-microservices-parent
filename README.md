Up and running with Sample Spring-Cloud based app
-------------------------------------------------

There are two ways to run the entire application:

* On Local Machine
* Using Docker



DNS Simulation
~~~~~~~~~~~~~~~~
.Please edit your hosts file to add this new hostnames:
[source]
----
127.0.0.1       localhost       gateway discovery configserver mongostore producer monitoringdashboard
----
~~~~~~~~~~~~~~~~



On Local Machine
~~~~~~~~~~~~~~~~
Running it all local is simple, do the following in sequence, in six different terminal windows:

.Start up Service Discovery Server
[source,java]
----
cd discovery-server
mvn spring-boot:run
----

.Start up Config Server
[source,java]
----
cd config-server
mvn spring-boot:run
----

.Start up Mongostore Microservice
[source,java]
----
cd mongostore-microservice
mvn spring-boot:run
----

.Start up Producer Microservice
[source,java]
----
cd producer-microservice
mvn spring-boot:run
----

.Start up Monitoring Dashboard 
[source,java]
----
cd monitoring-dashboard
mvn spring-boot:run
----

.Start up API Gateway 
[source,java]
----
cd api-gateway
mvn spring-boot:run
----
~~~~~~~~~~~~~~~~



On Docker
~~~~~~~~~
Running using Docker is even simpler, assuming that docker-compose and docker are installed on your box, just run the following:

.Build the docker images for the microservices
[source,java]
----
mvn clean package docker:build
----

.Start up Docker containers
[source,java]
----
docker-compose up
----
~~~~~~~~~



Endpoints
~~~~~~~~~

.Service Discovery
[source,java]
----
* Service discovery
http://discovery:8761
----

.Producer Microservice REST API: (http POST method)
[source,java]
----
http://producer:9000/report
----

.Monitoring dashboard
[source,java]
----
http://hystrixdashboard:7979/hystrix/monitor?stream=http%3A%2F%2Fproducer%3A9000%2Fhystrix.stream
----

.API Gateway (zuulproxy version, DEFAULT): health (http GET method) and REST API (http POST method)
[source,java]
----
http://gateway:10000/health.json
http://gateway:10000/report
----

.API Gateway  (sidecar version): health (http GET method) and REST API (http POST method)
[source,java]
----
http://gateway:10000/health.json
http://gateway:10000/producer/report
----
~~~~~~~~~
