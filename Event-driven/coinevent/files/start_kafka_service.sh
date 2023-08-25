#!/bin/bash

#https://www.linuxtechi.com/how-to-install-apache-kafka-on-ubuntu/#google_vignette

#Start end check the status of sevice
sudo systemctl start zookeeper
sudo systemctl status zookeeper

#Start end check the status of sevice
sudo systemctl start kafka
sudo systemctl status kafka