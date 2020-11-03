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

    @Column(name = "janeiro")
    private double janeiro;

    @Column(name = "fevereiro")
    private double fevereiro;

    @Column(name = "marco")
    private double marco;

    @Column(name = "abril")
    private double abril;

    @Column(name = "maio")
    private double maio;

    @Column(name = "junho")
    private double junho;

    @Column(name = "julho")
    private double julho;

    @Column(name = "agosto")
    private double agosto;

    @Column(name = "setembro")
    private double setembro;

    @Column(name = "outubro")
    private double outubro;

    @Column(name = "novembro")
    private double novembro;

    @Column(name = "dezembro")
    private double dezembro;

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
        return janeiro;
    }

    public void setJaneiro(double janeiro) {
        this.janeiro = janeiro;
    }

    public double getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(double fevereiro) {
        this.fevereiro = fevereiro;
    }

    public double getMarco() {
        return marco;
    }

    public void setMarco(double marco) {
        this.marco = marco;
    }

    public double getAbril() {
        return abril;
    }

    public void setAbril(double abril) {
        this.abril = abril;
    }

    public double getMaio() {
        return maio;
    }

    public void setMaio(double maio) {
        this.maio = maio;
    }

    public double getJunho() {
        return junho;
    }

    public void setJunho(double junho) {
        this.junho = junho;
    }

    public double getJulho() {
        return julho;
    }

    public void setJulho(double julho) {
        this.julho = julho;
    }

    public double getAgosto() {
        return agosto;
    }

    public void setAgosto(double agosto) {
        this.agosto = agosto;
    }

    public double getSetembro() {
        return setembro;
    }

    public void setSetembro(double setembro) {
        this.setembro = setembro;
    }

    public double getOutubro() {
        return outubro;
    }

    public void setOutubro(double outubro) {
        this.outubro = outubro;
    }

    public double getNovembro() {
        return novembro;
    }

    public void setNovembro(double novembro) {
        this.novembro = novembro;
    }

    public double getDezembro() {
        return dezembro;
    }

    public void setDezembro(double dezembro) {
        this.dezembro = dezembro;
    }

}
