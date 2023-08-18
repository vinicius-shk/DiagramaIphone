import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  public void ligar() {
    System.out.println("Ligando");
  }

  public void atender() {
    System.out.println("Atendendo");
  }

  public void iniciarCorreioDeVoz() {
    ligar();
    System.out.println("para correio de voz");
  }

  public void exibirPagina() {
    System.out.println("Exibe pagina");
  }

  public void adicionarNovaAba() {
    System.out.println("Abre nova aba");
  }

  public void atualizarPagina() {
    System.out.println("Atualiza página atual");
  }

  public void tocar() {
    System.out.println("Toca música");
  }

  public void pausar() {
    System.out.println("Pausa música");
  }

  public void selecionarMusica() {
    System.out.println("Seleciona musica");
  }

  public static void main(String[] args) {
    Iphone i = new Iphone();

    i.adicionarNovaAba();
    i.atender();
    i.atualizarPagina();
    i.ligar();
    i.pausar();
    i.exibirPagina();
    i.iniciarCorreioDeVoz();
    i.selecionarMusica();
    i.tocar();

  }
}
