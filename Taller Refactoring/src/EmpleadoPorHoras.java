public class EmpleadoPorHoras extends Empleado {
  
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        super.setSalarioBase(calcularSalario());
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    // Más metodos
}