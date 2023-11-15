FROM openjdk:8
EXPOSE 8080
ADD target/first-application.jar first-application.jar
ENTRYPOINT [ "java",".jar","/first-application.jar" ]