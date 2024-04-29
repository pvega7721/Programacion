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

