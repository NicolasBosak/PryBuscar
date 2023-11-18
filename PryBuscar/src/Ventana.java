import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Ventana {
    private JPanel Principal;
    private JTabbedPane Listar;
    private JButton btnListar;
    private JTextArea txtListado;
    private JSpinner spinner1;
    private JTextArea txtResultados;
    private JComboBox cboCiudad;
    private JButton btnBuscar;
    private JButton btnBuscarCodigo;
    Lista paquetes=new Lista();
    public Ventana() {
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Paquete p: paquetes.getListado())
                    txtListado.append(p.toString());
            }
        });
        btnBuscarCodigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultados.setText("");
                int codigo=Integer.parseInt(spinner1.getValue().toString());
                try {
                    Paquete paquete = paquetes.buscarPaqueteBinario(codigo);
                    txtResultados.setText(paquete.toString());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultados.setText("");
                String destino=cboCiudad.getSelectedItem().toString();
                List<Paquete> resultado=paquetes.buscarDestino(destino);
                for (Paquete p: resultado){
                    txtResultados.append(paquetes.toString());
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
