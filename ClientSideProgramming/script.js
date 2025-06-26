function validateForm() {
    const name = document.getElementById("name").value.trim();
    const age = parseInt(document.getElementById("age").value);
    const password = document.getElementById("password").value;

    if (name.length < 3) {
        alert("Name must be at least 3 characters.");
        return false;
    }

    if (age < 18 || age > 30) {
        alert("Age must be between 18 and 30.");
        return false;
    }

    if (password.length < 6) {
        alert("Password must be at least 6 characters.");
        return false;
    }

    alert("Form submitted successfully!");
    return true;
}
