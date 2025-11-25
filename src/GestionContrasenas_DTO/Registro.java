package GestionContrasenas_DTO;

public class Registro {

    //Atributos
    private String servicio;
    private String usuario;
    private String contrasena;
    private String categoria;
    private String seguridad;
    private boolean dobleFactor;
    private String notas;

    //Constuctor vacio
    public Registro() {
    }

    //Constructor lleno
    public Registro(String servicio, String usuario, String contrasena, String categoria, String seguridad, boolean dobleFactor, String notas) {
        this.servicio = servicio;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.categoria = categoria;
        this.seguridad = seguridad;
        this.dobleFactor = dobleFactor;
        this.notas = notas;
    }

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

    // Método que crea un array de Strings para la tabla
    public String[] toArrayStringRegistro() {
        String[] s = new String[7];

        s[0] = servicio;
        s[1] = usuario;
        s[2] = contrasena;
        s[3] = categoria;
        s[4] = seguridad;

        // Convertimos el boolean a String para que entre en el array
        if (dobleFactor) {
            s[5] = "Sí";
        } else {
            s[5] = "No";
        }

        s[6] = notas;

        return s;
    }

}
