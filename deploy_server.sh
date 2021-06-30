#!/bin/bash
cd /home/ubuntu/repos/springboot-rest-api-greetings-response;pkill screen;git stash;git checkout main;git pull;chmod +x gradlew;sudo ./gradlew build;screen -d -m bash -c "sudo ./gradlew bootRun";exit | sudo ssh -tt -o "StrictHostKeyChecking no" -i key.pem ubuntu@3.130.50.98 /bin/bash
