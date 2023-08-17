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

Created by: SDET-Michael A. Camacho
