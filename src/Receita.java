public class Receita {
    //new cria o obijeto
    //+exibirReceita():void metodo
    String nomeReceita;
    String autorReceita;
    String nivelDificudade;
    int tempoPreparo;
    int procoes;
    String resumoReceita;
    String ingredientes;
    String modoPreparo;

    //metodo sem retorno
    public void exibirReceita(){
        System.out.println("receita de "+nomeReceita);
        System.out.println("==================");
        System.out.println("Publicado por "+ autorReceita);
        System.out.println("Dificuldade\t\tTempo de preparo\t\tPorçoes");
        System.out.println(nivelDificudade+"\t\t\t"+tempoPreparo+"\t\t\t"+procoes);
        System.out.println(resumoReceita);
        System.out.println("ingredientes\n"+ingredientes);
        System.out.println("Modo de preparo\n"+modoPreparo);
    }

    //metodo com retorno
    public String exibirReceita2(){
        String mensagem = "receita de "+ nomeReceita +
                "\n=================="+"Publicado por "+ autorReceita+
                "Dificuldade\t\tTempo de preparo\t\tPorçoes"+
                nivelDificudade+"\t\t\t"+tempoPreparo+"\t\t\t"+procoes;
        return mensagem;
    }
}

