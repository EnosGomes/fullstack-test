#!/bin/bash

echo Gobots Config Server: BUILDING
cd gobots-config-server
mvn clean install -U
cd ..
clear

echo Gobots Config Server: BUILD DONE
echo Gobots Eureka Server: BUILDING
cd gobots-eureka-server
mvn clean install -U
cd ..
clear

echo Gobots Config Server: BUILD DONE
echo Gobots Eureka Server: BUILD DONE
echo Gobots Zuul Server: BUILDING
cd gobots-zuul-server
mvn clean install -U
cd ..
clear

echo Gobots Config Server: BUILD DONE
echo Gobots Eureka Server: BUILD DONE
echo Gobots Zuul Server: BUILD DONE
echo Gobots Suggestion Server: BUILDING
cd gobots-suggestion-server
mvn clean install -U
cd ..
clear

echo Gobots Config Server: BUILD DONE
echo Gobots Eureka Server: BUILD DONE
echo Gobots Zuul Server: BUILD DONE
echo Gobots Suggestion Server: BUILD DONE
echo ---
echo Starting Application...
docker-compose up -d --build

sleep 60