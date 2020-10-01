FROM adoptopenjdk/openjdk11:alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
VOLUME /tmp
EXPOSE 8080
ADD build/libs/taskPlanner-0.0.1-SNAPSHOT.jar taskPlanner.jar
ENTRYPOINT ["java","-jar","taskPlanner.jar"]