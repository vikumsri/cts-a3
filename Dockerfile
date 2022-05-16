
FROM java:8

EXPOSE 8082

ADD target/docker-abc-user-management.jar docker-abc-user-management.jar

ENTRYPOINT ["java","-jar","docker-abc-user-management.jar"]