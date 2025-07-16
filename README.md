f# 📋 Criando seu Board de Tarefas com Java

Projeto desenvolvido como parte do desafio **"Criando seu Board de Tarefas com Java"** promovido pela [DIO Academy](https://www.dio.me).

O objetivo é criar um sistema simples de gerenciamento de tarefas (Board/Kanban) utilizando Java puro, boas práticas de arquitetura e persistência com JDBC.

---

## 🚀 Tecnologias Utilizadas

- ☕ **Java 17+**
- 🧩 **JDBC (Java Database Connectivity)**
- 🐬 **MySQL**
- 🧱 **Maven** *(ou Gradle, dependendo da sua versão)*
- 🧪 JUnit (caso inclua testes)
- ❌ **Sem frameworks adicionais** (Spring, Hibernate etc.)

---

## 🗂️ Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/
│   │   └── br/
│   │       └── com/
│   │           └── dio/
│   │               ├── config/                # Configuração de conexão com o banco
│   │               ├── converter/             # Conversores de tipos (ex: Timestamp ↔ OffsetDateTime)
│   │               ├── exception/             # Exceções personalizadas
│   │               ├── model/                 # Entidades e modelos de domínio

````

---

## 🛠️ Como Executar o Projeto

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/Matheus-Dev-Souza/Criando-seu-Board-de-Tarefas-com-Java.git
   cd Criando-seu-Board-de-Tarefas-com-Java
   ```

2. **Configure o banco MySQL**:

   * Crie um banco de dados:

     ```sql
     CREATE DATABASE board;
     ```
   * Usuário/senha padrão: `board / board`
   * Execute o arquivo `schema.sql` para criar as tabelas

3. **Compile e execute**:

   * Com Maven:

     ```bash
     mvn clean compile exec:java
     ```
   * Ou configure sua IDE (Eclipse, IntelliJ, VS Code) para executar a `main`

---

## 📌 Funcionalidades Esperadas

* [x] Conexão com banco de dados via JDBC
* [x] Cadastro de tarefas
* [x] Listagem de tarefas
* [x] Atualização de status
* [x] Exclusão de tarefas
* [ ] Interface gráfica (não obrigatória)
* [ ] Testes automatizados (em desenvolvimento)

---

## 📦 Padrões e Boas Práticas

* Classes utilitárias `final` com construtores privados
* Exceções personalizadas com `serialVersionUID`
* Separação de camadas: configuração, modelo, repositório, etc.
* Convenção de commits semânticos
* Código limpo e comentado

---

## 🤝 Contribuições

Este projeto foi desenvolvido como parte de um desafio educacional. Pull requests são bem-vindos para melhorias futuras.

---

## 🧠 Autor

Desenvolvido por **Matheus Gonçalves** como parte do bootcamp **[DIO Java Developer](https://www.dio.me/bootcamps)**.

* GitHub: [github.com/Matheus-Dev-Souza](https://github.com/Matheus-Dev-Souza)


