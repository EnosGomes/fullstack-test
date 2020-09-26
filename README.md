# Fullstack Test

## Context

Gobots wants to create a new service to suggest music to its users. The suggestions will depend on the city and the climate where the user is.

## Task

Create a micro-service able to accept RESTful requests receiving as parameter a location and returns a playlist suggestion according to the current temperature. Use any language and framework you want (Kotlin/Java + Spring, Python + Django/Flask etc), however Kotlin + Spring is recommended.

Also create a simple frontend which sends the location to the microservice and shows the music suggestions. Use any language and framework you want (JQuery, ReactJS, Angular etc).

### Observations
 - Location can be represented as city name or lat long coordinates.
 - A playlist can be represented as a list of music names.

## Business rules
* If temperature (celcius) is above 30 degrees, suggest tracks for party
* In case temperature is between 15 and 30 degrees, suggest pop music tracks
* If it's a bit chilly (between 10 and 14 degrees), suggest rock music tracks
* Otherwise, if it's freezing outside, suggests classical music tracks

## Hints
You can make usage of OpenWeatherMaps API (https://openweathermap.org) to fetch temperature data and Spotify (https://developer.spotify.com) to suggest the tracks as part of the playlist.

## Submission
Fork this project and share it with your interviwer

## How to run it
 You will need Docker, Java 8 and Maven installed on your computer.

After clone it you:
Run the start.sh

Eureka link: http://localhost:9091 
Test through Swagger: http://localhost:9093/swagger-ui.html
