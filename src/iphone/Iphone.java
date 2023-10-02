package iphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{   
//Aparelho Telefonico 

    public void ligar() {
        System.out.println(verificarSinal());
        System.out.println("ligando ...");
    }
    public void atender(){
        System.out.println("atendendo ...");
    }

    public void redirecionarParaCorreioVoz() {
        System.out.println("chamada não atendida, encaminhando para correio de voz");
    }


    private String verificarSinal() {
        return "Aparelho possui sinal telefônico";
    }


//Navegador Internet 

    public void pesquisar(){
        verificarInternet();
        System.out.println("digite uma url");        
    }
    public void exibirPaginaWeb(){
        System.out.println("exibindo página");
    }
    public void adicionarNovaAba(){
        System.out.println("nova aba adicionada");
    }
    public void navegarEntreAbas(){
        System.out.println("selecione a aba para exibir");
    }   

    private String verificarInternet() {
        return "Aparelho possui conexão ativa";
    }
    

//Reprodutor Musical
    public void reproduzirMusica(){
        System.out.println("reproduzindo música");
    }
    public void pausarMusica(){
        System.out.println("música pausada");
    }
    public void proximaFaixa(){
        System.out.println("avançando para próxima faixa");
    }
    public void faixaAnterior(){
        System.out.println("avançando para faixa anterior");
    }
}
