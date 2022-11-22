package acosta.andrey.base;

public class Empleado {
    private String nombre;
    private int id;
    private String apellido;
    private int edad;
    private double salario;
    private String casado;
    private int cant_hijos;

    public Empleado(String nombre, int id, String apellido, int edad, double salario, String casado, int cant_hijos) {
       setNombre(nombre);
       setId(id);
       setApellido(apellido);
       setEdad(edad);
       setSalario(salario);
       setCasado(casado);
       setCant_hijos(cant_hijos);
    }
    public Empleado(){

    }

    public Empleado(String nombre, int edad, double salario, int hijos) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", casado='" + casado + '\'' +
                ", cant_hijos=" + cant_hijos +
                '}';
    }
}
