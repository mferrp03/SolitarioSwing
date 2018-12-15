import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Desktop.Action;
import javax.swing.*;
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
import java.util.ArrayList;
public class SolitarioSwing extends JFrame {
	private Carta seleccionada = new Carta ('0','0',"0");
	int pilaSeleccionada = 0;
	public static void main(String[] args) {
		new SolitarioSwing();
	}
	int getPilaSeleccionada(){
		return pilaSeleccionada;
	}
	void setPilaSeleccionada(int n) {
		pilaSeleccionada = n;
	}
	public SolitarioSwing() { 
		
		ArrayList<Pila>Pilas = new ArrayList<Pila>();
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
		Pila1.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila2.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila2.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila3.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila3.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila3.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		Pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		/*Pila1.addCarta(AD);
		Pila2.addCarta(QH);
		pila.addCarta(QH);
		Pila2.addCarta(KS);*/
		Pilas.add(pila);
		Pilas.add(monton);
		Pilas.add(Palo1);
		Pilas.add(Palo2);
		Pilas.add(Palo3);
		Pilas.add(Palo4);
		Pilas.add(Pila1);
		Pilas.add(Pila2);
		Pilas.add(Pila3);
		Pilas.add(Pila4);
		Pilas.add(Pila5);
		Pilas.add(Pila6);
		Pilas.add(Pila7);
		getContentPane().setBackground(new Color(0, 128, 0));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		getContentPane().setBackground(new Color(0, 128, 0));

		JButton btn0 = new JButton("");
		
		btn0.setIcon(new ImageIcon(solitarioSwing.class.getResource("/Images/107016_54.gif")));
		
		btn0.setBackground(new Color(0, 128, 0));
		btn0.setForeground(new Color(0, 128, 0));

		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btn0.ipadx = 2;
		gbc_btn0.gridwidth = 2;
		gbc_btn0.gridheight = 4;
		gbc_btn0.insets = new Insets(0, 0, 5, 5);
		gbc_btn0.gridx = 0;
		gbc_btn0.gridy = 0;
		getContentPane().add(btn0, gbc_btn0);

		JButton btn1 = new JButton("");
		
		btn1.setBackground(new Color(0, 128, 0));
		btn1.setForeground(new Color(0, 128, 0));
		btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource("/Images/107016_75.gif")));
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 2;
		gbc_btn1.gridy = 0;
		getContentPane().add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("");
		
		btn2.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn2.setBackground(new Color(0, 128, 0));
		btn2.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 3;
		gbc_btn2.gridy = 0;
		getContentPane().add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("");
		
		btn3.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn3.setForeground(new Color(0, 128, 0));
		btn3.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 4;
		gbc_btn3.gridy = 0;
		getContentPane().add(btn3, gbc_btn3);
		
		JButton btn4 = new JButton("");
		
		btn4.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn4.setForeground(new Color(0, 128, 0));
		btn4.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 5;
		gbc_btn4.gridy = 0;
		getContentPane().add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("");
		
		btn5.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn5.setBackground(new Color(0, 128, 0));
		btn5.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 6;
		gbc_btn5.gridy = 0;
		getContentPane().add(btn5, gbc_btn5);
		
		JButton btn6 = new JButton("");
		
		btn6.setHorizontalAlignment(SwingConstants.LEFT);
		btn6.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
		btn6.setBackground(new Color(0, 128, 0));
		btn6.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.weighty = 2.0;
		gbc_btn6.ipady = 5;
		gbc_btn6.ipadx = 5;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 1;
		gbc_btn6.gridy = 7;
		getContentPane().add(btn6, gbc_btn6);
		
		JButton btn7 = new JButton("");
		
		btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
		btn7.setBackground(new Color(0, 128, 0));
		btn7.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.weighty = 2.0;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 2;
		gbc_btn7.gridy = 7;
		getContentPane().add(btn7, gbc_btn7);
		
		JButton btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
		btn8.setBackground(new Color(0, 128, 0));
		btn8.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.weighty = 2.0;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 3;
		gbc_btn8.gridy = 7;
		getContentPane().add(btn8, gbc_btn8);
		
		JButton btn9 = new JButton("");
		
		btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
		btn9.setBackground(new Color(0, 128, 0));
		btn9.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.weighty = 2.0;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 4;
		gbc_btn9.gridy = 7;
		getContentPane().add(btn9, gbc_btn9);
		
		JButton btn10 = new JButton("");
		
		btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
		btn10.setBackground(new Color(0, 128, 0));
		btn10.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn10 = new GridBagConstraints();
		gbc_btn10.weighty = 2.0;
		gbc_btn10.insets = new Insets(0, 0, 5, 5);
		gbc_btn10.gridx = 5;
		gbc_btn10.gridy = 7;
		getContentPane().add(btn10, gbc_btn10);
		
		JButton btn11 = new JButton("");
		
		btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
		btn11.setBackground(new Color(0, 128, 0));
		btn11.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn11 = new GridBagConstraints();
		gbc_btn11.weighty = 2.0;
		gbc_btn11.insets = new Insets(0, 0, 5, 5);
		gbc_btn11.gridx = 6;
		gbc_btn11.gridy = 7;
		getContentPane().add(btn11, gbc_btn11);
		
		JButton btn12 = new JButton("");
		
		btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
		btn12.setForeground(new Color(0, 128, 0));
		btn12.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btn12 = new GridBagConstraints();
		gbc_btn12.weighty = 2.0;
		gbc_btn12.insets = new Insets(0, 0, 5, 0);
		gbc_btn12.gridx = 7;
		gbc_btn12.gridy = 7;
		getContentPane().add(btn12, gbc_btn12);
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
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Pilas.get(1).numCartas()!=0) {
					
					seleccionada = new Carta(Pilas.get(1).getCarta().getNum(),Pilas.get(1).getCarta().getPalo(),Pilas.get(1).getCarta().getRuta());
					setPilaSeleccionada(1);
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//codificar movimiento a la pila del palo
				if(Palo1.numCartas()==0) {
					if(seleccionada.getNum()=='A') {
						Pilas.get(2).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn2.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(2).getCarta().getRuta())));
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
						
					}
				}
				else {
					if (seleccionada.movimientoAMonton(Palo1.getCarta())) {
						Pilas.get(2).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn2.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(2).getCarta().getRuta())));
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(12).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
						
					}
				}
				seleccionada = new Carta('0','0',"0");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//codificar movimiento a la pila del palo
				if(Palo2.numCartas()==0) {
					if(seleccionada.getNum()=='A') {
						Pilas.get(3).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn3.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(3).getCarta().getRuta())));

						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(12).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
						
					}
				}
				else {
					if (seleccionada.movimientoAMonton(Palo2.getCarta())) {
						Pilas.get(3).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn3.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(3).getCarta().getRuta())));	
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(12).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
						
						
					}
				}
				seleccionada = new Carta('0','0',"0");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//codificar movimiento a la pila del palo
				if(Palo3.numCartas()==0) {
					if(seleccionada.getNum()=='A') {
						Pilas.get(4).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn4.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(4).getCarta().getRuta())));
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(12).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
						
					}
				}
				else {
					if (seleccionada.movimientoAMonton(Palo3.getCarta())) {
						Pilas.get(4).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						
						btn4.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(4).getCarta().getRuta())));	
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(12).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
						
					}
				}
				seleccionada = new Carta('0','0',"0");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//codificar movimiento a la pila del palo
				if(Palo4.numCartas()==0) {
					if(seleccionada.getNum()=='A') {
						Pilas.get(5).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn5.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(5).getCarta().getRuta())));
						
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(12).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
						
					}
				}
				else {
					if (seleccionada.movimientoAMonton(Palo4.getCarta())) {
						Pilas.get(5).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						
						btn5.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(5).getCarta().getRuta())));	
						
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
						}
						if(Pilas.get(1).numCartas()!=0) { 
						btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(6).numCartas()!=0) { 
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(7).numCartas()!=0) { 
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(8).numCartas()!=0) { 
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(9).numCartas()!=0) { 
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(10).numCartas()!=0) { 
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(11).numCartas()!=0) { 
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
					
						}
						if(Pilas.get(12).numCartas()!=0) { 
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
					}
				}
				seleccionada = new Carta('0','0',"0");
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Pilas.get(6).numCartas()==0) {
					if(seleccionada.getNum()=='K') {
						Pilas.get(6).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						if(getPilaSeleccionada() == 1) {
							if(Pilas.get(1).numCartas()==0) {
								btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 7) {
							if(Pilas.get(7).numCartas()==0) {
								btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 8) {
							if(Pilas.get(8).numCartas()==0) {
								btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 9) {
							if(Pilas.get(9).numCartas()==0) {
								btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 10) {
							if(Pilas.get(10).numCartas()==0) {
								btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 11) {
							if(Pilas.get(11).numCartas()==0) {
								btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 12) {
							if(Pilas.get(12).numCartas()==0) {
								btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
							}
						}
						setPilaSeleccionada(0);
					}
						
					
				}
				else if(seleccionada.getNum()=='0') {
					seleccionada = new Carta(Pilas.get(6).getCarta().getNum(),Pilas.get(6).getCarta().getPalo(),Pilas.get(6).getCarta().getRuta());
					setPilaSeleccionada(6);
				}
				
				else if(seleccionada.movimientoPila(Pilas.get(6).getCarta())) {
					Pilas.get(6).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
					btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));	
					if(getPilaSeleccionada() == 1) {
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 7) {
						if(Pilas.get(7).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 8) {
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 9) {
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 10) {
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 11) {
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 12) {
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
					}
					
					seleccionada = new Carta('0','0',"0");
					setPilaSeleccionada(0);
				}
				else {
					if (Pilas.get(6).numCartas()!=0) {
						
						seleccionada = new Carta(Pilas.get(6).getCarta().getNum(),Pilas.get(6).getCarta().getPalo(),Pilas.get(6).getCarta().getRuta());
						setPilaSeleccionada(6);
					}
				}
			
			}
			
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pilas.get(7).numCartas()==0) {
					if(seleccionada.getNum()=='K') {
						Pilas.get(7).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						if(getPilaSeleccionada() == 1) {
							if(Pilas.get(1).numCartas()==0) {
								btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
							}
						}
						else if(pilaSeleccionada == 6) {
							if(Pilas.get(6).numCartas()==0) {
								btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
							}
						}
						else if(pilaSeleccionada == 8) {
							if(Pilas.get(8).numCartas()==0) {
								btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 9) {
							if(Pilas.get(9).numCartas()==0) {
								btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 10) {
							if(Pilas.get(10).numCartas()==0) {
								btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 11) {
							if(Pilas.get(11).numCartas()==0) {
								btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 12) {
							if(Pilas.get(12).numCartas()==0) {
								btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
							}
						}
						setPilaSeleccionada(0);
						
					}
				}
				else if(seleccionada.getNum()=='0') {
					seleccionada = new Carta(Pilas.get(7).getCarta().getNum(),Pilas.get(7).getCarta().getPalo(),Pilas.get(7).getCarta().getRuta());
					setPilaSeleccionada(7);
				}
				
				else if(seleccionada.movimientoPila(Pilas.get(7).getCarta())) {
					Pilas.get(7).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
					btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));	
					if(getPilaSeleccionada() == 1) {
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 6) {
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 8) {
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 9) {
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 10) {
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 11) {
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 12) {
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
					}
					
					seleccionada = new Carta('0','0',"0");
					setPilaSeleccionada(0);
				}
				else {
					if (Pilas.get(7).numCartas()!=0) {
						
						seleccionada = new Carta(Pilas.get(7).getCarta().getNum(),Pilas.get(7).getCarta().getPalo(),Pilas.get(7).getCarta().getRuta());
						setPilaSeleccionada(7);
					}
				}
			
			}
			
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pilas.get(8).numCartas()==0) {
					if(seleccionada.getNum()=='K') {
						Pilas.get(8).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						if(getPilaSeleccionada() == 1) {
							if(Pilas.get(1).numCartas()==0) {
								btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 6) {
							if(Pilas.get(6).numCartas()==0) {
								btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 7) {
							if(Pilas.get(1).numCartas()==0) {
								btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 9) {
							if(Pilas.get(9).numCartas()==0) {
								btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 10) {
							if(Pilas.get(10).numCartas()==0) {
								btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 11) {
							if(Pilas.get(11).numCartas()==0) {
								btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 12) {
							if(Pilas.get(12).numCartas()==0) {
								btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
							}
						}
						setPilaSeleccionada(0);
						
					}
				}
				else if(seleccionada.getNum()=='0') {
					seleccionada = new Carta(Pilas.get(8).getCarta().getNum(),Pilas.get(8).getCarta().getPalo(),Pilas.get(8).getCarta().getRuta());
					setPilaSeleccionada(8);
				}
				
				else if(seleccionada.movimientoPila(Pilas.get(8).getCarta())) {
					Pilas.get(8).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
					btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));	
					if(getPilaSeleccionada() == 1) {
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 6) {
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 7) {
						if(Pilas.get(1).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 9) {
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 10) {
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 11) {
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 12) {
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
					}
					
					seleccionada = new Carta('0','0',"0");
					setPilaSeleccionada(0);
				}
				else {
					if (Pilas.get(8).numCartas()!=0) {
						
						seleccionada = new Carta(Pilas.get(8).getCarta().getNum(),Pilas.get(8).getCarta().getPalo(),Pilas.get(8).getCarta().getRuta());
						setPilaSeleccionada(8);
					}
				}
			
			}
			
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pilas.get(9).numCartas()==0) {
					if(seleccionada.getNum()=='K') {
						Pilas.get(9).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						if(getPilaSeleccionada() == 1) {
							if(Pilas.get(1).numCartas()==0) {
								btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 6) {
							if(Pilas.get(6).numCartas()==0) {
								btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 7) {
							if(Pilas.get(1).numCartas()==0) {
								btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 8) {
							if(Pilas.get(8).numCartas()==0) {
								btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 10) {
							if(Pilas.get(10).numCartas()==0) {
								btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 11) {
							if(Pilas.get(11).numCartas()==0) {
								btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 12) {
							if(Pilas.get(12).numCartas()==0) {
								btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
							}
						}
						setPilaSeleccionada(0);
						
					}
				}
				else if(seleccionada.getNum()=='0') {
					seleccionada = new Carta(Pilas.get(9).getCarta().getNum(),Pilas.get(9).getCarta().getPalo(),Pilas.get(9).getCarta().getRuta());
					setPilaSeleccionada(9);
				}
				
				else if(seleccionada.movimientoPila(Pilas.get(9).getCarta())) {
					Pilas.get(9).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
					btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));	
					if(getPilaSeleccionada() == 1) {
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 6) {
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 7) {
						if(Pilas.get(1).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 8) {
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 10) {
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 11) {
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 12) {
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
					}
					
					seleccionada = new Carta('0','0',"0");
					setPilaSeleccionada(0);
				}
				else {
					if (Pilas.get(9).numCartas()!=0) {
						
						seleccionada = new Carta(Pilas.get(9).getCarta().getNum(),Pilas.get(9).getCarta().getPalo(),Pilas.get(9).getCarta().getRuta());
						setPilaSeleccionada(9);
					}
				}
			
			}
			
		});
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pilas.get(10).numCartas()==0) {
					if(seleccionada.getNum()=='K') {
						Pilas.get(10).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						if(getPilaSeleccionada() == 1) {
							if(Pilas.get(1).numCartas()==0) {
								btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 6) {
							if(Pilas.get(6).numCartas()==0) {
								btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 7) {
							if(Pilas.get(1).numCartas()==0) {
								btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 8) {
							if(Pilas.get(8).numCartas()==0) {
								btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 9) {
							if(Pilas.get(9).numCartas()==0) {
								btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 11) {
							if(Pilas.get(11).numCartas()==0) {
								btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 12) {
							if(Pilas.get(12).numCartas()==0) {
								btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
							}
						}
						setPilaSeleccionada(0);
						
					}
				}
				else if(seleccionada.getNum()=='0') {
					seleccionada = new Carta(Pilas.get(10).getCarta().getNum(),Pilas.get(10).getCarta().getPalo(),Pilas.get(10).getCarta().getRuta());
					setPilaSeleccionada(10);
				}
				
				else if(seleccionada.movimientoPila(Pilas.get(10).getCarta())) {
					Pilas.get(10).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
					btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));	
					if(getPilaSeleccionada() == 1) {
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 6) {
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 7) {
						if(Pilas.get(1).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 8) {
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 9) {
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 11) {
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 12) {
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
					}
					seleccionada = new Carta('0','0',"0");
					setPilaSeleccionada(0);
				}
				else {
					if (Pilas.get(10).numCartas()!=0) {
						
						seleccionada = new Carta(Pilas.get(10).getCarta().getNum(),Pilas.get(10).getCarta().getPalo(),Pilas.get(10).getCarta().getRuta());
						setPilaSeleccionada(10);
					}
				}
			
			}
			
		});
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pilas.get(11).numCartas()==0) {
					if(seleccionada.getNum()=='K') {
						Pilas.get(11).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						if(getPilaSeleccionada() == 1) {
							if(Pilas.get(1).numCartas()==0) {
								btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 6) {
							if(Pilas.get(6).numCartas()==0) {
								btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 7) {
							if(Pilas.get(1).numCartas()==0) {
								btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 8) {
							if(Pilas.get(8).numCartas()==0) {
								btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 9) {
							if(Pilas.get(9).numCartas()==0) {
								btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 10) {
							if(Pilas.get(10).numCartas()==0) {
								btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 12) {
							if(Pilas.get(12).numCartas()==0) {
								btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
							}
						}
						setPilaSeleccionada(0);
						
					}
				}
				else if(seleccionada.getNum()=='0') {
					seleccionada = new Carta(Pilas.get(11).getCarta().getNum(),Pilas.get(11).getCarta().getPalo(),Pilas.get(11).getCarta().getRuta());
					setPilaSeleccionada(11);
				}
				
				else if(seleccionada.movimientoPila(Pilas.get(11).getCarta())) {
					Pilas.get(11).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
					btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));	
					if(getPilaSeleccionada() == 1) {
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 6) {
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 7) {
						if(Pilas.get(1).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 8) {
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 9) {
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 10) {
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 12) {
						if(Pilas.get(12).numCartas()==0) {
							btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						}
					}
					
					seleccionada = new Carta('0','0',"0");
					setPilaSeleccionada(0);
				}
				else {
					if (Pilas.get(11).numCartas()!=0) {
						
						seleccionada = new Carta(Pilas.get(11).getCarta().getNum(),Pilas.get(11).getCarta().getPalo(),Pilas.get(11).getCarta().getRuta());
						setPilaSeleccionada(11);
					}
				}
			
			}
			
		});
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pilas.get(12).numCartas()==0) {
					if(seleccionada.getNum()=='K') {
						Pilas.get(12).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						btn12.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
						if(getPilaSeleccionada() == 1) {
							if(Pilas.get(1).numCartas()==0) {
								btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 6) {
							if(Pilas.get(6).numCartas()==0) {
								btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 7) {
							if(Pilas.get(1).numCartas()==0) {
								btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 8) {
							if(Pilas.get(8).numCartas()==0) {
								btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 9) {
							if(Pilas.get(9).numCartas()==0) {
								btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 10) {
							if(Pilas.get(10).numCartas()==0) {
								btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
							}
						}
						else if(getPilaSeleccionada() == 11) {
							if(Pilas.get(11).numCartas()==0) {
								btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
							
							}
							else {
								btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
							}
						}
						setPilaSeleccionada(0);
						
					}
				}
				else if(seleccionada.getNum()=='0') {
					seleccionada = new Carta(Pilas.get(12).getCarta().getNum(),Pilas.get(12).getCarta().getPalo(),Pilas.get(12).getCarta().getRuta());
					setPilaSeleccionada(12);
				}
				
				else if(seleccionada.movimientoPila(Pilas.get(11).getCarta())) {
					Pilas.get(11).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
					btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));	
					if(getPilaSeleccionada() == 1) {
						if(Pilas.get(1).numCartas()==0) {
							btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 6) {
						if(Pilas.get(6).numCartas()==0) {
							btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn6.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 7) {
						if(Pilas.get(1).numCartas()==0) {
							btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn7.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 8) {
						if(Pilas.get(8).numCartas()==0) {
							btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn8.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 9) {
						if(Pilas.get(9).numCartas()==0) {
							btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn9.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
						}
					}
					else if(pilaSeleccionada == 10) {
						if(Pilas.get(10).numCartas()==0) {
							btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn10.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
						}
					}
					else if(getPilaSeleccionada() == 11) {
						if(Pilas.get(11).numCartas()==0) {
							btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
						
						}
						else {
							btn11.setIcon(new ImageIcon(solitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
						}
					}
					
					seleccionada = new Carta('0','0',"0");
					setPilaSeleccionada(0);
				}
				else {
					if (Pilas.get(12).numCartas()!=0) {
						
						seleccionada = new Carta(Pilas.get(12).getCarta().getNum(),Pilas.get(12).getCarta().getPalo(),Pilas.get(12).getCarta().getRuta());
						setPilaSeleccionada(12);
					}
				}
			
			}
			
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//mover de mazo a monton dandole la vuelta a la carta
				seleccionada = new Carta('0','0',"0");
				setPilaSeleccionada(0);
				btn1.setIcon(new ImageIcon(solitarioSwing.class.getResource(pila.getCarta().getRuta())));
				Pilas.get(1).addCarta(pila.getCarta());
				Pilas.get(0).eliminarCarta();
				if(pila.numCartas()==0) {
					btn0.setIcon(new ImageIcon(solitarioSwing.class.getResource("/Images/107016_64.gif")));
				}
				
			}
		});
		menuBar.add(mntmAyuda);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1024, 768);
		setVisible(true);
	}

}

