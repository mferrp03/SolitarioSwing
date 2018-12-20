import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
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
import javax.swing.ImageIcon;

import java.util.ArrayList;
public class SolitarioSwing extends JFrame {
	private Carta seleccionada = new Carta ('0','0',false,"0");
	int pilaSeleccionada = 0;
	JButton btn0;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn10;
	JButton btn11;
	JButton btn12;
	JPanel panel;
	JLayeredPane panel12;
	JLayeredPane panel11;
	JLayeredPane panel10;
	JLayeredPane panel9;
	JLayeredPane panel8;
	JLayeredPane panel7;
	JLayeredPane panel6;
	JPanel panel5;
	JPanel panel4;
	JPanel panel3;
	JPanel panel2;
	JPanel panel1;
	
	ArrayList<Pila>Pilas = new ArrayList<Pila>();
	
	private int y;
	private JButton btn11_2;
	private JButton btn11_3;
	private JButton btn11_4;
	private JButton btn11_5;
	private JButton btn11_6;
	private JButton btn11_7;
	private JButton btn11_8;
	private JButton btn11_9;
	private JButton btn11_10;
	private JButton btn11_11;
	private JButton btn11_12;
	private JButton btn11_13;
	private JButton btn11_14;
	private JButton btn11_15;
	private JButton btn11_16;
	private JButton btn11_17;
	private JButton btn11_18;
	private JButton btn11_19;
	private JButton btn6_2;
	private JButton btn6_3;
	private JButton btn6_4;
	private JButton btn6_5;
	private JButton btn6_6;
	private JButton btn6_7;
	private JButton btn6_8;
	private JButton btn6_9;
	private JButton btn6_10;
	private JButton btn6_11;
	private JButton btn6_12;
	private JButton btn6_13;
	private JButton btn6_14;
	private JButton btn7_2;
	private JButton btn7_3;
	private JButton btn7_4;
	private JButton btn7_5;
	private JButton btn7_6;
	private JButton btn7_7;
	private JButton btn7_8;
	private JButton btn7_9;
	private JButton btn7_10;
	private JButton btn7_11;
	private JButton btn7_12;
	private JButton btn7_13;
	private JButton btn7_14;
	private JButton btn7_15;
	private JButton btn8_2;
	private JButton btn8_3;
	private JButton btn8_4;
	private JButton btn8_5;
	private JButton btn8_6;
	private JButton btn8_7;
	private JButton btn8_8;
	private JButton btn8_9;
	private JButton btn8_10;
	private JButton btn8_11;
	private JButton btn8_12;
	private JButton btn8_13;
	private JButton btn8_14;
	private JButton btn8_15;
	private JButton btn8_16;
	private JButton btn9_2;
	private JButton btn9_3;
	private JButton btn9_4;
	private JButton btn9_5;
	private JButton btn9_6;
	private JButton btn9_7;
	private JButton btn9_8;
	private JButton btn9_9;
	private JButton btn9_10;
	private JButton btn9_11;
	private JButton btn9_12;
	private JButton btn9_13;
	private JButton btn9_14;
	private JButton btn9_15;
	private JButton btn9_16;
	private JButton btn9_17;
	private JButton btn10_2;
	private JButton btn10_3;
	private JButton btn10_4;
	private JButton btn10_5;
	private JButton btn10_6;
	private JButton btn10_7;
	private JButton btn10_8;
	private JButton btn10_9;
	private JButton btn10_10;
	private JButton btn10_11;
	private JButton btn10_12;
	private JButton btn10_13;
	private JButton btn10_14;
	private JButton btn10_15;
	private JButton btn10_16;
	private JButton btn10_17;
	private JButton btn10_18;
	private JButton btn12_2;
	private JButton btn12_3;
	private JButton btn12_4;
	private JButton btn12_5;
	private JButton btn12_6;
	private JButton btn12_7;
	private JButton btn12_8;
	private JButton btn12_9;
	private JButton btn12_10;
	private JButton btn12_11;
	private JButton btn12_12;
	private JButton btn12_13;
	private JButton btn12_14;
	private JButton btn12_15;
	private JButton btn12_16;
	private JButton btn12_17;
	private JButton btn12_18;
	private JButton btn12_19;
	private JButton btn12_20;
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
		
		
		Pila pila = new Pila();
		Pila monton = new Pila();
		Pila palo1 = new Pila();
		Pila palo2 = new Pila();
		Pila palo3 = new Pila();
		Pila palo4 = new Pila();
		Pila pila1 = new Pila();
		Pila pila2 = new Pila();
		Pila pila3 = new Pila();
		Pila pila4 = new Pila();
		Pila pila5 = new Pila();
		Pila pila6 = new Pila();
		Pila pila7 = new Pila();
		
		
		Carta AS = new Carta ('A','S',false,"/Images/107016_01.png");
		pila.addCarta(AS);
		Carta DS = new Carta ('2','S',false,"/Images/62233_30.png");
		pila.addCarta(DS);
		Carta TS = new Carta ('3','S',false,"/Images/107016_03.gif");
		pila.addCarta(TS);
		Carta CS = new Carta ('4','S',false,"/Images/107016_04.gif");
		pila.addCarta(CS);
		Carta CiS = new Carta ('5','S',false,"/Images/107016_05.gif");
		pila.addCarta(CiS);
		Carta SS = new Carta ('6','S',false,"/Images/107016_06.gif");
		pila.addCarta(SS);
		Carta SiS = new Carta ('7','S',false,"/Images/107016_07.gif");
		pila.addCarta(SiS);
		Carta OS = new Carta ('8','S',false,"/Images/107016_08.gif");
		pila.addCarta(OS);
		Carta NS = new Carta ('9','S',false,"/Images/107016_09.gif");
		pila.addCarta(NS);
		Carta DiS = new Carta ('T','S',false,"/Images/107016_10.gif");
		pila.addCarta(DiS);
		Carta JS = new Carta ('J','S',false,"/Images/107016_11.gif");
		pila.addCarta(JS);
		Carta QS = new Carta ('Q','S',false,"/Images/107016_12.gif");
		pila.addCarta(QS);
		Carta KS = new Carta ('K','S',false,"/Images/107016_13.gif");
		pila.addCarta(KS);
		
