$(document).ready(function() {
    $('.js-select2').select2(); // Inicializar select2 para los selectores con clase js-select2

    // Evento click para el botón de buscar vuelos
    document.getElementById('buscar-vuelos').addEventListener('click', function() {
        const origen = $('#origen').val(); // Obtener el valor seleccionado de origen con select2
        const destino = $('#destino').val(); // Obtener el valor seleccionado de destino con select2
        const tipoCabina = document.getElementById('tipo-cabina').value;
        const tipoViaje = document.querySelector('input[name="tipo-viaje"]:checked').value;
        const fechaSalida = document.getElementById('fecha-salida').value;
        const fechaRegreso = document.getElementById('fecha-regreso').value;
        const flexibleDates = document.getElementById('salida-checkbox').checked;

        // Aquí se simularía una búsqueda real de vuelos con los parámetros seleccionados
        const flightsData = [
            { route: { departureAirport: { id: 'CAI', name: 'Origen' }, destinationAirport: { id: 'AUH', name: 'Destino' }, date: '2024-06-17T08:00:00Z', id: '1908', price: '500' } },
            { route: { departureAirport: { id: 'AUH', name: 'Destino' }, destinationAirport: { id: 'CAI', name: 'Origen' }, date: '2024-06-18T10:00:00Z', id: '1909', price: '550' } }
            // Aquí se agregarían los vuelos reales obtenidos de la API
        ];

        displayResults(flightsData, tipoViaje);
    });

    // Función para mostrar los resultados de la búsqueda
    function displayResults(data, tipoViaje) {
        const salidaResults = document.getElementById('salida-results');
        const regresoResults = document.getElementById('regreso-results');

        salidaResults.innerHTML = '';
        regresoResults.innerHTML = '';

        const salidaVuelos = data.filter(flight => flight.route.departureAirport.id === 'CAI');
        const regresoVuelos = data.filter(flight => flight.route.departureAirport.id === 'AUH');

        salidaVuelos.forEach(flight => {
            const flightElement = document.createElement('tr');
            flightElement.innerHTML = `
                <td>${flight.route.departureAirport.name}</td>
                <td>${flight.route.destinationAirport.name}</td>
                <td>${flight.date.split('T')[0]}</td>
                <td>${flight.date.split('T')[1]}</td>
                <td>${flight.id}</td>
                <td>${flight.price}</td>
            `;
            salidaResults.appendChild(flightElement);
        });

        if (tipoViaje === 'retorno') {
            regresoVuelos.forEach(flight => {
                const flightElement = document.createElement('tr');
                flightElement.innerHTML = `
                    <td>${flight.route.departureAirport.name}</td>
                    <td>${flight.route.destinationAirport.name}</td>
                    <td>${flight.date.split('T')[0]}</td>
                    <td>${flight.date.split('T')[1]}</td>
                    <td>${flight.id}</td>
                    <td>${flight.price}</td>
                `;
                regresoResults.appendChild(flightElement);
            });
        }
    }

    // Evento click para el botón de reservar vuelo
    document.getElementById('reservar-vuelo').addEventListener('click', function() {
        const numPasajeros = document.getElementById('num-pasajeros').value;

        // Validación simple: asegurarse de que se haya seleccionado al menos un pasajero
        if (numPasajeros <= 0) {
            alert('Debe seleccionar al menos un pasajero.');
            return;
        }

        // Aquí se abriría el modal para agregar pasajeros
        // Vamos a simular el llamado a la función para agregar pasajeros
        openPassengerModal();
    });

    // Función para abrir el modal de pasajeros
    function openPassengerModal() {
        // Implementar lógica para abrir el modal de pasajeros
        alert('Abriendo formulario para agregar pasajeros');
    }

    // Evento click para el botón de salir
    document.getElementById('salir').addEventListener('click', function() {
        // Implementar lógica para salir o regresar a la página principal
        alert('Saliendo del proceso de reserva');
    });
});
