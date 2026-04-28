
---

# Factory Pattern: Problem Statements

## 1. Payment Method Factory (Based on Provided Code)

**Scenario:**  
You are building a payment processing system that supports multiple payment methods (e.g., UPI, Credit Card, Net Banking).
- The system should be able to create the appropriate payment object based on user selection.
- The client should not need to know the details of how each payment method is implemented.

**Requirements:**
- Provide a factory that creates payment objects based on a given type.
- Allow easy addition of new payment methods without changing client code.
- Ensure all payment methods implement a common interface.

---

## 2. Notification Service Factory

**Scenario:**  
A notification system needs to send messages via different channels (Email, SMS, Push Notification, WhatsApp, etc.).
- The system should be able to create the appropriate notification service based on configuration or user preference.

**Requirements:**
- Implement a factory that returns the correct notification service object.
- All notification services should implement a common interface.
- Support easy extension for new notification channels.

---

## 3. Document Export Engine Factory

**Scenario:**  
A document editor allows users to export documents in various formats (PDF, DOCX, HTML, Markdown, etc.).
- The export logic for each format is different and should be encapsulated.

**Requirements:**
- Provide a factory to create the appropriate export engine based on the selected format.
- All export engines should implement a common interface.
- Allow new export formats to be added with minimal changes.

---

## 4. Logger Factory

**Scenario:**  
An application needs to log messages to different destinations (console, file, database, remote server, etc.).
- The logging mechanism should be configurable and extensible.

**Requirements:**
- Implement a factory that creates logger objects for different destinations.
- All loggers should implement a common interface.
- Support easy addition of new logging destinations.

---

## 5. Database Connection Factory

**Scenario:**  
An application supports multiple databases (MySQL, PostgreSQL, MongoDB, Oracle, etc.).
- The application should be able to obtain a connection to the desired database without hardcoding the connection logic.

**Requirements:**
- Provide a factory that returns the correct database connection object based on configuration.
- All database connections should implement a common interface.
- Allow new database types to be added easily.

---

These scenarios demonstrate how the Factory Pattern helps in creating objects without exposing the instantiation logic to the client, promoting flexibility and scalability.