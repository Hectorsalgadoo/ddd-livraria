public class testeReceita {
    public static void main(String[] args) {
        Receita boloFuba = new Receita();
        boloFuba.nomeReceita = "Bolo de fuba";
        boloFuba.autorReceita = "Hector";
        boloFuba.nivelDificudade = "Facil";
        boloFuba.tempoPreparo = 35;
        boloFuba.procoes = 8;
        boloFuba.resumoReceita = "O bolo de fubá simples combina com um cafezinho no lanche da tarde. Fácil de preparar, a receita leva menos de 10 ingredientes.\n" + "\n" + "Ele é ideal para quem busca um bolo fofinho e muito saboroso. Confira o passo a passo!";
        boloFuba.ingredientes = "1 xícara de chá de óleo\n" +
                "4 ovos\n" +
                "2 xícaras de chá de açúcar\n" +
                "1 xícara de chá de leite morno\n" +
                "2 xícaras de chá de farinha de trigo\n" +
                "1 xícara de chá de fubá\n" +
                "1 colher de sopa de fermento em pó";
        boloFuba.modoPreparo = "1\n" +
                "Bata no liquidificador o óleo, ovos e a açúcar até ficar homogêneo. Depois, adicione leite e bata novamente .\n" +
                "2\n" +
                "Com o liquidificador batendo, adicione farinha de trigo aos poucos.\n" +
                "3\n" +
                "Acrescente o fubá e bata até misturar bem.\n" +
                "4\n" +
                "Sem bater, acrescente o fubá e misture com uma espátula.\n" +
                "5\n" +
                "Despeje em uma forma untada com manteiga. Leve para assar em forno preaquecido a 250 graus Celsius por 35 minutos.";
        boloFuba.exibirReceita();
        System.out.println(boloFuba.exibirReceita2());

        /*
        System.out.println(boloFuba.tempoPreparo+" endereço"+boloFuba);
        Receita boloFubaEliane= new Receita();
        boloFubaEliane.tempoPreparo = 50;
        System.out.println(boloFuba.tempoPreparo+ " "+ boloFubaEliane.tempoPreparo+ " endereço " +boloFubaEliane);
        */
    }
}
