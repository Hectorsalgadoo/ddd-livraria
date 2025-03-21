import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        Editora novatec = new Editora();
                //Criando um objeto do tipo editora chamado novatec
            novatec.nome="Novatec";
            novatec.site="www.novatec.com";
            novatec.telefone="115689123";

        //criar um objeto-> instanciar um objeti
        // sintaxe: tipo nomeObjeto=new Tipo();
                    Livro meuLivro= new Livro();
                    meuLivro.titulo = "UML 2 ";
                    meuLivro.autor="Gilleanes Guedes";
                    meuLivro.editora=novatec;
                    meuLivro.preco=50;
                    meuLivro.paginas=484;
                    meuLivro.tipoCapa=TipoCapaEnum.DURA;
                    meuLivro.resumo="UML abordagem pratica...";
                    meuLivro.exibirLivro();


           Livro livroDoHector = new Livro();
           livroDoHector.titulo="Herry potter e a pedra filosofal";
           livroDoHector.autor="J K";

           Livro livro =new Livro();
            System.out.println("Informe o titulo do livro");
            livro.titulo=leitor.nextLine();
            System.out.println("Tipo de cpa:\n1 - Comum\n2 - Dura\n3 - Personalizada"+
                    "\nEscolha o tipo de capa desejada:");
            int opcao = leitorNumerico`
           
    }
}
