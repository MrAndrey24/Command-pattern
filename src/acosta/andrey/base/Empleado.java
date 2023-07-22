package acosta.andrey.base;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;
    private String casado;
    private int cant_hijos;

    public Empleado() {
    }

    public Empleado(String nombre, int id, double salario, String casado, int cant_hijos) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.casado = casado;
        this.cant_hijos = cant_hijos;
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
                ", salario=" + salario +
                ", casado='" + casado + '\'' +
                ", cant_hijos=" + cant_hijos +
                '}';
    }
}