		Carta AC = new Carta ('A','C',false,"/Images/107016_27.gif");
		pila.addCarta(AC);
		Carta DC = new Carta ('2','C',false,"/Images/107016_28.gif");
		pila.addCarta(DC);
		Carta TC = new Carta ('3','C',false,"/Images/107016_29.gif");;
		pila.addCarta(TC);
		Carta CC = new Carta ('4','C',false,"/Images/107016_30.gif");
		pila.addCarta(CC);
		Carta CiC = new Carta ('5','C',false,"/Images/107016_31.gif");
		pila.addCarta(CiC);
		Carta SC = new Carta ('6','C',false,"/Images/107016_32.gif");
		pila.addCarta(SC);
		Carta SiC = new Carta ('7','C',false,"/Images/107016_33.gif");
		pila.addCarta(SiC);
		Carta OC = new Carta ('8','C',false,"/Images/107016_34.gif");
		pila.addCarta(OC);
		Carta NC = new Carta ('9','C',false,"/Images/107016_35.gif");
		pila.addCarta(NC);
		Carta DiC = new Carta ('T','C',false,"/Images/107016_36.gif");
		pila.addCarta(DiC);
		Carta JC = new Carta ('J','C',false,"/Images/107016_37.gif");
		pila.addCarta(JC);
		Carta QC = new Carta ('Q','C',false,"/Images/107016_38.gif");
		pila.addCarta(QC);
		Carta KC = new Carta ('K','C',false,"/Images/107016_39.gif");
		pila.addCarta(KC);
	
		Carta AD = new Carta ('A','D',false,"/Images/107016_40.gif");
		pila.addCarta(AD);
		Carta DD = new Carta ('2','D',false,"/Images/107016_41.gif");
		pila.addCarta(DD);
		Carta TD = new Carta ('3','D',false,"/Images/107016_42.gif");
		pila.addCarta(TD);
		Carta CD = new Carta ('4','D',false,"/Images/107016_43.gif");
		pila.addCarta(CD);
		Carta CiD = new Carta ('5','D',false,"/Images/107016_44.gif");
		pila.addCarta(CiD);
		Carta SD = new Carta ('6','D',false,"/Images/107016_45.gif");
		pila.addCarta(SD);
		Carta SiD = new Carta ('7','D',false,"/Images/107016_46.gif");
		pila.addCarta(SiD);
		Carta OD = new Carta ('8','D',false,"/Images/107016_47.gif");
		pila.addCarta(OD);
		Carta ND = new Carta ('9','D',false,"/Images/107016_48.gif");
		pila.addCarta(ND);
		Carta DiD = new Carta ('T','D',false,"/Images/107016_49.gif");
		pila.addCarta(DiD);
		Carta JD = new Carta ('J','D',false,"/Images/107016_50.gif");
		pila.addCarta(JD);
		Carta QD = new Carta ('Q','D',false,"/Images/107016_51.gif");
		pila.addCarta(QD);
		Carta KD = new Carta ('K','D',false,"/Images/107016_52.gif");
		pila.addCarta(KD);
	
		Carta AH = new Carta ('A','H',false,"/Images/107016_14.gif");
		pila.addCarta(AH);
		Carta DH = new Carta ('2','H',false,"/Images/107016_15.gif");
		pila.addCarta(DH);
		Carta TH = new Carta ('3','H',false,"/Images/107016_16.gif");
		pila.addCarta(TH);
		Carta CH = new Carta ('4','H',false,"/Images/107016_17.gif");
		pila.addCarta(CH);
		Carta CiH = new Carta ('5','H',false,"/Images/107016_18.gif");
		pila.addCarta(CiH);
		Carta SH = new Carta ('6','H',false,"/Images/107016_19.gif");
		pila.addCarta(SH);
		Carta SiH = new Carta ('7','H',false,"/Images/107016_20.gif");
		pila.addCarta(SiH);
		Carta OH = new Carta ('8','H',false,"/Images/107016_21.gif");
		pila.addCarta(OH);
		Carta NH = new Carta ('9','H',false,"/Images/107016_22.gif");
		pila.addCarta(NH);
		Carta DiH = new Carta ('T','H',false,"/Images/107016_23.gif");
		pila.addCarta(DiH);
		Carta JH = new Carta ('J','H',false,"/Images/107016_24.gif");
		pila.addCarta(JH);
		Carta QH = new Carta ('Q','H',false,"/Images/107016_25.gif");
		pila.addCarta(QH);
		Carta KH = new Carta ('K','H',false,"/Images/107016_26.gif");
		pila.addCarta(KH);
		
		
		pila.barajar();
		pila1.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila2.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila2.getCarta().setBack(true);
		pila2.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila3.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila3.getCarta().setBack(true);
		pila3.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila3.getCarta().setBack(true);
		pila3.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila4.getCarta().setBack(true);
		pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila4.getCarta().setBack(true);
		pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila4.getCarta().setBack(true);
		pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila5.getCarta().setBack(true);
		pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila5.getCarta().setBack(true);
		pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila5.getCarta().setBack(true);
		pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila5.getCarta().setBack(true);
		pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila6.getCarta().setBack(true);
		pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila6.getCarta().setBack(true);
		pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila6.getCarta().setBack(true);
		pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila6.getCarta().setBack(true);
		pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila6.getCarta().setBack(true);
		pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila7.getCarta().setBack(true);
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila7.getCarta().setBack(true);
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila7.getCarta().setBack(true);
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila7.getCarta().setBack(true);
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila7.getCarta().setBack(true);
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila7.getCarta().setBack(true);
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		/*Pila1.addCarta(AD);
		Pila2.addCarta(QH);
		pila.addCarta(QH);
		Pila2.addCarta(KS);*/
		Pilas.add(pila);
		Pilas.add(monton);
		Pilas.add(palo1);
		Pilas.add(palo2);
		Pilas.add(palo3);
		Pilas.add(palo4);
		Pilas.add(pila1);
		Pilas.add(pila2);
		Pilas.add(pila3);
		Pilas.add(pila4);
		Pilas.add(pila5);
		Pilas.add(pila6);
		Pilas.add(pila7);
		getContentPane().setBackground(new Color(0, 128, 0));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		getContentPane().setBackground(new Color(0, 128, 0));
		
		panel = new JPanel();
		panel.setForeground(new Color(0, 128, 0));
		panel.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JButton btn0_1 = new JButton("");
		GridBagConstraints gbc_btn0_1 = new GridBagConstraints();
		gbc_btn0_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btn0_1.gridheight = 4;
		gbc_btn0_1.gridwidth = 2;
		gbc_btn0_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn0_1.gridx = 0;
		gbc_btn0_1.gridy = 0;
		panel.add(btn0_1, gbc_btn0_1);
		
		btn0_1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_54.gif")));
		
