<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-container {
            background: white;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            width: 300px;
        }

        .login-container h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        .login-container input[type="email"],
        .login-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
        }

        .login-container input[type="submit"] {
            width: 100%;
            background-color: #2575fc;
            color: white;
            border: none;
            padding: 10px;
            font-weight: bold;
            cursor: pointer;
            border-radius: 8px;
        }

        .login-container input[type="submit"]:hover {
            background-color: #1a5edc;
        }

        .login-container p {
            text-align: center;
            margin-top: 10px;
        }

        .login-container a {
            color: #2575fc;
            text-decoration: none;
            font-weight: bold;
        }

        .login-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form action="login" method="post" onsubmit="return validateLogin()">
            <input type="email" name="email" id="email" placeholder="Email" required>
            <input type="password" name="password" id="password" placeholder="Password" required>
            <input type="submit" value="Login">
        </form>
        <p>New user? <a href="register.jsp">Register</a></p>
    </div>

    <script>
        function validateLogin() {
            let email = document.getElementById('email').value.trim();
            let pass = document.getElementById('password').value.trim();
            if (!email || !pass) {
                alert("Please fill all fields.");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>
