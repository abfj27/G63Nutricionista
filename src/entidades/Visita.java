package entidades;

import java.time.LocalDate;

public class Visita {

    private int idDieta;
    private int idPaciente;
    private double peso;
    private LocalDate fecha;
    private int idVisita;
    private int estado;

    public Visita() {

    }

    public Visita(int idDieta, int idPaciente, double peso, LocalDate fecha, int estado) {
        this.idDieta = idDieta;
        this.idPaciente = idPaciente;
        this.peso = peso;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
