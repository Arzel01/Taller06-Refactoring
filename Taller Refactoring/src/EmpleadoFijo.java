public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private double salarioBase;
    

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, horasTrabajadas, departamento, genero);
        this.bonoAnual = bonoAnual;
        this.salarioBase = salarioBase;
        
    }

    public void imprimirDetalles() {
        printDetalles();
    }

    private void printDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
