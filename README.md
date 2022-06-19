# kafka-example

#in windows run below commands in terminal: <br />

zookeeper --> zookeeper-server-start.bat ../../config/zookeeper.properties <br />
kafka --> kafka-server-start.bat ../../config/server.properties <br />
listener --> kafka-console-consumer.bat --topic newTopic --from-beginning --bootstrap-server localhost:9092
