package negocio;

import BackEnd.CalculadoraBackend;

public class Memoria {
    private CalculadoraBackend calculadora;
    private double primeiraParte;
    private double segundaParte;
    private String operacao;

    public Memoria() {
        calculadora = new CalculadoraBackend();
        primeiraParte = 0;
        segundaParte = 0;
        operacao = "";
    }

    public String getNumeros() {
        return "" + segundaParte; // Retorna a segunda parte para exibição no Display
    }

    public void setNumero(String numero) {
        if (numero.equals("=")) {
            double resultado = calculadora.calcular(primeiraParte, operacao, segundaParte);
            segundaParte = resultado;
            operacao = "";
        } else if (isOperador(numero)) {
            operacao = numero;
            primeiraParte = segundaParte;
            segundaParte = 0;
        } else {
            segundaParte = Double.parseDouble(numero);
        }
    }

    private boolean isOperador(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}

