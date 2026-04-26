

# Problems

## Problem 1
### Scenario

You are building a support ticket system for a company. Tickets can be of different severity: **Basic**, **Medium**, or **Critical**.

Each level of support (**Team Lead**, **Manager**, **Director**) can handle certain types of tickets. If a ticket is too severe for one level, it should be escalated to the next.

---

### Requirements

- Each support level should only handle requests it is responsible for.
- If a request cannot be handled, it should be passed to the next level.
- The system should be flexible to add or remove support levels without changing the core logic.

## Problem 2

### Scenario

You are designing a logging system that receives messages with different severity levels: **INFO**, **DEBUG**, and **ERROR**.

Traditionally, you might use multiple `if-else` statements to determine how to handle each message. However, you want a more flexible and maintainable approach.

Each log level should be handled by a separate processor. If a processor cannot handle a message (for example, a DEBUG processor receives an ERROR message), it should pass the message to the next processor in the chain.

---

### Requirements

- Each log level (INFO, DEBUG, ERROR) should have its own processor.
- Processors should be linked in a chain, passing messages they cannot handle to the next processor.
- The system should be easy to extend with new log levels or processors without modifying existing code.
- Avoid using large `if-else` or `switch` statements for log level handling.

## Problem 3

### Scenario

You are building an expense approval system for a company. Employees submit expense claims that need to be approved based on the amount.

- A **Team Lead** can approve expenses up to ₹5,000.
- A **Manager** can approve expenses up to ₹25,000.
- A **Director** can approve expenses up to ₹1,00,000.

If an expense exceeds the approval limit of one role, it should be passed to the next level in the chain for approval.

---

### Requirements

- Each approver (Team Lead, Manager, Director) should only approve expenses within their limit.
- If an approver cannot approve a claim, it should be passed to the next approver in the chain.
- The system should be flexible to add or remove approvers or change approval limits without modifying the core logic.
## Problem 4

### Scenario

You are designing the middleware pipeline for a web server that processes HTTP requests. Each request must pass through a series of checks:

- **Authentication Check**
- **Rate Limiter**
- **Input Validator**
- **Actual Request Handler**

If any middleware fails (e.g., authentication fails, rate limit exceeded, or input is invalid), the request should be stopped immediately and an error should be returned. Only if all checks pass should the request reach the actual handler.

---

### Requirements

- Each middleware (authentication, rate limiter, validator, handler) should be implemented as a separate processor.
- Middleware should be linked in a chain, passing the request to the next processor only if the current check passes.
- If any middleware fails, processing should stop and an appropriate error should be returned.
- The system should be flexible to add, remove, or reorder middleware components without changing the core logic.

---

## Problem 5

### Scenario

You are building the cash dispenser logic for an ATM. When a user requests a withdrawal, the ATM should dispense cash in the following denominations (in order): **₹2000**, **₹500**, **₹200**, **₹100**.

The ATM should try to use the largest denominations first. If the requested amount cannot be dispensed exactly using these denominations (i.e., the amount is not a multiple of 100), the ATM should reject the request as invalid.

---

### Requirements

- Each denomination (₹2000, ₹500, ₹200, ₹100) should be handled by a separate processor.
