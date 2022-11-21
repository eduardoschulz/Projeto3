package org.uniproj.arquivo;


import com.google.gson.*;
import org.uniproj.pessoa.Pessoa;

public class Json {

    public static String pessoaToJson(Pessoa p){

        Gson g = new Gson();
        String json =  g.toJson(p);
        return json;

    }
    public static Pessoa jsonToPessoa(String s){
        Gson g = new Gson();
        return g.fromJson(s, Pessoa.class);
    }

}
