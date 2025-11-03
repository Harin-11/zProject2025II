# Sistema de Gestión de Biblioteca — Proyecto 2025-II

![Java](https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-blue?style=for-the-badge&logo=postgresql)
![Status](https://img.shields.io/badge/Status-En%20Desarrollo-yellow?style=for-the-badge)

---

## Descripción del Proyecto

Este sistema fue desarrollado como parte del curso **Fundamentos de Java** (Ciclo 2025-II). Tiene como objetivo gestionar los recursos de una biblioteca, permitiendo registrar, editar y eliminar información de libros, autores y categorías, además de realizar búsquedas eficientes y mantener la integridad de los datos mediante una base de datos PostgreSQL.

---

## Autores

| Rol | Nombre |
|-----|--------|
| Desarrollador Backend | **Jack** |
| Desarrollador Backend | **Aldo** |

---

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Thymeleaf**
- **PostgreSQL 15+**
- **pgAdmin 4**
- **Maven**
- **Lombok**

---

## Estructura del Proyecto
```
zProject2025II/
├── src/
│   ├── main/
│   │   ├── java/com/biblioteca/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   └── test/
├── pom.xml
└── README.md
```

---

## Funcionalidades Principales

- Gestión de Libros: CRUD completo (crear, listar, actualizar, eliminar)
- Gestión de Autores y Categorías
- Integración con PostgreSQL
- Interfaz web con Thymeleaf
- Control de errores y validaciones
- Seguridad básica con Spring Security (opcional)

---

## Configuración de Base de Datos

### Crear la base de datos en PostgreSQL
```sql
CREATE DATABASE bibliotecadb;
```

### Configurar credenciales en `application.properties`

Actualizar el archivo `src/main/resources/application.properties` con las siguientes propiedades:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bibliotecadb
spring.datasource.username=postgres
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

---

## Ejecución del Proyecto

### Desde el IDE (Eclipse / IntelliJ / VS Code)

1. Importar el proyecto como Maven Project
2. Esperar que se descarguen las dependencias
3. Ejecutar la clase principal: `com.biblioteca.BibliotecaApplication`
4. Abrir el navegador en: `http://localhost:8071/`

### Comandos Maven
```bash
# Compilar el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
```

### Verificar conexión a la base de datos

Ejecutar en pgAdmin:
```sql
SELECT * FROM libro;
```

---

## Próximas Mejoras

- Implementar autenticación con Spring Security
- Generación de reportes en PDF
- Interfaz web mejorada con Bootstrap
- Documentación de API con Swagger

---

## Licencia

Este proyecto fue desarrollado con fines académicos y educativos.

© 2025 — Jack & Aldo. Todos los derechos reservados.
