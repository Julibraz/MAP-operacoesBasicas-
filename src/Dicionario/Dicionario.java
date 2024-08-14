package Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributos
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarDefinicao(String palavra){
        String def;
        if(!dicionarioMap.isEmpty() && dicionarioMap.containsKey(palavra)){
            return dicionarioMap.get(palavra);
        }
        return "Palavra não encontrada.";
    }

}
