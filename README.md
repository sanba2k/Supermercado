# 🛒 Sistema de Ventas de Supermercado


Una cadena de supermercados necesita desarrollar un sistema para gestionar y analizar sus ventas.
Las ventas pueden ser de distintos tipos y cada una tiene un cálculo de importe final diferente.

El sistema deberá almacenar la información utilizando un HashMap y resolver distintos requerimientos usando Streams de Java.

## 🧾 Formato del archivo ventas.txt

Cada línea del archivo representa una venta y tiene el siguiente formato:

S;1001;Juan Perez;Arroz;5;200.0
P;1002;Ana Gomez;Leche;3;500.0;150.0
S;1003;Luis Lopez;Fideos;10;100.0
P;1004;Maria Diaz;Aceite;2;800.0;200.0

## 📊 Tipos de Venta

🟢 Venta Simple (S)
Tipo;Codigo;Cliente;Producto;Cantidad;PrecioUnitario

🔴 Venta Premium (P)
Todos los datos de la venta simple
Costo de envío adicional

## 🧩 Requisitos del sistema
## 1️⃣ Lectura de datos

Implementar una clase que lea el archivo ventas.txt y cargue los datos en un:

HashMap<Integer, Venta>

Donde:

🔑 Key → código de venta
📦 Value → objeto Venta (polimórfico)
## 2️⃣ Modelo de clases

Implementar:

Clase abstracta Venta
Clase VentaSimple
Clase VentaPremium

Cada una debe definir su propio comportamiento para calcular el total de la venta.

## 3️⃣ Funcionalidades con Streams

Implementar los siguientes métodos utilizando Streams:

💰 Recaudación total

Obtener el total recaudado por todas las ventas.

🏆 Venta con mayor importe

Obtener la venta con el mayor total calculado.

📊 Promedio de ventas simples

Calcular el promedio de importe de las ventas de tipo simple.

👥 Clientes premium

Obtener una lista con los nombres de clientes que realizaron compras premium.

📦 Total de productos vendidos

Calcular la cantidad total de productos vendidos en todas las ventas.

## 🚀 Objetivo

Aplicar conceptos de:

Programación orientada a objetos
Colecciones (HashMap)
Streams en Java
Lectura de archivos
Manejo de errores
