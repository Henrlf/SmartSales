package entidades;

import javax.persistence.*;

@Entity
@Table(name = "auditoria")

public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    private Funcionario funcionario;

    @Column(name = "acao")
    private String acao;

    @Column(name = "id_alvo")
    private int id_alvo;

    @Column(name = "data")
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

    public int getId_alvo() {
        return id_alvo;
    }

    public void setId_alvo(int id_alvo) {
        this.id_alvo = id_alvo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
