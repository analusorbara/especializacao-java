#!/bin/sh
mvn clean package && docker build -t br.edu.utfpr/Aula4TarefaEJB .
docker rm -f Aula4TarefaEJB || true && docker run -d -p 9080:9080 -p 9443:9443 --name Aula4TarefaEJB br.edu.utfpr/Aula4TarefaEJB