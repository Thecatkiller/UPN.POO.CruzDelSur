
package pack_clases;

public class Viaje {
   //ATRIBUTOS VUELO 
    private String origen;
    private String destino;
    private String num_pasajeros;
    private String cabina;
    private String ida;
    private String vuelta;

    //CONSTRUCTORES DEL VUELO
    public Viaje() {
    }

    public Viaje(String origen, String destino, String num_pasajeros, String cabina, String ida, String vuelta) {
        this.origen = origen;
        this.destino = destino;
        this.num_pasajeros = num_pasajeros;
        this.cabina = cabina;
        this.ida = ida;
        this.vuelta = vuelta;
    }
  
    
    //GETTER AND SETTERS

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(String num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getVuelta() {
        return vuelta;
    }

    public void setVuelta(String vuelta) {
        this.vuelta = vuelta;
    }

 
   
    
    
    
}
