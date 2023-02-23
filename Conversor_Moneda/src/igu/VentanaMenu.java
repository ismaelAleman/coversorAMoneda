package igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.DropMode;
import java.awt.Toolkit;

public class VentanaMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txt_resulrato;

	public VentanaMenu() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ismae\\OneDrive\\Escritorio\\camisetas\\kongo.jpg"));
		setTitle("Coversor Alura 2023");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		
		JPanel panel_Principal = new JPanel();
		contentPane.add(panel_Principal, BorderLayout.CENTER);
		panel_Principal.setLayout(new BorderLayout(0, 0));
		
		
		
		
		JPanel panel_superior = new JPanel();
		panel_superior.setBackground(new Color(192, 192, 192));
		panel_Principal.add(panel_superior, BorderLayout.NORTH);
			panel_superior.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		
			
			// imagen central superior
			JLabel lbl_imagen = new JLabel("");
			panel_superior.add(lbl_imagen);
			lbl_imagen.setFont(new Font("Tahoma", Font.PLAIN, 5));
			lbl_imagen.setIcon(new ImageIcon("C:\\Users\\ismae\\OneDrive\\Escritorio\\conversor -3.png"));
			lbl_imagen.setHorizontalAlignment(SwingConstants.CENTER);
		
		// panel botones superior izq.
		JPanel panel_btn_izq = new JPanel();
		panel_btn_izq.setBackground(new Color(192, 192, 192));
		panel_superior.add(panel_btn_izq);
		panel_btn_izq.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btn_moneda = new JButton("Moneda");
		panel_btn_izq.add(btn_moneda);
		btn_moneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_moneda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btn_temperatura = new JButton("Temperatura");
		panel_btn_izq.add(btn_temperatura);
		btn_temperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_temperatura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btn_medida = new JButton("Medida");
		panel_btn_izq.add(btn_medida);
		btn_medida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		
		//panel inferior
		
		JPanel panel_inferior = new JPanel();
		panel_Principal.add(panel_inferior, BorderLayout.SOUTH);
		panel_inferior.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Resultado");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_inferior.add(lblNewLabel);
		
		JPanel panel_inferior_result = new JPanel();
		panel_inferior.add(panel_inferior_result);
		
		txt_resulrato = new JTextField();
		txt_resulrato.setEditable(false);
		panel_inferior_result.add(txt_resulrato);
		txt_resulrato.setColumns(20);
		
		
		
		//panel central
		
		JPanel panel_central = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_central.getLayout();
		flowLayout.setHgap(15);
		panel_Principal.add(panel_central, BorderLayout.CENTER);
	}

}
