# bot-sofia

## init
docker run -d --network host --rm --name some-mongo \
    -e MONGO_INITDB_ROOT_USERNAME=mongoadmin \
    -e MONGO_INITDB_ROOT_PASSWORD=secret \
    mongo
    
## connect
docker run -it --rm --network host mongo \
    mongo --host localhost \
        -u mongoadmin \
        -p secret \
        --authenticationDatabase admin \
        teste
