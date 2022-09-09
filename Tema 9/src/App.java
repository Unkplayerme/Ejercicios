public class App {
    public static void main(String[] args) throws Exception {
        Cliente miCliente = new Cliente();

        miCliente.setEdad(21);
        miCliente.setNombre("Lorka");
        miCliente.setTelefono("6184763517");
        miCliente.setCredito(1000);

        System.out.println("Edad: " + miCliente.getEdad() + "\nNombre: " + miCliente.getNombre() + "\nTeléfono: " + miCliente.getTelefono() + "\nCrédito: " + miCliente.getCredito());
        
        Trabajador miTrabajador = new Trabajador();
        
        miTrabajador.setEdad(33);
        miTrabajador.setNombre("Dorka");
        miTrabajador.setTelefono("6121876535");
        miTrabajador.setSalario(50000);

        System.out.println("Edad: " + miTrabajador.getEdad() + "\nNombre: " + miTrabajador.getNombre() + "\nTeléfono: " + miTrabajador.getTelefono() + "\nCrédito: " + miTrabajador.getSalario());

        Trabajador miTrabajador1 = new Trabajador();
        
        miTrabajador1.setEdad(33);
        miTrabajador1.setNombre("Dorka");
        miTrabajador1.setTelefono("6121876535");
        miTrabajador1.setSalario(50000);

        System.out.println("Edad: " + miTrabajador1.getEdad() + "\nNombre: " + miTrabajador1.getNombre() + "\nTeléfono: " + miTrabajador1.getTelefono() + "\nCrédito: " + miTrabajador1.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}