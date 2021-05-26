@echo off
call mvn clean package
call docker build -t br.edu.utfpr/Aula4TarefaEJB .
call docker rm -f Aula4TarefaEJB
call docker run -d -p 9080:9080 -p 9443:9443 --name Aula4TarefaEJB br.edu.utfpr/Aula4TarefaEJB