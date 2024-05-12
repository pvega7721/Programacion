DROP TABLE equipo;
CREATE TABLE equipo (
  CODIGO varchar2(4) NOT NULL,
  NOMBRE varchar2(30) NOT NULL,
  CONSTRAINT PK_EQUIPO 
	PRIMARY KEY (CODIGO)
);

DROP TABLE jugador;
CREATE TABLE jugador (
  NUMERO NUMERIC(4,0) NOT NULL,
  CODIGO_EQUIPO varchar2(4) NOT NULL,
  NOMBRE varchar2(40) NOT NULL,
  NACIMIENTO date NOT NULL,
  PRIMARY KEY (NUMERO,CODIGO_EQUIPO),
  CONSTRAINT FK_CODIGO_EQUIPO
    FOREIGN KEY (CODIGO_EQUIPO)
    REFERENCES equipo(CODIGO)
);
insert into jugador values(12, 'bcn', 'Juan', '02/04/2005');
select * from jugador;
select * from equipo;
insert into equipo values('rm', 'Real Madrid');
insert into equipo values('bcn', 'Barcelona');
select * from jugador where codigo_equipo like 'bcn';
select * from equipo where codigo like 'bcn';