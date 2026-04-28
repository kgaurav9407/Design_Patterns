
---

# Composite Pattern: Problem Statements

## 1. File System (Google Drive/Dropbox)

**Scenario:**  
You are building a file system for a cloud storage service like Google Drive or Dropbox.
- The system should support both files and folders.
- Folders can contain files or other folders, forming a tree structure.
- Operations like size calculation, move, or delete should work uniformly on both files and folders.

**Requirements:**
- Represent files and folders with a common interface.
- Allow folders to contain an arbitrary number of files or subfolders.
- Enable operations to be performed recursively on the entire structure.

---

## 2. Amazon Product Categories

**Scenario:**  
Amazon organizes products into categories and subcategories (e.g., Electronics > Computers > Laptops).
- Each category can contain products or other subcategories.
- The system should allow operations like listing all products in a category, including those in subcategories.

**Requirements:**
- Represent both categories and products with a common interface.
- Allow categories to contain products and other categories.
- Support recursive operations like product listing or category removal.

---

## 3. Uber Organization Hierarchy

**Scenario:**  
Uber's organization structure includes employees, managers, and departments.
- Departments can contain employees or other departments.
- Operations like sending announcements or calculating total headcount should work for both individuals and groups.

**Requirements:**
- Use a common interface for employees and departments.
- Allow departments to contain employees and sub-departments.
- Enable recursive operations across the hierarchy.

---

## 4. Netflix UI Layout Engine

**Scenario:**  
Netflix's UI layout engine arranges components (buttons, panels, containers, etc.) in a nested structure.
- Containers can hold other components or containers.
- Operations like rendering or applying styles should work uniformly on all components.

**Requirements:**
- Represent UI elements and containers with a common interface.
- Allow containers to nest other components or containers.
- Support recursive operations like rendering or style application.

---

## 5. Google Docs Graphic Editor

**Scenario:**  
Google Docs' graphic editor allows users to create complex drawings using basic shapes (lines, rectangles, circles) and groups of shapes.
- Groups can contain individual shapes or other groups.
- Operations like move, resize, or delete should apply to both individual shapes and groups.

**Requirements:**
- Use a common interface for shapes and groups.
- Allow groups to contain shapes and other groups.
- Enable recursive operations on the entire graphic structure.

---

These scenarios demonstrate how the Composite Pattern enables you to treat individual objects and compositions of objects uniformly, making it easier to work with tree-like structures.