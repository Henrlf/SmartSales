package apoio;

import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.text.*;

public class Mascaras {

    public static void formatarCPF(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("###.###.###-##");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void formatarDecimal(JFormattedTextField campo) {
        DecimalFormat dFormat = new DecimalFormat("########");
        NumberFormatter formatter = new NumberFormatter(dFormat);
        formatter.setFormat(dFormat);
        formatter.setAllowsInvalid(false);
        campo.setFormatterFactory(new DefaultFormatterFactory(formatter));
    }

    public static double formatarDoubleBanco(JFormattedTextField campo) {
        double valor = Double.parseDouble((campo.getText().replace(".", "")).replaceAll(",", "."));
        return valor;
    }
    
    public static String formataMoedaParaCampo(double valor) {
        DecimalFormat d = new DecimalFormat("##,###.##");
        return d.format(valor);
    }

}
