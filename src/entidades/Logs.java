package entidades;

import javax.persistence.*;

@Entity
@Table(name = "logs")

public class Logs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    private Funcionario funcionario;

    @Column(name = "acao")
    private String acao;

    @Column(name = "erro")
    private String erro;

    @Column(name = "data_op")
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



}
