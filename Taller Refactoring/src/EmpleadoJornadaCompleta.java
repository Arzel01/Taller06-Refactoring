
public abstract class EmpleadoJornadaCompleta extends Empleado {
    private double salarioBase;
    
    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, horasTrabajadas, departamento, genero);
        this.salarioBase = salarioBase;
        
    }
