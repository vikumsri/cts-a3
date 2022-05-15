FROM java:8

EXPOSE 8080

ADD target/docker-abc-order-handling.jar docker-abc-order-handling.jar

ENTRYPOINT ["java","-jar","docker-abc-order-handling.jar"]