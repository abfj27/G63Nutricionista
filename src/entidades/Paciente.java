package entidades;

public class Paciente {

    private int dni;
    private String apellido;
    private String nombre;
    private double pesoActual;
    private String domicilio;
    private String telefono;
    private String email;
    private int idPaciente;
    private int estado;

    public Paciente() {

    }

    public Paciente(int dni, String apellido, String nombre, double pesoActual, String domicilio, String telefono, String email, int estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.pesoActual = pesoActual;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }

    public Paciente(int dni, String apellido, String nombre, double pesoActual, String domicilio, String telefono, String email, int idPaciente, int estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.pesoActual = pesoActual;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.idPaciente = idPaciente;
        this.estado = estado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
