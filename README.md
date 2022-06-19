# kafka-example

#in windows run below commands in terminal:

zookeeper: zookeeper-server-start.bat ../../config/zookeeper.properties
kafka: kafka-server-start.bat ../../config/server.properties
listener: kafka-console-consumer.bat --topic newTopic --from-beginning --bootstrap-server localhost:9092
