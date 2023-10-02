public class Telefone {

    public Telefone() {

    }

    public void ligar(int numero) {
        System.out.println("Ligando para número " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida.");
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz.");
    }

    public void sairCorreioVoz() {
        System.out.println("Saindo do correio de voz.");
    }

    public void adidcionarNumero(int numero) {
        System.out.println("Número" + numero + " adicionado.");
    }

}
