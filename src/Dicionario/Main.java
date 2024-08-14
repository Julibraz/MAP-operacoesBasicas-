package Dicionario;

public class Main {
    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Amor", "Emoção ou sentimento que leva uma pessoa a desejar o bem a outra pessoa ou a uma coisa.");
        dicionario.adicionarPalavra("Odio","A pessoa ou a coisa odiada.");
        dicionario.adicionarPalavra("Felicidade","Sensação de bem estar e contentamento");
        dicionario.adicionarPalavra("Prazer","Sensação ou emoção agradável");
        dicionario.adicionarPalavra("Inteligente","Que ou aquele que possui mais inteligência que a média das pessoas.");
        dicionario.adicionarPalavra("Simpatico", "relativo a simpatia.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Prazer");

        dicionario.exibirPalavras();

        System.out.println("A definição da palavra pesquisada eh: " + dicionario.pesquisarDefinicao("Inteligente"));
    }
}