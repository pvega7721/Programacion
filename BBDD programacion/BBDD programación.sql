drop table personas cascade constraints;
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

select * from personas where nombre  = 'Pablo' or apellidos = 'Pablo';
select * from personas;