#!/bin/bash

sudo apt update
#sudo apt install openjdk-17-jdk -y

#STEP 1: GET KAFKA
#Download the last Kafka release from https://kafka.apache.org/quickstart
wget https://dlcdn.apache.org/kafka/3.5.0/kafka_2.13-3.5.0.tgz

tar xvf kafka_2.13-3.5.0.tgz
sudo mv kafka_2.13-3.5.0 /usr/local/kafka
