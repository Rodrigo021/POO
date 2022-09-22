import java.util.*;

public class Funcionario {
    private String name;
    private String cargo;
    private String matricula;
    private String email;
    private ArrayList<Mail> emailRecebidos;
    private ArrayList<Mail> emailEnviados;

    public Funcionario(String name, String cargo, String matricula, String email) {
        this.name = name;
        this.cargo = cargo;
        this.matricula = matricula;
        this.email = email;
        this.emailRecebidos = new ArrayList<>();
        this.emailEnviados = new ArrayList<>();
    }

    void adicionarNovoEmailRecebido(Mail email) {
        emailRecebidos.add(email);
    }

    void adicionarNovoEmailEnviado(Mail email) {
        emailEnviados.add(email);
    }

    public String getName() {
        return name;
    }

    public String getCargo() {
        return cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Mail> getEmailRecebidos() {
        return emailRecebidos;
    }

    public ArrayList<Mail> getEmailEnviados() {
        return emailEnviados;
    }
}
