CoreJAVA Project

This is a modular Java learning project built in Eclipse using Java 21. It demonstrates core Java concepts such as data types, OOP, collections, file handling, multithreading, JSON, XML parsing, JDBC, and JSP/Servlet integration (if applicable).


---

## ✅ How to Run

### ✔️ Steps:
1. Open Eclipse → Import the `CoreJAVA` project
2. Right-click any `Main.java` → Run As → Java Application
3. For file-based modules (e.g., `filereadwrite`), output files like `students.txt` will be generated in the root.

---
## 📚 Module Highlights

### 🔸 basics/
- Introduction to Java syntax and class structure.

### 🔸 datatypes/
- Demonstrates primitive data types, final/static variables, and constructors.

### 🔸 oopconcepts/
- `Student`, `Person`, and `Performance` show encapsulation, inheritance, method overriding, and abstraction.

### 🔸 filereadwrite/
- `StudentFileManager` reads/writes students to `students.txt` using `BufferedReader` and `BufferedWriter`.

### 🔸 collections/
- Uses `List<Student>`, `Set<Student>`, and `Map<Integer, Student>` with sorting via `Comparable` and `Comparator`.

### 🔸 jsondemo/
- Uses `jackson-databind` to convert Java objects to JSON and back.

### 🔸 xmlparser/
- Parses `student.xml` using DOM API (`DocumentBuilderFactory`).

### 🔸 jdbc/
- Connects to MySQL database, runs queries.

### 🔸 multithreading/
- Demonstrates `Thread`, `Runnable`, `volatile`, and synchronization with multiple classes.

---

## ⚙️ Dependencies

If you're not using Maven, add the following JARs manually:
- `jackson-databind-2.15.2.jar`
- `jackson-core-2.15.2.jar`
- `jackson-annotations-2.15.2.jar`
- `mysql-connector-java-8.0.33.jar` (for JDBC)

