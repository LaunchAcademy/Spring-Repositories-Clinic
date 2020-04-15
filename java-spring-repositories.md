# Spring Repositories in Spring Data

---

## What is Spring Data?

- Built **on top** of Hibernate and the JPA
- Supplies **repositories** as a means to save us from writing JPQL

---

## What is a Spring Repository?

- An **interface** that uses convention over configuration to implement queries
- Repository implementations are created at runtime
- Thanks to Dependency Injection and the IoC Container, we don't have to write the class or any JPQL out of the gates

---

## Why not DAO? Is it a DAO?

- A repository is very similar to a DAO, but they work on different levels.
- You can use both together, but due to Spring convention it is prefered to use repositories
- A DAO is mostly used to interact with data at or near the database level and is more loose in definition
- A repository is Spring's built in DAO convention, it is much more concrete in its use and works at a higher level in the program. 
- A repository deals more with the object data closer to the presentation/business part of the application.

## Example Repository


