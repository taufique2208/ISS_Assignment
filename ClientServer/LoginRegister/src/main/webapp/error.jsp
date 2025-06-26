<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Error</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #ff416c, #ff4b2b);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .error-container {
            background: white;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 350px;
        }

        .error-container h3 {
            color: red;
            margin-bottom: 20px;
        }

        .error-container a {
            text-decoration: none;
            background-color: #ff416c;
            color: white;
            padding: 10px 20px;
            border-radius: 8px;
            font-weight: bold;
            transition: background 0.3s;
        }

        .error-container a:hover {
            background-color: #d73352;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <h3>Invalid login credentials!</h3>
        <a href="login.jsp">Try again</a>
    </div>
</body>
</html>
