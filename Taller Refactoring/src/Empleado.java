public class Empleado {
    private String nombre;
    private Departamento departamento;
    private String genero;
    private int horasTrabajadas;

    public Empleado(){}
    public Empleado(String nombre, int horasTrabajadas, Departamento departamento, String genero) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero = genero;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }

    // Más metodos
}
