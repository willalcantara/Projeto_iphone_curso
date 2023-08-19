import java.util.Scanner;

public class iphone implements navegador, reprodutormusical, telefone {
  String operacao;
  String[] opcoes = new String[] { "tocarmusica", "passarmusica", "selecionarmusica", "exibirPagina",
      "adicionarnovaaba", "atualizarpagina", "ligar_chamada", "atender", "iniciarcorreiovoz", "finalizar" };
  Scanner ler = new Scanner(System.in);

  void telainicial() {
    System.out.println("O que deseja fazer ?");
    for (String opcao : opcoes) {
      System.out.println(opcao);
    }
    operacao = ler.next();
    switch (operacao) {
      case "tocarmusica":
        this.tocarmusica();
        break;
      case "passarmusica":
        this.passarmusica();
        break;
      case "selecionarmusica":
        this.selecionarmusica();
        break;
      case "exibirpagina":
        this.exibirPagina();
        break;
      case "adicionarnovaaba":
        this.adicionarnovaaba();
        break;
      case "atualizarpagina":
        this.atualizarpagina();
        break;
      case "ligar_chamada":
        this.ligar_chamada();
        break;
      case "atender":
        this.atender();
        break;
      case "IniciarCorreioVoz":
        this.IniciarCorreioVoz();
        break;
      case "Finalizar":
        this.finalizar();
        break;
    }
  }

  void ligar() {
    System.out.println("ligando . . . ");
    System.out.println("Ok, pronto pra uso ");
    this.telainicial();
  }

  void finalizar() {
    System.exit(0);
  }

  @Override
  public void tocarmusica() {
    // TODO Auto-generated method stub
    System.out.println("tocando musica");
    this.telainicial();
  }

  @Override
  public void passarmusica() {
    // TODO Auto-generated method stub
    System.out.println("passando de musica");
    this.telainicial();
  }

  @Override
  public void selecionarmusica() {
    // TODO Auto-generated method stub
    System.out.println("selecione a musica");
    this.telainicial();
  }

  @Override
  public void exibirPagina() {
    // TODO Auto-generated method stub
    System.out.println("exibindo pagina");
    this.telainicial();
  }

  @Override
  public void adicionarnovaaba() {
    // TODO Auto-generated method stub
    System.out.println("nova aba iniciada, pagina padrão em branco");
    this.telainicial();
  }

  @Override
  public void atualizarpagina() {
    // TODO Auto-generated method stub
    System.out.println("atualizando pagina");
    this.telainicial();
  }

  @Override
  public void ligar_chamada() {
    // TODO Auto-generated method stub
    System.out.println("ligando..");
    this.telainicial();
  }

  @Override
  public void atender() {
    // TODO Auto-generated method stub
    System.out.println("atender ao telefonema");
    this.telainicial();
  }

  @Override
  public void IniciarCorreioVoz() {
    // TODO Auto-generated method stub
    System.out.println("iniciando correio de voz");
    this.telainicial();
  }
}
