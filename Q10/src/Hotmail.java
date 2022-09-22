public class Hotmail {
    private Sist Sist;

    public Hotmail(Sist Sist) {
        this.Sist = Sist;
    }

    void sendEmail(Mail Mail) {
        if(!Sist.funcionarios.contains(Mail.getOrigem()) || !Sist.funcionarios.contains(Mail.getDestino())) {
            System.out.println("Origem ou destino não registrado no Sist");
            System.exit(1);
        }
        int origemIndex = Sist.funcionarios.indexOf(Mail.getOrigem());
        int destinatarioIndex = Sist.funcionarios.indexOf(Mail.getDestino());

        Sist.funcionarios.get(origemIndex).adicionarNovoEmailEnviado(Mail);
        Sist.funcionarios.get(destinatarioIndex).adicionarNovoEmailRecebido(Mail);
    }
}
