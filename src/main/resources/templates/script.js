// JavaScript code for sending HTTP requests and integrating with the map
// Example: using Fetch API for sending requests to the backend
document.getElementById('vehicleForm').addEventListener('submit', function(event) {
    event.preventDefault();
    var formData = new FormData(this);

    fetch('/api/vehicles/register', {
        method: 'POST',
        body: formData
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log('Vehicle registered successfully:', data);
        // Handle success response
    })
    .catch(error => {
        console.error('Error registering vehicle:', error);
        // Handle error
    });
});
