package pack_clases;

/**
 *
 * @author Bryan
 */
public class Conductor {

    private int ID;
    private String nombre;
    private String apellido;
    private String fech_nac;
    private String genero;
    private String dni;
    private String telefono;
    private int num_Papeleta;
    private int aniosExp;
    
    public Conductor() {
    }

    public Conductor(int ID, String nombre, String apellido, String fech_nac, String genero, String dni, String telefono, int num_Papeleta, int aniosExp) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fech_nac = fech_nac;
        this.genero = genero;
        this.dni = dni;
        this.telefono = telefono;
        this.num_Papeleta = num_Papeleta;
        this.aniosExp = aniosExp;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getFech_nac() {
        return fech_nac;
    }

    public void setFech_nac(String fech_nac) {
        this.fech_nac = fech_nac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNum_Papeleta() {
        return num_Papeleta;
    }

    public void setNum_Papeleta(int num_Papeleta) {
        this.num_Papeleta = num_Papeleta;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }   
}
