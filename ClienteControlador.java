package medioCurso.Pregunta3;

public class ClienteControlador {

    public String nombre;
    public int contador;

    public Cliente[] cliente;

    public ClienteControlador(String nombre) {

        this.nombre = nombre;

        this.cliente = new Cliente[3];

        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCliente(Cliente cliente)
    {
        this.cliente[this.contador] = cliente;

        this.contador ++;
    }

    public Cliente[] listarClientes()
    {
        return this.cliente;
    }

    public Cliente[] buscarCliente()
    {

    }

    public Cliente[] editar()
    {

    }
    public Cliente[] eliminar()
    {

    }
}
