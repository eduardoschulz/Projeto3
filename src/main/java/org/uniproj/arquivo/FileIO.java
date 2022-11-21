package org.uniproj.arquivo;


import java.io.*;

public class FileIO {
    public void criaArquivoVazio(String arq){
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(arq));
            w.write('!');
            w.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void escreverEmArquivo(String s, String arq) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(arq));
            w.write(s);
            w.close();
        } catch (IOException e){
        e.printStackTrace();
    }

    }

    public String leArquivo(String arq){
        String read = "";
       try {
           BufferedReader r = new BufferedReader(new FileReader(arq));
           read = r.readLine();
           r.close();
       }catch (IOException e){
           criaArquivoVazio(arq);
       }
       return read;
    }


}
