# JaxRSDemo

1. start wsl
wsl

2. log into ec2 machine:

ssh -i /mnt/d/myAWSAccount/mykey.pem  ec2-user@ec2-54-85-129-223.compute-1.amazonaws.com


3. jetty commands:

cd $JETTY_BASE

java -jar $JETTY_HOME/start.jar --help

java -jar $JETTY_HOME/start.jar --add-modules=ee10-servlet,ee10-servlets,ee10-apache-jsp,ee10-annotations,ee10-plus

java -jar $JETTY_HOME/start.jar


4. copy war file into ec2 server:

scp -i /mnt/d/myAWSAccount/mykey.pem JaxRSDemo-1.0-SNAPSHOT.war ec2-user@ec2-54-85-129-223.compute-1.amazonaws.com:/home/ec2-user/server/jetty-base/webapps
