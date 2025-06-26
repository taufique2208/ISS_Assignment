
# 🌐 Client Server Applications


## ✅ 1. Hello World Web App

A basic dynamic web app that displays a "Hello World" message via JSP and runs on Tomcat.

### 📂 Folder: `HelloWorld/`


## ✅ 2. Login/Register App (MySQL + JSP/Servlet)

A full-featured login and registration web application with JDBC-backed MySQL integration.

### 📂 Folder: `LoginRegister/`

#### 🧾 Pages

| File             | Description                                  |
| ---------------- | -------------------------------------------- |
| `register.jsp`   | Registration form with JavaScript validation |
| `login.jsp`      | Login form                                   |
| `welcome.jsp`    | Post-login success page                      |
| `error.jsp`      | Generic error page                           |
| `userexists.jsp` | Displays "User already exists" message       |

#### 🚀 Servlets

| Servlet                | URL Mapping | Purpose                                |
| ---------------------- | ----------- | -------------------------------------- |
| `RegisterServlet.java` | `/register` | Handles registration and DB insertions |
| `LoginServlet.java`    | `/login`    | Validates login credentials            |
| `LogoutServlet.java`   | `/logout`   | Ends session and redirects to login    |

---

### ✅ MySQL Table Schema

```sql
CREATE DATABASE loginapp;

USE loginapp;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);
```

## 🖥️ Prerequisites

* Java 21
* Eclipse IDE for Enterprise Java
* Apache Tomcat 9/10
* MySQL Server
* JARs in `WEB-INF/lib/`:

  * `mysql-connector-java-8.0.xx.jar`

---

## ▶️ How to Run

### For Both Apps:

1. Open Eclipse → `File → New → Dynamic Web Project`
2. Import or recreate `HelloWorld` and `LoginRegister`
3. Right-click the project → `Run As → Run on Server`
4. Choose your **Apache Tomcat** server
5. Access via browser:

   * Hello World:
     `http://localhost:8080/helloworldwebapp/`
   * Login/Register:
     `http://localhost:8080/loginregisterwebapp/login.jsp`

