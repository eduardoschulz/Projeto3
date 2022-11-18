package org.uniproj;

import org.uniproj.calculadora.Calculadora.*;
import org.uniproj.pessoa.Pessoa;

import static org.uniproj.calculadora.Calculadora.calcularImc;
import static org.uniproj.calculadora.Calculadora.statusImc;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(19, 61, 165, "Moxé", "manleto", "masculino");
        calcularImc(p1);
        String stats = statusImc(p1);
        System.out.printf("%s\n%s", stats, p1.getImc());


    }
}