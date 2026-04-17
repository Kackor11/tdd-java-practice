# Java Data Structures: Queue & BST (TDD Approach)

## 📖 Overview
This repository contains custom, from-scratch implementations of fundamental data structures in Java: a Generic Queue and a Binary Search Tree (BST). 

The primary focus of this project is software engineering quality. All features were developed using strict **Test-Driven Development (TDD)**, adhering to **SOLID** principles, Object-Oriented Programming best practices, and Clean Code standards.

## 🏗️ Project Structure

### Part I: Generic Queue (`Queue<T>`)
A custom generic queue data structure implemented using a node-based architecture.
* **Internal State:** `head` (points to the first node in the queue).
* **Node Structure:** `value` (generic type `T`), `next` (pointer to the next node).
* **Core Operations:**
  * `enqueue(T value)`: Adds a new element to the queue.
  * `dequeue()`: Removes and returns the element at the front of the queue.
  * `isEmpty()`: Returns `true` if the queue contains no elements.

### Part II: Binary Search Tree (`BST`)
A custom implementation of a Binary Search Tree designed to store integer values.
* **Internal State:** `root` (points to the root node of the tree).
* **Node Structure:** `value` (integer), `left` (left child node), `right` (right child node).
* **Core Operations:**
  * `insert(int key)`: Inserts a new key while maintaining strict BST properties.
  * `delete(int key)`: Safely removes a specific key from the tree.
  * `bfs()`: Performs a Breadth-First Search (BFS) traversal. 
  
> **Architecture Note:** The `bfs()` method natively integrates and reuses the custom `Queue<T>` implemented in Part I, demonstrating modularity, code reusability, and separation of concerns.

## 🚀 Technologies & Methodology
* **Language:** Java (JDK 17+)
* **Build Tool:** Maven
* **Testing:** JUnit 5 (Jupiter)
* **Methodologies:** * Strict TDD (Red-Green-Refactor cycle)
  * Clean Code (e.g., encapsulating `Node` as a private static nested class)
  * SOLID Principles

## 🛠️ How to Run
To run the test suite and verify the implementations, ensure you have Java and Maven installed, then execute the following command in the root directory:

```bash
mvn clean test
