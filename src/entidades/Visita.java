package entidades;

import java.time.LocalDate;

public class Visita {

    private Dieta Dieta;
    private Paciente Paciente;
    private double peso;
    private LocalDate fecha;
    private int idVisita;
    private int estado;

    public Visita() {
    }

    public Visita(Dieta Dieta, Paciente Paciente, double peso, LocalDate fecha, int estado) {
        this.Dieta = Dieta;
        this.Paciente = Paciente;
        this.peso = peso;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Visita(Dieta Dieta, Paciente Paciente, double peso, LocalDate fecha, int idVisita, int estado) {
        this.Dieta = Dieta;
        this.Paciente = Paciente;
        this.peso = peso;
        this.fecha = fecha;
        this.idVisita = idVisita;
        this.estado = estado;
    }

    public Dieta getDieta() {
        return Dieta;
    }

    public void setDieta(Dieta Dieta) {
        this.Dieta = Dieta;
    }

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente Paciente) {
        this.Paciente = Paciente;
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

    @Override
    public String toString() {
        return "idDieta=" + Dieta.getIdDieta() + ", id.Paciente=" + Paciente.getIdPaciente() + ", peso=" + peso + ", fecha=" + fecha + ", idVisita=" + idVisita + ", estado=" + estado;
    }

    
}
