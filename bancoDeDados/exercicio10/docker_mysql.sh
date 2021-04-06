docker run \
--detach \
--name=spring-mysql \
--env="MYSQL_ROOT_PASSWORD=1234" \
--env="MYSQL_DATABASE=contatos" \
--env="MYSQL_ROOT_HOST=%" \
--publish 3306:3306 \
mysql/mysql-server
#mysql:latest

docker stop spring-mysql && docker rm spring-mysql