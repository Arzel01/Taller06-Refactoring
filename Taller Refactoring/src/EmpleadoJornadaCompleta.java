
public abstract class EmpleadoJornadaCompleta extends Empleado {
    private double salarioBase;
    
    public EmpleadoJornadaCompleta(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, String genero) {
        super(nombre, horasTrabajadas, departamento, genero);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (getHorasTrabajadas() < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    
        double salarioTotal = salarioBase;
    
        if (getHorasTrabajadas() > 40) {
            salarioTotal += (getHorasTrabajadas() - 40) * 50; 
        }

        return getDepartamento().calcularValorDepartamento(salarioTotal);
    }

    @Override
        public void imprimirDetalles(){
            super.imprimirDetalles();
            System.out.println("Salario: " + salarioBase);
        }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double setSalarioBase(double salarioBase){
        return this.salarioBase = salarioBase;
    }
}
