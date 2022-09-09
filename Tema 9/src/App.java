public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();

        cliente.edad = 21;
        cliente.nombre = "Lorka";
        cliente.telefono = "6184763517";
        cliente.credito = 1100;

        System.out.println("Nombre: " + cliente.nombre + "\nEdad: "  + cliente.edad  + " años" + "\nTeléfono: " + cliente.telefono + "\nCrédito: " + "$" + cliente.credito);
        
        Trabajador trabajador = new Trabajador();
        
        trabajador.edad = 33;
        trabajador.nombre = "Dorka";
        trabajador.telefono = "6121876535";
        trabajador.salario = 1850;

        System.out.println("Nombre: " + trabajador.nombre + "\nEdad: " + trabajador.edad + " años" + "\nTeléfono: " + trabajador.telefono + "\nSalario: " + "$" + trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}