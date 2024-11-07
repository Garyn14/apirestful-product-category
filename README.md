# Product Service API 📦

🌟 **Product Service API** is a RESTful project designed to efficiently manage products and categories. It follows best practices and handles errors using an error catalog and global management with `@RestControllerAdvice`.

---

## 🛠️ Technologies Used

- **Spring Boot 3**
- **MySQL**
- **MapStruct**
- **Spring Data JPA**

---

## 📚 API Endpoints

The API exposes the following endpoints for managing products and categories. The base path is `api/v1/products`:

| Method | Endpoint                              | Description                    |
|--------|---------------------------------------|--------------------------------|
| GET    | `/api/v1/products/{id}`               | Retrieve a product by its ID. |
| GET    | `/api/v1/products`                    | List all products.            |
| GET    | `/api/v1/products/categories/{id}`    | List products by category.    |
| POST   | `/api/v1/products`                    | Create a new product.         |
| PUT    | `/api/v1/products/{id}`               | Update an existing product.   |
| DELETE | `/api/v1/products/{id}`               | Delete a product by its ID.   |

---

## 🎯 Project Goals

1. Build a robust and user-friendly RESTful API.
2. Follow best practices such as:
   - Dependency injection.
   - Global error handling with `@RestControllerAdvice`.
   - Efficient mappings between DTOs and entities using **MapStruct**.
3. Ensure consistency in CRUD operations for products and categories.

---

## 🏗️ Project Architecture

The project follows a layered architecture to ensure clear separation of responsibilities and maintainability:

1. **Controllers:** Handle incoming requests and respond to clients.
2. **Services:** Contain business logic.
3. **Repositories:** Manage database interactions using **Spring Data JPA**.
4. **Mappers:** Convert entities to DTOs and vice versa using **MapStruct**.
5. **Error Management:** Centralized exception handling with an error catalog.

---
