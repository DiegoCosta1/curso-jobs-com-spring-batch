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

INSERT INTO cliente VALUES ("Zeca 1", "Silva", "30", "zeca1@test.com");
INSERT INTO cliente VALUES ("Zeca 2", "Silva", "30", "zeca2@test.com");
INSERT INTO cliente VALUES ("Zeca 3", "Silva", "30", "zeca3@test.com");
INSERT INTO cliente VALUES ("Zeca 4", "Silva", "30", "zeca4@test.com");
INSERT INTO cliente VALUES ("Zeca 5", "Silva", "30", "zeca5@test.com");
INSERT INTO cliente VALUES ("Zeca 6", "Silva", "30", "zeca6@test.com");
INSERT INTO cliente VALUES ("Zeca 7", "Silva", "30", "zeca7@test.com");
INSERT INTO cliente VALUES ("Zeca 8", "Silva", "30", "zeca8@test.com");
INSERT INTO cliente VALUES ("Zeca 9", "Silva", "30", "zeca9@test.com");