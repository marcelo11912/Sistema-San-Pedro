package Bean;

public class Catequista {

    private int idCatequista;
    private String nombres;
    private String Comunidad;
    private String cordinador;

    public String getComunidad() {
        return Comunidad;
    }

    public void setComunidad(String Comunidad) {
        this.Comunidad = Comunidad;
    }

    public String getCordinador() {
        return cordinador;
    }

    public void setCordinador(String cordinador) {
        this.cordinador = cordinador;
    }

   
    public int getIdCatequista() {
        return idCatequista;
    }

    public void setIdCatequista(int idCatequista) {
        this.idCatequista = idCatequista;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

   

}




