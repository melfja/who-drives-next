## Code Generator for the server

# run an root of package
# additionaly a .swagger-codegen-ignore file in root is required to supress some unwonted files

swagger-codegen generate -i src/main/resources/swagger.yaml -l spring --invoker-package de.whodrivesnext.invoker --model-package de.whodrivesnext.model --api-package de.whodrivesnext.api
