package acosta.andrey.comando_concreto;

import acosta.andrey.base.Empleado;
import acosta.andrey.comando_abstracto.TareaEjecutar;

public class ValidarTramsos implements TareaEjecutar {


    @Override
    public void ejecutarOrden66(Empleado empleado) {

        ValidarTramos(empleado);
    }

    private void ValidarTramos(Empleado empleado) {
        if (empleado.getSalario() < 830000) {
            System.out.println("El empleado " + empleado.getNombre() + " no tiene que hacer tramos, debido a que su salario es menor a $840,000");


        } else {

            System.out.println("El empleado " + empleado.getNombre() + " tiene que hacer tramos");


        }

        if (empleado.getSalario() >= 5000000 || empleado.getSalario() >= 432000 && empleado.getCant_hijos() < 1 && empleado.getCasado().equals("no")) {
            empleado.setSalario(empleado.getSalario() - 779950);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 25%, por lo tanto su saldo quedara con " + empleado.getSalario());


        } else if (empleado.getCant_hijos() > 1 && empleado.getCasado().equals("si")) {
            empleado.setSalario(empleado.getSalario() - 772234);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 25%, por lo tanto su saldo quedara con " + empleado.getSalario());


        }
       else if (empleado.getSalario() >= 2500000 || empleado.getSalario() >= 2163000 && empleado.getCant_hijos() < 1 && empleado.getCasado().equals("no")) {
            empleado.setSalario(empleado.getSalario() - 611200);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 20%, por lo tanto su saldo quedara con " + empleado.getSalario());


        } else if (empleado.getCant_hijos() > 1 && empleado.getCasado().equals("si")) {
            empleado.setSalario(empleado.getSalario() - 604130);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 20%, por lo tanto su saldo quedara con " + empleado.getSalario());


        }
       else if (empleado.getSalario() >= 1500000 || empleado.getSalario() >= 1233000 && empleado.getCant_hijos() < 1 && empleado.getCasado().equals("no")) {
            empleado.setSalario(empleado.getSalario() - 178800);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 15%, por lo tanto su saldo quedara con " + empleado.getSalario());


        } else if (empleado.getCant_hijos() > 1 && empleado.getCasado().equals("si")) {
            empleado.setSalario(empleado.getSalario() - 171793);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 15%, por lo tanto su saldo quedara con "  + empleado.getSalario());


        } else if (empleado.getSalario() >= 840000 && empleado.getCant_hijos() < 1 && empleado.getCasado().equals("no")) {
            empleado.setSalario(empleado.getSalario() - 39300);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 15%, por lo tanto su saldo quedara con " + empleado.getSalario());


        } else if (empleado.getSalario() >= 840000 && empleado.getCant_hijos() < 1 && empleado.getCasado().equals("si")) {
            empleado.setSalario(empleado.getSalario() - 32230);
            System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellido() + " tiene un tramo del 15%, por lo tanto su saldo quedara con " + empleado.getSalario());


        }
    }
}
