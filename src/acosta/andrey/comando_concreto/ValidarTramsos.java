package acosta.andrey.comando_concreto;

import acosta.andrey.base.Empleado;
import acosta.andrey.comando_abstracto.TareaEjecutar;

public class ValidarTramsos implements TareaEjecutar {


    @Override
    public void ejecutarOrden66(Empleado empleado) {
        ValidarTramos(empleado);
    }

    private void ValidarTramos(Empleado empleado) {
        double salario = empleado.getSalario();
        int cant_hijos = empleado.getCant_hijos();
        String casado = empleado.getCasado();

        if (salario < 830000) {
            System.out.println("El empleado " + empleado.getNombre() + " no tiene que hacer tramos, debido a que su salario es menor a $830,000");
        } else {
            System.out.println("El empleado " + empleado.getNombre() + " tiene que hacer tramos");
            calcularTramo(empleado, salario, cant_hijos, casado);
        }
    }

    private void calcularTramo(Empleado empleado, double salario, int cant_hijos, String casado) {
        if (salario >= 5000000 || (salario >= 432000 && cant_hijos < 1 && casado.equals("no"))) {
            aplicarDescuento(empleado, 779950, 0.25);
        } else if (cant_hijos > 1 && casado.equals("si")) {
            aplicarDescuento(empleado, 772234, 0.25);
        } else if (salario >= 2500000) {
            aplicarDescuento(empleado, 611200, 0.20);
        } else if (salario >= 1500000) {
            aplicarDescuento(empleado, 178800, 0.15);
        } else if (salario >= 840000 && cant_hijos <= 1 && casado.equals("no")) {
            aplicarDescuento(empleado, 39300, 0.15);
        } else if (salario >= 840000 && cant_hijos <= 1 && casado.equals("si")) {
            aplicarDescuento(empleado, 32230, 0.15);
        }
    }

    private void aplicarDescuento(Empleado empleado, double descuento, double porcentaje) {
        double salario = empleado.getSalario();
        double nuevoSalario = salario - descuento;
        empleado.setSalario(nuevoSalario);
        System.out.println("El empleado " + empleado.getNombre() + " tiene un tramo del " + (porcentaje * 100) + "%");
    }



}
