public class DepartmentoSistemas extends Departamento{

    @Override
    public double calcularValorDepartamento(double salario) {
        return salario += 20;
    }

}