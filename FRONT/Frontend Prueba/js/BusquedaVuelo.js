document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('flightSearchForm');
    const searchResults = document.getElementById('searchResults');

    // Cargar aeropuertos de salida y llegada (ejemplo básico, idealmente cargarías desde el backend)
    const departureAirportSelect = document.getElementById('departureAirport');
    const destinationAirportSelect = document.getElementById('destinationAirport');

    // Ejemplo de carga de aeropuertos (sustituir con datos reales del backend)
    const airports = [
        { id: 1, name: 'Aeropuerto 1' },
        { id: 2, name: 'Aeropuerto 2' },
        { id: 3, name: 'Aeropuerto 3' }
    ];

    airports.forEach(airport => {
        const option = document.createElement('option');
        option.value = airport.id;
        option.textContent = airport.name;
        departureAirportSelect.appendChild(option.cloneNode(true));
        destinationAirportSelect.appendChild(option);
    });

    // Manejar envío del formulario
    form.addEventListener('submit', function(event) {
        event.preventDefault();
        
        const formData = new FormData(form);
        const searchParams = new URLSearchParams(formData).toString();

        // Ejemplo de URL de búsqueda (debe ajustarse según tu API backend)
        const apiUrl = `http://localhost:9000/recuperacion/v1/api/schedules/search?${searchParams}`;

        fetch(apiUrl)
            .then(response => response.json())
            .then(data => {
                displaySearchResults(data);
            })
            .catch(error => {
                console.error('Error fetching data:', error);
            });
    });

    function displaySearchResults(results) {
        searchResults.innerHTML = ''; // Limpiar resultados anteriores

        results.forEach(result => {
            const flightDiv = document.createElement('div');
            flightDiv.classList.add('flight');

            const departureAirport = result.route.departureAirport.name;
            const destinationAirport = result.route.destinationAirport.name;
            const departureDateTime = new Date(result.date).toLocaleString();
            const flightDetails = `${departureAirport} - ${destinationAirport}, ${departureDateTime}`;

            const price = result.price.toFixed(2); // Redondear precio a 2 decimales
            const confirmed = result.confirmed ? 'Confirmado' : 'No confirmado';
            const flightInfo = `Precio: ${price}, Estado: ${confirmed}`;

            const flightTitle = document.createElement('h3');
            flightTitle.textContent = flightDetails;

            const flightInfoParagraph = document.createElement('p');
            flightInfoParagraph.textContent = flightInfo;

            flightDiv.appendChild(flightTitle);
            flightDiv.appendChild(flightInfoParagraph);

            searchResults.appendChild(flightDiv);
        });
    }
});
