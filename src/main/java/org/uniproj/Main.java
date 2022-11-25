package org.uniproj;

import org.uniproj.arquivo.FileIO;
import org.uniproj.arquivo.Json;
import org.uniproj.pessoa.Pessoa;
import org.uniproj.io.Io;

import static org.uniproj.calculadora.Calculadora.*;

public class Main {
    public static void main(String[] args) {

        FileIO f = new FileIO();
        Pessoa pessoa = null;
        String linha = f.leArquivo(".save.json");
        if (!(linha.equals("!"))) {
            if (Io.inputString("Save encontrado. Deseja carrega-lo?(S/N) ").equalsIgnoreCase("S"))
                pessoa = Json.jsonToPessoa(linha);
         else
            pessoa = cadastrarPessoa();
        }
        else
            pessoa = cadastrarPessoa();

        System.out.printf("%s\n", opcoes());
        while(true){
            String recv = Io.inputString(">");
            switch (recv){
                case "1":
                    System.out.printf("%.2f\n", calcularImc(pessoa));
                    break;
                case "2":
                    System.out.printf("%s\n", statusImc(pessoa));
                    break;
                case "3":
                    System.out.printf("%s\n", txGorduraCorporal(pessoa));
                    break;
                case "4":
                    System.out.printf("%d\n", pesoIdeal(pessoa));
                    break;
                case "5":
                    sairESalvar(pessoa, f);
                case ":wq":
                    sairESalvar(pessoa, f);
                case ":q":
                    System.exit(0);
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
    public static void sairESalvar(Pessoa pessoa, FileIO f){
        String json = Json.pessoaToJson(pessoa);
        f.escreverEmArquivo(json, ".save.json");
        System.exit(0);
    }

}