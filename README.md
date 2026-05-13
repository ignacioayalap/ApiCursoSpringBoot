# Api Curso Spring Boot

Este es un proyecto de una API RESTful desarrollada con **Spring Boot** y **Java**, construida bajo una arquitectura genérica y escalable para facilitar la mantenibilidad y extender nuevas entidades rápidamente.

## 🛠️ Tecnologías Utilizadas

- **Java 17+**
- **Spring Boot** (Web, Data JPA)
- **Hibernate Envers** (Para auditoría de entidades)
- **Lombok** (Para reducir el código repetitivo)
- **Bases de Datos Relacionales**
- **Gradle** (Como gestor de dependencias)

## 🏗️ Arquitectura del Proyecto

El proyecto implementa una estructura genérica mediante el uso de clases y controladores base:

- **`BaseEntity` / `Base`**: Clase padre con el identificador único (`Id`) y configuraciones comunes.
- **`BaseRepository<E, Id>`**: Interfaz genérica para realizar operaciones a la base de datos (JPA).
- **`BaseService<E, Id>`** & **`BaseServiceImpl`**: Contienen toda la lógica de negocio estándar (CRUD) y de paginación (`Pageable`).
- **`BaseController<E, Id>`** & **`BaseControllerImpl`**: Exponen los endpoints RESTful estándar para cualquier entidad que herede de ellos.

### Entidades Disponibles
Actualmente la API gestiona las siguientes entidades:
- **Persona** (y sus Libros/Domicilio asociados)
- **Autor**
- **Localidad**
- **Libro**
- **Domicilio**

## 🚀 Endpoints Principales

Cada entidad que extienda de los controladores base expone automáticamente las siguientes rutas genéricas:

*Reemplazar `{entidad}` por `personas`, `autores` o `localidades`.*

- `GET /api/v1/{entidad}`: Obtiene todos los registros.
- `GET /api/v1/{entidad}/paged`: Obtiene todos los registros con paginación (`?page=0&size=10`).
- `GET /api/v1/{entidad}/{id}`: Obtiene un registro específico por su ID.
- `POST /api/v1/{entidad}`: Crea un nuevo registro.
- `PUT /api/v1/{entidad}/{id}`: Actualiza un registro existente.
- `DELETE /api/v1/{entidad}/{id}`: Elimina un registro existente.

### Endpoints Personalizados

- `GET /api/v1/personas/search?filtro={texto}`: Búsqueda personalizada en nombres y apellidos.
- `GET /api/v1/personas/searchPaged?filtro={texto}&page=0&size=10`: Búsqueda personalizada con paginación.

## ⚙️ Cómo Ejecutar el Proyecto

1. Clona el repositorio.
2. Configura los accesos a la base de datos en tu archivo `application.properties` o `application.yml`.
3. Ejecuta el comando en tu terminal (en la raíz del proyecto):
   ```bash
   ./gradlew bootRun
   ```
4. La aplicación estará corriendo por defecto en `http://localhost:8080` (o el puerto configurado).
