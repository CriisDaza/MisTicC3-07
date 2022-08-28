public class Empleado {
    private String nombreEmpleado;
    private String correo;
    private String rolEmpleado;

    public Empleado(String nombreEmpleado, String correo, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
