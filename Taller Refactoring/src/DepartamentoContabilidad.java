public class DepartamentoContabilidad extends Departamento{


    @Override
    public double calcularValorDepartamento(double salario) {
        return salario += 10;
    }

    
}
