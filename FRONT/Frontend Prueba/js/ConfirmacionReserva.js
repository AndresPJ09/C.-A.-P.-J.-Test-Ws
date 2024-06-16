// Función para agregar un pasajero a la tabla
function addPassenger() {
    const table = document.getElementById("passengerTable").getElementsByTagName('tbody')[0];
    const row = table.insertRow();

    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const passportNumber = document.getElementById("passportNumber").value;
    const passportCountry = document.getElementById("passportCountry").value;
    const phone = document.getElementById("phone").value;
    const passportPhoto = document.getElementById("passportPhoto").value;

    row.insertCell(0).innerText = firstName;
    row.insertCell(1).innerText = lastName;
    row.insertCell(2).innerText = dob;
    row.insertCell(3).innerText = passportNumber;
    row.insertCell(4).innerText = passportCountry;
    row.insertCell(5).innerText = phone;
    const photoCell = row.insertCell(6);
    const viewPhotoButton = document.createElement("button");
    viewPhotoButton.innerText = "Ver pasaporte";
    viewPhotoButton.onclick = function() {
        alert(`Foto: ${passportPhoto}`);
    };
    photoCell.appendChild(viewPhotoButton);

    const deleteCell = row.insertCell(7);
    const deleteButton = document.createElement("button");
    deleteButton.innerText = "Eliminar";
    deleteButton.onclick = function() {
        table.deleteRow(row.rowIndex - 1);
    };
    deleteCell.appendChild(deleteButton);

    document.getElementById("passengerForm").reset();
}

// Evento click para el botón de regresar a buscar vuelos
document.getElementById('regresar-busqueda-vuelos').addEventListener('click', function() {
    // Implementar lógica para regresar a la página de búsqueda de vuelos
    alert('Regresar a la búsqueda de vuelos');
});

// Evento click para el botón de confirmar reserva
document.getElementById('confirmar-reserva').addEventListener('click', function() {
    // Implementar lógica para confirmar la reserva
    alert('Reserva confirmada');
});
