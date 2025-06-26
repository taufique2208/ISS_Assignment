<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello App</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #00c6ff, #0072ff);
            height: 100vh;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            color: white;
        }

        .container {
            background: rgba(255, 255, 255, 0.1);
            padding: 40px 60px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            text-align: center;
        }

        h1 {
            margin-bottom: 20px;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background-color: #ffffff;
            color: #0072ff;
            padding: 10px 20px;
            font-weight: bold;
            border-radius: 8px;
            transition: 0.3s;
        }

        a:hover {
            background-color: #e0e0e0;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Hello World from JSP!</h1>
        <a href="hello">Go to Servlet</a>
    </div>
</body>
</html>
