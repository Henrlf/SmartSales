package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "metas")

public class Metas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ano_id")
    private Ano ano;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @Column(name = "meta_janeiro")
    private double meta_janeiro;

    @Column(name = "meta_fevereiro")
    private double meta_fevereiro;

    @Column(name = "meta_marco")
    private double meta_marco;

    @Column(name = "meta_abril")
    private double meta_abril;

    @Column(name = "meta_maio")
    private double meta_maio;

    @Column(name = "meta_junho")
    private double meta_junho;

    @Column(name = "meta_julho")
    private double meta_julho;

    @Column(name = "meta_agosto")
    private double meta_agosto;

    @Column(name = "meta_setembro")
    private double meta_setembro;

    @Column(name = "meta_outubro")
    private double meta_outubro;

    @Column(name = "meta_novembro")
    private double meta_novembro;

    @Column(name = "meta_dezembro")
    private double meta_dezembro;

    @Column(name = "realizado_janeiro")
    private double realizado_janeiro;

    @Column(name = "realizado_fevereiro")
    private double realizado_fevereiro;

    @Column(name = "realizado_marco")
    private double realizado_marco;

    @Column(name = "realizado_abril")
    private double realizado_abril;

    @Column(name = "realizado_maio")
    private double realizado_maio;

    @Column(name = "realizado_junho")
    private double realizado_junho;

    @Column(name = "realizado_julho")
    private double realizado_julho;

    @Column(name = "realizado_agosto")
    private double realizado_agosto;

    @Column(name = "realizado_setembro")
    private double realizado_setembro;

    @Column(name = "realizado_outubro")
    private double realizado_outubro;

    @Column(name = "realizado_novembro")
    private double realizado_novembro;

    @Column(name = "realizado_dezembro")
    private double realizado_dezembro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getJaneiro() {
        return meta_janeiro;
    }

    public void setJaneiro(double janeiro) {
        this.meta_janeiro = janeiro;
    }

    public double getFevereiro() {
        return meta_fevereiro;
    }

    public void setFevereiro(double fevereiro) {
        this.meta_fevereiro = fevereiro;
    }

    public double getMarco() {
        return meta_marco;
    }

    public void setMarco(double marco) {
        this.meta_marco = marco;
    }

    public double getAbril() {
        return meta_abril;
    }

    public void setAbril(double abril) {
        this.meta_abril = abril;
    }

    public double getMaio() {
        return meta_maio;
    }

    public void setMaio(double maio) {
        this.meta_maio = maio;
    }

    public double getJunho() {
        return meta_junho;
    }

    public void setJunho(double junho) {
        this.meta_junho = junho;
    }

    public double getJulho() {
        return meta_julho;
    }

    public void setJulho(double julho) {
        this.meta_julho = julho;
    }

    public double getAgosto() {
        return meta_agosto;
    }

    public void setAgosto(double agosto) {
        this.meta_agosto = agosto;
    }

    public double getSetembro() {
        return meta_setembro;
    }

    public void setSetembro(double setembro) {
        this.meta_setembro = setembro;
    }

    public double getOutubro() {
        return meta_outubro;
    }

    public void setOutubro(double outubro) {
        this.meta_outubro = outubro;
    }

    public double getNovembro() {
        return meta_novembro;
    }

    public void setNovembro(double novembro) {
        this.meta_novembro = novembro;
    }

    public double getDezembro() {
        return meta_dezembro;
    }

    public void setDezembro(double dezembro) {
        this.meta_dezembro = dezembro;
    }

}
