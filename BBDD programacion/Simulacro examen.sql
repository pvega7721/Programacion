CREATE TABLE libros (
 ISBN varchar2(50) NOT NULL,
 TITULO varchar2(50) NOT NULL,
 AUTOR varchar2(50) NOT NULL,
 PRECIO NUMERIC(20,6) NOT NULL,
 PRIMARY KEY (ISBN)
); 
INSERT INTO libros VALUES('abcd', 'titulo1', 'Pablo', 13);
INSERT INTO libros VALUES( 'abced', 'titulo1', 'Pablo', 13);
select * from libros;

UPDATE libros set PRECIO = 15 WHERE ISBN = 'abcd';
select avg(precio) from libros;