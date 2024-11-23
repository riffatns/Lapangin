function fetchData() {
    fetch('http://localhost:8080/api/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById('result').innerText = data;
        })
        .catch(error => console.error('Error:', error));
}