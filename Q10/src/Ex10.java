import java.util.Date;

public class Ex10 {
    public static void main(String[] args) {
        Sist s = new Sist();
        Hotmail h = new Hotmail(s);
        
        Funcionario f1 = new Funcionario("Rodrigo", "Dev", "21110618", "rodrigo.srj@hotmail.com");
        Funcionario f2 = new Funcionario("Carlos", "Venda", "25811957", "carlos.silva@hotmail.com");

        s.addFuncionario(f1);
        s.addFuncionario(f2);

        Mail m = new Mail("Requisição", "Preciso que atualize o banco de dados de vendas da empresa", f2, f1, new Date());
        h.sendEmail(m);

        for (Funcionario f : s.funcionarios) {
            System.out.println(f.getName());
            System.out.println(f.getEmail());
            System.out.println("caixa de entrada");
            for(Mail emailRecebido : f.getEmailRecebidos()) {
                System.out.println(emailRecebido.getMensagem());
            }
            System.out.println();
            System.out.println("Email enviados: ");
            for(Mail emailRecebido : f.getEmailEnviados()) {
                System.out.println(emailRecebido.getMensagem()+"\n");
            }

        }
    }
}
