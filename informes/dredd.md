# El juez Dredd

## Checkstyle código

## Checkstyle Report - Dredd
**Version checkstyle:** 10.21.4
### Archivos procesados
    
#### Archivo: src/main/java/ar/unrn/DesordenadoApp.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|[0x1001] Falta documentación Javadoc para el atributo|4|
|error|[0x1001] Falta documentación Javadoc para el método|6|
|error|[0x1001] Falta documentación Javadoc para el método|13|

#### Archivo: src/main/java/ar/unrn/PlantillaApp.java
##### Archivo OK.
    
#### Archivo: src/main/java/ar/unrn/HolaApp.java
| tipo | mensaje | línea |
|:----:|:-------:|-------|
|error|[0x1001] Falta documentación Javadoc para el método|7|

#### Archivo: src/main/java/ar/unrn/LoaderApp.java
##### Archivo OK.
    
## PMD código

## PMD
    
### Archivo src/main/java/ar/unrn/DesordenadoApp.java
#### CommentRequired de Documentation en la línea 13
 - Descripción:  Public method and constructor comments are required 
 - Encontrado en: package: `ar.unrn`, clase: `DesordenadoApp` método: `suma` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.16.0/pmd_rules_java_documentation.html#commentrequired)
 
  
### Archivo src/main/java/ar/unrn/LoaderApp.java
#### CommentDefaultAccessModifier de Code Style en la línea 35
 - Descripción:  Missing commented default access modifier on method 'main(String[])' 
 - Encontrado en: package: `ar.unrn`, clase: `LoaderApp` método: `main` variable: ``
 [+Información](https://docs.pmd-code.org/pmd-doc-7.16.0/pmd_rules_java_codestyle.html#commentdefaultaccessmodifier)
 
  
#### UseVarargs de Best Practices en la línea 35
 - Descripción:  Consider using varargs for methods or constructors which take an array the last parameter. 
 - Encontrado en: package: `ar.unrn`, clase: `LoaderApp` método: `main` variable: `args`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.16.0/pmd_rules_java_bestpractices.html#usevarargs)
 
  
#### LocalVariableNamingConventions de Code Style en la línea 118
 - Descripción:  The final local variable name 'EXTENSION' doesn't match '[a-z][a-zA-Z0-9]*' 
 - Encontrado en: package: `ar.unrn`, clase: `LoaderApp` método: `findClasses` variable: `EXTENSION`
 [+Información](https://docs.pmd-code.org/pmd-doc-7.16.0/pmd_rules_java_codestyle.html#localvariablenamingconventions)
 
  
## SpotBugs
| Tipo | Categoría | Clase | Mensaje |
|:----:|:---------:|:-----:|:--------|
|VA_FORMAT_STRING_USES_NEWLINE|BAD_PRACTICE|ar.unrn.HolaApp|Format string should use %n rather than \n in ar.unrn.HolaApp.main(String[])|

## Cobertura de código (JaCoCo)
No se encontró el reporte de cobertura.

## Conan ejecuta los Tests

        
### Probando los tests
Total de tests: 2. De los cuales, fallos en: 1, errores en: 0
- Dos mas cuatro (en 0.016 segundos): Pasó
- Este falla a proposito (en 0.007 segundos): Falló

