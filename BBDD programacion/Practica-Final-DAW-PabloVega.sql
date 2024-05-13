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
insert into jugador values(15, 'rm', 'Alvaro', '14/08/1999');
insert into jugador values(19, 'sv', 'Carlos', '19/10/2003');
insert into jugador values(21, 'bt', 'Sergio', '19/10/2003');
insert into jugador values(18, 'bb', 'Tomas', '19/10/2003');
select * from jugador join equipo on jugador.codigo_equipo = equipo.codigo;
select * from equipo;
select * from jugador;
insert into equipo values('rm', 'Real Madrid');
insert into equipo values('bcn', 'Barcelona');
select * from jugador where codigo_equipo like 'rm';
select * from equipo where codigo like 'rm';
select * from jugador where codigo_equipo like 'bnc';
select * from equipo where codigo like 'bb';
select * from jugador where codigo_equipo like 'cd';
select * from equipo where codigo like 'rm';