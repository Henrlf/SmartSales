package entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "pedido")

public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Cliente cliente;

    @Column(name = "valor")
    private Double valor;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "tipo_pagamento")
    private String tipo_pagamento;

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStaus(String status) {
        this.status = status;
    }

}
