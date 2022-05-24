package medioCurso.Pregunta3;

public class Main {

    public static void main(String[] args) {

        ClienteControlador clienteControlador = new ClienteControlador("Cliente");

        System.out.println("CLIENTE 1: "+clienteControlador.getNombre());

        clienteControlador.agregarCliente(new Cliente("Kevin","Arteaga","Cabra",73627795));
        clienteControlador.agregarCliente(new Cliente("Juan","Ramirez","Perez",75847963));
        clienteControlador.agregarCliente(new Cliente("Fernan","Torres","Vasquez",758496577));

        for (Cliente cliente: clienteControlador.listarClientes())
        {
            System.out.println(cliente.getNombres()+ " " +cliente.getApepat()+ "" + cliente.getApemat()+ " "+ cliente.getDni());
        }



    }
}
