## Problem 1

### Scenario

You are designing a **vending machine**. The machine can be in different states: **Idle**, **Coin Inserted**, **Item Selected**, and **Dispensing**. The behavior of actions like inserting a coin, selecting an item, or dispensing depends on the current state of the machine.

---

### Requirements

- The vending machine should change its behavior based on its current state.
- Actions such as inserting a coin, selecting an item, or dispensing should only be valid in certain states.
- The system should be easy to extend with new states or actions without modifying the core logic.
- Avoid using large `if-else` or `switch` statements to manage state transitions.

---

## Problem 2

### Scenario

You are building a **traffic light system**. The traffic light cycles through states: **Red**, **Green**, and **Yellow**. The behavior of the light (e.g., when to switch to the next color) depends on its current state.

---

### Requirements

- The traffic light should transition between states in a defined sequence.
- Each state should determine the next state and the duration for which it remains active.
- The system should be flexible to add new states or change the sequence without modifying the core logic.

---

## Problem 3

### Scenario

You are developing an **order lifecycle** system for an e-commerce platform. An order can be in states such as **Created**, **Paid**, **Shipped**, **Delivered**, and **Cancelled**. The allowed actions and transitions depend on the current state of the order.

---

### Requirements

- The order should change its behavior and allowed actions based on its current state.
- Only valid transitions should be allowed (e.g., you cannot ship an order that is not paid).
- The system should be flexible to add new states or transitions without modifying the core logic.

---

## Problem 4

### Scenario

You are designing a **media player**. The player can be in states such as **Stopped**, **Playing**, and **Paused**. The behavior of actions like play, pause, and stop depends on the current state.

---

### Requirements

- The media player should change its behavior based on its current state.
- Only valid actions should be allowed in each state (e.g., you cannot pause if already stopped).
- The system should be flexible to add new states or actions without modifying the core logic.

---

## Problem 5

### Scenario

You are building an **ATM machine**. The ATM can be in states such as **Idle**, **Card Inserted**, **Pin Entered**, **Transaction Selected**, and **Dispensing Cash**. The behavior of actions like inserting a card, entering a PIN, or withdrawing cash depends on the current state.

---

### Requirements

- The ATM should change its behavior based on its current state.
- Only valid actions should be allowed in each state (e.g., you cannot withdraw cash before entering a PIN).
- The system should be flexible to add new states or actions without modifying the core logic.
