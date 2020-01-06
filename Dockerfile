FROM openjdk:8
VOLUME /tmp
ADD ./target/servicio-person-service-0.0.1-SNAPSHOT.jar servicio-person.jar
ENTRYPOINT ["java","-jar","/servicio-person.jar"]