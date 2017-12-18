FROM 192.168.0.237:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/cydtest1123-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
