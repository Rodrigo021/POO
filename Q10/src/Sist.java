import java.util.*;

public class Sist {
    ArrayList<Funcionario> funcionarios;

    public Sist() {
        this.funcionarios = new ArrayList<>();
    }

    void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
