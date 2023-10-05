package entidades;

import java.time.LocalDate;

public class Dieta {

    private String nombre;
    private Paciente Paciente;
    private double pesoInicial;
    private double pesoObjetivo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private int idDieta;
    private int estado;

    public Dieta() {

    }

    public Dieta(String nombre, Paciente Paciente, double pesoInicial, double pesoObjetivo, LocalDate fechaInicial, LocalDate fechaFinal, int estado) {
        this.nombre = nombre;
        this.Paciente = Paciente;
        this.pesoInicial = pesoInicial;
        this.pesoObjetivo = pesoObjetivo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, Paciente Paciente, double pesoInicial, double pesoObjetivo, LocalDate fechaInicial, LocalDate fechaFinal, int idDieta, int estado) {
        this.nombre = nombre;
        this.Paciente = Paciente;
        this.pesoInicial = pesoInicial;
        this.pesoObjetivo = pesoObjetivo;
        this.fechaInicial = fechaInicial;
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
        return Paciente;
    }

    public void setPaciente(Paciente Paciente) {
        this.Paciente = Paciente;
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

    public void setPesoObjetivo(double pesoObjetivo) {
        this.pesoObjetivo = pesoObjetivo;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
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
