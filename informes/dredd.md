Los tests no se generaron en build/reports/dredd.md, así que con STDOUT & STDERR generé este archivo.
Únicamente aparecen los `.html` .
 
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :checkstyleTest UP-TO-DATE

> Task :test FAILED

Probando los tests > Dos mas cuatro PASSED

Probando los tests > Este falla a proposito FAILED
    org.opentest4j.AssertionFailedError: Esto tiene sus usos!
        at app//org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:38)
        at app//org.junit.jupiter.api.Assertions.fail(Assertions.java:138)
        at app//ar.unrn.DesordenadoAppTest.falla(DesordenadoAppTest.java:21)

> Task :checkstyleMain FAILED

[Incubating] Problems report is available at: file:///home/milkotiz/dev/p2/tp1-2026-lampertizi/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.3.1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.
5 actionable tasks: 2 executed, 3 up-to-date
