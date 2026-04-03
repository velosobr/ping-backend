# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run Commands

- **Build**: `./gradlew build`
- **Run**: `./gradlew bootRun`
- **Test all**: `./gradlew test`
- **Test single class**: `./gradlew test --tests "com.velosobr.ping.SomeTestClass"`
- **Test single method**: `./gradlew test --tests "com.velosobr.ping.SomeTestClass.methodName"`
- **Clean**: `./gradlew clean`

## Architecture

Spring Boot 4.0.5 + Kotlin 2.2.21 backend targeting Java 21.

**Stack**: Spring Web MVC, Spring Data JPA (PostgreSQL), Spring Security, WebSocket, Thymeleaf, Spring Mail, Jackson Kotlin module.

**Base package**: `com.velosobr.ping`

**JPA entities** use the Kotlin all-open plugin — classes annotated with `@Entity`, `@MappedSuperclass`, or `@Embeddable` are automatically opened for JPA compatibility.

**Kotlin compiler** is configured with `-Xjsr305=strict` for null-safety interop with Spring annotations.
