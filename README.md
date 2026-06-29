## Fábrica de Laptops - Patrón de diseño "Factory"

Esta vez nos pide desarrollar una fábrica de laptops capaz de crear objetos de tipo:
- Laptop Básica
- Laptop Gamer
- Laptop Profesional

Cada tipo de laptop posee características comunes como marca, modelo, año de fabricación, procesador y tamaño de pantalla.

###  Estructura del proyecto

```
src/
│
├── Main.java
│
├── Laptops.java
├── Basico.java
├── Gamer.java
├── Profesional.java
│
├── LaptopsFactory.java
├── BasicoFactory.java
├── GamerFactory.java
└── ProfesionalFactory.java
```

### Patrón de diseño utilizado

He utilizado el patron factory

### Producto Abstracto

- `Laptops`

### Productos Concretos

- `Basico`
- `Gamer`
- `Profesional`

### Creador Abstracto

- `LaptopsFactory`

### Creadores Concretos

- `BasicoFactory`
- `GamerFactory`
- `ProfesionalFactory`


### Salida esperada

```text
BIENVENIDOS A LA FABRICA DE LAPTOPS

Corriendo programas en una Laptop para Gamer
Laptop para Gamer
Marca y Modelo: Macbook Air
Año de Fabricacion: 2017
Procesador: Silicon M1
Tamaño de la Pantalla: 13

Corriendo programas en una Laptop Basica
Laptop Basica
Marca y Modelo: Dell Latitude
Año de Fabricacion: 2020
Procesador: Intel Core i7
Tamaño de la Pantalla: 14

Corriendo programas en una Laptop Profesional
Laptop Profesional
Marca y Modelo: Macbook Pro
Año de Fabricacion: 2022
Procesador: Apple Silicon M2
Tamaño de la Pantalla: 16
```

![Diagrama.jpeg](images/Diagrama.jpeg)