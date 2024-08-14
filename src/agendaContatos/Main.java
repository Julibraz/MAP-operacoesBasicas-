package agendaContatos;

public class Main {
    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila Sousa",918273);
        agendaContatos.adicionarContato("Gabriel",321456);
        agendaContatos.adicionarContato("Ana",654321);
        agendaContatos.adicionarContato("Luiza",456789);
        agendaContatos.adicionarContato("Joao", 123654);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Ana");

        agendaContatos.exibirContatos();

        System.out.println("O numero da pessoal que foi pesquisada eh: " + agendaContatos.pesquisarPorNome("Camila"));
    }
}