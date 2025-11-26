package GestionContrasenas_DTO;

/**
 * Clase DTO (Data Transfer Object) Registro. Representa el modelo de datos de
 * una contraseña dentro de la aplicación. Sirve para transportar la información
 * desde el formulario hasta la tabla de la pantalla principal.
 *
 * * @author Jaime
 */
public class Registro {

    // --- ATRIBUTOS  ---
    private String servicio;
    private String usuario;
    private String contrasena;
    private String categoria;
    private String seguridad;
    private boolean dobleFactor;
    private String notas;

    // --- CONSTRUCTORES ---
    
    /**
     * Constructor vacío. Crea una instancia de Registro sin datos iniciales.
     * Necesario para operaciones genéricas.
     */
    public Registro() {
    }

    /**
     * Constructor completo. Inicializa un nuevo Registro asignando valor a
     * todos sus atributos.
     *
     * @param servicio Nombre del servicio.
     * @param usuario Nombre de usuario.
     * @param contrasena Contraseña.
     * @param categoria Categoría seleccionada.
     * @param seguridad Nivel de seguridad seleccionado.
     * @param dobleFactor Estado del 2FA (true = activado).
     * @param notas Observaciones adicionales.
     */
    public Registro(String servicio, String usuario, String contrasena, String categoria, String seguridad, boolean dobleFactor, String notas) {
        this.servicio = servicio;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.categoria = categoria;
        this.seguridad = seguridad;
        this.dobleFactor = dobleFactor;
        this.notas = notas;
    }

    // --- MÉTODOS GETTER Y SETTER  ---
    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public boolean isDobleFactor() {
        return dobleFactor;
    }

    public void setDobleFactor(boolean dobleFactor) {
        this.dobleFactor = dobleFactor;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    // --- MÉTODOS PERSONALIZADOS PARA LA VISTA ---
    /**
     * Sobreescritura del método toString. Genera un resumen formateado y
     * legible del registro. Se utiliza para mostrar la información en el
     * JOptionPane de confirmación final.
     *
     * @return String con el resumen estructurado y saltos de línea.
     */
    @Override
    public String toString() {
        return "NUEVA CONTRASEÑA REGISTRADA\n"
                + "================================\n"
                + "Servicio:      " + servicio + "\n"
                + "Usuario:       " + usuario + "\n"
                + "Contraseña:    " + contrasena + "\n"
                + "--------------------------------\n"
                + "Categoría:     " + categoria + "\n"
                + "Seguridad:     " + seguridad + "\n"
                + "Doble Factor:  " + (dobleFactor ? "Sí" : "No") + "\n"
                + "--------------------------------\n"
                + "Notas:\n"
                + notas + "\n"
                + "================================";
    }

    /**
     * Convierte el objeto Registro en un array de Strings (fila de tabla). Este
     * método facilita la inserción de datos en el modelo de la JTable de la
     * Pantalla Principal. Realiza la conversión visual del booleano 2FA a "Sí"
     * o "No".
     *
     * @return Array de String[] con los 7 campos ordenados.
     */
    public String[] toArrayStringRegistro() {
        String[] s = new String[7];

        s[0] = servicio;
        s[1] = usuario;
        s[2] = contrasena;
        s[3] = categoria;
        s[4] = seguridad;

        // Convertimos el valor lógico (boolean) a texto legible para el usuario
        if (dobleFactor) {
            s[5] = "Sí";
        } else {
            s[5] = "No";
        }

        s[6] = notas;

        return s;
    }

}
