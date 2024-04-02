# spring-boot-kafka

Steps to install Spring Boot Kafka Project:- 

1. Make sure you have Java8 or higher version of Java installed on your machine.
2. Download kafka tar file and extract it on your system.
3. Set environment variable of kafka and if you are using windows, set path as \bin\windows.
4. Inside kafka directory, create a folder named data and two sub folders kafka and zookeeper.
5. In config\zookeeper.properties file, edit the value of 'data.dir' by pasting the zookeeper folder address. Save it. This address will be used for clients to get connected.
6. In config\server.properties file, edit the value of 'log.dirs' by pasting the kafka folder address.Here, the user will find some files, which will be generated on the successful startup of the Kafka server.

Steps to run Spring Boot kafka:-
1. Open terminal and go to Kafka folder. Run Zookeeper as:
   zookeeper-server-start.bat config\zookeeper.properties
   In the output screen, a port number 2181 is shown which tells the successful zookeeper server startup.
2. Open new terminal and go to Kafka folder.Run Broker as :
   kafka-server-start.bat config\server.properties
   In the output screen, a port number 9092 is shown which tells the successful zookeeper server startup.
    Start Both zookeeper and Broker in different terminals.
3. Once both of them gets connected, set the kafka broker server configuration in application.properties.
4. Start the Application successfully.