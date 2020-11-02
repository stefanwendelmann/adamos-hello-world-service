# neuenhauser-portal-user-api project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `neuenhauser-portal-user-api-0.0.1-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/neuenhauser-portal-user-api-0.0.1-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/neuenhauser-portal-user-api-0.0.1-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## Run Oracle DB 11g

`docker run -d -p 1521:1521 -e ORACLE_ALLOW_REMOTE=true oracleinanutshell/oracle-xe-11g`

Password für SYS & SYSTEM: 

`oracle`


## Docker 

### JVM

#### Build

`docker build -f .\src\main\docker\Dockerfile.jvm-test -t quarkus/neuenhauser-portal-user-api-jvm .`

#### Run Local

`docker run -i --rm -p 8080:8080 -p 5005:5005 -e JAVA_ENABLE_DEBUG="true" quarkus/neuenhauser-portal-user-api-jvm`

#### Run Permanent Server

`docker run -d -p 8080:8080 quarkus/neuenhauser-portal-user-api-jvm`
