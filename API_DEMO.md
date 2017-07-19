# API Examples

who-drives-next comes with an API:  [swagger.yaml](./src/main/resources/swagger.yaml)

## hello World
```sh
curl -X GET -H "Content-type: application/json" -H "Accept: application/json"  "https://who-drives-next.herokuapp.com/v1/helloDatabase?key=1" -v
```

## eine Fahrgemeinschaft anlegen
```sh
curl -X POST -H "Content-type: application/json" -H "Accept: application/json"  "https://who-drives-next.herokuapp.com/v1/carpools" -v -d '{"name":"ttt","displayName":"Testeintrag"}'
```

## eine Fahrgemeinschaft abfragen
```sh
curl -X GET -H "Content-type: application/json" -H "Accept: application/json"  "https://who-drives-next.herokuapp.com/v1/carpools?name=ttt" -v
```

## eine Fahrt anlegen
```sh
curl -X POST -H "Content-type: application/json" -H "Accept: application/json"  "https://who-drives-next.herokuapp.com/v1/rides" -v -d '{"carpool":"ttt","date":"2017-07-17","driver":"ttt01"}'
```
## einen user anlegen  TODO ... POST nicht unterstützt
```sh
curl -X POST -H "Content-type: application/json" -H "Accept: application/json"  "https://who-drives-next.herokuapp.com/v1/users" -v -d { "first_name": "ttt_first",  "last_name": "ttt_last",  "email": "ttt@ttt.com" }
```

## einen user abfragen
```sh
curl -X GET -H "Content-type: application/json" -H "Accept: application/json"  "https://who-drives-next.herokuapp.com/v1/users" -v
```
