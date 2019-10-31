package pack_clases;

public class Usuario {
    private String user;
    private String pasword;

    public Usuario() {
    }

    public Usuario(String user, String pasword) {
        this.user = user;
        this.pasword = pasword;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
}
