# Nexer assignment
 This project has two endpoints. first one for simulating the log generating and the second one for getting this logs by rest client.
 
### Run
At first start database docker file by:
- `cd ./docker`
- `docker compose up -d`

Then run project by:
- `mvn spring-boot:run`

To start generator call:
- `curl --location --request GET 'localhost:8080/api/logs/generate'`

To get the logs which is generated call:
- `curl --location --request GET 'localhost:8080/api/logs'`
