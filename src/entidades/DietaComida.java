package entidades;

public class DietaComida {

    private int idComida;
    private int idDieta;
    private int idDC;
    private int estado;

    public DietaComida() {

    }

    public DietaComida(int idComida, int idDieta, int estado) {
        this.idComida = idComida;
        this.idDieta = idDieta;
        this.estado = estado;
    }

    public DietaComida(int idComida, int idDieta, int idDC, int estado) {
        this.idComida = idComida;
        this.idDieta = idDieta;
        this.idDC = idDC;
        this.estado = estado;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public int getIdDC() {
        return idDC;
    }

    public void setIdDC(int idDC) {
        this.idDC = idDC;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
