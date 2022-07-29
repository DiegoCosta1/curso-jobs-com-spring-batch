CREATE USER 'user'@'localhost' IDENTIFIED BY '123456';

GRANT ALL PRIVILEGES ON *.* TO 'user'@'localhost';

CREATE DATABASE spring_batch;

show tables;

select * from batch_job_instance;

select * from batch_job_execution;

select * from batch_job_execution_context;