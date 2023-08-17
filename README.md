# Jenkins-Kakaroto

## Introduction
This repository contains a Jenkins pipeline configuration designed for a Java project using Maven and JUnit. The pipeline fetches code from a GitHub repository, builds it using Maven, and runs unit tests.

## English Instructions

### Jenkins Pipeline Overview
1. **Build Stage**: This stage fetches the code from the given GitHub repository and runs Maven to compile and package the code.
2. **UnitTest Stage**: This stage uses Maven to run unit tests. The results of these tests are then captured as XML reports which can be viewed in Jenkins.

### Requirements
- Jenkins with the necessary plugins installed (Maven, Git, JUnit).
- Maven setup in the Jenkins environment.

### Execution
To run the pipeline:
1. Ensure that you've configured Jenkins to recognize your Maven installation.
2. Create a new pipeline job and use the provided `Jenkinsfile` as the pipeline script.
3. Execute the pipeline and view the results.

## Instrucciones en Español

### Descripción del Pipeline de Jenkins
1. **Etapa de Construcción (Build)**: Esta etapa recupera el código del repositorio de GitHub proporcionado y ejecuta Maven para compilar y empaquetar el código.
2. **Etapa de Pruebas Unitarias (UnitTest)**: Esta etapa utiliza Maven para ejecutar pruebas unitarias. Los resultados de estas pruebas se capturan como informes XML que se pueden ver en Jenkins.

### Requisitos
- Jenkins con los plugins necesarios instalados (Maven, Git, JUnit).
- Configuración de Maven en el entorno de Jenkins.

### Ejecución
Para ejecutar el pipeline:
1. Asegúrese de haber configurado Jenkins para reconocer su instalación de Maven.
2. Cree un nuevo trabajo de pipeline y utilice el `Jenkinsfile` proporcionado como el script del pipeline.
3. Ejecute el pipeline y vea los resultados.


Created by: SDET-Michael A. Camacho
