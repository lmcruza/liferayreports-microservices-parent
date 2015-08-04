Up and running with Sample Spring-Cloud based app
-------------------------------------------------

There are two ways to run the entire application:

* On Local Machine
* Using Docker

On Local Machine
~~~~~~~~~~~~~~~~
Running it all local is simple, do the following in sequence, in four different terminal windows:

.Start up Eureka
[source,java]
----
cd sample-eureka
mvn spring-boot:run
----


.Start up Config server
[source,java]
----
cd sample-config
mvn spring-boot:run
----

.Start up Pong Service
[source,java]
----
cd sample-pong
mvn spring-boot:run
----

.Start up Ping Service
[source,java]
----
cd sample-ping
mvn spring-boot:run
----

If all the applications have come up cleanly, the endpoint should be available at http://localhost:8080

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

That is it, the endpoint should be available at http://dockerhost:8080






Testing
~~~~~~~~~
* Add to /etc/hosts
XXX.XXX.XXX.XXX     discovery configserver gateway mongostore producer hystrixdashboard

* Run with docker
docker-compose up

* Service discovery
http://discovery:8761

* Reports REST API (http POST)
http://producer:9000/report

* Monitoring dashboard
http://hystrixdashboard:7979/hystrix/monitor?stream=http%3A%2F%2Fproducer%3A9000%2Fhystrix.stream

* API gateway
** Health
http://gateway:10000/health.json
** (http POST)
http://gateway:10000/producer/report
