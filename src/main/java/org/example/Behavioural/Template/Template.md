## Problem 1

### Scenario

You are building a beverage preparation system for a cafe. The process of making **tea** and **coffee** involves several common steps (boil water, pour in cup, add condiments), but some steps differ (e.g., steeping tea leaves vs. brewing coffee grounds).

Initially, you might duplicate the preparation steps in each beverage class, but this leads to code duplication and makes it hard to maintain.

You want a solution where:
- The overall preparation algorithm is defined in one place.
- Subclasses can override only the steps that are different.

---

### Requirements

- Define the skeleton of the beverage preparation algorithm in a base class.
- Allow subclasses to override specific steps (e.g., steeping, brewing, adding condiments).
- Avoid code duplication for the common steps.
- Make it easy to add new beverages with different preparation steps.

---

## Problem 2

### Scenario

You are developing an **order processor** for an e-commerce platform. The steps to process a **physical product** order and a **digital product** order are similar (validate order, process payment, deliver product), but the delivery step differs.

---

### Requirements

- Define the order processing algorithm in a base class.
- Allow subclasses to override the delivery step (e.g., ship physical product, email digital product).
- Avoid duplicating the common order processing steps.
- Make it easy to add new order types with custom delivery logic.

---

## Problem 3

### Scenario

You are building a **report generator** that can create different types of reports (e.g., PDF, Excel, HTML). The steps to generate a report are similar (gather data, format data, export), but the formatting and exporting steps differ.

---

### Requirements

- Define the report generation algorithm in a base class.
- Allow subclasses to override the formatting and exporting steps.
- Avoid duplicating the common data gathering logic.
- Make it easy to add new report formats.

---

## Problem 4

### Scenario

You are designing a **game character creator**. The process of creating a character involves common steps (choose name, assign stats, select equipment), but the way stats are assigned or equipment is selected may differ for different character classes (e.g., Warrior, Mage).

---

### Requirements

- Define the character creation algorithm in a base class.
- Allow subclasses to override steps like assigning stats or selecting equipment.
- Avoid duplicating the common character creation steps.
- Make it easy to add new character classes with custom creation logic.

---

## Problem 5

### Scenario

You are developing a **data parser** that can parse different file formats (e.g., CSV, JSON, XML). The parsing process involves common steps (read file, parse data, validate data), but the parsing logic differs for each format.

---

### Requirements

- Define the data parsing algorithm in a base class.
- Allow subclasses to override the parsing step for each file format.
- Avoid duplicating the common file reading and validation logic.
- Make it easy to add new file formats.
