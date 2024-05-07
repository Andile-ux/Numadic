document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // For simplicity, let's just check if the username and password are not empty
    if (username.trim() === '' || password.trim() === '') {
        document.getElementById('message').innerText = 'Please enter username and password.';
        document.getElementById('message').classList.remove('hidden');
    } else {
        // You can perform AJAX request to your backend for authentication here
        // For demonstration purposes, let's just display a success message
        document.getElementById('message').innerText = 'Login successful!';
        document.getElementById('message').classList.remove('hidden');
    }
});
