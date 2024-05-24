# Map Advisor Api

This api is used to show information on the client of map advisor.

### Some general information

This project uses maven.
This project is build in Java 17.
This project uses mysql@5.7

### Startup the application
To startup the application, please use docker. First you need to create a docker network:

```
docker network create map-advisor-network 
```

Next you need to create, and link the mysql database to the network.

```
docker run --name map-advisor-db -e MYSQL_ROOT_PASSWORD=heelgeheim123 -p 127.0.0.1:3306:3306 --network map-advisor-network -d mysql:5.7
```

#### Creating the mysql database 

Before you can start right now, you first need to create your database. First login to your docker container. Of course you can find your docker container id by executing the `docker container ls` command.  

```
docker exec -it <container-id> bash
```

Now, when you are in your docker container, you need to create your datbase. You can run the command `mysql -u root -p`. It will now ask you to enter your password. Please enter your password `heelgeheim123`. Right now you can create your database with mysql and leave the terminal. To create your database run command:

```
CREATE DATABASE map_advisor_db;
```

### Import anwb information to the database

Right now we have a working database with a connected API, but there is no usefull information in our database yet. So you can use the following docker image to import the information from the ANWB api and import it into your own local database.

```
docker run --env-file secret.env --name map-advisor-import-anwb --network map-advisor-network aaronweggemans/map-advisor-anwb-importer
```

```
docker run -e MYSQL_HOST=localhost -e MYSQL_USER=root -e MYSQL_PASSWORD=heelgeheim123 -e MYSQL_DATABASE=map_advisor_db --name map-advisor-import-anwb --network map-advisor-network bartmachielsen/anwb-fuel-prices
```

```
docker run --name map-advisor-db-maria -e MYSQL_ROOT_PASSWORD=heelgeheim123 -p 127.0.0.1:3306:3306 --network map-advisor-network -d mariadb:10.5
```