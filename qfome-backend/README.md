# QFome Backend (MVP simples)

Backend inicial do QFome com foco em simplicidade para apresentacao de MVP.

## O que tem aqui
- Java 21
- Spring Boot 3.5
- Spring Web
- Spring Actuator
- Spring Data JPA
- H2 em arquivo local (sem Docker e sem Postgres)

## Rodar local
No Windows:
```bash
mvnw.cmd spring-boot:run
```

No Linux/Mac:
```bash
./mvnw spring-boot:run
```

## Endpoints uteis
- Health: `GET http://localhost:8080/actuator/health`
- Console H2: `http://localhost:8080/h2-console`

## Configuracoes
- `src/main/resources/application.yml`: config unica do projeto
- `.env.example`: variaveis basicas (porta e CORS)
