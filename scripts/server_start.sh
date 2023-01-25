#!/bin/bash
cd /home/ubuntu/app_deploy/
#java -jar cars-api.jar &
#java -jar -Dserver.port=80 *.jar > /dev/null 2> /dev/null < /dev/null &
java -jar *.jar > /dev/null 2> /dev/null < /dev/null &