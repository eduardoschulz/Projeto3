package org.uniproj;

import org.uniproj.arquivo.FileIO;
import org.uniproj.arquivo.Json;
import org.uniproj.pessoa.Pessoa;
import org.uniproj.utils.Io;

import static org.uniproj.calculadora.Calculadora.*;

public class Main {
    public static void main(String[] args) {

        FileIO f = new FileIO();
        Pessoa pessoa = null;
        String linha = f.leArquivo(".save.json");
        if(!(linha.equals("!"))){
            if(Io.inputString("Save encontrado. Deseja carrega-lo? ").equalsIgnoreCase("S"))
                pessoa = Json.jsonToPessoa(linha);}
        else
            pessoa = cadastrarPessoa();

        System.out.printf("%s\n", opcoes());
        while(true){
            int recv = Io.inputInt(">");
            switch (recv){
                case 1:
                    System.out.printf("%.2f\n", calcularImc(pessoa));
                    break;
                case 2:
                    System.out.printf("%s\n", statusImc(pessoa));
                    break;
                case 3:
                    System.out.printf("%s\n", txGorduraCorporal(pessoa));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida! ");

            }
        }





    }
    public static Pessoa cadastrarPessoa(){
       Pessoa pessoa = new Pessoa(Io.inputString("\nNome: "),
               "1", Io.inputInt("\nIdade: "),
               Io.inputInt("\nPeso: "),
               Io.inputInt("\nAltura(ex:175): "),
               Io.inputString("\nSexo(ex: masculino):"));
       return pessoa;
    }
    public static String opcoes(){
        return "Menu\n " +
                "[0] Mostrar Opções\n" +
                "[1] Fazer Imc\n" +
                "[2] Status Imc\n" +
                "[3] Fazer Tx Gordura Corporal\n" +
                "[4] Fazer Peso Ideal\n" +
                "[5] Sair\n";
    }

}