## Code Generator for the server

# run an root of package

swagger-codegen generate -i src/main/resources/swagger.yaml -l spring --invoker-package de.whodrivesnext.invoker --model-package de.whodrivesnext.model --api-package de.whodrivesnext.api
