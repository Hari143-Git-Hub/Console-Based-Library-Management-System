# Console-Based Library Management System

## Project Overview

The Console-Based Library Management System is a Java application that allows librarians to manage books, members, and borrowing operations using a command-line interface. The system is designed using Object-Oriented Programming (OOP) principles and supports data persistence using text files.

This project demonstrates core Java concepts such as classes, encapsulation, collections, file handling, exception handling, and console-based user interaction.

## Features

* Add books to the library collection
* Remove books from the library
* Register new library members
* Borrow books with availability tracking
* Return borrowed books
* Search and display books
* Store and load data using text files
* Console-based menu system for user interaction

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* File I/O operations
* ArrayList collections
* Exception handling

## Project Structure

```
week3-library-system/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── library/
│   │   │       ├── Main.java
│   │   │       ├── Book.java
│   │   │       ├── Member.java
│   │   │       ├── Library.java
│   │   │       └── FileHandler.java
│   └── resources/
│
│── data/
│   ├── books.txt
│   └── members.txt
│
│── README.md
│── .gitignore
└── pom.xml
```

## How to Compile and Run

### Compile

Navigate to the `library` folder and compile all Java files:

```
javac *.java
```

### Run

Move one directory back and run the program:

```
java library.Main
```

## Example Menu

```
Library Menu
1 Add Book
2 Show Books
3 Register Member
4 Borrow Book
5 Return Book
6 Exit
```

## Learning Outcomes

* Understanding Java classes and objects
* Implementing encapsulation using getters and setters
* Using ArrayList to store collections of objects
* Implementing file reading and writing in Java
* Creating a console-based menu system
* Handling exceptions and validating user input

## Author

Week 3 Task – Java Basics Project