		btn0_1.setBackground(new Color(0, 128, 0));
		btn0_1.setForeground(new Color(0, 128, 0));
		
	
	
		
		btn0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//mover de mazo a monton dandole la vuelta a la carta
				seleccionada = new Carta('0','0',false,"0");
				setPilaSeleccionada(0);
				if(pila.numCartas()!=0) {
					btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource(pila.getCarta().getRuta())));
					Pilas.get(1).addCarta(pila.getCarta());
					Pilas.get(0).eliminarCarta();
				}
				if(pila.numCartas()==0) {
					btn0_1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_64.gif")));
				}
				
			}
		});
		
		panel1 = new JPanel();
		panel1.setForeground(new Color(0, 128, 0));
		panel1.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel1 = new GridBagConstraints();
		gbc_panel1.fill = GridBagConstraints.BOTH;
		gbc_panel1.insets = new Insets(0, 0, 5, 5);
		gbc_panel1.gridx = 2;
		gbc_panel1.gridy = 0;
		getContentPane().add(panel1, gbc_panel1);
		panel1.setLayout(new CardLayout(0, 0));

		btn1 = new JButton("");
		panel1.add(btn1, "name_70510578004605");
		
		btn1.setBackground(new Color(0, 128, 0));
		btn1.setForeground(new Color(0, 128, 0));
		btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Pilas.get(1).numCartas()!=0) {
					
					seleccionada = new Carta(Pilas.get(1).getCarta().getNum(),Pilas.get(1).getCarta().getPalo(),Pilas.get(1).getCarta().getBack(),Pilas.get(1).getCarta().getRuta());
					setPilaSeleccionada(1);
				}
			}
		});
		
		panel2 = new JPanel();
		panel2.setForeground(new Color(0, 128, 0));
		panel2.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel2 = new GridBagConstraints();
		gbc_panel2.fill = GridBagConstraints.BOTH;
		gbc_panel2.insets = new Insets(0, 0, 5, 5);
		gbc_panel2.gridx = 3;
		gbc_panel2.gridy = 0;
		getContentPane().add(panel2, gbc_panel2);
		GridBagLayout gbl_panel2 = new GridBagLayout();
		gbl_panel2.columnWidths = new int[]{0, 0};
		gbl_panel2.rowHeights = new int[]{0, 0};
		gbl_panel2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel2.setLayout(gbl_panel2);
		
		btn2 = new JButton("");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.gridx = 0;
		gbc_btn2.gridy = 0;
		panel2.add(btn2, gbc_btn2);
		
		btn2.setName("2");
		btn2.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn2.setBackground(new Color(0, 128, 0));
		btn2.setForeground(new Color(0, 128, 0));
		
		btn2.addActionListener(new MyListener());
		
		panel3 = new JPanel();
		panel3.setForeground(new Color(0, 128, 0));
		panel3.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel3 = new GridBagConstraints();
		gbc_panel3.fill = GridBagConstraints.BOTH;
		gbc_panel3.insets = new Insets(0, 0, 5, 5);
		gbc_panel3.gridx = 4;
		gbc_panel3.gridy = 0;
		getContentPane().add(panel3, gbc_panel3);
		GridBagLayout gbl_panel3 = new GridBagLayout();
		gbl_panel3.columnWidths = new int[]{0, 0};
		gbl_panel3.rowHeights = new int[]{0, 0};
		gbl_panel3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel3.setLayout(gbl_panel3);
		
		btn3 = new JButton("");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.gridx = 0;
		gbc_btn3.gridy = 0;
		panel3.add(btn3, gbc_btn3);
		
		btn3.setName("3");
		btn3.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn3.setForeground(new Color(0, 128, 0));
		btn3.setBackground(new Color(0, 128, 0));
		btn3.addActionListener(new MyListener());
		
		panel4 = new JPanel();
		panel4.setForeground(new Color(0, 128, 0));
		panel4.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel4 = new GridBagConstraints();
		gbc_panel4.fill = GridBagConstraints.BOTH;
		gbc_panel4.insets = new Insets(0, 0, 5, 5);
		gbc_panel4.gridx = 5;
		gbc_panel4.gridy = 0;
		getContentPane().add(panel4, gbc_panel4);
		GridBagLayout gbl_panel4 = new GridBagLayout();
		gbl_panel4.columnWidths = new int[]{0, 0};
		gbl_panel4.rowHeights = new int[]{0, 0};
		gbl_panel4.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel4.setLayout(gbl_panel4);
		
		btn4 = new JButton("");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 0;
		panel4.add(btn4, gbc_btn4);
		
		btn4.setName("4");
		btn4.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn4.setForeground(new Color(0, 128, 0));
		btn4.setBackground(new Color(0, 128, 0));
		btn4.addActionListener(new MyListener());
		
		panel5 = new JPanel();
		panel5.setForeground(new Color(0, 128, 0));
		panel5.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel5 = new GridBagConstraints();
		gbc_panel5.fill = GridBagConstraints.BOTH;
		gbc_panel5.insets = new Insets(0, 0, 5, 5);
		gbc_panel5.gridx = 6;
		gbc_panel5.gridy = 0;
		getContentPane().add(panel5, gbc_panel5);
		GridBagLayout gbl_panel5 = new GridBagLayout();
		gbl_panel5.columnWidths = new int[]{0, 0};
		gbl_panel5.rowHeights = new int[]{0, 0};
		gbl_panel5.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel5.setLayout(gbl_panel5);
		
		btn5 = new JButton("");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.gridx = 0;
		gbc_btn5.gridy = 0;
		panel5.add(btn5, gbc_btn5);
		
		btn5.setName("5");
		btn5.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
		btn5.setBackground(new Color(0, 128, 0));
		btn5.setForeground(new Color(0, 128, 0));
		btn5.addActionListener(new MyListener());
		
		panel6 = new JLayeredPane();
		panel6.setForeground(new Color(0, 128, 0));
		panel6.setBackground(new Color(0, 128, 0));
		panel6.setLayout(null);
		GridBagConstraints gbc_panel6 = new GridBagConstraints();
		gbc_panel6.gridheight = 5;
		gbc_panel6.fill = GridBagConstraints.BOTH;
		gbc_panel6.insets = new Insets(0, 0, 0, 5);
		gbc_panel6.gridx = 1;
		gbc_panel6.gridy = 1;
		getContentPane().add(panel6, gbc_panel6);
		y = 0;
		
		btn6 = new JButton("");
		/*btn6.setBounds(0, 0, 105, 115);
		panel6.add(btn6);*/
		
		btn6.setName("1");
		btn6.setHorizontalAlignment(SwingConstants.LEFT);
		btn6.setVerticalAlignment(SwingConstants.BOTTOM);
		btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
		crearBotonesClasico(panel6,btn6,1,0,1,6);
		
		btn6_2 = new JButton("");
		
		crearBotonesClasico(panel6,btn6_2,2,1,1,6);
		
		
		btn6_3 = new JButton("");
		crearBotonesClasico(panel6,btn6_3,3,2,1,6);
		
		btn6_4 = new JButton("");
		crearBotonesClasico(panel6,btn6_4,4,3,1,6);
		
		btn6_5 = new JButton("");
		crearBotonesClasico(panel6,btn6_5,5,4,1,6);
		
		btn6_6 = new JButton("");
		crearBotonesClasico(panel6,btn6_6,6,5,1,6);
		
		btn6_7 = new JButton("");
		crearBotonesClasico(panel6,btn6_7,7,6,1,6);
		
		btn6_8 = new JButton("");
		crearBotonesClasico(panel6,btn6_8,8,7,1,6);
		
		btn6_9 = new JButton("");
		crearBotonesClasico(panel6,btn6_9,9,8,1,6);
		
		btn6_10 = new JButton("");
		crearBotonesClasico(panel6,btn6_10,10,9,1,6);
		
		btn6_11 = new JButton("");
		crearBotonesClasico(panel6,btn6_11,11,10,1,6);
		
		btn6_12 = new JButton("");
		crearBotonesClasico(panel6,btn6_12,12,11,1,6);
		
		btn6_13 = new JButton("");
		crearBotonesClasico(panel6,btn6_13,13,12,1,6);
		btn6_14 = new JButton("");
		crearBotonesClasico(panel6,btn6_14,14,13,1,6);
		btn6_2.setName("2");
		btn6_3.setName("3");
		btn6_4.setName("4");
		btn6_5.setName("5");
		btn6_6.setName("6");
		btn6_7.setName("7");
		btn6_8.setName("8");
		btn6_9.setName("9");
		btn6_10.setName("10");
		btn6_11.setName("11");
		btn6_12.setName("12");
		btn6_13.setName("13");
		btn6_14.setName("14");
		
		btn6.addActionListener(new MyListener());
		btn6_2.addActionListener(new MyListener());
		btn6_3.addActionListener(new MyListener());
		btn6_4.addActionListener(new MyListener());
		btn6_5.addActionListener(new MyListener());
		btn6_6.addActionListener(new MyListener());
		btn6_7.addActionListener(new MyListener());
		btn6_8.addActionListener(new MyListener());
		btn6_9.addActionListener(new MyListener());
		btn6_10.addActionListener(new MyListener());
		btn6_11.addActionListener(new MyListener());
		btn6_12.addActionListener(new MyListener());
		btn6_13.addActionListener(new MyListener());
		btn6_14.addActionListener(new MyListener());
		panel7 = new JLayeredPane();
		
		
		panel7.setForeground(new Color(0, 128, 0));
		panel7.setBackground(new Color(0, 128, 0));
		panel7.setLayout(null);
		GridBagConstraints gbc_panel7 = new GridBagConstraints();
		gbc_panel7.gridheight = 5;
		gbc_panel7.fill = GridBagConstraints.BOTH;
		gbc_panel7.insets = new Insets(0, 0, 0, 5);
		gbc_panel7.gridx = 2;
		gbc_panel7.gridy = 1;
		getContentPane().add(panel7, gbc_panel7);
		
		btn7 = new JButton("");
		
		btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(0).getImage())));
		btn7.setName("1");
		
		crearBotonesClasico(panel7,btn7,1,0,1,7);
		
		
		
		btn7_2 = new JButton("");
		btn7_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCarta().getImage())));
		crearBotonesClasico(panel7,btn7_2,2,1,2,7);
		
		btn7_3 = new JButton("");
		crearBotonesClasico(panel7,btn7_3,3,2,2,7);
		
		btn7_4 = new JButton("");
		crearBotonesClasico(panel7,btn7_4,4,3,2,7);
		
		btn7_5 = new JButton("");
		crearBotonesClasico(panel7,btn7_5,5,4,2,7);;
		
		btn7_6 = new JButton("");
		crearBotonesClasico(panel7,btn7_6,6,5,2,7);
		
		btn7_7 = new JButton("");
		crearBotonesClasico(panel7,btn7_7,7,6,2,7);
		
		btn7_8 = new JButton("");
		crearBotonesClasico(panel7,btn7_8,8,7,2,7);
		
		btn7_9 = new JButton("");
		crearBotonesClasico(panel7,btn7_9,9,8,2,7);
		
		btn7_10 = new JButton("");
		crearBotonesClasico(panel7,btn7_10,10,9,2,7);
		
		btn7_11 = new JButton("");
		crearBotonesClasico(panel7,btn7_11,11,10,2,7);
		
		btn7_12 = new JButton("");
		crearBotonesClasico(panel7,btn7_12,12,11,2,7);
		
		btn7_13 = new JButton("");
		crearBotonesClasico(panel7,btn7_13,13,12,2,7);
		
		btn7_14 = new JButton("");
		crearBotonesClasico(panel7,btn7_14,14,13,2,7);
		
		btn7_15 = new JButton("");
		crearBotonesClasico(panel7,btn7_15,15,14,2,7);
		
		btn7.addActionListener(new MyListener());
		btn7_2.addActionListener(new MyListener());
		btn7_3.addActionListener(new MyListener());
		btn7_4.addActionListener(new MyListener());
		btn7_5.addActionListener(new MyListener());
		btn7_6.addActionListener(new MyListener());
		btn7_7.addActionListener(new MyListener());
		btn7_8.addActionListener(new MyListener());
		btn7_9.addActionListener(new MyListener());
		btn7_10.addActionListener(new MyListener());
		btn7_11.addActionListener(new MyListener());
		btn7_12.addActionListener(new MyListener());
		btn7_13.addActionListener(new MyListener());
		btn7_14.addActionListener(new MyListener());
		btn7_15.addActionListener(new MyListener());
		btn7_2.setName("2");
		btn7_3.setName("3");
		btn7_4.setName("4");
		btn7_5.setName("5");
		btn7_6.setName("6");
		btn7_7.setName("7");
		btn7_8.setName("8");
		btn7_9.setName("9");
		btn7_10.setName("10");
		btn7_11.setName("11");
		btn7_12.setName("12");
		btn7_13.setName("13");
		btn7_14.setName("14");
		btn7_15.setName("15");
	
		panel8 = new JLayeredPane();
		panel8.setForeground(new Color(0, 128, 0));
		panel8.setBackground(new Color(0, 128, 0));
		panel8.setLayout(null);
		GridBagConstraints gbc_panel8 = new GridBagConstraints();
		gbc_panel8.gridheight = 5;
		gbc_panel8.fill = GridBagConstraints.BOTH;
		gbc_panel8.insets = new Insets(0, 0, 0, 5);
		gbc_panel8.gridx = 3;
		gbc_panel8.gridy = 1;
		getContentPane().add(panel8, gbc_panel8);
		
		btn8 = new JButton("");
		btn8.setName("1");
		
		btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(0).getImage())));
		crearBotonesClasico(panel8,btn8,1,0,3,8);
		
		btn8_2 = new JButton("");
		btn8_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(1).getImage())));
		crearBotonesClasico(panel8,btn8_2,2,1,3,8);
		
		btn8_3 = new JButton("");
		btn8_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCarta().getImage())));
		crearBotonesClasico(panel8,btn8_3,3,2,3,8);
		
		btn8_4 = new JButton("");
		crearBotonesClasico(panel8,btn8_4,4,3,3,8);
		
		btn8_5 = new JButton("");
		crearBotonesClasico(panel8,btn8_5,5,4,3,8);
		
		btn8_6 = new JButton("");
		crearBotonesClasico(panel8,btn8_6,6,5,3,8);
		
		btn8_7 = new JButton("");
		crearBotonesClasico(panel8,btn8_7,7,6,3,8);
		
		btn8_8 = new JButton("");
		crearBotonesClasico(panel8,btn8_8,8,7,3,8);
		
		btn8_9 = new JButton("");
		crearBotonesClasico(panel8,btn8_9,9,8,3,8);
		
		btn8_10 = new JButton("");
		crearBotonesClasico(panel8,btn8_10,10,9,3,8);
		
		btn8_11 = new JButton("");
		crearBotonesClasico(panel8,btn8_11,11,10,3,8);
		
		btn8_12 = new JButton("");
		crearBotonesClasico(panel8,btn8_12,12,10,3,8);
		
		btn8_13 = new JButton("");
		crearBotonesClasico(panel8,btn8_13,13,12,3,8);
		
		btn8_14 = new JButton("");
		crearBotonesClasico(panel8,btn8_14,14,13,3,8);
		
		btn8_15 = new JButton("");
		crearBotonesClasico(panel8,btn8_15,15,14,3,8);
		
		btn8_16 = new JButton("");
		crearBotonesClasico(panel8,btn8_16,16,15,3,8);
		btn8_2.setName("2");
		btn8_3.setName("3");
		btn8_4.setName("4");
		btn8_5.setName("5");
		btn8_6.setName("6");
		btn8_7.setName("7");
		btn8_8.setName("8");
		btn8_9.setName("9");
		btn8_10.setName("10");
		btn8_11.setName("11");
		btn8_12.setName("12");
		btn8_13.setName("13");
		btn8_14.setName("14");
		btn8_15.setName("15");
		btn8_16.setName("16");
		btn8.addActionListener(new MyListener());
		btn8_2.addActionListener(new MyListener());
		btn8_3.addActionListener(new MyListener());
		btn8_4.addActionListener(new MyListener());
		btn8_5.addActionListener(new MyListener());
		btn8_6.addActionListener(new MyListener());
		btn8_7.addActionListener(new MyListener());
		btn8_8.addActionListener(new MyListener());
		btn8_9.addActionListener(new MyListener());
		btn8_10.addActionListener(new MyListener());
		btn8_11.addActionListener(new MyListener());
		btn8_12.addActionListener(new MyListener());
		btn8_13.addActionListener(new MyListener());
		btn8_14.addActionListener(new MyListener());
		btn8_15.addActionListener(new MyListener());
		btn8_16.addActionListener(new MyListener());
		
		panel9 = new JLayeredPane();
		panel9.setForeground(new Color(0, 128, 0));
		panel9.setBackground(new Color(0, 128, 0));
		panel9.setLayout(null);
		GridBagConstraints gbc_panel9 = new GridBagConstraints();
		gbc_panel9.gridheight = 5;
		gbc_panel9.fill = GridBagConstraints.BOTH;
		gbc_panel9.insets = new Insets(0, 0, 0, 5);
		gbc_panel9.gridx = 4;
		gbc_panel9.gridy = 1;
		getContentPane().add(panel9, gbc_panel9);
		
		btn9 = new JButton("");
		
		crearBotonesClasico(panel9,btn9,1,0,4,9);
		
		btn9.setName("1");
		btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(0).getImage())));

		btn9_2 = new JButton("");
		btn9_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(1).getImage())));
		crearBotonesClasico(panel9,btn9_2,2,1,4,9);
		
		btn9_3 = new JButton("");
		btn9_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(2).getImage())));
		crearBotonesClasico(panel9,btn9_3,3,2,4,9);
		
		btn9_4 = new JButton("");
		btn9_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(3).getImage())));
		crearBotonesClasico(panel9,btn9_4,4,3,4,9);
		
		btn9_5 = new JButton("");
		crearBotonesClasico(panel9,btn9_5,5,4,4,9);
		
		btn9_6 = new JButton("");
		crearBotonesClasico(panel9,btn9_6,6,5,4,9);
		
		btn9_7 = new JButton("");
		crearBotonesClasico(panel9,btn9_7,7,6,4,9);
		
		btn9_8 = new JButton("");
		crearBotonesClasico(panel9,btn9_8,8,7,4,9);
		
		btn9_9 = new JButton("");
		crearBotonesClasico(panel9,btn9_9,9,8,4,9);
		
		btn9_10 = new JButton("");
		crearBotonesClasico(panel9,btn9_10,10,9,4,9);
		
		btn9_11 = new JButton("");
		crearBotonesClasico(panel9,btn9_11,11,10,4,9);
		
		btn9_12 = new JButton("");
		crearBotonesClasico(panel9,btn9_12,12,11,4,9);
		
		btn9_13 = new JButton("");
		crearBotonesClasico(panel9,btn9_13,13,12,4,9);
		
		btn9_14 = new JButton("");
		crearBotonesClasico(panel9,btn9_14,14,13,4,9);
		
		btn9_15 = new JButton("");
		crearBotonesClasico(panel9,btn9_15,15,14,4,9);
		
		btn9_16 = new JButton("");
		crearBotonesClasico(panel9,btn9_16,16,15,4,9);
		
		btn9_17 = new JButton("");
		crearBotonesClasico(panel9,btn9_17,17,16,4,9);
		btn9.addActionListener(new MyListener());
		btn9_2.addActionListener(new MyListener());
		btn9_3.addActionListener(new MyListener());
		btn9_4.addActionListener(new MyListener());
		btn9_5.addActionListener(new MyListener());
		btn9_6.addActionListener(new MyListener());
		btn9_7.addActionListener(new MyListener());
		btn9_8.addActionListener(new MyListener());
		btn9_9.addActionListener(new MyListener());
		btn9_10.addActionListener(new MyListener());
		btn9_11.addActionListener(new MyListener());
		btn9_12.addActionListener(new MyListener());
		btn9_13.addActionListener(new MyListener());
		btn9_14.addActionListener(new MyListener());
		btn9_15.addActionListener(new MyListener());
		btn9_16.addActionListener(new MyListener());
		btn9_17.addActionListener(new MyListener());
		btn9_2.setName("2");
		btn9_3.setName("3");
		btn9_4.setName("4");
		btn9_5.setName("5");
		btn9_6.setName("6");
		btn9_7.setName("7");
		btn9_8.setName("8");
		btn9_9.setName("9");
		btn9_10.setName("10");
		btn9_11.setName("11");
		btn9_12.setName("12");
		btn9_13.setName("13");
		btn9_14.setName("14");
		btn9_15.setName("15");
		btn9_16.setName("16");
		btn9_17.setName("17");
		panel10 = new JLayeredPane();
		panel10.setForeground(new Color(0, 128, 0));
		panel10.setBackground(new Color(0, 128, 0));
		panel10.setLayout(null);
		GridBagConstraints gbc_panel10 = new GridBagConstraints();
		gbc_panel10.gridheight = 5;
		gbc_panel10.fill = GridBagConstraints.BOTH;
		gbc_panel10.insets = new Insets(0, 0, 0, 5);
		gbc_panel10.gridx = 5;
		gbc_panel10.gridy = 1;
		getContentPane().add(panel10, gbc_panel10);
		
		btn10 = new JButton("");
		
		crearBotonesClasico(panel10,btn10,1,0,5,10);
		
		btn10.setName("1");
		btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(0).getImage())));
		
		btn10_2 = new JButton("");
		btn10_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(1).getImage())));
		crearBotonesClasico(panel10,btn10_2,2,1,5,10);
		
		btn10_3 = new JButton("");
		btn10_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(2).getImage())));
		crearBotonesClasico(panel10,btn10_3,3,2,5,10);
		
		btn10_4 = new JButton("");
		btn10_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(3).getImage())));
		crearBotonesClasico(panel10,btn10_4,4,3,5,10);
		
		btn10_5 = new JButton("");
		btn10_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(4).getImage())));
		crearBotonesClasico(panel10,btn10_5,5,4,5,10);
		
		btn10_6 = new JButton("");
		crearBotonesClasico(panel10,btn10_6,6,5,5,10);
		
		btn10_7 = new JButton("");
		crearBotonesClasico(panel10,btn10_7,7,6,5,10);
		
		btn10_8 = new JButton("");
		crearBotonesClasico(panel10,btn10_8,8,7,5,10);
		
		btn10_9 = new JButton("");
		crearBotonesClasico(panel10,btn10_9,9,8,5,10);
		
		btn10_10 = new JButton("");
		crearBotonesClasico(panel10,btn10_10,10,9,5,10);
		
		btn10_11 = new JButton("");
		crearBotonesClasico(panel10,btn10_11,11,10,5,10);
		
		btn10_12 = new JButton("");
		crearBotonesClasico(panel10,btn10_12,12,11,5,10);
		
		btn10_13 = new JButton("");
		crearBotonesClasico(panel10,btn10_13,13,12,5,10);
		
		btn10_14 = new JButton("");
		crearBotonesClasico(panel10,btn10_14,14,13,5,10);
		
		btn10_15 = new JButton("");
		crearBotonesClasico(panel10,btn10_15,15,14,5,10);
		
		btn10_16 = new JButton("");
		crearBotonesClasico(panel10,btn10_16,16,15,5,10);
		
		btn10_17 = new JButton("");
		crearBotonesClasico(panel10,btn10_17,17,16,5,10);
		
		btn10_18 = new JButton("");
		crearBotonesClasico(panel10,btn10_18,18,17,5,10);
		btn10_2.setName("2");
		btn10_3.setName("3");
		btn10_4.setName("4");
		btn10_5.setName("5");
		btn10_6.setName("6");
		btn10_7.setName("7");
		btn10_8.setName("8");
		btn10_9.setName("9");
		btn10_10.setName("10");
		btn10_11.setName("11");
		btn10_12.setName("12");
		btn10_13.setName("13");
		btn10_14.setName("14");
		btn10_15.setName("15");
		btn10_16.setName("16");
		btn10_17.setName("17");
		btn10_18.setName("18");
		btn10.addActionListener(new MyListener());
		btn10_2.addActionListener(new MyListener());
		btn10_3.addActionListener(new MyListener());
		btn10_4.addActionListener(new MyListener());
		btn10_5.addActionListener(new MyListener());
		btn10_6.addActionListener(new MyListener());
		btn10_7.addActionListener(new MyListener());
		btn10_8.addActionListener(new MyListener());
		btn10_9.addActionListener(new MyListener());
		btn10_10.addActionListener(new MyListener());
		btn10_11.addActionListener(new MyListener());
		btn10_12.addActionListener(new MyListener());
		btn10_13.addActionListener(new MyListener());
		btn10_14.addActionListener(new MyListener());
		btn10_15.addActionListener(new MyListener());
		btn10_16.addActionListener(new MyListener());
		btn10_17.addActionListener(new MyListener());
		btn10_18.addActionListener(new MyListener());
		panel11 = new JLayeredPane();
		panel11.setForeground(new Color(0, 128, 0));
		panel11.setBackground(new Color(0, 128, 0));
		panel11.setLayout(null);
		GridBagConstraints gbc_panel11 = new GridBagConstraints();
		gbc_panel11.gridheight = 5;
		gbc_panel11.fill = GridBagConstraints.BOTH;
		gbc_panel11.insets = new Insets(0, 0, 0, 5);
		gbc_panel11.gridx = 6;
		gbc_panel11.gridy = 1;
		getContentPane().add(panel11, gbc_panel11);
		
		btn11 = new JButton("");
		crearBotonesClasico(panel11,btn11,1,0,6,11);
		
		btn11.setName("1");
		
		btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(0).getImage())));
		
		btn11_2 = new JButton("");
		btn11_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(1).getImage())));
		
		crearBotonesClasico(panel11,btn11_2,2,1,6,11);
		
		btn11_3 = new JButton("");
		
		btn11_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(2).getImage())));
		crearBotonesClasico(panel11,btn11_3,3,2,6,11);
		
		btn11_4 = new JButton("");
		
		btn11_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(3).getImage())));
		crearBotonesClasico(panel11,btn11_4,4,3,6,11);
		
		btn11_5 = new JButton("");
		btn11_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(4).getImage())));
		crearBotonesClasico(panel11,btn11_5,5,4,6,11);
		
		btn11_6 = new JButton("");
		btn11_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(5).getImage())));
		crearBotonesClasico(panel11,btn11_6,6,5,6,11);
	
		btn11_7 = new JButton("");
		crearBotonesClasico(panel11,btn11_7,7,6,6,11);
		
		btn11_8 = new JButton("");
		crearBotonesClasico(panel11,btn11_8,8,7,6,11);
		
		btn11_9 = new JButton("");
		crearBotonesClasico(panel11,btn11_9,9,8,6,11);
		
		btn11_10 = new JButton("");
		crearBotonesClasico(panel11,btn11_10,10,9,6,11);
		
		btn11_11 = new JButton("");
		crearBotonesClasico(panel11,btn11_11,11,10,6,11);
		
		btn11_12 = new JButton("");
		crearBotonesClasico(panel11,btn11_12,12,11,6,11);
		
		btn11_13 = new JButton("");
		crearBotonesClasico(panel11,btn11_13,13,12,6,11);
		
		btn11_14 = new JButton("");
		crearBotonesClasico(panel11,btn11_14,14,13,6,11);
		
		btn11_15 = new JButton("");
		crearBotonesClasico(panel11,btn11_15,15,14,6,11);
		
		btn11_16 = new JButton("");
		crearBotonesClasico(panel11,btn11_16,16,15,6,11);
		
		btn11_17 = new JButton("");
		crearBotonesClasico(panel11,btn11_17,17,16,6,11);
		
		btn11_18 = new JButton("");
		crearBotonesClasico(panel11,btn11_18,18,17,6,11);
		
		btn11_19 = new JButton("");
		crearBotonesClasico(panel11,btn11_19,19,18,6,11);
		btn11_2.setName("2");
		btn11_3.setName("3");
		btn11_4.setName("4");
		btn11_5.setName("5");
		btn11_6.setName("6");
		btn11_7.setName("7");
		btn11_8.setName("8");
		btn11_9.setName("9");
		btn11_10.setName("10");
		btn11_11.setName("11");
		btn11_12.setName("12");
		btn11_13.setName("13");
		btn11_14.setName("14");
		btn11_15.setName("15");
		btn11_16.setName("16");
		btn11_17.setName("17");
		btn11_18.setName("18");
		btn11_19.setName("19");
		btn11.addActionListener(new MyListener());
		btn11_2.addActionListener(new MyListener());
		btn11_3.addActionListener(new MyListener());
		btn11_4.addActionListener(new MyListener());
		btn11_5.addActionListener(new MyListener());
		btn11_6.addActionListener(new MyListener());
		btn11_7.addActionListener(new MyListener());
		btn11_8.addActionListener(new MyListener());
		btn11_9.addActionListener(new MyListener());
		btn11_10.addActionListener(new MyListener());
		btn11_11.addActionListener(new MyListener());
		btn11_12.addActionListener(new MyListener());
		btn11_13.addActionListener(new MyListener());
		btn11_14.addActionListener(new MyListener());
		btn11_15.addActionListener(new MyListener());
		btn11_16.addActionListener(new MyListener());
		btn11_17.addActionListener(new MyListener());
		btn11_18.addActionListener(new MyListener());
		btn11_19.addActionListener(new MyListener());		
		
		panel12 = new JLayeredPane();
		panel12.setForeground(new Color(0, 128, 0));
		panel12.setBackground(new Color(0, 128, 0));
		panel12.setLayout(null);
		GridBagConstraints gbc_panel12 = new GridBagConstraints();
		gbc_panel12.ipadx = 2;
		gbc_panel12.weightx = 2.0;
		gbc_panel12.insets = new Insets(0, 0, 5, 5);
		gbc_panel12.gridheight = 5;
		gbc_panel12.fill = GridBagConstraints.BOTH;
		gbc_panel12.gridx = 8;
		gbc_panel12.gridy = 1;
		getContentPane().add(panel12, gbc_panel12);
		
		btn12 = new JButton("");
		btn12.setName("1");
		btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(0).getImage())));
		crearBotonesClasico(panel12,btn12,1,0,7,11);
		btn12.addActionListener(new MyListener());
		
		btn12_2 = new JButton("");
		btn12_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(1).getImage())));
		crearBotonesClasico(panel12,btn12_2,2,1,7,11);
		btn12_3 = new JButton("");
		btn12_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(2).getImage())));
		crearBotonesClasico(panel12,btn12_3,3,2,7,11);
		btn12_4 = new JButton("");
		btn12_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(3).getImage())));
		crearBotonesClasico(panel12,btn12_4,4,3,7,11);
		btn12_5 = new JButton("");
		btn12_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(4).getImage())));
		crearBotonesClasico(panel12,btn12_5,5,4,7,11);
		btn12_6 = new JButton("");
		btn12_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(5).getImage())));
		crearBotonesClasico(panel12,btn12_6,6,5,7,11);
		btn12_7 = new JButton("");
		btn12_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(6).getImage())));
		crearBotonesClasico(panel12,btn12_7,7,6,7,11);
		btn12_8 = new JButton("");
		crearBotonesClasico(panel12,btn12_8,8,7,7,11);
		btn12_9 = new JButton("");
		crearBotonesClasico(panel12,btn12_9,9,8,7,11);
		btn12_10 = new JButton("");
		crearBotonesClasico(panel12,btn12_10,10,9,7,11);
		btn12_11 = new JButton("");
		crearBotonesClasico(panel12,btn12_11,11,10,7,11);
		btn12_12 = new JButton("");
		crearBotonesClasico(panel12,btn12_12,12,11,7,11);
		btn12_13 = new JButton("");
		crearBotonesClasico(panel12,btn12_13,13,12,7,11);
		btn12_14 = new JButton("");
		crearBotonesClasico(panel12,btn12_14,14,13,7,11);
		btn12_15 = new JButton("");
		crearBotonesClasico(panel12,btn12_15,15,14,7,11);
		btn12_16 = new JButton("");
		crearBotonesClasico(panel12,btn12_16,16,15,7,11);
		btn12_17 = new JButton("");
		crearBotonesClasico(panel12,btn12_17,17,16,7,11);
		btn12_18 = new JButton("");
		crearBotonesClasico(panel12,btn12_18,18,17,7,11);
		btn12_19 = new JButton("");
		crearBotonesClasico(panel12,btn12_19,19,18,7,11);
		btn12_20 = new JButton("");
		crearBotonesClasico(panel12,btn12_20,20,19,7,11);
		btn12_2.setName("2");
		btn12_3.setName("3");
		btn12_4.setName("4");
		btn12_5.setName("5");
		btn12_6.setName("6");
		btn12_7.setName("7");
		btn12_8.setName("8");
		btn12_9.setName("9");
		btn12_10.setName("10");
		btn12_11.setName("11");
		btn12_12.setName("12");
		btn12_13.setName("13");
		btn12_14.setName("14");
		btn12_15.setName("15");
		btn12_16.setName("16");
		btn12_17.setName("17");
		btn12_18.setName("18");
		btn12_19.setName("19");
		btn12_20.setName("20");
		btn12.addActionListener(new MyListener());
		btn12_2.addActionListener(new MyListener());
		btn12_3.addActionListener(new MyListener());
		btn12_4.addActionListener(new MyListener());
		btn12_5.addActionListener(new MyListener());
		btn12_6.addActionListener(new MyListener());
		btn12_7.addActionListener(new MyListener());
		btn12_8.addActionListener(new MyListener());
		btn12_9.addActionListener(new MyListener());
		btn12_10.addActionListener(new MyListener());
		btn12_11.addActionListener(new MyListener());
		btn12_12.addActionListener(new MyListener());
		btn12_13.addActionListener(new MyListener());
		btn12_14.addActionListener(new MyListener());
		btn12_15.addActionListener(new MyListener());
		btn12_16.addActionListener(new MyListener());
		btn12_17.addActionListener(new MyListener());
		btn12_18.addActionListener(new MyListener());
		btn12_19.addActionListener(new MyListener());		
		btn12_20.addActionListener(new MyListener());	
		
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
		
		menuBar.add(mntmAyuda);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1024, 1024);
		setVisible(true);
	}
	public void crearBotonesClasico(JLayeredPane pano,JButton button,int i,int dimension,int cartas,int pila) {
		if(i==1) {
			y = 0;

		}
		
		
		pano.setLayer(button, dimension);
		button.setBounds(0, y, 105, 115);
		button.setBackground(new Color(0, 128, 0));
		button.setForeground(new Color(0, 128, 0));
		pano.add(button);
		if(i>cartas)
			button.setVisible(false);
		y+=30;
	}
	public void actualizarImagenes() {
		if(Pilas.get(1).numCartas()==0) {
			btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));

		}
		if(Pilas.get(1).numCartas()!=0) { 
		btn1.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(1).getCarta().getRuta())));
		}
		if(Pilas.get(2).numCartas()==0) {
			btn2.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));

		}
		if(Pilas.get(2).numCartas()!=0) { 
			btn2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(2).getCarta().getRuta())));
		}
		if(Pilas.get(3).numCartas()==0) {
			btn3.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));

		}
		if(Pilas.get(3).numCartas()!=0) { 
			btn3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(3).getCarta().getRuta())));
		}
		if(Pilas.get(4).numCartas()==0) {
			btn4.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));

		}
		if(Pilas.get(4).numCartas()!=0) { 
			btn4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(4).getCarta().getRuta())));
		}
		if(Pilas.get(5).numCartas()==0) {
			btn5.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));

		}
		if(Pilas.get(5).numCartas()!=0) { 
			btn5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(5).getCarta().getRuta())));
		}
		if(Pilas.get(6).numCartas()==0) {
			btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
	
		}
		if(Pilas.get(6).numCartas()!=0) { 
			btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCarta().getRuta())));
		}
		if(Pilas.get(7).numCartas()==0) {
			btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
	
		}
		if(Pilas.get(7).numCartas()!=0) { 
			btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCarta().getRuta())));
		}
		if(Pilas.get(8).numCartas()==0) {
			btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
	
		}
		if(Pilas.get(8).numCartas()!=0) { 
			btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCarta().getRuta())));
		}
		if(Pilas.get(9).numCartas()==0) {
			btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
	
		}
		if(Pilas.get(9).numCartas()!=0) { 
			btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCarta().getRuta())));
		}
		if(Pilas.get(10).numCartas()==0) {
			btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
	
		}
		if(Pilas.get(10).numCartas()!=0) { 
			btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCarta().getRuta())));
		}
		if(Pilas.get(11).numCartas()==0) {
			btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
	
		}
		if(Pilas.get(11).numCartas()!=0) { 
			btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCarta().getRuta())));
		}
		if(Pilas.get(12).numCartas()==0) {
			btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
	
		}
		if(Pilas.get(12).numCartas()!=0) { 
			btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCarta().getRuta())));
		}
	}
	
	private class MyListener implements ActionListener{
		public void	actionPerformed(ActionEvent e){
			//por ahora solo esta codificado las acciones del boton 3, añadir las de los demas, las de los botones 2-5 son identicas a las de este, para los demas habra que añadir un if(?)
				if(e.getSource() == btn2 || e.getSource() == btn3 ||e.getSource() == btn4 || e.getSource() == btn5) {
					String numero = ((JButton) e.getSource()).getName();
					int i = Integer.parseInt(numero);
					
					//codificar movimiento a la pila del palo
					if(Pilas.get(i).numCartas()==0) {
						if(seleccionada.getNum()=='A') {
							Pilas.get(i).addCarta(seleccionada);
							Pilas.get(getPilaSeleccionada()).eliminarCarta();
							
							actualizarImagenes();
							
						}
					}
					else {
						if (seleccionada.movimientoAMonton(Pilas.get(i).getCarta())) {
							Pilas.get(i).addCarta(seleccionada);
							Pilas.get(getPilaSeleccionada()).eliminarCarta();
							
							actualizarImagenes();
							
						}
					}
					seleccionada = new Carta('0','0',false,"0");
				}
				else if(e.getSource() == btn6 || e.getSource() == btn7 ||e.getSource() == btn8 || e.getSource() == btn9 ||e.getSource() == btn10 || e.getSource() == btn11 ||e.getSource() == btn12) {
					String numero = ((JButton) e.getSource()).getName();
					int i = Integer.parseInt(numero);
					if(Pilas.get(i).numCartas()==0) {
						if(seleccionada.getNum()=='K') {
							Pilas.get(i).addCarta(seleccionada);
							Pilas.get(getPilaSeleccionada()).eliminarCarta();
							
							actualizarImagenes();
							setPilaSeleccionada(0);
						}	
					}
					else if(seleccionada.getNum()=='0') {
						seleccionada = new Carta(Pilas.get(i).getCarta().getNum(),Pilas.get(i).getCarta().getPalo(),Pilas.get(i).getCarta().getBack(),Pilas.get(i).getCarta().getRuta());
						setPilaSeleccionada(i);
					}
					
					else if(seleccionada.movimientoPila(Pilas.get(i).getCarta())) {
						Pilas.get(i).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
							
						actualizarImagenes();
						seleccionada = new Carta('0','0',false,"0");
						setPilaSeleccionada(0);
					}
		
					else {
						if (Pilas.get(i).numCartas()!=0) {
							
							seleccionada = new Carta(Pilas.get(i).getCarta().getNum(),Pilas.get(i).getCarta().getPalo(),Pilas.get(i).getCarta().getBack(),Pilas.get(i).getCarta().getRuta());
							setPilaSeleccionada(i);
						}
					}
				
				}	
				
			
			}
		}
}

