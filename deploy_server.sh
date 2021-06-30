#!/bin/bash
cd /home/ubuntu/repos/springboot-rest-api-greetings-response

pkill screen # Kill the service

git stash # For not taking the files generated if the case
git checkout origin/main
git pull

./gradlew build
screen -d -m bash -c "./gradlew bootRun" # Create a screen sesion

exit

