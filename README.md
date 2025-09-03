# JaxRSDemo

1. start wsl

wsl

2. log into ec2 machine:

ssh -i /mnt/d/myAWSAccount/mykey.pem  host


3. jetty commands:

cd $JETTY_BASE

java -jar $JETTY_HOME/start.jar --help

java -jar $JETTY_HOME/start.jar --add-modules=ee10-servlet,ee10-servlets,ee10-apache-jsp,ee10-annotations,ee10-plus

java -jar $JETTY_HOME/start.jar


4. copy war file into ec2 server:

scp -i /mnt/d/myAWSAccount/mykey.pem JaxRSDemo-1.0-SNAPSHOT.war host:/home/ec2-user/server/jetty-base/webapps


5. jetty configuration:

jetty-home-12.0.25

installed modules:

Enabled Modules:
----------------
0) resources                 transitive provider of resources for logging-jetty
1) logging/slf4j             transitive provider of logging/slf4j for logging-jetty
   dynamic dependency of logging-jetty
2) logging-jetty             transitive provider of logging for threadpool
   transitive provider of logging for bytebufferpool
   transitive provider of logging for server
3) bytebufferpool            transitive provider of bytebufferpool for server
   ini template available with --add-modules=bytebufferpool
4) threadpool                transitive provider of threadpool for server
   ini template available with --add-modules=threadpool
5) server                    ${jetty.base}/start.d/server.ini
6) deploy                    transitive provider of deploy for ee10-deploy
7) sessions                  transitive provider of sessions for ee10-servlet
   ini template available with --add-modules=sessions
8) ee10-servlet              ${jetty.base}/start.d/ee10-servlet.ini
9) security                  transitive provider of security for ee10-security
10) ee10-security             transitive provider of ee10-security for ee10-webapp
    transitive provider of ee10-security for ee10-plus
11) ee-webapp                 transitive provider of ee-webapp for ee10-webapp
    ini template available with --add-modules=ee-webapp
12) ee10-webapp               ${jetty.base}/start.d/ee10-webapp.ini
13) plus                      transitive provider of plus for jndi
    transitive provider of plus for ee10-plus
14) jndi                      transitive provider of jndi for ee10-plus
15) ee10-plus                 ${jetty.base}/start.d/ee10-plus.ini
16) ee10-annotations          ${jetty.base}/start.d/ee10-annotations.ini
17) ee10-apache-jsp           ${jetty.base}/start.d/ee10-apache-jsp.ini
18) ee10-deploy               ${jetty.base}/start.d/ee10-deploy.ini
19) ee10-servlets             ${jetty.base}/start.d/ee10-servlets.ini
20) http                      ${jetty.base}/start.d/http.ini














