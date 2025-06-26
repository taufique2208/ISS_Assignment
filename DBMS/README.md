# 🗄️ DBMS Project

## 📁 Project Structure

```
DBMS/
├── src/                         # Java source code
│   └── procedure/
│       ├── DBHelper.java        # JDBC connection utility
│       ├── Main.java            # Executes a stored procedure
│       ├── module-info.java     # Java module declaration
│       └── procedure_query.sql  # SQL script for procedure creation
│
├── basic_queries.sql            # SELECT, INSERT, UPDATE, DELETE
├── advance_sql.sql              # GROUP BY, HAVING, LIKE, etc.
├── joins.sql                    # INNER JOIN, LEFT JOIN, RIGHT JOIN
├── constraints_and_keys.sql     # Primary/Foreign keys, constraints
├── normalization.sql            # Notes and examples on 1NF–BCNF
```

---
## 🧪 SQL Practice Files

Each `.sql` file covers essential SQL concepts:

### 🔹 `basic_queries.sql`

* Basic DML operations: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `WHERE`, `ORDER BY`, etc.

### 🔹 `joins.sql`

* Join types: `INNER`, `LEFT`, `RIGHT`, `FULL` 

### 🔹 `constraints_and_keys.sql`

* Table constraints: `PRIMARY KEY`, `FOREIGN KEY`, `UNIQUE`, `NOT NULL`, `CHECK`, etc.

### 🔹 `advance_sql.sql`

* Advanced clauses: `GROUP BY`, `HAVING`, `LIKE`, `IN`, `BETWEEN`, `ALIAS`

### 🔹 `normalization.sql`

* Descriptions and examples for `1NF`, `2NF`, `3NF`, and `BCNF`

---

## 📦 Dependencies

* `mysql-connector-java-8.0.xx.jar`

