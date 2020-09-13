package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auditoria")

public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "funcionario")
    private String funcionario;

    @Column(name = "funcao")
    private String funcao;

    @Column(name = "id_alvo")
    private int id_alvo;

    @Column(name = "nome_alvo")
    private String nome_alvo;

    @Column(name = "data_op")
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getId_alvo() {
        return id_alvo;
    }

    public void setId_alvo(int id_alvo) {
        this.id_alvo = id_alvo;
    }

    public String getNome_alvo() {
        return nome_alvo;
    }

    public void setNome_alvo(String nome_alvo) {
        this.nome_alvo = nome_alvo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
