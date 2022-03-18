# API Driven development with Spring Boot and Java

This demo application shows how to create an HTTP REST API based on Spring Boot 2 and Java using openapi code generation.

## Important Notes

### Swagger Codegen

It is using swagger code generation for creating boilerplate code which helps a lot to sync documentation and code
because you have to change the swagger file to have the basic code (re-)generated before you can start or continue
coding. So in this case we chose the specification first approach and generate code from the specs.


## Infrastructure

### Docker

The demo application does not need any infrastructure so the docker files are not provided


## Getting started

```bash
git clone git@github.com:rilindnuka/api-driven-development.git
cd api-driven-development
./mvnw clean package
```
