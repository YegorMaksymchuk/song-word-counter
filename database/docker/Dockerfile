FROM mongodb:latest

MAINTAINER <Yegor Maksymchuk> egormaksimchuk@gmail.com

ADD mongo-init.sh /mongo-init.sh
ADD mongo-populate.sh /mongo-populate.sh
ADD mongo-run.sh /mongo-run.sh

EXPOSE 27017

CMD["/mongo-run.sh"]


