# 🎲 Aleatorios

Este proyecto es la **segunda parte** del sistema: genera una secuencia de números aleatorios según parámetros definidos y la envía (por salida estándar, fichero, etc.) para que luego pueda ser ordenada por el módulo “OrdenarNumeros”.

---

## 📂 Estructura del proyecto

```
Aleatorios/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── Aleatorios/
                ├── Main.java
                └── (otras clases de generación)
```

- `pom.xml` — configuración de Maven  
- `Main.java` — punto de entrada  
- Clases auxiliares para generación (aleatorios uniformes, límite mínimo/máximo, etc.)

---

## 🎯 Objetivo

1. Ser la **segunda parte** del sistema completo: generar números aleatorios con parámetros configurables (cantidad, rango, semilla, etc.).  
2. Emitir los números en un formato que pueda ser consumido por el módulo de ordenación (por ejemplo, línea por línea, separados por espacios, JSON, etc.).  
3. Empaquetar como un **.jar ejecutable** con Maven, para su uso directo desde la línea de comandos.

---

## 🛠 Uso con Maven

Para compilar y empaquetar:

```bash
mvn clean package
```

Obtendrás, por ejemplo, `Aleatorios-1.0-SNAPSHOT.jar` en `target/`.

Para ejecutar el JAR:

```bash
java -jar target/Aleatorios-1.0-SNAPSHOT.jar --count 100 --min 1 --max 1000
```

Opciones posibles (ejemplos):

- `--count` — cantidad de números a generar  
- `--min` — valor mínimo  
- `--max` — valor máximo  
- `--seed` — semilla opcional para reproducibilidad  

La salida puede ser algo como:

```
435 12 982 53 124 7 999 ...
```

o línea por línea.

---

## 🔁 Uso combinado con OrdenarNumeros

Para generar y ordenar en un solo comando:

```bash
java -jar Aleatorios-1.0-SNAPSHOT.jar --count 100 | java -jar OrdenarNumeros-1.0-SNAPSHOT.jar
```

Así produces 100 números aleatorios y los ordenas en cascada.

---

## ✨ Posibles mejoras / extensiones

- Permitir diferentes distribuciones (uniforme, normal, etc.)  
- Salida en diferentes formatos (JSON, CSV, etc.)  
- Parámetros adicionales (exclusión de duplicados, etc.)  
- Pruebas automatizadas  
- Documentación ampliada  

---

## 📝 Licencia / Contribución

Ángel Japón Castañeda.
