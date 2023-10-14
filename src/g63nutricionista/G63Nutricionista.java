package g63nutricionista;

import controlDatos.ComidaData;
import controlDatos.PacienteData;
import entidades.Paciente;

public class G63Nutricionista {

    public static void main(String[] args) {
        ComidaData cd=new ComidaData();
        System.out.println(cd.buscarComida("Pollo con arroz",350));


    }

}
