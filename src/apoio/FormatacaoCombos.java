package apoio;

import DAO.GenericoDAO;
import entidades.Ano;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FormatacaoCombos {

    public static void popularComboAno(JComboBox combo) {
        combo.removeAllItems();
        ComboItem item = new ComboItem();
        item.setCodigo(0);
        item.setDescricao("Selecione");
        combo.addItem(item);
        try {
            int id = 1;
            Ano ano = (Ano) GenericoDAO.getObjectBanco(id, Ano.class);
            while (ano != null) {
                item = new ComboItem();
                item.setCodigo(ano.getId());
                item.setDescricao(String.valueOf(ano.getAno_numerico()));
                combo.addItem(item);
                id++;
                ano = (Ano) GenericoDAO.getObjectBanco(id, Ano.class);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao popular lista de clientes:\n" + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
