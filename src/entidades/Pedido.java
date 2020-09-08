package entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
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
    
    @ManyToOne
    private Tipo_Pagamento tipo_pagamento;
    
    @Column(name = "data_venda")
    private String data_venda;
    
    @Column(name = "valor")
    private Double valor;
    
    @Column(name = "desconto")
    private Double desconto;
    
    @Column(name = "status")
    private String staus;
    
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Set<Produtos_Pedido> produtos_pedido = new HashSet<>();

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

    public Tipo_Pagamento getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(Tipo_Pagamento tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }
    
    
}
