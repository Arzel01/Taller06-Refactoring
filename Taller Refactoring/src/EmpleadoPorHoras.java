public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, horasTrabajadas, departamento, genero);
        this.tarifaHora = tarifaHora;
    }

    @override
    public void printDetalles() {
        super.printDetalles();
        System.out.println("Salario: " + this.calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    // Más metodos
}
