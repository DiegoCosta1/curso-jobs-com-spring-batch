CREATE USER 'user'@'localhost' IDENTIFIED BY '123456';

GRANT ALL PRIVILEGES ON *.* TO 'user'@'localhost';

CREATE DATABASE spring_batch;

show tables;

select * from batch_job_instance;

select * from batch_job_execution;

select * from batch_job_execution_context;

-- Novo banco de dados app (S05)
CREATE DATABASE app;

USE app;

CREATE TABLE cliente (
    nome TEXT,
    sobrenome TEXT,
    idade TEXT,
    email TEXT
);

INSERT INTO cliente VALUES ("Joao", "Silva", "30", "joao@test.com");
INSERT INTO cliente VALUES ("Maria", "Silva", "30", "maria@test.com");