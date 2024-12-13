public class DepartamentoSistemas extends Departamento{

    @Override
    public double calcularValorDepartamento(double salario) {
        return salario += 20;
    }

}