# Activity 2: Intermediate Encapsulation & Inheritance (Library System)

Welcome to your second Java OOP challenge! This time, you will implement an inventory tracker for a public library.

---

## 📝 Your Task Instructions

Implement the 4 empty Java classes inside the package `com.library` according to the following specifications:

### Task 1: Complete the Parent Class `LibraryItem.java`
* **Instance Variables (Private):**
  * `title` (String)
  * `id` (String)
  * `isAvailable` (boolean) -> *Hint: This tracks if the item is currently in the library or checked out.*
* **Constructor:**
  * Accepts `String title` and `String id`. 
  * Sets the variables accordingly and defaults `isAvailable` to `true` (since all items start on the shelf).
* **Encapsulation Requirements:**
  * Create public getters for `title`, `id`, and `isAvailable`. (Note: Boolean getters are conventionally named `isAvailable()`).
  * **No raw setter for `isAvailable`!** Instead, control this boolean flag using custom state-changing methods below.
* **Methods:**
  * `public void checkOut()`: If the item is available, change `isAvailable` to `false` and print `"[Title] has been successfully checked out."` If it's already checked out, print `"[Title] is already checked out!"`
  * `public void returnItem()`: Change `isAvailable` to `true` and print `"[Title] has been returned."`
  * `public void displayDetails()`: Prints a generic summary containing the title and ID.

### Task 2: Complete the Child Class `Book.java`
* **Inheritance:** Inherit from `LibraryItem`.
* **Unique Instance Variable (Private):**
  * `author` (String)
* **Constructor:**
  * Accepts `String title`, `String id`, and `String author`. Pass `title` and `id` to `super()`, then set the `author`.
* **Encapsulation:** Create a public getter for `author`.
* **Polymorphism (Method Overriding):**
  * Override `displayDetails()` to print the Title, ID, Author, and whether it is currently checked out or available.

### Task 3: Complete the Child Class `Magazine.java`
* **Inheritance:** Inherit from `LibraryItem`.
* **Unique Instance Variable (Private):**
  * `issueNumber` (int)
* **Constructor:**
  * Accepts `String title`, `String id`, and `int issueNumber`. Pass `title` and `id` to `super()`, then set the `issueNumber`.
* **Encapsulation:** Create a public getter for `issueNumber`.
* **Polymorphism (Method Overriding):**
  * Override `displayDetails()` to print the Title, ID, Issue Number, and its availability status.

### Task 4: Test Your Logic in `Main.java`
* **Main Method:** Inside `public static void main(String[] args)`, execute these steps:
  1. Instantiate a `Book` object (e.g., Title: "The Hobbit", ID: "B101", Author: "J.R.R. Tolkien").
  2. Instantiate a `Magazine` object (e.g., Title: "National Geographic", ID: "M202", Issue: 145).
  3. Call `.displayDetails()` on both items to check their starting status.
  4. Call `.checkOut()` on your book object to check it out.
  5. Try to call `.checkOut()` on the exact same book *again* to verify your error handling triggers.
  6. Call `.returnItem()` on the book, then call `.displayDetails()` one last time to verify its status changes back to available.
