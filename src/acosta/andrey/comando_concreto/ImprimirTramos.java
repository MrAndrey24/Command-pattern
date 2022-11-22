package acosta.andrey.comando_concreto;

import acosta.andrey.base.Empleado;
import acosta.andrey.comando_abstracto.TareaEjecutar;

public class ImprimirTramos implements TareaEjecutar {

    @Override
    public void ejecutarOrden66(Empleado empleado) {
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellido());
        System.out.println(empleado.getSalario());
    }
}
