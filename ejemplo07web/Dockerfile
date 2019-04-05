#Imagen de origen
FROM tomcat:9-jre8-alpine
#Variables de entorno
ENV APP=ejemplo07web
ENV VERSION=0.0.1-SNAPSHOT
#Copia y renombra el artefacto
COPY target/ejemplo07web-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/miapp.war
#Puertos expuestos, solo valen para la opcion -P
EXPOSE 8080
#CMD [ "catalina.sh", "run" ]
