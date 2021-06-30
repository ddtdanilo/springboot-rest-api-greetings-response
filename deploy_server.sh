#!/bin/bash
cd /home/ubuntu/repos/springboot-rest-api-greetings-response

pkill screen # Kill the service

git stash # For not taking the files generated if the case
git checkout main
git pull

chmod +x gradlew
sudo ./gradlew build
screen -d -m bash -c "sudo ./gradlew bootRun" # Create a screen sesion

exit

