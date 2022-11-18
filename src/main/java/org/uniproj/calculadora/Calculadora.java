package org.uniproj.calculadora;
import org.uniproj.pessoa.*;
public class Calculadora {

    public static void calcularImc(Pessoa pessoa){
        double alturaSqr = Math.pow((double) pessoa.getAltura()/100, 2.0);
       pessoa.setImc(pessoa.getPeso()/alturaSqr);
    }

    public static String statusImc(Pessoa pessoa){
        double imc = pessoa.getImc();
        if(pessoa.getSexo() == "masculino"){
            if(imc < 19.1)
                return "abaixo do peso";
            else if(imc < 25.8)
                return "ideal";
            else
                return "obeso";
        }
        else{
            if(imc < 20.7)
                return "abaixo do peso";
            else if(imc < 26.4)
                return "ideal";
            else
                return "obeso";
        }

    }

    public static double txGorduraCorporal(Pessoa pessoa){
        return (1.2 * pessoa.getImc()) - (10.8 * ((pessoa.getSexo() == "feminino")? 0 : 1) + (0.23 * pessoa.getIdade()) - 5.4);
    }


}
