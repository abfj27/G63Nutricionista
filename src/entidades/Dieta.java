package entidades;

import java.time.LocalDate;

public class Dieta {

    private String nombre;
    private Paciente idPaciente;
    private double pesoInicial;
    private double pesoObjetivo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private int idDieta;
    private int estado;

    public Dieta() {

    }

    public Dieta(String nombre, Paciente idPaciente, double pesoInicial, double peroObjetivo, LocalDate fechaInicla, LocalDate fechaFinal, int estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.pesoInicial = pesoInicial;
        this.pesoObjetivo = peroObjetivo;
        this.fechaInicial = fechaInicla;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, Paciente idPaciente, double pesoInicial, double peroObjetivo, LocalDate fechaInicla, LocalDate fechaFinal, int idDieta, int estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.pesoInicial = pesoInicial;
        this.pesoObjetivo = peroObjetivo;
        this.fechaInicial = fechaInicla;
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

    public Paciente getPaciente() {
        return idPaciente;
    }

    public void setPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoObjetivo() {
        return pesoObjetivo;
    }

    public void setPesoObjetivo(double peroObjetivo) {
        this.pesoObjetivo = peroObjetivo;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicla) {
        this.fechaInicial = fechaInicla;
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
