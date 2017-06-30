## How to generate

# api server

Aufruf aus dem root Verzeichnis des Projekts  (bei mir ~/src/whodrivesnext)

      swagger-codegen generate -i src/main/resources/swagger.yaml -l spring --invoker-package de.whodrivesnext.invoker --model-package de.whodrivesnext.model --api-package de.whodrivesnext.api

Known issues:
* erzeugt noch files in ./src/main/java/io/swagger/configuration
* erzeugt (und überschreibt damit)  noch das ./README.md file 
