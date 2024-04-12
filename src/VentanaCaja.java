import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCaja {
    private JPanel VentanaCaja;
    private JTextField textnumero;
    private JTextField textEmpresa;
    private JButton añadirButton;
    private JComboBox comboContenido;
    private JTextArea textArea1;
    private JButton buscarButton;
    private JButton mostrarTodosLosElementosButton;
    private JComboBox comboPila;

    private Pila pila1 = new Pila();
    private Pila pila2 = new Pila();
    private Pila pila3 = new Pila();

    public VentanaCaja() {

        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedItem = Integer.parseInt(comboPila.getSelectedItem().toString());
                if (selectedItem == 1){
                    if (pila1.getTamanio() < 6){
                        pila1.apilar(textnumero.getText(),textEmpresa.getText(),comboContenido.getSelectedItem().toString());
                        textArea1.setText(pila1.toString());
                    } else {
                        JOptionPane.showMessageDialog(null,"NO HAY ESPACIO EN LA PILA");
                    }
                }else if (selectedItem == 2) {
                    if (pila2.getTamanio() < 6) {
                        pila2.apilar(textnumero.getText(), textEmpresa.getText(), comboPila.getSelectedItem().toString());
                        textArea1.setText(pila2.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "NO HAY ESPACIO EN LA PILA");
                    }
                }else{
                    if (pila3.getTamanio() < 6) {
                        pila3.apilar(textnumero.getText(), textEmpresa.getText(), comboPila.getSelectedItem().toString());
                        textArea1.setText(pila3.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "NO HAY ESPACIO EN LA PILA");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaCaja");
        frame.setContentPane(new VentanaCaja().VentanaCaja);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
