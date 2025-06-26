<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Already Exists</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #fc466b, #3f5efb);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .exists-container {
            background: white;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 350px;
        }

        .exists-container h3 {
            color: #d32f2f;
            margin-bottom: 20px;
        }

        .exists-container a {
            text-decoration: none;
            background-color: #3f5efb;
            color: white;
            padding: 10px 20px;
            border-radius: 8px;
            font-weight: bold;
            transition: background 0.3s;
        }

        .exists-container a:hover {
            background-color: #3145d3;
        }
    </style>
</head>
<body>
    <div class="exists-container">
        <h3>User already exists with this email!</h3>
        <a href="register.jsp">Try Again</a>
    </div>
</body>
</html>
