package entidades;

public class Comida {

    private String nombre;
    private String detalle;
    private int calorias;
    private int idComida;
    private int estado;

    public Comida() {

    }

    public Comida(String nombre, String detalle, int calorias, int idComida, int estado) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.calorias = calorias;
        this.idComida = idComida;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
}
