import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        double imposto;

        String valorS = JOptionPane.showInputDialog(null, "Digite o valor do produto: ", "Calculo de impostos",
                JOptionPane.QUESTION_MESSAGE);
        double valor = Double.parseDouble(valorS);

        String estado;
        estado = JOptionPane.showInputDialog(null, "Digite o estado: ", "Calculo de impostos",
                JOptionPane.QUESTION_MESSAGE);

        if (estado.equalsIgnoreCase("MG")) {
            imposto = (valor * 0.07) + valor;

            JOptionPane.showMessageDialog(null, "Estado digitado: " + estado + "\nValor total com impostos: " + imposto,
                    "Calculo de imposto", JOptionPane.INFORMATION_MESSAGE);

        } else if (estado.equalsIgnoreCase("SP")) {
            imposto = (valor * 0.12) + valor;

            JOptionPane.showMessageDialog(null, "Estado digitado: " + estado + "\nValor total com impostos: " + imposto,
                    "Calculo de imposto", JOptionPane.INFORMATION_MESSAGE);

        } else if (estado.equalsIgnoreCase("RJ")) {
            imposto = (valor * 0.15) + valor;

            JOptionPane.showMessageDialog(null, "Estado digitado: " + estado + "\nValor total com impostos: " + imposto,
                    "Calculo de imposto", JOptionPane.INFORMATION_MESSAGE);

        } else if (estado.equalsIgnoreCase("MS")) {
            imposto = (valor * 0.08) + valor;

            JOptionPane.showMessageDialog(null, "Estado digitado: " + estado + "\nValor total com impostos: " + imposto,
                    "Calculo de imposto", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Estado digitado invalido", "Calculo de imposto",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}