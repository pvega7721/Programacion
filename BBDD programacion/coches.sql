CREATE TABLE coches (
 matricula varchar2(50) NOT NULL,
 marca varchar2(50) NOT NULL,
 precio number(20,6) NOT NULL,
 fecha_hora_compra DATE NOT NULL,
 PRIMARY KEY (matricula)
);
select * from coches;

INSERT INTO coches VALUES ('0000BBB', 'Toyota', 15000, TO_DATE('2024-05-01 10:00:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO coches VALUES ('0000BBC', 'Honda', 20000, TO_DATE('2024-05-02 11:30:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO coches VALUES ('0000BBD', 'Ford', 18000, TO_DATE('2024-05-03 09:45:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO coches VALUES ('0000BBF', 'Tesla', 40000, TO_DATE('2024-05-04 14:15:00', 'YYYY-MM-DD HH24:MI:SS'));
