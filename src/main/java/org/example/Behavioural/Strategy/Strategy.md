## Problem 1

### Scenario

You are building a payment processing system for an e-commerce platform. Customers can pay using different methods such as **UPI** and **Card**. The way payment is processed depends on the selected payment method.

Initially, you might use conditional statements to handle each payment type, but this approach is not flexible and makes it difficult to add new payment methods.

You want a solution where:
- The payment processing logic is decoupled from the payment method.
- New payment methods can be added without modifying the core payment service.

---

### Requirements

- Encapsulate each payment method (UPI, Card, etc.) as a separate strategy.
- The payment service should use the selected strategy to process payments.
- The system should be flexible to add new payment methods without changing the core logic.
- Avoid using large `if-else` or `switch` statements for payment method selection.

---

## Problem 2

### Scenario

You are developing a **route navigation** system for a mapping application. Users can choose different navigation strategies such as **fastest route**, **shortest route**, or **scenic route**.

The navigation algorithm should be selected at runtime based on user preference.

---

### Requirements

- Implement each navigation strategy as a separate strategy.
- The navigation system should use the selected strategy to calculate the route.
- The system should be flexible to add new navigation strategies without modifying the core logic.

---

## Problem 3

### Scenario

You are building a **file compression** tool that supports multiple compression algorithms such as **ZIP**, **RAR**, and **TAR**. The user should be able to select the desired compression algorithm at runtime.

---

### Requirements

- Implement each compression algorithm as a separate strategy.
- The compression tool should use the selected strategy to compress files.
- The system should be flexible to add new compression algorithms without changing the core logic.

---

## Problem 4

### Scenario

You are designing a **sorting utility** that can sort data using different algorithms such as **QuickSort**, **MergeSort**, and **BubbleSort**. The sorting algorithm should be selected at runtime based on the data or user preference.

---

### Requirements

- Implement each sorting algorithm as a separate strategy.
- The sorting utility should use the selected strategy to sort data.
- The system should be flexible to add new sorting algorithms without modifying the core logic.

---

## Problem 5

### Scenario

You are developing a **discount calculator** for an online store. Different discount strategies (e.g., **percentage discount**, **fixed amount discount**, **buy-one-get-one**) can be applied to orders.

The discount strategy should be selected at runtime based on the promotion or user eligibility.

---

### Requirements

- Implement each discount type as a separate strategy.
- The discount calculator should use the selected strategy to calculate the final price.
- The system should be flexible to add new discount types without changing the core logic.
