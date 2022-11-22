package acosta.andrey.main;

import acosta.andrey.base.Empleado;
import acosta.andrey.comando_abstracto.TareaEjecutar;

public class GestorTarea {

    public  void ejecutar(TareaEjecutar tarea, Empleado empleado){
        tarea.ejecutarOrden66(empleado);

    }
}
