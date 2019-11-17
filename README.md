#KidsTrack 
KidsTrack, Its complete solution to help there parent to track there childern location using the wearable watches. 

#Application Architecture

![alt text](https://github.com/KhangarAnupama/UserAPI/blob/master/src/main/resources/BlockDiagram.png)

Above architecture is designed with scalablility and reliability in the mind. This design can support more than 1 lack of watches easily. This as a different vertical (responsibilities) data collection, data ingestion, real time event generation and notification, data storing into the scalable persistence storage and should be easy to query for read or analytical operations. 

Following are the correspondent components with there GitHub repository link. 

A) Data Simulator
B) Data Producer 
C) Data consumer
D) User APIs

A) Data Simulator 
Git link : https://github.com/KhangarAnupama/DataSimulator

It produces geolocation data every two minutes and passed it to Data producer

B) Data Producer 
Git link :https://github.com/KhangarAnupama/DataProducer

It accepts the data produced by the simulator and store it to the reliable messaging pipeline which is Kafka.
Using a Kafka has many advantages like reliability and publish subscribe model so multiple consumer group can access it. 

C) Data Consumer
Git link : https://github.com/KhangarAnupama/DataConsumer

It consumes the data from the Kafka pipeline and saves it to the InfluDB.
It also saves the current data point in Redis cache.

D) User APIs.
Git link : https://github.com/KhangarAnupama/UserAPI

It performed the following operations.
- Register parent and kids and store data in postgres db
- Activate a device for kids
- Deactivate the device
- Send the current location of device

--------------------------------------------------------------------------------------------------------

#TODO Things will be added in coming days..

1) Making Kafka operational (I am using a normal file to read and write data..)
2) InfluxDB implementation remains, currently I am storing data in postgresDB.
3) Implementation of APIs like Setup geofences and Send notification if the breach happens is remaining.
4) Use of Apache Flink for real time complex event generation. 
5) Code formatting 

I am working on it, will notify you of its progress. 









