<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #ff6a00, #ee0979);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .register-container {
            background: white;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            width: 300px;
        }

        .register-container h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        .register-container input[type="email"],
        .register-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
        }

        .register-container input[type="submit"] {
            width: 100%;
            background-color: #ee0979;
            color: white;
            border: none;
            padding: 10px;
            font-weight: bold;
            cursor: pointer;
            border-radius: 8px;
        }

        .register-container input[type="submit"]:hover {
            background-color: #c50665;
        }

        .register-container p {
            text-align: center;
            margin-top: 10px;
        }

        .register-container a {
            color: #ee0979;
            text-decoration: none;
            font-weight: bold;
        }

        .register-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="register-container">
        <h2>Register</h2>
        <form action="register" method="post" onsubmit="return validateRegister()">
            <input type="email" name="email" id="email" placeholder="Email" required>
            <input type="password" name="password" id="password" placeholder="Password (min 6 chars)" required>
            <input type="submit" value="Register">
        </form>
        <p>Already registered? <a href="login.jsp">Login</a></p>
    </div>

    <script>
        function validateRegister() {
            const pass = document.getElementById('password').value.trim();
            if (pass.length < 6) {
                alert("Password must be at least 6 characters.");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>
