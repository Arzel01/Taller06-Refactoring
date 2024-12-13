
public abstract class EmpleadoJornadaCompleta extends Empleado {
    private double salarioBase;
    
    public EmpleadoJornadaCompleta(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, String genero) {
        super(nombre, horasTrabajadas, departamento, genero);
        this.salarioBase = salarioBase;
    }

    @override
    public double calcularSalario() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    
        double salarioTotal = salarioBase;
    
        if (horasTrabajadas > 40) {
            salarioTotal += (horasTrabajadas - 40) * 50; 
        }

        return departamento.calcularValorDepartamento(salarioTotal);
    }

    @override
    private void printDetalles() {
        super.printDetalles();
        System.out.println("Salario: " + super.getSalarioBase());
    }

    public void getSalarioBase(){
        return salarioBase;
    }

    public double setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
