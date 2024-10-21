# 📋 Microservices Architecture with Spring Cloud

A project demonstrating microservices architecture using Spring Cloud components, including Eureka, Spring Cloud Gateway, and multiple services.

## 👥 Team Members

- **Antony Boutros**
- **Abdulmajeed Mohamed**
- **Ahmed Haroun**
- **Ahmed Mandour**

## 🛠️ Prerequisites

Ensure you have the following installed:

- **Java JDK 8** or higher
- **MySQL Server**
- **Maven 3**
- **Docker** (to run Redis)

## 🚀 Running the Project

### Step 1: Clone All Repositories

1. Clone each repository to your local machine.

### Step 2: Set Up Databases

Create the necessary MySQL databases:

```sql
CREATE DATABASE admin;
CREATE DATABASE cars;
CREATE DATABASE products; -- Add this line for the product database

-- Create products table
CREATE TABLE products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    description TEXT,
    stock INT NOT NULL,
    shoe_color VARCHAR(50),
    shoe_size VARCHAR(50),
    date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    created_by VARCHAR(255),
    product_image VARCHAR(255),
    brand VARCHAR(255)
);
```
### Step 3: Start Redis

You can run Redis using Docker with the following command:

```bash
docker run --name redis -d -p 6379:6379 redis
```
## Gateway API:
mvn spring-boot:run

## Spring-Cloud (user-service):
mvn spring-boot:run

## product-service:
mvn spring-boot:run

## Step 5: Testing
Use Postman to send requests and test the application. Example endpoints:

User Service: http://localhost:8080/api/users
Product Service: http://localhost:8080/api/products
🔄 Checking for Updates
To check for any updates to the Redis image, you can run the following command:

docker pull redis

This command will fetch the latest version of the Redis image from Docker Hub.


