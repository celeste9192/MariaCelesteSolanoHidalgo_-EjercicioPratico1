function eliminarEstudiante(id) {
    if (confirm("¿Estás seguro de que deseas eliminar este estudiante?")) {
        // Realizar una solicitud AJAX para eliminar el estudiante
        $.ajax({
            type: "GET",  // Puedes usar GET, POST u otro método según tu controlador
            url: "/estudiantes/eliminar/" + id,  // La URL del controlador que maneja la eliminación
            success: function (data) {
                // La solicitud fue exitosa, puedes realizar acciones adicionales si es necesario
                location.reload();  // Recargar la página para actualizar la lista de estudiantes
            },
            error: function (xhr, status, error) {
                // Manejar errores si es necesario
                console.error("Error al eliminar estudiante: " + error);
            }
        });
    }
}
function abrirFormularioEdicion(id) {
    // Realizar una solicitud AJAX para obtener los detalles del estudiante a editar
    $.ajax({
        type: "GET",
        url: "/estudiantes/editar/" + id,  // La URL del controlador que maneja la edición
        success: function (data) {
            // La solicitud fue exitosa, muestra el formulario de edición con los detalles del estudiante
            $("#formulario-edicion").html(data); // Suponemos que tienes un div con ID "formulario-edicion" donde se mostrará el formulario
        },
        error: function (xhr, status, error) {
            // Manejar errores si es necesario
            console.error("Error al abrir formulario de edición: " + error);
        }
    });
}
function verDetallesEstudiante(id) {
    // Realizar una solicitud AJAX para obtener los detalles completos del estudiante
    $.ajax({
        type: "GET",
        url: "/estudiantes/ver/" + id,  // La URL del controlador que maneja la visualización de detalles
        success: function (data) {
            // La solicitud fue exitosa, muestra los detalles del estudiante en un cuadro de diálogo o en una sección de la página
            mostrarDetallesEnModal(data); // Suponemos que tienes una función para mostrar detalles en un modal o elemento en tu página
        },
        error: function (xhr, status, error) {
            // Manejar errores si es necesario
            console.error("Error al ver detalles del estudiante: " + error);
        }
    });
}








