# ♻️ Reciclagem API

API RESTful desenvolvida em Java com Spring Boot para gerenciamento de pontos de coleta recicláveis, alinhada aos princípios ESG (Environmental, Social and Governance).

---

# 📌 Objetivo do Projeto

O projeto tem como objetivo auxiliar no gerenciamento de pontos de coleta de resíduos recicláveis, permitindo cadastro, consulta, atualização e remoção de informações de coleta sustentável.

---

# 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- Swagger / OpenAPI
- Oracle Database
- Flyway
- Docker
- Maven

---

# 📂 Estrutura do Projeto

```txt
src/main/java/br/com/fiap/reciclagem
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── config
```

---

# 🔥 Funcionalidades Implementadas

✅ CRUD completo de pontos de coleta

✅ Validação de dados com Bean Validation

✅ Tratamento global de exceções

✅ Segurança com Spring Security

✅ Documentação automática com Swagger

✅ Respostas HTTP RESTful

✅ Integração com Oracle Database

✅ Migrations automáticas com Flyway

✅ Execução completa via Docker

---

# 📌 Endpoints Disponíveis

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/pontos-coleta` | Listar todos os pontos |
| GET | `/pontos-coleta/{id}` | Buscar ponto por ID |
| POST | `/pontos-coleta` | Cadastrar novo ponto |
| PUT | `/pontos-coleta/{id}` | Atualizar ponto |
| DELETE | `/pontos-coleta/{id}` | Remover ponto |

---

# 🔐 Segurança

A aplicação utiliza Spring Security para proteção dos endpoints.

## Usuário padrão

```txt
admin
```

## Senha padrão

```txt
123456
```

---

# 📖 Swagger

A documentação da API pode ser acessada em:

```txt
http://localhost:8080/swagger-ui.html
```

---

# 🐳 Docker

A aplicação pode ser executada totalmente em containers Docker, incluindo:

- API Spring Boot
- Oracle Database

## Executar containers

```bash
docker compose up --build
```

---

# ▶️ Como Executar o Projeto

## 1️⃣ Clonar repositório

```bash
git clone URL_DO_REPOSITORIO
```

---

## 2️⃣ Entrar na pasta

```bash
cd reciclagem-api
```

---

## 3️⃣ Executar com Docker

```bash
docker compose up --build
```

---

# 🧪 Exemplos de Requisição

## POST /pontos-coleta

```json
{
  "nome": "Eco Ponto Praia",
  "endereco": "Av. Beira Mar, 500",
  "tipoResiduo": "Vidro",
  "capacidade": 200,
  "ativo": 1
}
```

---

# 📌 Respostas HTTP Utilizadas

| Código | Significado |
|---|---|
| 200 | OK |
| 201 | Created |
| 204 | No Content |
| 400 | Bad Request |
| 404 | Not Found |

---

# 🗄️ Banco de Dados

A aplicação utiliza Oracle Database executando em container Docker.

O Flyway é responsável pelo versionamento e criação automática das tabelas do banco de dados.

---

# 👨‍💻 Integrantes

- [Iara Venâncio](https://github.com/Iaravenancio)
- [Jessica Ghirardelli Tinguely](https://github.com/jessicatinguely)
- [Caio Riva](https://github.com/caaioriva)

---

# 📚 Projeto Acadêmico - FIAP

Projeto desenvolvido para disciplina de Java Advanced / Spring Boot com foco em arquitetura RESTful e soluções ESG.