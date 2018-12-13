import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Desktop.Action;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Image;

public class SolitarioSwing extends JFrame {
	public static void main(String[] args) {
		new SolitarioSwing();
	}

	public SolitarioSwing() { 
		Pila pila = new Pila();
		Pila monton = new Pila();
		Pila Palo1 = new Pila();
		Pila Palo2 = new Pila();
		Pila Palo3 = new Pila();
		Pila Palo4 = new Pila();
		Pila Pila1 = new Pila();
		Pila Pila2 = new Pila();
		Pila Pila3 = new Pila();
		Pila Pila4 = new Pila();
		Pila Pila5 = new Pila();
		Pila Pila6 = new Pila();
		Pila Pila7 = new Pila();
		Carta seleccionada;
		
		Carta AS = new Carta ('A','S',"/Images/107016_01.png");
		pila.addCarta(AS);
		Carta DS = new Carta ('2','S',"/Images/62233_30.png");
		pila.addCarta(DS);
		Carta TS = new Carta ('3','S',"/Images/107016_03.gif");
		pila.addCarta(TS);
		Carta CS = new Carta ('4','S',"/Images/107016_04.gif");
		pila.addCarta(CS);
		Carta CiS = new Carta ('5','S',"/Images/107016_05.gif");
		pila.addCarta(CiS);
		Carta SS = new Carta ('6','S',"/Images/107016_06.gif");
		pila.addCarta(SS);
		Carta SiS = new Carta ('7','S',"/Images/107016_07.gif");
		pila.addCarta(SiS);
		Carta OS = new Carta ('8','S',"/Images/107016_08.gif");
		pila.addCarta(OS);
		Carta NS = new Carta ('9','S',"/Images/107016_09.gif");
		pila.addCarta(NS);
		Carta DiS = new Carta ('T','S',"/Images/107016_10.gif");
		pila.addCarta(DiS);
		Carta JS = new Carta ('J','S',"/Images/107016_11.gif");
		pila.addCarta(JS);
		Carta QS = new Carta ('Q','S',"/Images/107016_12.gif");
		pila.addCarta(QS);
		Carta KS = new Carta ('K','S',"/Images/107016_13.gif");
		pila.addCarta(KS);
		
		Carta AC = new Carta ('A','C',"/Images/107016_27.gif");
		pila.addCarta(AC);
		Carta DC = new Carta ('2','C',"/Images/107016_28.gif");
		pila.addCarta(DC);
		Carta TC = new Carta ('3','C',"/Images/107016_29.gif");;
		pila.addCarta(TC);
		Carta CC = new Carta ('4','C',"/Images/107016_30.gif");
		pila.addCarta(CC);
		Carta CiC = new Carta ('5','C',"/Images/107016_31.gif");
		pila.addCarta(CiC);
		Carta SC = new Carta ('6','C',"/Images/107016_32.gif");
		pila.addCarta(SC);
		Carta SiC = new Carta ('7','C',"/Images/107016_33.gif");
		pila.addCarta(SiC);
		Carta OC = new Carta ('8','C',"/Images/107016_34.gif");
		pila.addCarta(OC);
		Carta NC = new Carta ('9','C',"/Images/107016_35.gif");
		pila.addCarta(NC);
		Carta DiC = new Carta ('T','C',"/Images/107016_36.gif");
		pila.addCarta(DiC);
		Carta JC = new Carta ('J','C',"/Images/107016_37.gif");
		pila.addCarta(JC);
		Carta QC = new Carta ('Q','C',"/Images/107016_38.gif");
		pila.addCarta(QC);
		Carta KC = new Carta ('K','C',"/Images/107016_39.gif");
		pila.addCarta(KC);
	
		Carta AD = new Carta ('A','D',"/Images/107016_40.gif");
		pila.addCarta(AD);
		Carta DD = new Carta ('2','D',"/Images/107016_41.gif");
		pila.addCarta(DD);
		Carta TD = new Carta ('3','D',"/Images/107016_42.gif");
		pila.addCarta(TD);
		Carta CD = new Carta ('4','D',"/Images/107016_43.gif");
		pila.addCarta(CD);
		Carta CiD = new Carta ('5','D',"/Images/107016_44.gif");
		pila.addCarta(CiD);
		Carta SD = new Carta ('6','D',"/Images/107016_45.gif");
		pila.addCarta(SD);
		Carta SiD = new Carta ('7','D',"/Images/107016_46.gif");
		pila.addCarta(SiD);
		Carta OD = new Carta ('8','D',"/Images/107016_47.gif");
		pila.addCarta(OD);
		Carta ND = new Carta ('9','D',"/Images/107016_48.gif");
		pila.addCarta(ND);
		Carta DiD = new Carta ('T','D',"/Images/107016_49.gif");
		pila.addCarta(DiD);
		Carta JD = new Carta ('J','D',"/Images/107016_50.gif");
		pila.addCarta(JD);
		Carta QD = new Carta ('Q','D',"/Images/107016_51.gif");
		pila.addCarta(QD);
		Carta KD = new Carta ('K','D',"/Images/107016_52.gif");
		pila.addCarta(KD);
	
		Carta AH = new Carta ('A','H',"/Images/107016_14.gif");
		pila.addCarta(AH);
		Carta DH = new Carta ('2','H',"/Images/107016_15.gif");
		pila.addCarta(DH);
		Carta TH = new Carta ('3','H',"/Images/107016_16.gif");
		pila.addCarta(TH);
		Carta CH = new Carta ('4','H',"/Images/107016_17.gif");
		pila.addCarta(CH);
		Carta CiH = new Carta ('5','H',"/Images/107016_18.gif");
		pila.addCarta(CiH);
		Carta SH = new Carta ('6','H',"/Images/107016_19.gif");
		pila.addCarta(SH);
		Carta SiH = new Carta ('7','H',"/Images/107016_20.gif");
		pila.addCarta(SiH);
		Carta OH = new Carta ('8','H',"/Images/107016_21.gif");
		pila.addCarta(OH);
		Carta NH = new Carta ('9','H',"/Images/107016_22.gif");
		pila.addCarta(NH);
		Carta DiH = new Carta ('T','H',"/Images/107016_23.gif");
		pila.addCarta(DiH);
		Carta JH = new Carta ('J','H',"/Images/107016_24.gif");
		pila.addCarta(JH);
		Carta QH = new Carta ('Q','H',"/Images/107016_25.gif");
		pila.addCarta(QH);
		Carta KH = new Carta ('K','H',"/Images/107016_26.gif");
		pila.addCarta(KH);
		
		
		pila.barajar();
		getContentPane().setBackground(new Color(0, 128, 0));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		getContentPane().setBackground(new Color(0, 128, 0));

		JButton btnCarta = new JButton("");
		
		btnCarta.setIcon(new ImageIcon(solitarioSwing.class.getResource("/Images/107016_54.gif")));
		
		btnCarta.setBackground(new Color(0, 128, 0));
		btnCarta.setForeground(new Color(0, 128, 0));

		GridBagConstraints gbc_btnCarta = new GridBagConstraints();
		gbc_btnCarta.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnCarta.ipadx = 2;
		gbc_btnCarta.gridwidth = 2;
		gbc_btnCarta.gridheight = 4;
		gbc_btnCarta.insets = new Insets(0, 0, 5, 5);
		gbc_btnCarta.gridx = 0;
		gbc_btnCarta.gridy = 0;
		getContentPane().add(btnCarta, gbc_btnCarta);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setIcon(new ImageIcon(solitarioSwing.class.getResource("/Images/107016_75.gif")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		setBackground(new Color(255, 255, 255));

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);

		JMenuItem mntmCargar = new JMenuItem("Cargar");
		mnArchivo.add(mntmCargar);

		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setEnabled(false);
		mnArchivo.add(mntmSalvar);

		JMenuItem mntmSalvarComo = new JMenuItem("Salvar como");
		mnArchivo.add(mntmSalvarComo);

		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);

		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);

