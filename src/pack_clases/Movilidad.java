package pack_clases;

public class Movilidad {
    private String placa;
    private String modelo;
    private int cant_pasj;
    private String año_fab;
    private int n_papeletas;

    public Movilidad() {
    }

    public Movilidad(String placa, String modelo, int cant_pasj, String año_fab, int n_papeletas) {
        this.placa = placa;
        this.modelo = modelo;
        this.cant_pasj = cant_pasj;
        this.año_fab = año_fab;
        this.n_papeletas = n_papeletas;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCant_pasj() {
        return cant_pasj;
    }

    public void setCant_pasj(int cant_pasj) {
        this.cant_pasj = cant_pasj;
    }

    public String getAño_fab() {
        return año_fab;
    }

    public void setAño_fab(String año_fab) {
        this.año_fab = año_fab;
    }

    public int getN_papeletas() {
        return n_papeletas;
    }

    public void setN_papeletas(int n_papeletas) {
        this.n_papeletas = n_papeletas;
    }
    
    public int Capacidad(){
        switch(placa){
            case "M001":
                return 60;
            case "M002":
                return 55;
            case "M003":
                return 50;
            case "M004":
                return 45;
            case "M005":
                return 40;
            default:
                return 0;
        }
    }
    
    public int Asientos_Disponibles(){
        return Capacidad()-cant_pasj;
    }
    
    public String Estado(){
        if (n_papeletas>0 && n_papeletas<=10){
            return "Regular para el uso";
        } else if (n_papeletas>10 && n_papeletas<=20){
            return "No Recomendable para el uso";
        } else
            return "Disponible para el uso";
    }
}
