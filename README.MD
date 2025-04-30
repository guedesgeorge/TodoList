# 📝 To-Do List em Java

Este projeto é uma aplicação de **lista de tarefas (To-Do List)** desenvolvida em **Java**, com persistência de dados em um **banco de dados online**. O objetivo principal é permitir que usuários possam cadastrar, listar, atualizar e remover tarefas de forma simples e prática.

## 🚀 Funcionalidades

- ✅ Adicionar nova tarefa  
- 📋 Listar todas as tarefas  
- ✏️ Editar uma tarefa existente  
- ❌ Remover uma tarefa  
- 🗃️ Armazenamento de dados persistente usando banco de dados online

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 8+)
- **JDBC** (Java Database Connectivity)
- **Banco de Dados Online** (Ex: PostgreSQL com ElephantSQL, PlanetScale, Render, etc.)
- **IDE**: IntelliJ IDEA / Eclipse / VS Code

## 🧱 Estrutura do Projeto

- `Tarefa.java` – Classe que representa a entidade tarefa (id, descrição, status, data de criação)
- `TarefaDAO.java` – Classe responsável pelas operações no banco de dados (CRUD)
- `Conexao.java` – Responsável pela conexão com o banco de dados online
- `Main.java` – Interface simples no console para interação com o usuário

## 💾 Banco de Dados

A conexão com o banco de dados é feita por meio de uma URL externa, como por exemplo:

```java
String url = "jdbc:postgresql://<host>:<porta>/<database>";
String usuario = "<usuario>";
String senha = "<senha>";
