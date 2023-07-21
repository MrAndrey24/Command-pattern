package acosta.andrey.main;

import acosta.andrey.base.Empleado;
import acosta.andrey.comando_abstracto.TareaEjecutar;
import acosta.andrey.comando_concreto.EnvioTramos;
import acosta.andrey.comando_concreto.ImprimirTramos;
import acosta.andrey.comando_concreto.ManejadorTarea;
import acosta.andrey.comando_concreto.ValidarTramsos;
import java.io.BufferedReader;
import java.io.IOException;
import static java.lang.System.out;

public class GestorComando {

    public void ejecutar (TareaEjecutar tarea, Empleado p) {
        tarea.ejecutarOrden66(p);
    }


    public void IniciarProceso() throws IOException {
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));
        ManejadorTarea st  = new ManejadorTarea();
        st.agregar(new ValidarTramsos());
        st.agregar(new ImprimirTramos());
        st.agregar(new EnvioTramos());

        out.println("Bienvenido al sistema de gestion de calculos de tramos");
        out.println("------------------------------------------------------");
        out.println("Por favor ingrese su nombre");
        String nombre = in.readLine();
       out.println("Ingrese su id");
       int id = Integer.parseInt(in.readLine());
       out.println("Ingrese sus apellidos");
       String apellidos = in.readLine();
       out.println("Ingrese su edad");
       int edad = Integer.parseInt(in.readLine());
       if (edad >= 18 ){
           out.println("Usuario valido");
       }else {
           out.println("Debes ser mayor de 18 ");
       }
       out.println("Ingrese su salario bruto");
       double salario = Double.parseDouble(in.readLine());
       out.println("Usted esta casado ?");
       out.println("SI,NO");
       String casado = in.readLine().toUpperCase();
       out.println("Cuantos hijos tiene ? ");
       int hijos = Integer.parseInt(in.readLine());


        ejecutar(st, new Empleado(nombre,id,apellidos, edad,salario,casado,hijos));


    }

}
