# Jenkins-DEV-TEST-Architecture

# Ubicación de los Unit Tests para el Pipeline de Jenkins
# Introducción
Este documento especifica la estructura de directorios recomendada para asegurarse de que los unit tests sean detectados y ejecutados correctamente en el pipeline de Jenkins.

# Estructura de Directorios
En un proyecto Maven típico, la estructura de directorios sigue un formato estándar. Los unit tests deben estar ubicados en el siguiente directorio:

src/test/java/

Dentro de este directorio, deberías colocar tus pruebas unitarias en paquetes que reflejen la estructura del código fuente principal. Por ejemplo, si tienes una clase en src/main/java/com/miapp/ClasePrincipal.java, entonces el unit test para esa clase debería estar en src/test/java/com/miapp/ClasePrincipalTest.java.

# Configuración en el pom.xml
Asegúrate de que tu archivo pom.xml contenga la configuración adecuada para la ejecución de tests, como la dependencia de JUnit y el plugin maven-surefire-plugin. El plugin maven-surefire-plugin es el encargado de ejecutar los tests en un proyecto Maven.

```xml
<dependencies>
    <!-- Dependencia de JUnit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>[versión]</version>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <!-- Plugin maven-surefire para ejecutar tests -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>[versión]</version>
        </plugin>
    </plugins>
</build>
```

# Conclusion
Mantener una estructura de directorios estándar y una configuración correcta en el pom.xml es esencial para que los unit tests se ejecuten correctamente en el pipeline de Jenkins. Asegúrate de seguir las recomendaciones mencionadas para evitar problemas durante la ejecución de las pruebas.


# Englis Version
# Jenkins-DEV-TEST-Architecture

# Location of Unit Tests for Jenkins Pipeline
# Introduction
This document specifies the recommended directory structure to ensure that unit tests are detected and run correctly in the Jenkins pipeline.

# Directory Structure
In a typical Maven project, the directory structure follows a standard format. The unit tests should be located in the following directory:

src/test/java/

Within this directory, you should place your unit tests in packages that reflect the structure of the main source code. For example, if you have a class in src/main/java/com/myapp/MainClass.java, then the unit test for that class should be in src/test/java/com/myapp/MainClassTest.java.

# Configuration in pom.xml
Make sure your pom.xml file contains the appropriate settings for test execution, such as the JUnit dependency and the maven-surefire-plugin. The maven-surefire-plugin is responsible for running the tests in a Maven project.

```xml
<dependencies>
    <!-- JUnit Dependency -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>[version]</version>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <!-- maven-surefire plugin to run tests -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>[version]</version>
        </plugin>
    </plugins>
</build>
```

# Conclusion
Maintaining a standard directory structure and correct configuration in the pom.xml is essential for unit tests to run correctly in the Jenkins pipeline. Make sure to follow the mentioned recommendations to avoid issues during test execution.

Created by: SDET-Michael A. Camacho

--- 

You can copy and paste the above content as needed!

Created by: SDET-Michael A. Camacho
