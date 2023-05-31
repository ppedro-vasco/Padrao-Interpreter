public class Funcionario {
    private double salarioBase;
    private double horasExtras;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double calcularHorasExtras() {
        return Empresa.calcularHorasExtras(this.horasExtras);
    }

    public double valorTotalSalario(){
        double salarioBase = getSalarioBase();
        double horasExtras = calcularHorasExtras();

        return salarioBase + horasExtras;
    }
}