		JMenuItem mntmDeshacer = new JMenuItem("Deshacer");
		mnEditar.add(mntmDeshacer);

		JMenuItem mntmHacer = new JMenuItem("Hacer");
		mnEditar.add(mntmHacer);

		JMenuItem mntmResolver = new JMenuItem("Resolver");
		mnEditar.add(mntmResolver);

		JMenu mnHistorial = new JMenu("Historial");
		menuBar.add(mnHistorial);

		JMenuItem mntmEstadisticas = new JMenuItem("Estadisticas");
		mnHistorial.add(mntmEstadisticas);

		JMenuItem mntmFicheroEstadisticas = new JMenuItem("Fichero estadisticas");
		mnHistorial.add(mntmFicheroEstadisticas);

		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mntmAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Para realizar el solitario hay que...");
			}
		});
		btnCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//mover de mazo a monton dandole la vuelta a la carta
				btnNewButton.setIcon(new ImageIcon(solitarioSwing.class.getResource(pila.getCarta().getRuta())));
				monton.addCarta(pila.getCarta());
				pila.eliminarCarta();
				if(pila.numCartas()==0) {
					btnCarta.setIcon(new ImageIcon(solitarioSwing.class.getResource("/Images/107016_64.gif")));
				}
			}
		});
		menuBar.add(mntmAyuda);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 600, 320);
		setVisible(true);
	}

}

