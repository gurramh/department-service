# Docker Commands

## To build image from Dockerfile.

```shell
docker image build -t gurramh/department-service:v1.0.0 --no-cahce .
```

## Push the image to docker hub gurramh/department-service

```shell
docker image push gurramh/department-service:v1.0.0
```

## Run docker image

```shell
docker container run -d --name department-api -p 8081:8081 gurramh/department-service:v1.0.0
```