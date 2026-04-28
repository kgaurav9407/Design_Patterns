
---

# Decorator Pattern: Problem Statements

## 1. Coffee Order System (Starbucks Style)

**Scenario:**  
You are building a coffee ordering system like Starbucks.
- Customers can start with a base coffee (e.g., espresso, latte) and add various toppings (milk, sugar, whipped cream, syrups, etc.).
- Each topping or add-on should be applied dynamically and should not require a new subclass for every combination.

**Requirements:**
- Allow dynamic addition of toppings to a base coffee.
- Each topping should add its own cost and description.
- The system should be open for new toppings without modifying existing code.

---

## 2. Amazon Notification System (Multi-Channel Decorator)

**Scenario:**  
Amazon wants to notify users about order updates through multiple channels: email, SMS, push notification, etc.
- A notification can be sent through one or more channels, and new channels may be added in the future.

**Requirements:**
- Allow notifications to be sent through any combination of channels.
- Each channel should be added dynamically as a decorator.
- The system should be extensible for new notification channels.

---

## 3. Uber Fare Calculation

**Scenario:**  
Uber calculates fares based on a base rate, but additional charges may apply (e.g., surge pricing, tolls, airport fees, discounts).
- These charges should be applied dynamically based on the ride context.

**Requirements:**
- Allow dynamic addition of fare modifiers (e.g., surge, toll, discount).
- Each modifier should adjust the fare calculation.
- The system should be flexible to add new modifiers without changing core logic.

---

## 4. Google Docs Text Formatting (Stream Decorator)

**Scenario:**  
Google Docs allows users to apply multiple text formatting options (bold, italic, underline, highlight, etc.) to a piece of text.
- Formatting can be combined in any order and should be applied dynamically.

**Requirements:**
- Allow dynamic stacking of formatting options on text.
- Each formatting option should be a decorator.
- The system should support new formatting types without altering existing code.

---

## 5. Netflix Data Stream Processing

**Scenario:**  
Netflix processes video data streams with various processing steps (compression, encryption, buffering, analytics tagging, etc.).
- Each processing step should be applied as needed and in any order.

**Requirements:**
- Allow dynamic composition of processing steps on a data stream.
- Each step should be implemented as a decorator.
- The system should be extensible for new processing steps.

---

These scenarios demonstrate how the Decorator Pattern enables dynamic, flexible, and extensible addition of responsibilities to objects without modifying their structure.