package BackEnd;

public class CalculadoraBackend {
    
	public double calcular(double primeiraParte, String operacao, double segundaParte) {
        switch (operacao) {
            case "+":
                return primeiraParte + segundaParte;
            case "-":
                return primeiraParte - segundaParte;
            case "*":
                return primeiraParte * segundaParte;
            case "/":
                if (segundaParte == 0) {
                    // Tratamento de divisão por zero
                    return Double.NaN;
                }
                return primeiraParte / segundaParte;
            default:
                return Double.NaN; // Operação inválida
        }
    }
}
