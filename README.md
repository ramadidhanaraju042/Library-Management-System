📘 Library Management System (Java Console Project)
🧩 Overview

The Library Management System is a console-based Java application designed to manage a small-scale library.
It allows users to add books, display available books, search books, borrow and return books — all using a simple menu-driven interface.

This project demonstrates core Java concepts such as:
📊 Arrays — For storing books, authors, and borrowed details
🔀 Conditional Statements — To make decisions like availability checks
🔁 Loops — For iterating through book records and user lists
🧩 Methods — To organize logic into reusable code blocks
🧮 User Input Handling (Scanner) — To interact with users through console input
🧠 Basic Data Organization & Logic Implementation — For managing operations and system flow efficiently

It’s ideal for students or beginners learning Java fundamentals and object-oriented programming (OOP) through practical applications.

⚙️ Features:
   Feature	                              Description
📚 Add Book	                 Add fiction or non-fiction books with title, author,                                    copies, and subject.
🔍 Search Book	             Search for a book by title (case-insensitive).
📖 Display All Books	       View all books available in the library with details.
🧾 Borrow Book	             Borrow a book if copies are available; updates inventory.
🔁 Return Book	             Return previously borrowed books; restores copies.
🚪 Exit                    	 Gracefully exit the application.

🧠 How It Works

1.When the program starts, it displays a menu with options (Add, Display, Search, Borrow, Return, Exit).
2.The user selects an option by entering a number (1–6).
3.Based on the input, the corresponding method executes.
4.Data (like titles, authors, and copies) is stored in arrays in memory.
5.Borrow and return operations update the copies and maintain borrowed lists.
6.The system runs continuously until the user chooses Exit.

💡 Example Flow
--- Library Management System ---
1. Add Book
2. Display All Books
3. Search Book by Title
4. Borrow Book
5. Return Book
6. Exit
Enter your choice: 1
Enter book type (1 for Fiction, 2 for Non-Fiction): 1
Enter book title: Harry Potter
Enter author: J.K. Rowling
Enter number of copies: 5
Book added successfully!

Enter your choice: 2
Title: Harry Potter, Author: J.K. Rowling, Copies: 5
Subject: Fiction

🧰 Tools & Technologies Used
  Tool / Concept	                           Purpose
Java (JDK 8+)	                     Core language used for logic and structure
IntelliJ IDEA / Eclipse            Recommended IDEs for development
/ VS Code	 
OOP Concepts	                     Methods, data encapsulation, and modular code                                           organization
Arrays	                           Used for storing and managing books and users
Scanner Class	                     For taking user input
Switch Statements	                 For menu-based control flow


🧑‍💻 Technical Skills Highlighted
💻 Core Java Programming — Strong understanding of syntax, data types, and operators
🧱 Object-Oriented Programming (OOP) — Applied concepts like classes, objects, and methods
🔁 Control Structures — Efficient use of loops, conditionals, and switch statements
📊 Array Data Management — Handling and storing book and user information using arrays
🧮 Input Handling (java.util.Scanner) — Capturing and validating user input
🧠 Problem Solving & Logical Thinking — Structured approach to library management features
🧰 Console-Based Application Development — Interactive text-based user interfac

🪄 How to Run the Project

✅ Prerequisites
☕ Install Java JDK 8 or above — Required to compile and run the project
🧩 Install an IDE like IntelliJ IDEA, Eclipse, or VS Code — For easier development and execution
📘 Basic understanding of Java syntax — Helps in understanding the flow and making modifications

🚀 Steps to Run

1.Clone the repository:
git clone https://github.com/<your-username>/LibraryManagementSystem.git
2.Open the project in your IDE.
3.Locate the file:
src/com/librarymanagement/project/LibraryManagement.java
4.Run the main() method.
5.Use the menu options to interact with the system.

🧾 Future Enhancements
✅ Use ArrayList or HashMap instead of arrays for dynamic storage
✅ Add file handling to save data permanently
✅ Implement a login system for admin and users
✅ Create a GUI version using JavaFX or Swing
✅ Integrate a database (MySQL) for real-time data storage

🏆 Learning Outcomes
By building this project, you will:
Understand the structure of a Java application
Learn modular coding using methods
Handle user input and data storage
Develop a menu-driven system
Strengthen your logical thinking and problem-solving skills

📜 Author
👨‍💻 Ramadi Dhana Raju
Java Full Stack Developer | Passionate about building efficient and user-friendly applications

📍 Destination Codegnan Institute
📧 dhanarajramadi@gmail.com
