
CREATE TABLE personas (
 DNI varchar2(50) NOT NULL,
 NOMBRE varchar2(50) NOT NULL,
 APELLIDOS varchar2(100) NOT NULL,
 FECHA_NACIMIENTO DATE DEFAULT NULL,
 PRIMARY KEY (DNI)
); 
insert into personas (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('12345678b', 'Pablo', 'Vega', '02/04/2005');
insert into personas (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('12345678a', 'Pablo', 'Aranda', '02/04/2005');
insert into personas (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('12345678c', 'Juan', 'Lopez', '02/04/2005');
insert into personas (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('12345678d', 'Juan', 'Perez', '02/04/2005');
insert into personas (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('12345678e', 'Jose', 'Lopez', '02/04/2005');
insert into personas (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('12345678f', 'David', 'Suarez', '02/04/2005');
insert into personas (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('12345678h', 'María', 'Suarez', '02/04/2005');

select * from personas where nombre  = 'Pablo' or apellidos = 'Pablo';
select * from personas where dni = '12345678O';
SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%Juan%' OR APELLIDOS LIKE '%Juan%';
SELECT * FROM PERSONAS WHERE NOMBRE = '%Juan%' OR APELLIDOS ='%Juan%' ;
select * from personas;
SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%Jose%' OR APELLIDOS LIKE '%Jose%';
SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%Vega%' OR APELLIDOS LIKE '%Vega%';
SELECT * FROM personas WHERE DNI = '1234578M';
SELECT * FROM PERSONAS WHERE NOMBRE = 'Pablo' OR APELLIDOS = 'Pablo';
UPDATE PERSONAS SET NOMBRE = 'Maria', APELLIDOS = 'Lopez', FECHA_NACIMIENTO = '02/03/2001' WHERE DNI = '12345678b';
