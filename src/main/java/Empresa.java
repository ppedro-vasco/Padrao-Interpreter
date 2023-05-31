public class Empresa {

    public static String formula = "horasExtras * valorHoraExtra";

    public static double calcularHorasExtras(double horasExtras) {
        double valorHoraExtra = 10.0;
        String expressao = formula.replace("horasExtras", Double.toString(horasExtras))
                .replace("valorHoraExtra", Double.toString(valorHoraExtra));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

