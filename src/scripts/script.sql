CREATE TABLE aluno(
idAluno           SERIAL         PRIMARY KEY,
nome              VARCHAR(100)   NOT NULL,
matricula         VARCHAR(50)    NOT NULL,
cpf               VARCHAR(50)    NOT NULL,
);


INSERT INTO(nome, matricula, cpf)

SELECT idAluno, nome, matricula, cpf
FROM aluno
ORDER BY nome ASC;

