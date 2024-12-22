#Partimos de una imagen  Java 17 con Alpine
FROM openjdk:17-jdk-alpine

#Establecemos el directorio de trabajo dentro del contenedor
WORK /app

#Copiamos el JAR