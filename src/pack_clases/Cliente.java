
package pack_clases;

public class Cliente {
    String nombre;
    String apellido;
    String correo;
    String genero;
    String tipoDoc;
    int telefono;
    int celular;
    int numeroEmergencia;
    int dni;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, String genero, String tipoDoc, int telefono, int celular, int numeroEmergencia, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.tipoDoc = tipoDoc;
        this.telefono = telefono;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(int numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    

}