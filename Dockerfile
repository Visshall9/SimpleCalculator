FROM openjdk:11
COPY ./target/SimpleCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","SimpleCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]