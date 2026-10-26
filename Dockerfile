# Dockerfile for Java (war) deployment
FROM tomcat:9-jre11
COPY target\maven-web-java.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh","run"]
