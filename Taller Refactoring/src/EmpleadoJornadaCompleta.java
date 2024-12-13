
public abstract class EmpleadoJornadaCompleta extends Empleado {
    private double salarioBase;
    
    public EmpleadoJornadaCompleta(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, String genero) {
        super(nombre, horasTrabajadas, departamento, genero);
        this.salarioBase = salarioBase;
    }

    public void getSalarioBase(){
        return salarioBase;
    }

    public double setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
