FROM java:8
FROM maven:alpine

WORKDIR /app

COPY . /app

EXPOSE 8080
LABEL maintainer='nasyrov289@gmail.com'
ADD ./target/shop-0.0.1-SNAPSHOT.jar shop-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "shop-0.0.1-SNAPSHOT.jar"]