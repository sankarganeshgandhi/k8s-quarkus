# MicroProfile generated Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

The generation of the executable jar file can be performed by issuing the following command

    mvn clean compile package

This will create a jar file **demo-runner.jar** within the _target_ maven folder. This can be started by executing the following command

    java -jar target/demo-runner.jar

You can also start the project in development mode where it automatically updates code on the fly as you save your files:

    mvn clean compile quarkus:dev

Last but not least, you can build the whole application into a one statically linked executable that does not require JVM:

    mvn clean compile package -Pnative

Native executable build might take a minute. Then you can execute it on a compatible architecture without JVM:

    ./target/demo-runner

To launch the test page, open your browser at the following URL

    http://localhost:8080/index.html

## Note on Native image

 * You need GraalVM installed from the GraalVM web site. Using the community edition is enough. Version 19.1.1+ is required.
 * The GRAALVM_HOME environment variable configured appropriately
 * The native-image tool must be installed; this can be done by running ```gu install native-image``` from your GraalVM directory
 * To read more about Quarkus and Native image, see https://quarkus.io/guides/building-native-image-guide

## Specification examples

By default, there is always the creation of a JAX-RS application class to define the path on which the JAX-RS endpoints are available.

Also, a simple Hello world endpoint is created, have a look at the class **HelloController**.

More information on MicroProfile can be found [here](https://microprofile.io/)


### Config

Configuration of your application parameters. Specification [here](https://microprofile.io/project/eclipse/microprofile-config)

The example class **ConfigTestController** shows you how to inject a configuration parameter and how you can retrieve it programmatically.





### Health

The health status can be used to determine if the 'computing node' needs to be discarded/restarted or not. Specification [here](https://microprofile.io/project/eclipse/microprofile-health)

The class **ServiceHealthCheck** contains an example of a custom check which can be integrated to health status checks of the instance.  The index page contains a link to the status data.





### JWT Auth

Using the OpenId Connect JWT token to pass authentication and authorization information to the JAX-RS endpoint. Specification [here](https://microprofile.io/project/eclipse/microprofile-rest-client)

Have a look at the **TestSecureController** class which calls the protected endpoint on the secondary application.
The **ProtectedController** (secondary application) contains the protected endpoint since it contains the _@RolesAllowed_ annotation on the JAX-RS endpoint method.

The _TestSecureController_ code creates a JWT based on the private key found within the resource directory.
However, any method to send a REST request with an appropriate header will work of course. Please feel free to change this code to your needs.






