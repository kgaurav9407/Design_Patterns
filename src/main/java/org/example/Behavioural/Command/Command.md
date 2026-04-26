## Problem 1

### Scenario

You are designing a remote control system for home appliances such as **Light**, **Fan**, and **AC**. The remote should be able to turn each device ON and OFF.

Initially, you might implement the remote with direct method calls for each device (e.g., `pressLightOn()`, `pressFanOff()`). However, this approach is not flexible and makes it difficult to add new devices or change the way commands are executed.

You want a more extensible solution where:
- The remote can be configured with different commands at runtime.
- The same remote can control different devices without changing its code.
- You can add features like undo, macro commands, or logging in the future.

---

### Requirements

- Encapsulate each request (e.g., turn on light, turn off fan) as a command object.
- The remote control should not need to know the details of how each device works.
- The system should be flexible to add new devices or commands without modifying the remote control logic.
- Support configuring the remote with different commands at runtime.
- (Optional) Make it easy to add features like undo or macro commands in the future.

## Problem 2

### Scenario

You are building a text editor that supports operations such as **type**, **delete**, and **bold**. Users should be able to perform these actions and also undo or redo them as needed.

You want each operation to be encapsulated as a command object, so that the editor can keep a history of commands for undo/redo functionality.

---

### Requirements

- Each editor action (type, delete, bold, etc.) should be implemented as a command object.
- The editor should maintain a history of executed commands to support undo and redo.
- The system should be flexible to add new editor actions without changing the core editor logic.
- Support chaining multiple undo and redo operations.

---

## Problem 3

### Scenario

You are designing a restaurant order system where waiters take orders from customers and send them to the kitchen. Each order (e.g., "make pizza", "prepare salad", "pour drink") should be encapsulated as a command.

The kitchen should be able to execute, queue, or even cancel orders as needed.

---

### Requirements

- Each order should be represented as a command object.
- The system should support queuing, executing, and cancelling orders.
- Waiters should not need to know how the kitchen prepares each item.
- The system should be flexible to add new types of orders without modifying the core logic.

---

## Problem 4

### Scenario

You are building a task scheduler that can schedule, execute, and cancel various tasks (e.g., send email, generate report, backup data). Each task should be encapsulated as a command object.

The scheduler should be able to queue tasks, execute them at the right time, and support cancellation or rescheduling.

---

### Requirements

- Each task should be implemented as a command object.
- The scheduler should support queuing, executing, cancelling, and rescheduling tasks.
- The system should be flexible to add new types of tasks without changing the scheduler logic.
- Support logging or auditing of executed tasks.

---

## Problem 5

### Scenario

You are designing a stock trading system where users can place buy or sell orders for stocks. Each order (buy/sell) should be encapsulated as a command object.

The system should support executing, cancelling, and possibly undoing trades, as well as logging all actions for audit purposes.

---

### Requirements

- Each trade action (buy, sell, cancel) should be implemented as a command object.
- The system should support executing, cancelling, and (optionally) undoing trades.
- All trade actions should be logged for auditing.
- The system should be flexible to add new types of trade actions without modifying the core trading logic.
