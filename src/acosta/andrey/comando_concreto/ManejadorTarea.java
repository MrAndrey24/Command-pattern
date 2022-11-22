package acosta.andrey.comando_concreto;

import acosta.andrey.base.Empleado;
import acosta.andrey.comando_abstracto.TareaEjecutar;

import java.util.ArrayList;
import java.util.List;

public class ManejadorTarea implements TareaEjecutar {
    private List<TareaEjecutar> lista = new ArrayList<TareaEjecutar>();

    public void agregar(TareaEjecutar tarea){
        lista.add(tarea);
    }
    @Override
    public void ejecutarOrden66(Empleado empleado) {
        lista.forEach((tarea) -> tarea.ejecutarOrden66(empleado));

    }



}
