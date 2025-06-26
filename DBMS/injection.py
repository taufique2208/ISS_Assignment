import mysql.connector

conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="taufique",
    database="testdb"
)

cursor = conn.cursor()

# Parameterized query
query = "SELECT * FROM students WHERE name = %s"
cursor.execute(query, ('Taufique',))

results = cursor.fetchall()

for row in results:
    print(row)

cursor.close()
conn.close()