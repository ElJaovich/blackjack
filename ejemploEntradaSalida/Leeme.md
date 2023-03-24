# Ejemplo de entrada y salidad con JML

En este ejemplo se computa el mayor de cuatro números, y para hacer eso 
se le pide al usuario los cuatro números a comparar.

Para la verificación estática ejecute:

```
>openjml --esc --exclude main MaximoCuatroNumeros.java 
```

Para compilar ejecute:

```
>openjml --rac MaximoCuatroNumeros.java
```

Para correr la aplicación ejecute:

```
>openjml-java MaximoCuatroNumeros
```
