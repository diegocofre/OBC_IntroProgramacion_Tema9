public class Main {
    public static void main(String[] args) {
        var cli = new Cliente();
        cli.setEdad(44);
        cli.setNombre("Diego");
        cli.setTelefono("112334566");
        cli.setCredito(10000);

        System.out.println("El cliente " + cli.getNombre() + " tiene " + cli.getEdad() +
                " años y su teléfono es " + cli.getTelefono() + ". Además tiene " + cli.getCredito() + " crédito");

        var trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Juan");
        trabajador.setTelefono("34556660");
        trabajador.setSalario(12000);

        System.out.println("El trabajador " + trabajador.getNombre() + " tiene " + trabajador.getEdad() +
                " años y su teléfono es " + trabajador.getTelefono() + ". Además cobra un salario de " + trabajador.getSalario() );
    }
}