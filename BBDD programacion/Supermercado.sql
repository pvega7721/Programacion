CREATE TABLE pedidos (
 numero NUMERIC(6,0) NOT NULL,
 cliente varchar2(50) NOT NULL,
 fecha_entrega date NOT NULL,
 CONSTRAINT PK_PEDIDOS PRIMARY KEY (numero)
);
CREATE TABLE pedidos_lineas (
 numero_pedido NUMERIC(6,0) NOT NULL,
 articulo varchar2(50) NOT NULL,
 cantidad NUMERIC(6,0) NOT NULL,
 precio_unitario NUMERIC(10,6) NOT NULL,
 CONSTRAINT PK_PEDIDOS_LINEAS PRIMARY KEY (numero_pedido, articulo),
 CONSTRAINT FK_pedido FOREIGN KEY (numero_pedido) REFERENCES pedidos(numero)
); 
INSERT INTO pedidos VALUES (1, 'Pablo Vega', TO_DATE('2024-05-01', 'YYYY-MM-DD'));
INSERT INTO pedidos VALUES (2, 'Juan Lopez', TO_DATE('2024-05-02', 'YYYY-MM-DD'));
INSERT INTO pedidos VALUES (3, 'Enrique Díaz', TO_DATE('2024-05-03', 'YYYY-MM-DD'));
INSERT INTO pedidos VALUES (4, 'Samuel Lopez', TO_DATE('2024-05-04', 'YYYY-MM-DD'));

INSERT INTO pedidos_lineas VALUES (1, 'Articulo 1', 2, 200);
INSERT INTO pedidos_lineas VALUES (2, 'Articulo 2', 5, 500);
INSERT INTO pedidos_lineas VALUES (3, 'Articulo 3', 1, 300);
INSERT INTO pedidos_lineas VALUES (4, 'Articulo 4', 3, 600);

select * from pedidos;
select * from pedidos_lineas;
SELECT * FROM PEDIDOS_LINEAS WHERE NUMERO_PEDIDO = 2;