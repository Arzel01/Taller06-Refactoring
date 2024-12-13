public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, horasTrabajadas, departamento, genero);
        this.tarifaHora = tarifaHora;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Salario: " + this.calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * tarifaHora;
    }

    public void setTarifaHora(double tarifaHora){
        this.tarifaHora = tarifaHora;
    }
    
    public double getTarifaHora(){
        return this.tarifaHora;
    }

    // Más metodos
}
