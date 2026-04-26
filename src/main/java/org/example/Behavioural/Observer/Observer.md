## Problem 1

### Scenario

You are building an order processing system for an e-commerce platform. When a customer places an order, the system should notify multiple services, such as:

- **Email Service** (to send order confirmation emails)
- **SMS Service** (to send order status updates via SMS)
- **Push Notification Service** (to send app notifications)

Initially, you might call each notification service directly from the order processing code. However, this approach is not flexible and makes it difficult to add or remove notification channels in the future.

You want a more extensible solution where:
- The order service does not need to know the details of each notification service.
- New notification services can be added or removed without modifying the order processing logic.
- All registered notification services are automatically notified when an order is placed.

---

### Requirements

- Decouple the order processing logic from the notification services.
- Allow multiple notification services to subscribe or unsubscribe to order events at runtime.
- Ensure all registered observers are notified automatically when an order is placed.
- The system should be flexible to add or remove notification services without changing the core order processing code.

## Problem 2

### Scenario

You are building a YouTube-like platform where users can subscribe to channels. When a channel uploads a new video, all its subscribers should be notified automatically.

---

### Requirements

- Allow users to subscribe or unsubscribe to channels at any time.
- When a channel uploads a new video, all current subscribers should be notified.
- The system should be flexible to add new notification types (e.g., email, push) without changing channel logic.
- Decouple the channel’s upload logic from the notification mechanism.

---

## Problem 3

### Scenario

You are developing a stock price tracker application. Multiple clients (e.g., mobile apps, dashboards, alerting services) want to receive real-time updates whenever the price of a stock changes.

---

### Requirements

- Allow clients to subscribe or unsubscribe to stock price updates at runtime.
- When a stock price changes, all subscribed clients should be notified automatically.
- The system should be flexible to add new types of clients or notification channels.
- Decouple the stock price update logic from the client notification logic.

---

## Problem 4

### Scenario

You are designing a weather station system. Various display devices (e.g., LCD display, mobile app, web dashboard) need to show the latest weather data (temperature, humidity, etc.) as soon as it changes.

---

### Requirements

- Allow display devices to subscribe or unsubscribe to weather updates at runtime.
- When weather data changes, all subscribed displays should be updated automatically.
- The system should be flexible to add new types of displays or notification methods.
- Decouple the weather data collection from the display update logic.

---

## Problem 5

### Scenario

You are building an online auction system. Multiple bidders participate in an auction for an item. Whenever a new highest bid is placed, all bidders should be notified immediately.

---

### Requirements

- Allow bidders to join or leave an auction at any time.
- When a new highest bid is placed, all current bidders should be notified.
- The system should be flexible to add new notification channels (e.g., SMS, email).
- Decouple the auction logic from the bidder notification logic.

---

## Problem 6

### Scenario

You are developing an event management system. Multiple services (e.g., ticketing, catering, security) need to be notified when a new event is created or updated.

---

### Requirements

- Allow services to subscribe or unsubscribe to event notifications at runtime.
- When an event is created or updated, all subscribed services should be notified automatically.
- The system should be flexible to add new services or notification channels.
- Decouple the event creation/update logic from the service notification logic.
