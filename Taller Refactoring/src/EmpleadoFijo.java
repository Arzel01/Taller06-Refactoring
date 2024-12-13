public class EmpleadoFijo extends EmpleadoJornadaCompleta {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.bonoAnual = bonoAnual;
        
    }

    @override
    private void printDetalles() {
        super.printDetalles();
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
