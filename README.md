Cab driver location receiver app

DriverApplication
This application contains a kafka producer that produces mock location co-ordinates
which can be reffered to as a cab driver moving towards/ away from a particular point
The co-ordiates are then published on a kafka-topic, as mentioned in Constants

PassengerApplication
This application containes a kafka consumer app that receives the location co-ordidates as updated by Producer app
It does so by consuming messages from Kafka-Topic
