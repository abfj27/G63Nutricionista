package entidades;

import java.time.LocalDate;

public class Dieta {

    private String nombre;
    private int idPaciente;
    private double pesoInicial;
    private double peroObjetivo;
    private LocalDate fechaInicla;
    private LocalDate fechaFinal;
    private int idDieta;
    private int estado;

    public Dieta() {

    }

    public Dieta(String nombre, int idPaciente, double pesoInicial, double peroObjetivo, LocalDate fechaInicla, LocalDate fechaFinal, int estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.pesoInicial = pesoInicial;
        this.peroObjetivo = peroObjetivo;
        this.fechaInicla = fechaInicla;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, int idPaciente, double pesoInicial, double peroObjetivo, LocalDate fechaInicla, LocalDate fechaFinal, int idDieta, int estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.pesoInicial = pesoInicial;
        this.peroObjetivo = peroObjetivo;
        this.fechaInicla = fechaInicla;
        this.fechaFinal = fechaFinal;
        this.idDieta = idDieta;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPeroObjetivo() {
        return peroObjetivo;
    }

    public void setPeroObjetivo(double peroObjetivo) {
        this.peroObjetivo = peroObjetivo;
    }

    public LocalDate getFechaInicla() {
        return fechaInicla;
    }

    public void setFechaInicla(LocalDate fechaInicla) {
        this.fechaInicla = fechaInicla;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
