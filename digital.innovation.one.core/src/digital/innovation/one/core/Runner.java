package digital.innovation.one.core;

import digital.innovation.one.utils.operacao.Calculadora;


public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.sum(2,2));
        System.out.println(calculadora.sub(2,2));
        System.out.println(calculadora.mult(2,2));
        System.out.println(calculadora.div(2,2));



    }
}
