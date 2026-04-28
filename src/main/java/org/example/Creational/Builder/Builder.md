
---

# Builder Pattern: Problem Statements

## 1. HTTP Request Builder

**Scenario:**  
You are developing an HTTP client library.
- HTTP requests can have many optional parameters (headers, query params, body, authentication, etc.).
- Constructing a request with all possible combinations of parameters using constructors is cumbersome and error-prone.

**Requirements:**
- Provide a builder to construct HTTP requests step by step.
- Allow setting only the required parameters and any combination of optional ones.
- Ensure the final request object is immutable and valid.

---

## 2. Pizza Order System

**Scenario:**  
A pizza ordering app allows customers to customize their pizza (size, crust, cheese, toppings, sauces, etc.).
- Each pizza can have a different combination of options.

**Requirements:**
- Use a builder to construct pizza orders with various customizations.
- Allow customers to specify only the options they want.
- Make the pizza order creation process flexible and readable.

---

## 3. SQL Query Builder

**Scenario:**  
You are building a tool to generate SQL queries dynamically.
- Queries can have various clauses (SELECT, WHERE, JOIN, GROUP BY, ORDER BY, etc.), and not all are always needed.

**Requirements:**
- Provide a builder to construct SQL queries step by step.
- Allow chaining of methods to add different clauses.
- Ensure the generated query is syntactically correct.

---

## 4. User Profile Registration

**Scenario:**  
A user registration system collects various details (name, email, phone, address, profile picture, preferences, etc.).
- Not all fields are mandatory, and users may provide different sets of information.

**Requirements:**
- Use a builder to create user profile objects with optional fields.
- Allow flexible and readable profile creation.
- Ensure the resulting profile object is valid and complete as per business rules.

---

## 5. Email Message Builder

**Scenario:**  
An email sending service needs to construct email messages with various optional parts (to, cc, bcc, subject, body, attachments, etc.).
- Not all fields are required for every email.

**Requirements:**
- Provide a builder to construct email messages step by step.
- Allow setting only the fields needed for a particular email.
- Ensure the final email object is valid and ready to send.

---

These scenarios demonstrate how the Builder Pattern helps in constructing complex objects step by step, especially when many optional parameters are involved, promoting readability and maintainability.