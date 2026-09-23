# BookStore — Full-Featured Book Store Web Application

A Java/Spring Boot BookStore web application extended from a basic CRUD project into an academic/demo e-commerce system.

## Core modules
- User registration and login
- BCrypt password hashing
- Role-based access: USER and ADMIN
- Admin dashboard and order-status management
- Book CRUD management
- Book search and category filtering
- Book descriptions and image URL support
- Book reviews and 1–5 star ratings
- User-specific shopping cart
- Checkout and order management
- Inventory/stock management
- Demo payment methods (no real payment gateway)
- Email notification service with optional SMTP configuration
- REST API for books and statistics
- JWT login endpoint for API clients
- Thymeleaf web UI
- H2 local database for easy demonstration
- MySQL-ready profile
- Maven project structure
- Basic Spring Boot context test
- Optional React frontend starter

## Technology stack
Java 17, Spring Boot 3.5.x, Spring MVC, Spring Security, Spring Data JPA, Hibernate, Thymeleaf, HTML5, CSS3, JavaScript, H2, MySQL, Maven, JJWT, JavaMail.

## Demo accounts
| Role | Username | Password |
|---|---|---|
| Admin | admin | admin123 |
| User | user | user123 |

Change demo credentials before any public deployment.

## Run locally
1. Install JDK 17+ and Maven 3.6.3+.
2. From the project root run:

```bash
mvn clean spring-boot:run
```

3. Open `http://localhost:1001`.

The default configuration uses an H2 file database, so MySQL is not required for the demo.

## MySQL
Create a database named `book`, then run with the MySQL profile:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```

Update `src/main/resources/application-mysql.properties` with your MySQL credentials.

## Main workflow
1. User registers or logs in.
2. User searches books or filters by category.
3. User opens a book and reads details and reviews.
4. User adds books to the personal cart.
5. User checks out using a demo payment option.
6. Inventory is reduced when an order is placed.
7. User can view order history.
8. Admin can view dashboard statistics and update order status.

## Architecture
```text
Browser / Thymeleaf UI
        ↓
Spring MVC Controllers
        ↓
Services
        ↓
Spring Data JPA / Hibernate
        ↓
H2 or MySQL
```

## REST API
- `GET /api/books`
- `GET /api/books?q=java`
- `GET /api/books?category=Programming`
- `GET /api/stats`
- `POST /api/auth/login` — returns a JWT for valid credentials

## Important folders
- `src/main/java/com/bookstore/entity` — JPA entities and enums
- `src/main/java/com/bookstore/controller` — web controllers
- `src/main/java/com/bookstore/api` — REST API controller
- `src/main/java/com/bookstore/repository` — repositories
- `src/main/java/com/bookstore/service` — business services
- `src/main/java/com/bookstore/security` — Spring Security and JWT support
- `src/main/java/com/bookstore/config` — security and seed configuration
- `src/main/resources/templates` — Thymeleaf pages
- `src/main/resources/static` — CSS/JS
- `frontend-react` — optional React frontend starter; the main application uses Thymeleaf

## Payment and email note
This academic version includes a **demo payment flow** and an **email notification service**. It does not process real card payments. Real SMTP credentials are required to send real emails. A production payment gateway such as Razorpay or Stripe would require merchant credentials and additional integration.

## Important security note
The included credentials and JWT secret are development/demo values only. Change them before any public deployment.

## Future enhancements
- Real payment gateway integration
- Production email/SMS provider
- Cloud image storage
- More comprehensive unit/integration tests
- Production-grade API authentication and authorization
- CI/CD deployment
