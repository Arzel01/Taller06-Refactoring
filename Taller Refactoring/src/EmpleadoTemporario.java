public class EmpleadoTemporario extends EmpleadoJornadaCompleta {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.mesesContrato = mesesContrato;
    }

    @override
    public void printDetalles() {
        super.printDetalles()
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
