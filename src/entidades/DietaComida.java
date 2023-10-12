package entidades;

public class DietaComida {

    private Comida comida;
    private Dieta dieta;
    private Horario horario;
    private int idDC;
    private int estado;

    public DietaComida() {

    }

    public DietaComida(Comida comida, Dieta dieta, Horario horario, Porcion porcion, int estado) {
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
        this.porcion = porcion;
        this.estado = estado;
    }

    public DietaComida(Comida comida, Dieta dieta, Horario horario, Porcion porcion, int idDC, int estado) {
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
        this.porcion = porcion;
        this.idDC = idDC;
        this.estado = estado;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Porcion getPorcion() {
        return porcion;
    }

    public void setPorcion(Porcion porcion) {
        this.porcion = porcion;
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
