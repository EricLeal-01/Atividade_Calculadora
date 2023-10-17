//package BackEnd;
//
//public class Operacao {
//	
//    public static double calcular(double primeiraParte, double segundaParte, String operador) {
//        double resultado = 0.0;
//
//        switch (operador) {
//            case "+":
//                resultado = primeiraParte + segundaParte;
//                break;
//            case "-":
//                resultado = primeiraParte - segundaParte;
//                break;
//            case "*":
//                resultado = primeiraParte * segundaParte;
//                break;
//            case "/":
//                if (segundaParte != 0) {
//                    resultado = primeiraParte / segundaParte;
//                } else {
//                    throw new ArithmeticException("Divisão por zero não é permitida.");
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("Operação inválida: " + operador);
//        }
//
//        return resultado;
//    }
//}
