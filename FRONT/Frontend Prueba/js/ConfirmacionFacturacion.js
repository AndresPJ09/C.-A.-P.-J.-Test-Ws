document.addEventListener('DOMContentLoaded', function() {
    // Obtener el valor total desde el URL o de otro lugar en la aplicación
    const urlParams = new URLSearchParams(window.location.search);
    const totalValue = urlParams.get('total') || 'xxxxxxx'; // Valor por defecto o lógica para obtener el valor total
    document.getElementById('total-value').value = totalValue;

    // Evento click para el botón de emitir boletos
    document.getElementById('emit-tickets').addEventListener('click', function() {
        // Implementar lógica para emitir los boletos
        const selectedPayment = document.querySelector('input[name="payment"]:checked');
        if (selectedPayment) {
            const paymentMethod = selectedPayment.value;
            alert(`Boletos emitidos correctamente. Pago realizado con ${paymentMethod}`);
        } else {
            alert('Seleccione un método de pago antes de emitir los boletos.');
        }
    });

    // Evento click para el botón de cancelar
    document.getElementById('cancel').addEventListener('click', function() {
        // Implementar lógica para cancelar y regresar a la página de búsqueda de vuelos
        alert('Operación cancelada');
    });
});
