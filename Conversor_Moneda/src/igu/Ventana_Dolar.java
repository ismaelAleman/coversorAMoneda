package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana_Dolar extends JFrame {

	private JPanel contentPane;
	private JTextField txt_monto1;
	private JTextField textField;

	
	
	
	public Ventana_Dolar() {
		setResizable(false);
		setTitle("Convesor de moneda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_superior = new JPanel();
		panel_superior.setBackground(Color.LIGHT_GRAY);
		panel_superior.setBounds(0, 0, 518, 54);
		panel.add(panel_superior);
		FlowLayout fl_panel_superior = new FlowLayout(FlowLayout.CENTER, 5, 10);
		fl_panel_superior.setAlignOnBaseline(true);
		panel_superior.setLayout(fl_panel_superior);
		
		JLabel lbl_imagen = new JLabel("");
		lbl_imagen.setIcon(new ImageIcon("C:\\Users\\ismae\\OneDrive\\Escritorio\\conversor -3.png"));
		lbl_imagen.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imagen.setFont(new Font("Tahoma", Font.PLAIN, 5));
		panel_superior.add(lbl_imagen);
		
		JPanel panel_btn_izq = new JPanel();
		panel_btn_izq.setBackground(Color.LIGHT_GRAY);
		panel_superior.add(panel_btn_izq);
		panel_btn_izq.setLayout(new GridLayout(0, 2, 5, 0));
		
		JButton btn_moneda = new JButton("Moneda");
		btn_moneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_moneda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_btn_izq.add(btn_moneda);
		
		JButton btn_temperatura = new JButton("Temperatura");
		btn_temperatura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_btn_izq.add(btn_temperatura);
		
		JPanel panel_btn_der = new JPanel();
		panel_btn_der.setBackground(Color.LIGHT_GRAY);
		panel_superior.add(panel_btn_der);
		panel_btn_der.setLayout(new GridLayout(0, 2, 5, 0));
		
		JButton btn_medida = new JButton("Medida");
		btn_medida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_btn_der.add(btn_medida);
		
		JButton btn_peso = new JButton("Peso");
		btn_peso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_btn_der.add(btn_peso);
		
		JLabel lbl_monto_sup = new JLabel("Monto");
		lbl_monto_sup.setBounds(127, 79, 47, 14);
		panel.add(lbl_monto_sup);
		
		JLabel lbl_convertir_a_sup = new JLabel("Convertir a");
		lbl_convertir_a_sup.setBounds(249, 79, 73, 14);
		panel.add(lbl_convertir_a_sup);
		
		txt_monto1 = new JTextField();
		txt_monto1.setBounds(83, 112, 115, 20);
		panel.add(txt_monto1);
		txt_monto1.setColumns(10);
		
		JComboBox lista_monedas = new JComboBox();
		lista_monedas.setToolTipText("");
		lista_monedas.setBounds(223, 111, 130, 22);
		panel.add(lista_monedas);
		lista_monedas.addItem("Dolar");
		lista_monedas.addItem("Euro");
		lista_monedas.addItem("Libra Esterlina");
		lista_monedas.addItem("Yen Japones");
		lista_monedas.addItem("Won sur-Coreano");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 100, 73, 44);
		panel.add(panel_1);
		
		JLabel lbl_Moneda_Arg = new JLabel("Moneda");
		panel_1.add(lbl_Moneda_Arg);
		
		JLabel lblNewLabel_1 = new JLabel("Argentina");
		panel_1.add(lblNewLabel_1);
		
		JLabel lbl_equivale_sup = new JLabel("Equivale a: ");
		lbl_equivale_sup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_equivale_sup.setBounds(406, 78, 170, 14);
		panel.add(lbl_equivale_sup);
		
		textField = new JTextField();
		textField.setBounds(380, 112, 115, 20);
		panel.add(textField);
		textField.setColumns(10);
	}
}
