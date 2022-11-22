package acosta.andrey.comando_concreto;

import acosta.andrey.base.Empleado;
import acosta.andrey.comando_abstracto.TareaEjecutar;

public class EnvioTramos implements TareaEjecutar {

    @Override
    public void ejecutarOrden66(Empleado empleado) {
        System.out.println("Envio de tramo de " + empleado.getNombre() + " se enviara al correo ");

    }
}
