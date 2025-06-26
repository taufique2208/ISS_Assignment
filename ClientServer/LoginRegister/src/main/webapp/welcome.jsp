<%@ page session="true" %>
<%
    String user = (String) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #00b09b, #96c93d);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .welcome-container {
            background: white;
            padding: 40px 50px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            text-align: center;
            width: 350px;
        }

        .welcome-container h2 {
            color: #333;
            margin-bottom: 20px;
        }

        .welcome-container a {
            display: inline-block;
            margin-top: 15px;
            text-decoration: none;
            background-color: #00b09b;
            color: white;
            padding: 10px 20px;
            border-radius: 8px;
            transition: background 0.3s;
        }

        .welcome-container a:hover {
            background-color: #028b7f;
        }
    </style>
</head>
<body>
    <div class="welcome-container">
        <h2>Welcome, <%= user %>!</h2>
        <a href="logout">Logout</a>
    </div>
</body>
</html>
