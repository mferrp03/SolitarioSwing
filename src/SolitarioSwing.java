import javax.swing.JFrame;
import javax.swing.filechooser.*;
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
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.util.ArrayList;
public class SolitarioSwing extends JFrame {
	File file;
	JFileChooser fc = new JFileChooser();
	private Carta seleccionada = new Carta ('0','0',false,"0");
	int pilaSeleccionada = 0;
	int numBtn = 0;
	ArrayList<char[]>movimientos;
	int oMov = -1;//pila de origen del ultimo movimiento
	int dMov = -1;//pila de destino del ultimo movimiento
	int tipo = 0;//sera 1 para el solitario clasico y 2 para el de saltos
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
	JButton e1;
	JButton e2;
	JButton e3;
	JButton e4;
	JButton e5;
	JButton e6;
	JButton e7;
	JButton e8;
	JButton e9;
	JButton e10;
	JButton e11;
	JButton e12;
	JButton e13;
	JButton e14;
	JButton e15;
	JButton e16;
	JButton e17;
	JButton e18;
	JButton e19;
	JButton e20;
	JButton e21;
	JButton e22;
	JButton e23;
	JButton e24;
	JButton e25;
	JButton e26;
	JButton e27;
	JButton e28;
	JButton e29;
	JButton e30;
	JButton e31;
	JButton e32;
	JButton e33;
	JButton e34;
	JButton e35;
	JButton e36;
	JButton e37;
	JButton e38;
	JButton e39;
	JButton e40;
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
	JPanel panel_2;
	JPanel panel_3;
	JPanel panel_4;
	JPanel panel_9;
	JPanel panel_1;
	JPanel panel_5;
	JPanel panel_6;
	JPanel panel_7;
	JPanel panel_8;
	JPanel panel_20;
	JPanel panel_21;
	JPanel panel_19;
	JPanel panel_18;
	JPanel panel_17;
	JPanel panel_16;
	JPanel panel_15;
	JPanel panel_14;
	JPanel panel_13;
	JPanel panel_12;
	JPanel panel_11;
	JPanel panel_10;
	JPanel panel_22;
	JPanel panel_23;
	JPanel panel_24;
	JPanel panel_25;
	JPanel panel_26;
	JPanel panel_27;
	JPanel panel_28;
	JPanel panel_29;
	JPanel panel_30;
	JPanel panel_31;
	JPanel panel_32;
	JPanel panel_33;
	JPanel panel_34;
	JPanel panel_35;
	JPanel panel_36;
	JPanel panel_37;
	JPanel panel_38;
	JPanel panel_39;
	JPanel panel_40;
	ArrayList<Pila>Pilas;
	
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
	Pila pila;
	Pila pila1;
	Pila pila2;
	Pila pila3;
	Pila pila4;	
	Pila pila5;
	Pila pila6;
	Pila pila7;
	Pila pila8;
	Pila pila9;
	Pila pila10;
	Pila pila11;
	Pila pila12;
	Pila pila13;
	Pila pila14;
	Pila pila15;
	Pila pila16;
	Pila pila17;
	Pila pila18;
	Pila pila19;	
	Pila pila20;
	Pila pila21;
	Pila pila22;
	Pila pila23 ;
	Pila pila24;
	Pila pila25;
	Pila pila26;
	Pila pila27;
	Pila pila28;
	Pila pila29;
	Pila pila30;
	Pila pila31;
	Pila pila32;
	Pila pila33;
	Pila pila34;	
	Pila pila35;
	Pila pila36;
	Pila pila37;
	Pila pila38;
	Pila pila39 ;
	Pila pila40;
	public static void main(String[] args) {
		new SolitarioSwing();
	}
	int getPilaSeleccionada(){
		return pilaSeleccionada;
	}
	void setPilaSeleccionada(int n) {
		pilaSeleccionada = n;
	}
	int getNumBtn(){
		return numBtn;
	}
	void setNumBtn(int n) {
		numBtn = n;
	}
	public SolitarioSwing() { 

		getContentPane().setBackground(new Color(0, 128, 0));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		getContentPane().setBackground(new Color(0, 128, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenu mnNuevo = new JMenu("Nuevo");
		mnArchivo.add(mnNuevo);
		
		JMenuItem mntmSolitarioClasico = new JMenuItem("Solitario Clasico");
		mnNuevo.add(mntmSolitarioClasico);
		
		JMenuItem mntmSolitarioDeSaltos = new JMenuItem("Solitario de Saltos");
		mnNuevo.add(mntmSolitarioDeSaltos);

		JMenuItem mntmCargar = new JMenuItem("Cargar");
		mnArchivo.add(mntmCargar);

		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setEnabled(false);
		mnArchivo.add(mntmSalvar);

		JMenuItem mntmSalvarComo = new JMenuItem("Salvar como");
		mntmSalvarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO filechooser guardar como movidas
				int returnVal = fc.showOpenDialog(getContentPane());
				
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						file = fc.getSelectedFile();
				}
			}
		});
		mnArchivo.add(mntmSalvarComo);

		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
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
		mntmSolitarioClasico.addActionListener(new ListenerClasico());
		mntmSolitarioDeSaltos.addActionListener(new ListenerNuevoSaltos());
		mntmAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Para realizar el solitario hay que...");
			}
		});
		mntmResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tipo == 1) {
					primerMovimientoClasico();
					System.out.println("solitario resuelto\n");
				}
				if(tipo == 2) {
					int i = 0;
					while(i<40) {
					
							if (i > 0) {
								if(i > 2) {
									if (primerSalto(Pilas.get(i).getLargo(),i)){
										Pilas.get(Pilas.get(i).getLargo()).addCarta(Pilas.get(i).getCarta());
										Pilas.get(i).eliminarCarta();
										if(Pilas.get(i).numCartas()==0) {
											desplazarSaltos(i);
										}
										i=0;	
									}
							
									else if(primerSalto(Pilas.get(i).getCorto(),i)) {
										Pilas.get(Pilas.get(i).getCorto()).addCarta(Pilas.get(i).getCarta());
										Pilas.get(i).eliminarCarta();
										if(Pilas.get(i).numCartas()==0) {
											desplazarSaltos(i);
										}
										i=0;	
									}
									else
										i++;
									
								}
							else if	(primerSalto(Pilas.get(i).getCorto(),i)){
								Pilas.get(Pilas.get(i).getCorto()).addCarta(Pilas.get(i).getCarta());
								Pilas.get(i).eliminarCarta();
								if(Pilas.get(i).numCartas()==0) {
									desplazarSaltos(i);
								}
									i=0;
								}
							else
								i++;
							}
						else
							i++;
						
					}
					actualizarBotonesSaltos();
				}
			}
		});
		
		menuBar.add(mntmAyuda);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1024, 768);
		setVisible(true);
	}
	public boolean movimientoRepetido(Carta carta,int origen,int destino) {
		boolean repetido = false;
		
		if(carta == seleccionada && destino == oMov && origen == dMov) {
			repetido = true;
		}
		return repetido;
	}
	public void primerMovimientoClasico() {// TODO se forman ciclos de 3 movimientos que previenen el bucle de acabarse nunca
		//TODO Cuando se le da a resolver sin haber hecho nada antes entra en un bucle infinito frecuentemente, cuando se vacia la baraja sin hacer ningun movimiento suele 
		//salir un 13 que da out of bound, otras veces sale un -1 y a veces el programa no saca mas cartas del mazo, solo trabaja con las cartas que ya han sido sacadas
		
		//parece que el bucle infinito se produce cuando no se puede hacer ningun movimiento, sin embargo si lo resuelve el programa e intento que lo vuelva a resolver
		//no da problemas
		boolean stop = false;
		int i = 0;
		boolean pila1 = true;
		while(i<= 12 && !stop) {
			for(int n = 6;n<=12;n++) {
				if(Pilas.get(n).numCartas()>0)
					Pilas.get(n).getCarta().setBack(false);
			}
		if(Pilas.get(1).numCartas()>0 && pila1) {
			i = 2;
			while(i<=5 && i>0) {
				if(Pilas.get(1).getCarta().getNum()=='A') {
					if(Pilas.get(i).numCartas()==0) {
						if(movimientoRepetido(Pilas.get(1).getCarta(),1,i))
							stop=true;
						else {
							seleccionada = Pilas.get(1).getCarta();
							oMov = 1;
							dMov = i;		
							Pilas.get(i).addCarta(Pilas.get(1).getCarta());
							Pilas.get(1).eliminarCarta();
							i=0;
						}
					}
					else {
						i++;
					}
						
				}
					else {
						if(Pilas.get(i).numCartas()>0) {
							if(Pilas.get(1).getCarta().movimientoAMonton(Pilas.get(i).getCarta())) {
								if(movimientoRepetido(Pilas.get(1).getCarta(),1,i))
								stop=true;
								else {
									seleccionada = Pilas.get(1).getCarta();
									oMov = 1;
									dMov = i;
									Pilas.get(i).addCarta(Pilas.get(1).getCarta());
									Pilas.get(1).eliminarCarta();
									i=0;
								}
							
							}
							else {
								i++;
							}
						}
						else {
							i++;
						}
						
					}
				}
				while(i>=6) {
					if(i==13) {
						stop=true;
					}
					else if(Pilas.get(1).getCarta().getNum()=='K') {
						if(Pilas.get(i).numCartas()==0) {//TODO llega un 13 hasta aqui
							if(movimientoRepetido(Pilas.get(1).getCarta(),1,i)) {
								i=0;
								stop=true;
							}
							else {
								seleccionada = Pilas.get(1).getCarta();
								oMov = 1;
								dMov = i;
								Pilas.get(i).addCarta(Pilas.get(1).getCarta());
								Pilas.get(1).eliminarCarta();
								i=0;
							}
							
						}
						else {
							i++;
						}
						
					}
					else {
						if(Pilas.get(i).numCartas()>0) {
						if(Pilas.get(1).getCarta().movimientoPila(Pilas.get(i).getCarta())) {
							if(movimientoRepetido(Pilas.get(1).getCarta(),1,i)) {
								stop=true;
								i=0;
							}
							else {
								seleccionada = Pilas.get(1).getCarta();
								oMov = 1;
								dMov = i;
								Pilas.get(i).addCarta(Pilas.get(1).getCarta());
								Pilas.get(1).eliminarCarta();
								i=0;
							}
						}
							else {
								i++;
								if(i == 13) {
									i=0;
									pila1=false;
								}
							}
						}
						else {
							i++;
							if(i == 13) {
								i=0;
								pila1=false;
							}
						}
					}
				}
			}
		else {
			pila1=false;
			i=6;
			int j = 2;
			while(i>=6 && i<13) {
				if(j<6 && j>= 2 ) {
					//TODO a veces llega un 13
					
					if(Pilas.get(i).numCartas()>0) {
						if(Pilas.get(i).getCarta().getNum()=='A' && Pilas.get(j).numCartas()==0) {
							Pilas.get(j).addCarta(Pilas.get(i).getCarta());
							Pilas.get(i).eliminarCarta();
							i=0;
						}
						else {
							if(Pilas.get(j).numCartas()>0) {
								if(Pilas.get(i).getCarta().movimientoAMonton(Pilas.get(j).getCarta())) { 
									Pilas.get(j).addCarta(Pilas.get(i).getCarta());
									Pilas.get(i).eliminarCarta();
									i=0;
								}
								else {
									j++;
								}
							
							}
							else {
								j++;
							}
						}
						
					}
					else if((Pilas.get(i).numCartas()==0)){
						i++;
					}
					if(j==6) {
						if(i==12) {
							i=6;
							j=7;
						}
						else {
							j=2;
							i++;
						}
					}
					
				}
				else {
					if(j==i)
						j++;
			
					if(j==13) {
						if(i!=13) {
							i++;
							j=2;
						}
						if(i==13)
							stop=true;
						
					}
					if(i==13) {//TODO esto es lo que genera un bucle infinito, el stop de arriba deberia arreglarlo
						i=0;
					}
					
					else {
						int k = 0;
						
						while(k<Pilas.get(i).numCartas() && k>=0 && !stop)  {
							if(j==13) {
								i++;
								j=6;
								if(i==13) {
									stop=true;
								}
								i=6;//esto deberia arreglar el 13
								
							}
							if(Pilas.get(i).getCarta().getNum()=='K') {
								// TODO Llega un 13 aqui de alguna manera
								if(Pilas.get(j).numCartas()==0) {
									if(movimientoRepetido(Pilas.get(i).getCarta(),i,j)) {
										k=-1;
										i=0;
										stop=true;
									}
									else {
										seleccionada = Pilas.get(i).getCarta();
										oMov = i;
										dMov = j;
										Pilas.get(j).addCarta(Pilas.get(i).getCarta());
										Pilas.get(i).eliminarCarta();
										i=0;
										k=-1;
									}
								}
								else {
									k++;
									if(k == Pilas.get(i).numCartas()) {
										j++;
										k=0;
									}
								}
							}
							else {
								if(Pilas.get(i).numCartas()>0 && Pilas.get(j).numCartas()>0) {
									if(Pilas.get(i).getCartaN(k).movimientoPila(Pilas.get(j).getCarta()) && Pilas.get(i).getCartaN(k).getBack()==false) {
										int aux;
										if(movimientoRepetido(Pilas.get(i).getCartaN(k),i,j)) {
										stop=true;
										k=-1;
										i=0;
									}
									else {
										seleccionada = Pilas.get(i).getCarta();
										oMov = i;
										dMov = j;
										for (aux = k;aux<Pilas.get(i).numCartas();aux++) {
											Pilas.get(j).addCarta(Pilas.get(i).getCartaN(aux));
										}
										for(aux = k;aux<Pilas.get(i).numCartas();aux++) {
											Pilas.get(i).eliminarCarta();
										}
										k=-1;
										i=0;
									}
								}
								else {//TODO Esto deberia arreglar el -1
										k++;
									}
								}
								else {
									k++;
								}
							}
						}
						
						if(k==Pilas.get(i).numCartas()) {
							j++;
							k=0;
						}
						if(j==13) {
							i++;
							j=6;
							
						}
						if(i==13 || stop) {//pasar carta del mazo al monton si ningun otro movimiento es posible
							if(Pilas.get(0).numCartas()>0) {
								Pilas.get(1).addCarta(Pilas.get(0).getCarta());
								Pilas.get(0).eliminarCarta();
								i=0;
								stop=false;
							}
							else {
								stop=true;
								i=0;
							}
						}
					}
					
				}
				}
				
			
		}
		if(i==13 || stop) {//pasar carta del mazo al monton si ningun otro movimiento es posible
			if(Pilas.get(0).numCartas()>0) {
				Pilas.get(1).addCarta(Pilas.get(0).getCarta());
				Pilas.get(0).eliminarCarta();
				i=0;
				stop=false;
			}
			else {
				stop=true;
				i=0;
			}
		}
		}
		actualizarImagenes();

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
			btn6_2.setVisible(false);
			btn6_3.setVisible(false);
			btn6_4.setVisible(false);
			btn6_5.setVisible(false);
			btn6_6.setVisible(false);
			btn6_7.setVisible(false);
			btn6_8.setVisible(false);
			btn6_9.setVisible(false);
			btn6_10.setVisible(false);
			btn6_11.setVisible(false);
			btn6_12.setVisible(false);
			btn6_13.setVisible(false);
			btn6_14.setVisible(false);
	
		}
		if(Pilas.get(6).numCartas()!=0) { 
			btn6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(0).getImage())));
			if(Pilas.get(6).numCartas()>1) {
				btn6_2.setVisible(true);
				btn6_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(1).getImage())));
			}
			else {
				btn6_2.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>2) {
				btn6_3.setVisible(true);
				btn6_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(2).getImage())));
			}
			else {
				btn6_3.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>3) {
				btn6_4.setVisible(true);
				btn6_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(3).getImage())));
			}
			else {
				btn6_4.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>4) {
				btn6_5.setVisible(true);
				btn6_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(4).getImage())));
			}
			else {
				btn6_5.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>5) {
				btn6_6.setVisible(true);
				btn6_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(5).getImage())));
			}
			else {
				btn6_6.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>6) {
				btn6_7.setVisible(true);
				btn6_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(6).getImage())));
			}
			else {
				btn6_7.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>7) {
				btn6_8.setVisible(true);
				btn6_8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(7).getImage())));
			}
			else {
				btn6_8.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>8) {
				btn6_9.setVisible(true);
				btn6_9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(8).getImage())));
			}
			else {
				btn6_9.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>9) {
				btn6_10.setVisible(true);
				btn6_10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(9).getImage())));
			}
			else {
				btn6_10.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>10) {
				btn6_11.setVisible(true);
				btn6_11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(10).getImage())));
			}
			else {
				btn6_11.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>11) {
				btn6_12.setVisible(true);
				btn6_12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(11).getImage())));
			}
			else {
				btn6_12.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>12) {
				btn6_13.setVisible(true);
				btn6_13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(12).getImage())));
			}
			else {
				btn6_13.setVisible(false);
			}
			if(Pilas.get(6).numCartas()>13) {
				btn6_14.setVisible(true);
				btn6_14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCartaN(13).getImage())));
			}
			else {
				btn6_14.setVisible(false);
			}
		}
		if(Pilas.get(7).numCartas()==0) {
			btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
			btn7_2.setVisible(false);
			btn7_3.setVisible(false);
			btn7_4.setVisible(false);
			btn7_5.setVisible(false);
			btn7_6.setVisible(false);
			btn7_7.setVisible(false);
			btn7_8.setVisible(false);
			btn7_9.setVisible(false);
			btn7_10.setVisible(false);
			btn7_11.setVisible(false);
			btn7_12.setVisible(false);
			btn7_13.setVisible(false);
			btn7_14.setVisible(false);
			btn7_15.setVisible(false);
	
		}
		if(Pilas.get(7).numCartas()!=0) { 
			btn7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(0).getImage())));
			if(Pilas.get(7).numCartas()>1) {
				btn7_2.setVisible(true);
				btn7_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(1).getImage())));
			}
			else {
				btn7_2.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>2) {
				btn7_3.setVisible(true);
				btn7_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(2).getImage())));
			}
			else {
				btn7_3.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>3) {
				btn7_4.setVisible(true);
				btn7_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(3).getImage())));
			}
			else {
				btn7_4.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>4) {
				btn7_5.setVisible(true);
				btn7_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(4).getImage())));
			}
			else {
				btn7_5.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>5) {
				btn7_6.setVisible(true);
				btn7_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(5).getImage())));
			}
			else {
				btn7_6.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>6) {
				btn7_7.setVisible(true);
				btn7_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(6).getImage())));
			}
			else {
				btn7_7.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>7) {
				btn7_8.setVisible(true);
				btn7_8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(7).getImage())));
			}
			else {
				btn7_8.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>8) {
				btn7_9.setVisible(true);
				btn7_9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(8).getImage())));
			}
			else {
				btn7_9.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>9) {
				btn7_10.setVisible(true);
				btn7_10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(9).getImage())));
			}
			else {
				btn7_10.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>10) {
				btn7_11.setVisible(true);
				btn7_11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(10).getImage())));
			}
			else {
				btn7_11.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>11) {
				btn7_12.setVisible(true);
				btn7_12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(11).getImage())));
			}
			else {
				btn7_12.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>12) {
				btn7_13.setVisible(true);
				btn7_13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(12).getImage())));
			}
			else {
				btn7_13.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>13) {
				btn7_14.setVisible(true);
				btn7_14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(13).getImage())));
			}
			else {
				btn7_14.setVisible(false);
			}
			if(Pilas.get(7).numCartas()>14) {
				btn7_15.setVisible(true);
				btn7_15.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCartaN(14).getImage())));
			}
			else {
				btn7_15.setVisible(false);
			}
		}
		if(Pilas.get(8).numCartas()==0) {
			btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
			btn8_2.setVisible(false);
			btn8_3.setVisible(false);
			btn8_4.setVisible(false);
			btn8_5.setVisible(false);
			btn8_6.setVisible(false);
			btn8_7.setVisible(false);
			btn8_8.setVisible(false);
			btn8_9.setVisible(false);
			btn8_10.setVisible(false);
			btn8_11.setVisible(false);
			btn8_12.setVisible(false);
			btn8_13.setVisible(false);
			btn8_14.setVisible(false);
			btn8_15.setVisible(false);
			btn8_16.setVisible(false);
	
		}
		if(Pilas.get(8).numCartas()!=0) { 
			btn8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(0).getImage())));
			if(Pilas.get(8).numCartas()>1) {
				btn8_2.setVisible(true);
				btn8_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(1).getImage())));
			}
			else {
				btn8_2.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>2) {
				btn8_3.setVisible(true);
				
				btn8_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(2).getImage())));
			}
			else {
				btn8_3.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>3) {
				btn8_4.setVisible(true);
				btn8_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(3).getImage())));
			}
			else {
				btn8_4.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>4) {
				btn8_5.setVisible(true);
				btn8_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(4).getImage())));
			}
			else {
				btn8_5.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>5) {
				btn8_6.setVisible(true);
				btn8_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(5).getImage())));
			}
			else {
				btn8_6.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>6) {
				btn8_7.setVisible(true);
				btn8_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(6).getImage())));
			}
			else {
				btn8_7.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>7) {
				btn8_8.setVisible(true);
				btn8_8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(7).getImage())));
			}
			else {
				btn8_8.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>8) {
				btn8_9.setVisible(true);
				btn8_9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(8).getImage())));
			}
			else {
				btn8_9.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>9) {
				btn8_10.setVisible(true);
				btn8_10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(9).getImage())));
			}
			else {
				btn8_10.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>10) {
				btn8_11.setVisible(true);
				btn8_11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(10).getImage())));
			}
			else {
				btn8_11.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>11) {
				btn8_12.setVisible(true);
				btn8_12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(11).getImage())));
			}
			else {
				btn8_12.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>12) {
				btn8_13.setVisible(true);
				btn8_13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(12).getImage())));
			}
			else {
				btn8_13.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>13) {
				btn8_14.setVisible(true);
				btn8_14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(13).getImage())));
			}
			
			else {
				btn8_14.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>14) {
				btn8_15.setVisible(true);
				btn8_15.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(14).getImage())));
			}
			else {
				btn8_15.setVisible(false);
			}
			if(Pilas.get(8).numCartas()>15) {
				btn8_16.setVisible(true);
				btn8_16.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCartaN(15).getImage())));
			}
			else {
				btn8_16.setVisible(false);
			}
		}
		if(Pilas.get(9).numCartas()==0) {
			btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
			btn9_2.setVisible(false);
			btn9_3.setVisible(false);
			btn9_4.setVisible(false);
			btn9_5.setVisible(false);
			btn9_6.setVisible(false);
			btn9_7.setVisible(false);
			btn9_8.setVisible(false);
			btn9_9.setVisible(false);
			btn9_10.setVisible(false);
			btn9_11.setVisible(false);
			btn9_12.setVisible(false);
			btn9_13.setVisible(false);
			btn9_14.setVisible(false);
			btn9_15.setVisible(false);
			btn9_16.setVisible(false);
			btn9_17.setVisible(false);
		}
		if(Pilas.get(9).numCartas()!=0) { 
			btn9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(0).getImage())));
			if(Pilas.get(9).numCartas()>1) {
				btn9_2.setVisible(true);
				btn9_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(1).getImage())));
			}
			else {
				btn9_2.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>2) {
				btn9_3.setVisible(true);
				
				btn9_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(2).getImage())));
			}
			else {
				btn9_3.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>3) {
				btn9_4.setVisible(true);
				btn9_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(3).getImage())));
			}
			else {
				btn9_4.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>4) {
				btn9_5.setVisible(true);
				btn9_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(4).getImage())));
			}
			else {
				btn9_5.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>5) {
				btn9_6.setVisible(true);
				btn9_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(5).getImage())));
			}
			else {
				btn9_6.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>6) {
				btn9_7.setVisible(true);
				btn9_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(6).getImage())));
			}
			else {
				btn9_7.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>7) {
				btn9_8.setVisible(true);
				btn9_8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(7).getImage())));
			}
			else {
				btn9_8.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>8) {
				btn9_9.setVisible(true);
				btn9_9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(8).getImage())));
			}
			else {
				btn9_9.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>9) {
				btn9_10.setVisible(true);
				btn9_10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(9).getImage())));
			}
			else {
				btn9_10.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>10) {
				btn9_11.setVisible(true);
				btn9_11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(10).getImage())));
			}
			else {
				btn9_11.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>11) {
				btn9_12.setVisible(true);
				btn9_12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(11).getImage())));
			}
			else {
				btn9_12.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>12) {
				btn9_13.setVisible(true);
				btn9_13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(12).getImage())));
			}
			else {
				btn9_13.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>13) {
				btn9_14.setVisible(true);
				btn9_14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(13).getImage())));
			}
			else {
				btn9_14.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>14) {
				btn9_15.setVisible(true);
				btn9_15.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(14).getImage())));
			}
			else {
				btn9_15.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>15) {
				btn9_16.setVisible(true);
				btn9_16.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(15).getImage())));
			}
			else {
				btn9_16.setVisible(false);
			}
			if(Pilas.get(9).numCartas()>16) {
				btn9_17.setVisible(true);
				btn9_17.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCartaN(16).getImage())));
			}
			else {
				btn9_17.setVisible(false);
			}
		}
		if(Pilas.get(10).numCartas()==0) {
			btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
			btn10_2.setVisible(false);
			btn10_3.setVisible(false);
			btn10_4.setVisible(false);
			btn10_5.setVisible(false);
			btn10_6.setVisible(false);
			btn10_7.setVisible(false);
			btn10_8.setVisible(false);
			btn10_9.setVisible(false);
			btn10_10.setVisible(false);
			btn10_11.setVisible(false);
			btn10_12.setVisible(false);
			btn10_13.setVisible(false);
			btn10_14.setVisible(false);
			btn10_15.setVisible(false);
			btn10_16.setVisible(false);
			btn10_17.setVisible(false);
			btn10_18.setVisible(false);
	
		}
		if(Pilas.get(10).numCartas()!=0) { 
			btn10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(0).getImage())));
			if(Pilas.get(10).numCartas()>1) {
				btn10_2.setVisible(true);
				btn10_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(1).getImage())));
			}
			else {
				btn10_2.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>2) {
				btn10_3.setVisible(true);
				
				btn10_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(2).getImage())));
			}
			else {
				btn10_3.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>3) {
				btn10_4.setVisible(true);
				btn10_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(3).getImage())));
			}
			else {
				btn10_4.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>4) {
				btn10_5.setVisible(true);
				btn10_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(4).getImage())));
			}
			else {
				btn10_5.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>5) {
				btn10_6.setVisible(true);
				btn10_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(5).getImage())));
			}
			else {
				btn10_6.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>6) {
				btn10_7.setVisible(true);
				btn10_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(6).getImage())));
			}
			else {
				btn10_7.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>7) {
				btn10_8.setVisible(true);
				btn10_8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(7).getImage())));
			}
			else {
				btn10_8.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>8) {
				btn10_9.setVisible(true);
				btn10_9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(8).getImage())));
			}
			else {
				btn10_9.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>9) {
				btn10_10.setVisible(true);
				btn10_10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(9).getImage())));
			}
			else {
				btn10_10.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>10) {
				btn10_11.setVisible(true);
				btn10_11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(10).getImage())));
			}
			else {
				btn10_11.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>11) {
				btn10_12.setVisible(true);
				btn10_12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(11).getImage())));
			}
			else {
				btn10_12.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>12) {
				btn10_13.setVisible(true);
				btn10_13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(12).getImage())));
			}
			else {
				btn10_13.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>13) {
				btn10_14.setVisible(true);
				btn10_14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(13).getImage())));
			}
			else {
				btn10_14.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>14) {
				btn10_15.setVisible(true);
				btn10_15.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(14).getImage())));
			}
			else {
				btn10_15.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>15) {
				btn10_16.setVisible(true);
				btn10_16.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(15).getImage())));
			}
			else {
				btn10_16.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>16) {
				btn10_17.setVisible(true);
				btn10_17.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(16).getImage())));
			}
			else {
				btn10_18.setVisible(false);
			}
			if(Pilas.get(10).numCartas()>17) {
				btn10_18.setVisible(true);
				btn10_18.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCartaN(17).getImage())));
			}
			else {
				btn10_18.setVisible(false);
			}
		}
		if(Pilas.get(11).numCartas()==0) {
			btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
			btn11_2.setVisible(false);
			btn11_3.setVisible(false);
			btn11_4.setVisible(false);
			btn11_5.setVisible(false);
			btn11_6.setVisible(false);
			btn11_7.setVisible(false);
			btn11_8.setVisible(false);
			btn11_9.setVisible(false);
			btn11_10.setVisible(false);
			btn11_11.setVisible(false);
			btn11_12.setVisible(false);
			btn11_13.setVisible(false);
			btn11_14.setVisible(false);
			btn11_15.setVisible(false);
			btn11_16.setVisible(false);
			btn11_17.setVisible(false);
			btn11_18.setVisible(false);
			btn11_19.setVisible(false);
	
		}
		if(Pilas.get(11).numCartas()!=0) { 
			btn11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(0).getImage())));
			if(Pilas.get(11).numCartas()>1) {
				btn11_2.setVisible(true);
				btn11_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(1).getImage())));
			}
			else {
				btn11_2.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>2) {
				btn11_3.setVisible(true);
				
				btn11_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(2).getImage())));
			}
			else {
				btn11_3.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>3) {
				btn11_4.setVisible(true);
				btn11_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(3).getImage())));
			}
			else {
				btn11_4.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>4) {
				btn11_5.setVisible(true);
				btn11_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(4).getImage())));
			}
			else {
				btn11_5.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>5) {
				btn11_6.setVisible(true);
				btn11_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(5).getImage())));
			}
			else {
				btn11_6.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>6) {
				btn11_7.setVisible(true);
				btn11_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(6).getImage())));
			}
			else {
				btn11_7.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>7) {
				btn11_8.setVisible(true);
				btn11_8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(7).getImage())));
			}
			else {
				btn11_8.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>8) {
				btn11_9.setVisible(true);
				btn11_9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(8).getImage())));
			}
			else {
				btn11_9.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>9) {
				btn11_10.setVisible(true);
				btn11_10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(9).getImage())));
			}
			else {
				btn11_10.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>10) {
				btn11_11.setVisible(true);
				btn11_11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(10).getImage())));
			}
			else {
				btn11_11.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>11) {
				btn11_12.setVisible(true);
				btn11_12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(11).getImage())));
			}
			else {
				btn11_12.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>12) {
				btn11_13.setVisible(true);
				btn11_13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(12).getImage())));
			}
			else {
				btn11_13.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>13) {
				btn11_14.setVisible(true);
				btn11_14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(13).getImage())));
			}
			else {
				btn11_14.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>14) {
				btn11_15.setVisible(true);
				btn11_15.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(14).getImage())));
			}
			else {
				btn11_15.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>15) {
				btn11_16.setVisible(true);
				btn11_16.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(15).getImage())));
			}
			else {
				btn11_16.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>16) {
				btn11_17.setVisible(true);
				btn11_17.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(16).getImage())));
			}
			else {
				btn11_17.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>17) {
				btn11_18.setVisible(true);
				btn11_18.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(17).getImage())));
			}
			else {
				btn11_18.setVisible(false);
			}
			if(Pilas.get(11).numCartas()>18) {
				btn11_19.setVisible(true);
				btn11_19.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCartaN(18).getImage())));
			}
			else {
				btn11_19.setVisible(false);
			}
		}
		if(Pilas.get(12).numCartas()==0) {
			btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource("/Images/107016_75.gif")));
			btn12_2.setVisible(false);
			btn12_3.setVisible(false);
			btn12_4.setVisible(false);
			btn12_5.setVisible(false);
			btn12_6.setVisible(false);
			btn12_7.setVisible(false);
			btn12_8.setVisible(false);
			btn12_9.setVisible(false);
			btn12_10.setVisible(false);
			btn12_11.setVisible(false);
			btn12_12.setVisible(false);
			btn12_13.setVisible(false);
			btn12_14.setVisible(false);
			btn12_15.setVisible(false);
			btn12_16.setVisible(false);
			btn12_17.setVisible(false);
			btn12_18.setVisible(false);
			btn12_19.setVisible(false);
		}
		if(Pilas.get(12).numCartas()!=0) { 
			btn12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(0).getImage())));
			if(Pilas.get(12).numCartas()>1) {
				btn12_2.setVisible(true);
				btn12_2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(1).getImage())));
			}
			else {
				btn12_2.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>2) {
				btn12_3.setVisible(true);
				
				btn12_3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(2).getImage())));
			}else {
				btn12_3.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>3) {
				btn12_4.setVisible(true);
				btn12_4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(3).getImage())));
			}
			else {
				btn12_4.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>4) {
				btn12_5.setVisible(true);
				btn12_5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(4).getImage())));
			}
			else {
				btn12_5.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>5) {
				btn12_6.setVisible(true);
				btn12_6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(5).getImage())));
			}
			else {
				btn12_6.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>6) {
				btn12_7.setVisible(true);
				btn12_7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(6).getImage())));
			}
			else {
				btn12_7.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>7) {
				btn12_8.setVisible(true);
				btn12_8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(7).getImage())));
			}
			else {
				btn12_8.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>8) {
				btn12_9.setVisible(true);
				btn12_9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(8).getImage())));
			}
			else {
				btn12_9.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>9) {
				btn12_10.setVisible(true);
				btn12_10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(9).getImage())));
			}
			else {
				btn12_10.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>10) {
				btn12_11.setVisible(true);
				btn12_11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(10).getImage())));
			}
			else {
				btn12_11.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>11) {
				btn12_12.setVisible(true);
				btn12_12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(11).getImage())));
			}
			else {
				btn12_12.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>12) {
				btn12_13.setVisible(true);
				btn12_13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(12).getImage())));
			}
			else {
				btn12_13.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>13) {
				btn12_14.setVisible(true);
				btn12_14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(13).getImage())));
			}
			else {
				btn12_14.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>14) {
				btn12_15.setVisible(true);
				btn12_15.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(14).getImage())));
			}
			else {
				btn12_15.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>15) {
				btn12_16.setVisible(true);
				btn12_16.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(15).getImage())));
			}
			else {
				btn12_16.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>16) {
				btn12_17.setVisible(true);
				btn12_17.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(16).getImage())));
			}
			else {
				btn12_17.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>17) {
				btn12_18.setVisible(true);
				btn12_18.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(17).getImage())));
			}
			else {
				btn12_18.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>18) {
				btn12_19.setVisible(true);
				btn12_19.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(18).getImage())));
			}
			else {
				btn12_19.setVisible(false);
			}
			if(Pilas.get(12).numCartas()>19) {
				btn12_19.setVisible(true);
				btn12_20.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCartaN(19).getImage())));
			}
		}
	}
	
	private class ListenerSaltos implements ActionListener{
		public void	actionPerformed(ActionEvent e){
			int boton = 0;
			boton = Integer.parseInt(((JButton) e.getSource()).getName());

			
			if(getPilaSeleccionada()==-1) {
				seleccionada = new Carta(Pilas.get(boton-1).getCarta().getNum(),Pilas.get(boton-1).getCarta().getPalo(),Pilas.get(boton-1).getCarta().getBack(),Pilas.get(boton-1).getCarta().getRuta());
				setPilaSeleccionada(boton-1);
				setNumBtn(boton);
			}
			else if(primerSalto(boton-1,getPilaSeleccionada())  && (Pilas.get(boton-1)).saltoPosible(Pilas.get(getPilaSeleccionada())) && ((boton-1)==Pilas.get(getPilaSeleccionada()).getCorto() || (boton-1) == Pilas.get(getPilaSeleccionada()).getLargo())) {

				Pilas.get(boton-1).addCarta(Pilas.get(getPilaSeleccionada()).getCarta());
				Pilas.get(getPilaSeleccionada()).eliminarCarta();
				if(Pilas.get(getPilaSeleccionada()).numCartas()==0) {
					desplazarSaltos(getPilaSeleccionada());
				}
					
				seleccionada = new Carta('0','0',false,"0");
				setPilaSeleccionada(-1);
				setNumBtn(-1);
			}
			
			
			else{
				seleccionada = new Carta(Pilas.get(boton-1).getCarta().getNum(),Pilas.get(boton-1).getCarta().getPalo(),Pilas.get(boton-1).getCarta().getBack(),Pilas.get(boton-1).getCarta().getRuta());
				setPilaSeleccionada(boton-1);
				setNumBtn(boton);
			}
			actualizarBotonesSaltos();
		
	
		}
	}
	boolean primerSalto(int i, int origen) {
	
		boolean primero = false;
		boolean bucle = true;
		int j = 0;
		int salto = 0;
		while(bucle && j<40) {
		
			
				if(Pilas.get(j).numCartas()>0) {
					if(Pilas.get(j).getLargo()>=0) {
						if(Pilas.get(Pilas.get(j).getLargo()).saltoPosible(Pilas.get(j))) {
							salto = Pilas.get(j).getLargo();
							bucle = false;
						
						}
					}
					
					if(Pilas.get(j).getCorto()>=0 && bucle) {
						if(Pilas.get(Pilas.get(j).getCorto()).saltoPosible(Pilas.get(j))){
							salto =Pilas.get(j).getCorto();//AQUI
							bucle = false;
						}
					}
					}
			if(bucle) {
				j++;
			}
		}
		if(salto==i && origen == j) {
			primero = true;
			
		}
		return primero;
	}
	void desplazarSaltos(int n) {
		for(int i = n;i<Pilas.size();i++) {
			if(Pilas.get(i).getCorto()>=0) {
				while(Pilas.get(Pilas.get(i).getCorto()).numCartas()==0) {
					Pilas.get(i).cambiarCorto();
				}
			}
			
			while(Pilas.get(i).getLargo()>=0 && comprobarLargo(i,Pilas.get(i).getLargo())) {
				Pilas.get(i).cambiarLargo();
			}
			
		}
	}
	boolean comprobarLargo(int i,int largo) {
		boolean cambiar = false;
		int contar = 0;
		for(int j = largo; j < i;j++) {
			if(Pilas.get(j).numCartas()>0)
				contar++;
		}
		if(contar<3) {
			cambiar=true;
		}
		return cambiar;
	}
	private class MyListener implements ActionListener{//Listener principal para el solitario clasico
		public void	actionPerformed(ActionEvent e){
			String[] nombre =((JButton) e.getSource()).getName().split("_");
			int pila = Integer.parseInt(nombre[0]);
			int numero = Integer.parseInt(nombre[1]);
			if(numero == Pilas.get(pila).numCartas() && Pilas.get(pila).getCarta().getBack()) {
				Pilas.get(pila).getCarta().setBack(false);
				((JButton) e.getSource()).setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(pila).getCarta().getImage())));
				seleccionada = new Carta('0','0',false,"0");
			}
			else if(pila<6 && seleccionada.getNum()==Pilas.get(getPilaSeleccionada()).getCarta().getNum() && seleccionada.getPalo()==Pilas.get(getPilaSeleccionada()).getCarta().getPalo()) {
				if(Pilas.get(pila).numCartas()==0) {
					if(seleccionada.getNum()=='A') {
						Pilas.get(pila).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						
						actualizarImagenes();
						
					}
				}
				else {
					if (seleccionada.movimientoAMonton(Pilas.get(pila).getCarta())) {
						Pilas.get(pila).addCarta(seleccionada);
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
						actualizarImagenes();
						seleccionada = new Carta('0','0',false,"0");
					}
				}
			}
			else if(Pilas.get(pila).numCartas()==0) {
				if(seleccionada.getNum()=='K') {
					if(getPilaSeleccionada()!=1) {
					int j = 0;
					for(int i = getNumBtn();i<=Pilas.get(getPilaSeleccionada()).numCartas();i++) {
						Pilas.get(pila).addCarta(Pilas.get(getPilaSeleccionada()).getCartaN(i-1));
						j++;
					}
					for(int i = 0;i<j;i++) {
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
					}
					
				}
					else {
						Pilas.get(pila).addCarta(Pilas.get(getPilaSeleccionada()).getCarta());
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
					}
				}
				
				actualizarImagenes();
				
				setPilaSeleccionada(0);
			}
			else if(seleccionada.movimientoPila(Pilas.get(pila).getCarta())) {
				if(getPilaSeleccionada()==1) {
					Pilas.get(pila).addCarta(seleccionada);
					Pilas.get(getPilaSeleccionada()).eliminarCarta();
				}
				else if(getNumBtn() != Pilas.get(getPilaSeleccionada()).numCartas()) {
					int j = 0;
					
					for(int i = getNumBtn();i<=Pilas.get(getPilaSeleccionada()).numCartas();i++) {
						Pilas.get(pila).addCarta(Pilas.get(getPilaSeleccionada()).getCartaN(i-1));
						j++;
					}
					for(int i = 0;i<j;i++) {
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
					}
					
				}
				
				else {
					int j = 0;
					for(int i = getNumBtn();i<=Pilas.get(getPilaSeleccionada()).numCartas();i++) {
						Pilas.get(pila).addCarta(Pilas.get(getPilaSeleccionada()).getCartaN(i-1));
						j++;
					}
					for(int i = 0;i<j;i++) {
						Pilas.get(getPilaSeleccionada()).eliminarCarta();
					}
					
				}
				actualizarImagenes();
			}
	
	
			else {
				seleccionada = new Carta(Pilas.get(pila).getCartaN(numero-1).getNum(),Pilas.get(pila).getCartaN(numero-1).getPalo(),Pilas.get(pila).getCarta().getBack(),Pilas.get(pila).getCartaN(numero-1).getRuta());
				setPilaSeleccionada(pila);
				setNumBtn(numero);
			}
			
			}
		}
	private class ListenerClasico implements ActionListener{
		public void	actionPerformed(ActionEvent e){
		nuevoClasico();
		}
	}
	private class ListenerNuevoSaltos implements ActionListener{
		public void	actionPerformed(ActionEvent e){
		nuevoSaltos();
		}
	}
	public void actualizarBotonesSaltos() {
		
		if(Pilas.get(0).numCartas()>0) {
			
			e1.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(0).getCarta().getImage()))); 
			 
		}
		if(Pilas.get(0).numCartas()==0) {
			e1.setVisible(false);
		}
		if(Pilas.get(1).numCartas()>0) {
			e2.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(1).getCarta().getImage()))); 
		}
		if(Pilas.get(1).numCartas()==0) {
			e2.setVisible(false);
		}
		if(Pilas.get(2).numCartas()>0) {
			e3.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(2).getCarta().getImage()))); 
		}
		if(Pilas.get(2).numCartas()==0) {
			e3.setVisible(false);
		}
		if(Pilas.get(3).numCartas()>0) {
			e4.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(3).getCarta().getImage()))); 
		}
		if(Pilas.get(3).numCartas()==0) {
			e4.setVisible(false);
		}
		if(Pilas.get(4).numCartas()>0) {
			e5.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(4).getCarta().getImage()))); 
		}
		if(Pilas.get(4).numCartas()==0) {
			e5.setVisible(false);
		}
		if(Pilas.get(5).numCartas()>0) {
			e6.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(5).getCarta().getImage()))); 
		}
		if(Pilas.get(5).numCartas()==0) {
			e6.setVisible(false);
		}
		if(Pilas.get(6).numCartas()>0) {
			e7.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(6).getCarta().getImage()))); 
		}
		if(Pilas.get(6).numCartas()==0) {
			e7.setVisible(false);
		}
		if(Pilas.get(7).numCartas()>0) {
			e8.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(7).getCarta().getImage()))); 
		}
		if(Pilas.get(7).numCartas()==0) {
			e8.setVisible(false);
		}
		if(Pilas.get(8).numCartas()>0) {
			e9.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(8).getCarta().getImage()))); 
		}
		if(Pilas.get(8).numCartas()==0) {
			e9.setVisible(false);
		}
		if(Pilas.get(9).numCartas()>0) {
			e10.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(9).getCarta().getImage()))); 
		}
		if(Pilas.get(9).numCartas()==0) {
			e10.setVisible(false);
		}
		if(Pilas.get(10).numCartas()>0) {
			e11.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(10).getCarta().getImage()))); 
		}
		if(Pilas.get(10).numCartas()==0) {
			e11.setVisible(false);
		}
		if(Pilas.get(11).numCartas()>0) {
			e12.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(11).getCarta().getImage()))); 
		}
		if(Pilas.get(11).numCartas()==0) {
			e12.setVisible(false);
		}
		if(Pilas.get(12).numCartas()>0) {
			e13.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(12).getCarta().getImage()))); 
		}
		if(Pilas.get(12).numCartas()==0) {
			e13.setVisible(false);
		}
		if(Pilas.get(13).numCartas()>0) {
			e14.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(13).getCarta().getImage()))); 
		}
		if(Pilas.get(13).numCartas()==0) {
			e14.setVisible(false);
		}
		if(Pilas.get(14).numCartas()>0) {
			e15.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(14).getCarta().getImage()))); 
		}
		if(Pilas.get(14).numCartas()==0) {
			e15.setVisible(false);
		}
		if(Pilas.get(15).numCartas()>0) {
			e16.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(15).getCarta().getImage()))); 
		}
		if(Pilas.get(15).numCartas()==0) {
			e16.setVisible(false);
		}
		if(Pilas.get(16).numCartas()>0) {
			e17.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(16).getCarta().getImage()))); 
		}
		if(Pilas.get(16).numCartas()==0) {
			e17.setVisible(false);
		}
		if(Pilas.get(17).numCartas()>0) {
			e18.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(17).getCarta().getImage()))); 
		}
		if(Pilas.get(17).numCartas()==0) {
			e18.setVisible(false);
		}
		if(Pilas.get(18).numCartas()>0) {
			e19.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(18).getCarta().getImage()))); 
		}
		if(Pilas.get(18).numCartas()==0) {
			e19.setVisible(false);
		}
		if(Pilas.get(19).numCartas()>0) {
			e20.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(19).getCarta().getImage()))); 
		}
		if(Pilas.get(19).numCartas()==0) {
			e20.setVisible(false);
		}
		if(Pilas.get(20).numCartas()>0) {
			e21.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(20).getCarta().getImage()))); 
		}
		if(Pilas.get(20).numCartas()==0) {
			e21.setVisible(false);
		}
		if(Pilas.get(21).numCartas()>0) {
			e22.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(21).getCarta().getImage()))); 
		}
		if(Pilas.get(21).numCartas()==0) {
			e22.setVisible(false);
		}
		if(Pilas.get(22).numCartas()>0) {
			e23.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(22).getCarta().getImage()))); 
		}
		if(Pilas.get(22).numCartas()==0) {
			e23.setVisible(false);
		}
		if(Pilas.get(23).numCartas()>0) {
			e24.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(23).getCarta().getImage()))); 
		}
		if(Pilas.get(23).numCartas()==0) {
			e24.setVisible(false);
		}
		if(Pilas.get(24).numCartas()>0) {
			e25.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(24).getCarta().getImage()))); 
		}
		if(Pilas.get(24).numCartas()==0) {
			e25.setVisible(false);
		}
		if(Pilas.get(25).numCartas()>0) {
			e26.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(25).getCarta().getImage()))); 
		}
		if(Pilas.get(25).numCartas()==0) {
			e26.setVisible(false);
		}
		if(Pilas.get(26).numCartas()>0) {
			e27.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(26).getCarta().getImage()))); 
		}
		if(Pilas.get(26).numCartas()==0) {
			e27.setVisible(false);
		}
		if(Pilas.get(27).numCartas()>0) {
			e28.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(27).getCarta().getImage()))); 
		}
		if(Pilas.get(27).numCartas()==0) {
			e28.setVisible(false);
		}
		if(Pilas.get(28).numCartas()>0) {
			e29.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(28).getCarta().getImage()))); 
		}
		if(Pilas.get(28).numCartas()==0) {
			e29.setVisible(false);
		}
		if(Pilas.get(29).numCartas()>0) {
			e30.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(29).getCarta().getImage()))); 
		}
		if(Pilas.get(29).numCartas()==0) {
			e30.setVisible(false);
		}
		if(Pilas.get(30).numCartas()>0) {
			e31.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(30).getCarta().getImage()))); 
		}
		if(Pilas.get(30).numCartas()==0) {
			e31.setVisible(false);
		}
		if(Pilas.get(31).numCartas()>0) {
			e32.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(31).getCarta().getImage()))); 
		}
		if(Pilas.get(31).numCartas()==0) {
			e32.setVisible(false);
		}
		if(Pilas.get(32).numCartas()>0) {
			e33.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(32).getCarta().getImage()))); 
		}
		if(Pilas.get(32).numCartas()==0) {
			e33.setVisible(false);
		}
		if(Pilas.get(33).numCartas()>0) {
			e34.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(33).getCarta().getImage()))); 
		}
		if(Pilas.get(33).numCartas()==0) {
			e34.setVisible(false);
		}
		if(Pilas.get(34).numCartas()>0) {
			e35.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(34).getCarta().getImage()))); 
		}
		if(Pilas.get(34).numCartas()==0) {
			e35.setVisible(false);
		}
		if(Pilas.get(35).numCartas()>0) {
			e36.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(35).getCarta().getImage()))); 
		}
		if(Pilas.get(35).numCartas()==0) {
			e36.setVisible(false);
		}
		if(Pilas.get(36).numCartas()>0) {
			e37.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(36).getCarta().getImage()))); 
		}
		if(Pilas.get(36).numCartas()==0) {
			e37.setVisible(false);
		}
		if(Pilas.get(37).numCartas()>0) {
			e38.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(37).getCarta().getImage()))); 
		}
		if(Pilas.get(37).numCartas()==0) {
			e38.setVisible(false);
		}
		if(Pilas.get(38).numCartas()>0) {
			e39.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(38).getCarta().getImage()))); 
		}
		if(Pilas.get(38).numCartas()==0) {
			e39.setVisible(false);
		}
		if(Pilas.get(39).numCartas()>0) {
			e40.setIcon(new ImageIcon(SolitarioSwing.class.getResource(Pilas.get(39).getCarta().getImage()))); 
		}
		if(Pilas.get(39).numCartas()==0) {
			e40.setVisible(false);
		}
	}
	public void nuevoSaltos() {
		movimientos = new ArrayList<char[]>();
		getContentPane().removeAll();
		tipo = 2;
		Pilas = new ArrayList<Pila>();
		pila = new Pila();
		pila1 = new Pila();
		pila2 = new Pila();
		pila3 = new Pila();
		pila4 = new Pila();	
		pila5 = new Pila();
		pila6 = new Pila();
		pila7 = new Pila();
		pila8 = new Pila();
		pila9 = new Pila();
		pila10 = new Pila();
		pila11 = new Pila();
		pila12 = new Pila();
		pila13 = new Pila();
		pila14 = new Pila();
		pila15 = new Pila();
		pila16 = new Pila();
		pila17 = new Pila();
		pila18 = new Pila();
		pila19 = new Pila();	
		pila20 = new Pila();
		pila21 = new Pila();
		pila22 = new Pila();
		pila23 = new Pila();
		pila24= new Pila();
		pila25 = new Pila();
		pila26 = new Pila();
		pila27 = new Pila();
		pila28 = new Pila();
		pila29 = new Pila();
		pila30 = new Pila();
		pila31 = new Pila();
		pila32 = new Pila();
		pila33 = new Pila();
		pila34 = new Pila();	
		pila35 = new Pila();
		pila36 = new Pila();
		pila37 = new Pila();
		pila38 = new Pila();
		pila39 = new Pila();
		pila40 = new Pila();
		
		
		Carta AS = new Carta ('A','S',false,"/Images/espada/1.jpg");
		pila.addCarta(AS);
		Carta DS = new Carta ('2','S',false,"/Images/espada/2.jpg");
		pila.addCarta(DS);
		Carta TS = new Carta ('3','S',false,"/Images/espada/3.jpg");
		pila.addCarta(TS);
		Carta CS = new Carta ('4','S',false,"/Images/espada/4.jpg");
		pila.addCarta(CS);
		Carta CiS = new Carta ('5','S',false,"/Images/espada/5.jpg");
		pila.addCarta(CiS);
		Carta SS = new Carta ('6','S',false,"/Images/espada/6.jpg");
		pila.addCarta(SS);
		Carta SiS = new Carta ('7','S',false,"/Images/espada/7.jpg");
		pila.addCarta(SiS);
		
		Carta DiS = new Carta ('T','S',false,"/Images/espada/10.jpg");
		pila.addCarta(DiS);
		Carta JS = new Carta ('J','S',false,"/Images/espada/11.jpg");
		pila.addCarta(JS);
		
		Carta KS = new Carta ('K','S',false,"/Images/espada/12.jpg");
		pila.addCarta(KS);
		
		Carta AC = new Carta ('A','C',false,"/Images/copa/1.jpg");
		pila.addCarta(AC);
		Carta DC = new Carta ('2','C',false,"/Images/copa/2.jpg");
		pila.addCarta(DC);
		Carta TC = new Carta ('3','C',false,"/Images/copa/3.jpg");;
		pila.addCarta(TC);
		Carta CC = new Carta ('4','C',false,"/Images/copa/4.jpg");
		pila.addCarta(CC);
		Carta CiC = new Carta ('5','C',false,"/Images/copa/5.jpg");
		pila.addCarta(CiC);
		Carta SC = new Carta ('6','C',false,"/Images/copa/6.jpg");
		pila.addCarta(SC);
		Carta SiC = new Carta ('7','C',false,"/Images/copa/7.jpg");
		pila.addCarta(SiC);
		
		Carta DiC = new Carta ('T','C',false,"/Images/copa/10.jpg");
		pila.addCarta(DiC);
		Carta JC = new Carta ('J','C',false,"/Images/copa/11.jpg");
		pila.addCarta(JC);
		Carta KC = new Carta ('K','C',false,"/Images/copa/12.jpg");
		pila.addCarta(KC);
	
		Carta AD = new Carta ('A','D',false,"/Images/oro/1.jpg");
		pila.addCarta(AD);
		Carta DD = new Carta ('2','D',false,"/Images/oro/2.jpg");
		pila.addCarta(DD);
		Carta TD = new Carta ('3','D',false,"/Images/oro/3.jpg");
		pila.addCarta(TD);
		Carta CD = new Carta ('4','D',false,"/Images/oro/4.jpg");
		pila.addCarta(CD);
		Carta CiD = new Carta ('5','D',false,"/Images/oro/5.jpg");
		pila.addCarta(CiD);
		Carta SD = new Carta ('6','D',false,"/Images/oro/6.jpg");
		pila.addCarta(SD);
		Carta SiD = new Carta ('7','D',false,"/Images/oro/7.jpg");
		pila.addCarta(SiD);
		
		Carta DiD = new Carta ('T','D',false,"/Images/oro/10.jpg");
		pila.addCarta(DiD);
		Carta JD = new Carta ('J','D',false,"/Images/oro/11.jpg");
		pila.addCarta(JD);
		
		Carta KD = new Carta ('K','D',false,"/Images/oro/12.jpg");
		pila.addCarta(KD);
	
		Carta AH = new Carta ('A','H',false,"/Images/basto/1.jpg");
		pila.addCarta(AH);
		Carta DH = new Carta ('2','H',false,"/Images/basto/2.jpg");
		pila.addCarta(DH);
		Carta TH = new Carta ('3','H',false,"/Images/basto/3.jpg");
		pila.addCarta(TH);
		Carta CH = new Carta ('4','H',false,"/Images/basto/4.jpg");
		pila.addCarta(CH);
		Carta CiH = new Carta ('5','H',false,"/Images/basto/5.jpg");
		pila.addCarta(CiH);
		Carta SH = new Carta ('6','H',false,"/Images/basto/6.jpg");
		pila.addCarta(SH);
		Carta SiH = new Carta ('7','H',false,"/Images/basto/7.jpg");
		pila.addCarta(SiH);
		
		Carta DiH = new Carta ('T','H',false,"/Images/basto/10.jpg");
		pila.addCarta(DiH);
		Carta JH = new Carta ('J','H',false,"/Images/basto/11.jpg");
		pila.addCarta(JH);
		
		Carta KH = new Carta ('K','H',false,"/Images/basto/12.jpg");
		pila.addCarta(KH);
		
		pila.barajar();
		
		pila1.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila2.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila3.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila4.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila5.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila6.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila7.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila8.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila9.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila10.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila11.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila12.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila13.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila14.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila15.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila16.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila17.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila18.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila19.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila20.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila21.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila22.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila23.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila24.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila25.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila26.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila27.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila28.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila29.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila30.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila31.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila32.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila33.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila34.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila35.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila36.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila37.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila38.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila39.addCarta(pila.getCarta());
		pila.eliminarCarta();
		pila40.addCarta(pila.getCarta());
		pila.eliminarCarta();
		
		Pilas.add(pila1);
		Pilas.add(pila2);
		Pilas.add(pila3);
		Pilas.add(pila4);
		Pilas.add(pila5);
		Pilas.add(pila6);
		Pilas.add(pila7);
		Pilas.add(pila8);
		Pilas.add(pila9);
		Pilas.add(pila10);
		Pilas.add(pila11);
		Pilas.add(pila12);
		Pilas.add(pila13);
		Pilas.add(pila14);
		Pilas.add(pila15);
		Pilas.add(pila16);
		Pilas.add(pila17);
		Pilas.add(pila18);
		Pilas.add(pila19);
		Pilas.add(pila20);
		Pilas.add(pila21);
		Pilas.add(pila22);
		Pilas.add(pila23);
		Pilas.add(pila24);
		Pilas.add(pila25);
		Pilas.add(pila26);
		Pilas.add(pila27);
		Pilas.add(pila28);
		Pilas.add(pila29);
		Pilas.add(pila30);
		Pilas.add(pila31);
		Pilas.add(pila32);
		Pilas.add(pila33);
		Pilas.add(pila34);
		Pilas.add(pila35);
		Pilas.add(pila36);
		Pilas.add(pila37);
		Pilas.add(pila38);
		Pilas.add(pila39);
		Pilas.add(pila40);
		setPilaSeleccionada(-1);
		
		
		panel_9 = new JPanel();
		panel_9.setForeground(new Color(0, 128, 0));
		panel_9.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 5);
		gbc_panel_9.gridx = 9;
		gbc_panel_9.gridy = 0;
		getContentPane().add(panel_9, gbc_panel_9);
		
		 e9 = new JButton("");
		 e9.setName("9");
		e9.setBackground(new Color(0, 128, 0));
		e9.setForeground(new Color(0, 128, 0));
		panel_9.add(e9);
		
		panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 128, 0));
		panel_1.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		getContentPane().add(panel_1, gbc_panel_1);
		
		e1 = new JButton("");
		e1.setName("1");
		e1.setForeground(new Color(0, 128, 0));
		e1.setBackground(new Color(0, 128, 0));
		panel_1.add(e1);
		
		 panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 0));
		panel_2.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 0;
		getContentPane().add(panel_2, gbc_panel_2);
		
		e2 = new JButton("");
		e2.setName("2");
		e2.setBackground(new Color(0, 128, 0));
		e2.setForeground(new Color(0, 128, 0));
		panel_2.add(e2);
		
		 panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 128, 0));
		panel_3.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 3;
		gbc_panel_3.gridy = 0;
		getContentPane().add(panel_3, gbc_panel_3);
		
		e3 = new JButton("");
		e3.setName("3");
		e3.setBackground(new Color(0, 128, 0));
		e3.setForeground(new Color(0, 128, 0));
		panel_3.add(e3);
		
		 panel_4 = new JPanel();
		panel_4.setForeground(new Color(0, 128, 0));
		panel_4.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 4;
		gbc_panel_4.gridy = 0;
		getContentPane().add(panel_4, gbc_panel_4);
		
		e4 = new JButton("");
		e4.setName("4");
		e4.setBackground(new Color(0, 128, 0));
		e4.setForeground(new Color(0, 128, 0));
		panel_4.add(e4);
		
		 panel_5 = new JPanel();
		panel_5.setForeground(new Color(0, 128, 0));
		panel_5.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.gridx = 5;
		gbc_panel_5.gridy = 0;
		getContentPane().add(panel_5, gbc_panel_5);
		
		 e5 = new JButton("");
		 e5.setName("5");
		e5.setForeground(new Color(0, 128, 0));
		e5.setBackground(new Color(0, 128, 0));
		panel_5.add(e5);
		
		 panel_6 = new JPanel();
		panel_6.setForeground(new Color(0, 128, 0));
		panel_6.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 5, 5);
		gbc_panel_6.gridx = 6;
		gbc_panel_6.gridy = 0;
		getContentPane().add(panel_6, gbc_panel_6);
		
		 e6 = new JButton("");
		 e6.setName("6");
		e6.setForeground(new Color(0, 128, 0));
		e6.setBackground(new Color(0, 128, 0));
		panel_6.add(e6);
		
		 panel_7 = new JPanel();
		panel_7.setForeground(new Color(0, 128, 0));
		panel_7.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.gridx = 7;
		gbc_panel_7.gridy = 0;
		getContentPane().add(panel_7, gbc_panel_7);
		
		 e7 = new JButton("");
		 e7.setName("7");
		e7.setBackground(new Color(0, 128, 0));
		e7.setForeground(new Color(0, 128, 0));
		panel_7.add(e7);
		
		 panel_8 = new JPanel();
		panel_8.setForeground(new Color(0, 128, 0));
		panel_8.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 5);
		gbc_panel_8.gridx = 8;
		gbc_panel_8.gridy = 0;
		getContentPane().add(panel_8, gbc_panel_8);
		
		 e8 = new JButton("");
		 e8.setName("8");
		e8.setForeground(new Color(0, 128, 0));
		e8.setBackground(new Color(0, 128, 0));
		panel_8.add(e8);
		
		 panel_10 = new JPanel();
		panel_10.setForeground(new Color(0, 128, 0));
		panel_10.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 5);
		gbc_panel_10.gridx = 10;
		gbc_panel_10.gridy = 0;
		getContentPane().add(panel_10, gbc_panel_10);
		
		 e10 = new JButton("");
		 e10.setName("10");
		e10.setBackground(new Color(0, 128, 0));
		e10.setForeground(new Color(0, 128, 0));
		panel_10.add(e10);
		
		 panel_20 = new JPanel();
		panel_20.setForeground(new Color(0, 128, 0));
		panel_20.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_20 = new GridBagConstraints();
		gbc_panel_20.insets = new Insets(0, 0, 5, 5);
		gbc_panel_20.gridx = 10;
		gbc_panel_20.gridy = 1;
		getContentPane().add(panel_20, gbc_panel_20);
		
		 e20 = new JButton("");
		 e20.setName("20");
		e20.setBackground(new Color(0, 128, 0));
		e20.setForeground(new Color(0, 128, 0));
		panel_20.add(e20);
		
		 panel_11 = new JPanel();
		panel_11.setForeground(new Color(0, 128, 0));
		panel_11.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 5);
		gbc_panel_11.gridx = 1;
		gbc_panel_11.gridy = 1;
		getContentPane().add(panel_11, gbc_panel_11);
		
		 e11 = new JButton("");
		 e11.setName("11");
		e11.setForeground(new Color(0, 128, 0));
		e11.setBackground(new Color(0, 128, 0));
		panel_11.add(e11);
		
		 panel_12 = new JPanel();
		panel_12.setForeground(new Color(0, 128, 0));
		panel_12.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 5, 5);
		gbc_panel_12.gridx = 2;
		gbc_panel_12.gridy = 1;
		getContentPane().add(panel_12, gbc_panel_12);
		
		 e12 = new JButton("");
		 e12.setName("12");
		e12.setForeground(new Color(0, 128, 0));
		e12.setBackground(new Color(0, 128, 0));
		panel_12.add(e12);
		
		 panel_13 = new JPanel();
		panel_13.setForeground(new Color(0, 128, 0));
		panel_13.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.insets = new Insets(0, 0, 5, 5);
		gbc_panel_13.gridx = 3;
		gbc_panel_13.gridy = 1;
		getContentPane().add(panel_13, gbc_panel_13);
		
		 e13 = new JButton("");
		 e13.setName("13");
		e13.setBackground(new Color(0, 128, 0));
		e13.setForeground(new Color(0, 128, 0));
		panel_13.add(e13);
		
		 panel_14 = new JPanel();
		panel_14.setForeground(new Color(0, 128, 0));
		panel_14.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 0, 5, 5);
		gbc_panel_14.gridx = 4;
		gbc_panel_14.gridy = 1;
		getContentPane().add(panel_14, gbc_panel_14);
		
		 e14 = new JButton("");
		 e14.setName("14");
		e14.setForeground(new Color(0, 128, 0));
		e14.setBackground(new Color(0, 128, 0));
		panel_14.add(e14);
		
		 panel_15 = new JPanel();
		panel_15.setForeground(new Color(0, 128, 0));
		panel_15.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.insets = new Insets(0, 0, 5, 5);
		gbc_panel_15.gridx = 5;
		gbc_panel_15.gridy = 1;
		getContentPane().add(panel_15, gbc_panel_15);
		
		 e15 = new JButton("");
		 e15.setName("15");
		e15.setForeground(new Color(0, 128, 0));
		e15.setBackground(new Color(0, 128, 0));
		panel_15.add(e15);
		
		 panel_16 = new JPanel();
		panel_16.setForeground(new Color(0, 128, 0));
		panel_16.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.insets = new Insets(0, 0, 5, 5);
		gbc_panel_16.gridx = 6;
		gbc_panel_16.gridy = 1;
		getContentPane().add(panel_16, gbc_panel_16);
		
		 e16 = new JButton("");
		 e16.setName("16");
		e16.setForeground(new Color(0, 128, 0));
		e16.setBackground(new Color(0, 128, 0));
		panel_16.add(e16);
		
		 panel_17 = new JPanel();
		panel_17.setForeground(new Color(0, 128, 0));
		panel_17.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.insets = new Insets(0, 0, 5, 5);
		gbc_panel_17.gridx = 7;
		gbc_panel_17.gridy = 1;
		getContentPane().add(panel_17, gbc_panel_17);
		
		 e17 = new JButton("");
		 e17.setName("17");
		e17.setBackground(new Color(0, 128, 0));
		e17.setForeground(new Color(0, 128, 0));
		panel_17.add(e17);
		
		 panel_18 = new JPanel();
		panel_18.setForeground(new Color(0, 128, 0));
		panel_18.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.insets = new Insets(0, 0, 5, 5);
		gbc_panel_18.gridx = 8;
		gbc_panel_18.gridy = 1;
		getContentPane().add(panel_18, gbc_panel_18);
		
		 e18 = new JButton("");
		 e18.setName("18");
		e18.setForeground(new Color(0, 128, 0));
		e18.setBackground(new Color(0, 128, 0));
		panel_18.add(e18);
		
		 panel_19 = new JPanel();
		panel_19.setForeground(new Color(0, 128, 0));
		panel_19.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_19 = new GridBagConstraints();
		gbc_panel_19.insets = new Insets(0, 0, 5, 5);
		gbc_panel_19.gridx = 9;
		gbc_panel_19.gridy = 1;
		getContentPane().add(panel_19, gbc_panel_19);
		
		 e19 = new JButton("");
		 e19.setName("19");
		e19.setBackground(new Color(0, 128, 0));
		e19.setForeground(new Color(0, 128, 0));
		panel_19.add(e19);
		
		 panel_21 = new JPanel();
		panel_21.setForeground(new Color(0, 128, 0));
		panel_21.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_21 = new GridBagConstraints();
		gbc_panel_21.insets = new Insets(0, 0, 5, 5);
		gbc_panel_21.gridx = 1;
		gbc_panel_21.gridy = 2;
		getContentPane().add(panel_21, gbc_panel_21);
		
		 e21 = new JButton("");
		 e21.setName("21");
		e21.setForeground(new Color(0, 128, 0));
		e21.setBackground(new Color(0, 128, 0));
		panel_21.add(e21);
		
		 panel_22 = new JPanel();
		panel_22.setForeground(new Color(0, 128, 0));
		panel_22.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.insets = new Insets(0, 0, 5, 5);
		gbc_panel_22.gridx = 2;
		gbc_panel_22.gridy = 2;
		getContentPane().add(panel_22, gbc_panel_22);
		
		 e22 = new JButton("");
		 e22.setName("22");
		e22.setForeground(new Color(0, 128, 0));
		e22.setBackground(new Color(0, 128, 0));
		panel_22.add(e22);
		
		 panel_23 = new JPanel();
		panel_23.setForeground(new Color(0, 128, 0));
		panel_23.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_23 = new GridBagConstraints();
		gbc_panel_23.insets = new Insets(0, 0, 5, 5);
		gbc_panel_23.gridx = 3;
		gbc_panel_23.gridy = 2;
		getContentPane().add(panel_23, gbc_panel_23);
		
		 e23 = new JButton("");
		 e23.setName("23");
		e23.setBackground(new Color(0, 128, 0));
		e23.setForeground(new Color(0, 128, 0));
		panel_23.add(e23);
		
		 panel_24 = new JPanel();
		panel_24.setForeground(new Color(0, 128, 0));
		panel_24.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_24 = new GridBagConstraints();
		gbc_panel_24.insets = new Insets(0, 0, 5, 5);
		gbc_panel_24.gridx = 4;
		gbc_panel_24.gridy = 2;
		getContentPane().add(panel_24, gbc_panel_24);
		
		 e24 = new JButton("");
		 e24.setName("24");
		e24.setBackground(new Color(0, 128, 0));
		e24.setForeground(new Color(0, 128, 0));
		panel_24.add(e24);
		
		 panel_25 = new JPanel();
		panel_25.setForeground(new Color(0, 128, 0));
		panel_25.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_25 = new GridBagConstraints();
		gbc_panel_25.insets = new Insets(0, 0, 5, 5);
		gbc_panel_25.gridx = 5;
		gbc_panel_25.gridy = 2;
		getContentPane().add(panel_25, gbc_panel_25);
		
		 e25 = new JButton("");
		 e25.setName("25");
		e25.setForeground(new Color(0, 128, 0));
		e25.setBackground(new Color(0, 128, 0));
		panel_25.add(e25);
		
		 panel_26 = new JPanel();
		panel_26.setForeground(new Color(0, 128, 0));
		panel_26.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_26 = new GridBagConstraints();
		gbc_panel_26.insets = new Insets(0, 0, 5, 5);
		gbc_panel_26.gridx = 6;
		gbc_panel_26.gridy = 2;
		getContentPane().add(panel_26, gbc_panel_26);
		
		 e26 = new JButton("");
		 e26.setName("26");
		e26.setBackground(new Color(0, 128, 0));
		e26.setForeground(new Color(0, 128, 0));
		panel_26.add(e26);
		
		 panel_27 = new JPanel();
		panel_27.setBackground(new Color(0, 128, 0));
		panel_27.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_27 = new GridBagConstraints();
		gbc_panel_27.insets = new Insets(0, 0, 5, 5);
		gbc_panel_27.gridx = 7;
		gbc_panel_27.gridy = 2;
		getContentPane().add(panel_27, gbc_panel_27);
		
		 e27 = new JButton("");
		 e27.setName("27");
		e27.setForeground(new Color(0, 128, 0));
		e27.setBackground(new Color(0, 128, 0));
		panel_27.add(e27);
		
		 panel_28 = new JPanel();
		panel_28.setForeground(new Color(0, 128, 0));
		panel_28.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_28 = new GridBagConstraints();
		gbc_panel_28.insets = new Insets(0, 0, 5, 5);
		gbc_panel_28.gridx = 8;
		gbc_panel_28.gridy = 2;
		getContentPane().add(panel_28, gbc_panel_28);
		
		 e28 = new JButton("");
		 e28.setName("28");
		e28.setBackground(new Color(0, 128, 0));
		e28.setForeground(new Color(0, 128, 0));
		panel_28.add(e28);
		
		 panel_29 = new JPanel();
		panel_29.setBackground(new Color(0, 128, 0));
		panel_29.setForeground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_29 = new GridBagConstraints();
		gbc_panel_29.insets = new Insets(0, 0, 5, 5);
		gbc_panel_29.gridx = 9;
		gbc_panel_29.gridy = 2;
		getContentPane().add(panel_29, gbc_panel_29);
		
		 e29 = new JButton("");
		 e29.setName("29");
		e29.setBackground(new Color(0, 128, 0));
		e29.setForeground(new Color(0, 128, 0));
		panel_29.add(e29);
		
		 panel_30 = new JPanel();
		panel_30.setForeground(new Color(0, 128, 0));
		panel_30.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_30 = new GridBagConstraints();
		gbc_panel_30.insets = new Insets(0, 0, 5, 5);
		gbc_panel_30.gridx = 10;
		gbc_panel_30.gridy = 2;
		getContentPane().add(panel_30, gbc_panel_30);
		
		 e30 = new JButton("");
		 e30.setName("30");
		e30.setForeground(new Color(0, 128, 0));
		e30.setBackground(new Color(0, 128, 0));
		panel_30.add(e30);
		
		 panel_31 = new JPanel();
		panel_31.setForeground(new Color(0, 128, 0));
		panel_31.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_31 = new GridBagConstraints();
		gbc_panel_31.fill = GridBagConstraints.BOTH;
		gbc_panel_31.insets = new Insets(0, 0, 5, 5);
		gbc_panel_31.gridx = 1;
		gbc_panel_31.gridy = 3;
		getContentPane().add(panel_31, gbc_panel_31);
		
		 e31 = new JButton("");
		 e31.setName("31");
		e31.setForeground(new Color(0, 128, 0));
		e31.setBackground(new Color(0, 128, 0));
		panel_31.add(e31);
		
		 panel_32 = new JPanel();
		panel_32.setForeground(new Color(0, 128, 0));
		panel_32.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_32 = new GridBagConstraints();
		gbc_panel_32.insets = new Insets(0, 0, 5, 5);
		gbc_panel_32.fill = GridBagConstraints.BOTH;
		gbc_panel_32.gridx = 2;
		gbc_panel_32.gridy = 3;
		getContentPane().add(panel_32, gbc_panel_32);
		
		 e32 = new JButton("");
		 e32.setName("32");
		e32.setForeground(new Color(0, 128, 0));
		e32.setBackground(new Color(0, 128, 0));
		panel_32.add(e32);
		
		 panel_33 = new JPanel();
		panel_33.setForeground(new Color(0, 128, 0));
		panel_33.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_33 = new GridBagConstraints();
		gbc_panel_33.insets = new Insets(0, 0, 5, 5);
		gbc_panel_33.fill = GridBagConstraints.BOTH;
		gbc_panel_33.gridx = 3;
		gbc_panel_33.gridy = 3;
		getContentPane().add(panel_33, gbc_panel_33);
		
		 e33 = new JButton("");
		 e33.setName("33");
		e33.setForeground(new Color(0, 128, 0));
		e33.setBackground(new Color(0, 128, 0));
		panel_33.add(e33);
		
		 panel_34 = new JPanel();
		panel_34.setForeground(new Color(0, 128, 0));
		panel_34.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_34 = new GridBagConstraints();
		gbc_panel_34.insets = new Insets(0, 0, 5, 5);
		gbc_panel_34.fill = GridBagConstraints.BOTH;
		gbc_panel_34.gridx = 4;
		gbc_panel_34.gridy = 3;
		getContentPane().add(panel_34, gbc_panel_34);
		
		 e34 = new JButton("");
		 e34.setName("34");
		e34.setForeground(new Color(0, 128, 0));
		e34.setBackground(new Color(0, 128, 0));
		panel_34.add(e34);
		
		 panel_35 = new JPanel();
		panel_35.setForeground(new Color(0, 128, 0));
		panel_35.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_35 = new GridBagConstraints();
		gbc_panel_35.insets = new Insets(0, 0, 5, 5);
		gbc_panel_35.fill = GridBagConstraints.BOTH;
		gbc_panel_35.gridx = 5;
		gbc_panel_35.gridy = 3;
		getContentPane().add(panel_35, gbc_panel_35);
		
		 e35 = new JButton("");
		 e35.setName("35");
		e35.setForeground(new Color(0, 128, 0));
		e35.setBackground(new Color(0, 128, 0));
		panel_35.add(e35);
		
		 panel_36 = new JPanel();
		panel_36.setForeground(new Color(0, 128, 0));
		panel_36.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_36 = new GridBagConstraints();
		gbc_panel_36.insets = new Insets(0, 0, 5, 5);
		gbc_panel_36.fill = GridBagConstraints.BOTH;
		gbc_panel_36.gridx = 6;
		gbc_panel_36.gridy = 3;
		getContentPane().add(panel_36, gbc_panel_36);
		
		 e36 = new JButton("");
		 e36.setName("36");
		e36.setForeground(new Color(0, 128, 0));
		e36.setBackground(new Color(0, 128, 0));
		panel_36.add(e36);
		
		 panel_37 = new JPanel();
		panel_37.setForeground(new Color(0, 128, 0));
		panel_37.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_37 = new GridBagConstraints();
		gbc_panel_37.insets = new Insets(0, 0, 5, 5);
		gbc_panel_37.fill = GridBagConstraints.BOTH;
		gbc_panel_37.gridx = 7;
		gbc_panel_37.gridy = 3;
		getContentPane().add(panel_37, gbc_panel_37);
		
		 e37 = new JButton("");
		 e37.setName("37");
		e37.setForeground(new Color(0, 128, 0));
		e37.setBackground(new Color(0, 128, 0));
		panel_37.add(e37);
		
		 panel_38 = new JPanel();
		panel_38.setForeground(new Color(0, 128, 0));
		panel_38.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_38 = new GridBagConstraints();
		gbc_panel_38.insets = new Insets(0, 0, 5, 5);
		gbc_panel_38.fill = GridBagConstraints.BOTH;
		gbc_panel_38.gridx = 8;
		gbc_panel_38.gridy = 3;
		getContentPane().add(panel_38, gbc_panel_38);
		
		 e38 = new JButton("");
		 e38.setName("38");
		e38.setForeground(new Color(0, 128, 0));
		e38.setBackground(new Color(0, 128, 0));
		panel_38.add(e38);
		
		 panel_39 = new JPanel();
		panel_39.setForeground(new Color(0, 128, 0));
		panel_39.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_39 = new GridBagConstraints();
		gbc_panel_39.insets = new Insets(0, 0, 5, 5);
		gbc_panel_39.fill = GridBagConstraints.BOTH;
		gbc_panel_39.gridx = 9;
		gbc_panel_39.gridy = 3;
		getContentPane().add(panel_39, gbc_panel_39);
		
		 e39 = new JButton("");
		 e39.setName("39");
		e39.setForeground(new Color(0, 128, 0));
		e39.setBackground(new Color(0, 128, 0));
		panel_39.add(e39);
		
		 panel_40 = new JPanel();
		panel_40.setForeground(new Color(0, 128, 0));
		panel_40.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel_40 = new GridBagConstraints();
		gbc_panel_40.fill = GridBagConstraints.BOTH;
		gbc_panel_40.insets = new Insets(0, 0, 5, 5);
		gbc_panel_40.gridx = 10;
		gbc_panel_40.gridy = 3;
		getContentPane().add(panel_40, gbc_panel_40);
		
		 e40 = new JButton("");
		 e40.setName("40");
		e40.setForeground(new Color(0, 128, 0));
		e40.setBackground(new Color(0, 128, 0));
		panel_40.add(e40);
		
		e1.addActionListener(new ListenerSaltos());
		
		e2.addActionListener(new ListenerSaltos());
		e3.addActionListener(new ListenerSaltos());
		e4.addActionListener(new ListenerSaltos());
		e5.addActionListener(new ListenerSaltos());
		e6.addActionListener(new ListenerSaltos());
		e7.addActionListener(new ListenerSaltos());
		e8.addActionListener(new ListenerSaltos());
		e9.addActionListener(new ListenerSaltos());
		e10.addActionListener(new ListenerSaltos());
		e11.addActionListener(new ListenerSaltos());
		
		e12.addActionListener(new ListenerSaltos());
		e13.addActionListener(new ListenerSaltos());
		e14.addActionListener(new ListenerSaltos());
		e15.addActionListener(new ListenerSaltos());
		e16.addActionListener(new ListenerSaltos());
		e17.addActionListener(new ListenerSaltos());
		e18.addActionListener(new ListenerSaltos());
		e19.addActionListener(new ListenerSaltos());
		e20.addActionListener(new ListenerSaltos());
		e21.addActionListener(new ListenerSaltos());
		
		e22.addActionListener(new ListenerSaltos());
		e23.addActionListener(new ListenerSaltos());
		e24.addActionListener(new ListenerSaltos());
		e25.addActionListener(new ListenerSaltos());
		e26.addActionListener(new ListenerSaltos());
		e27.addActionListener(new ListenerSaltos());
		e28.addActionListener(new ListenerSaltos());
		e29.addActionListener(new ListenerSaltos());
		e30.addActionListener(new ListenerSaltos());
		e31.addActionListener(new ListenerSaltos());
		
		e32.addActionListener(new ListenerSaltos());
		e33.addActionListener(new ListenerSaltos());
		e34.addActionListener(new ListenerSaltos());
		e35.addActionListener(new ListenerSaltos());
		e36.addActionListener(new ListenerSaltos());
		e37.addActionListener(new ListenerSaltos());
		e38.addActionListener(new ListenerSaltos());
		e39.addActionListener(new ListenerSaltos());
		e40.addActionListener(new ListenerSaltos());
		actualizarBotonesSaltos();
		
		pila1.setSaltos(0);
		pila2.setSaltos(1);
		pila3.setSaltos(2);
		pila4.setSaltos(3);
		pila5.setSaltos(4);
		pila6.setSaltos(5);
		pila7.setSaltos(6);
		pila8.setSaltos(7);
		pila9.setSaltos(8);
		pila10.setSaltos(9);
		pila11.setSaltos(10);
		pila12.setSaltos(11);
		pila13.setSaltos(12);
		pila14.setSaltos(13);
		pila15.setSaltos(14);
		pila16.setSaltos(15);
		pila17.setSaltos(16);
		pila18.setSaltos(17);
		pila19.setSaltos(18);
		pila20.setSaltos(19);
		pila21.setSaltos(20);
		pila22.setSaltos(21);
		pila23.setSaltos(22);
		pila24.setSaltos(23);
		pila25.setSaltos(24);
		pila26.setSaltos(25);
		pila27.setSaltos(26);
		pila28.setSaltos(27);
		pila29.setSaltos(28);
		pila30.setSaltos(29);
		pila31.setSaltos(30);
		pila32.setSaltos(31);
		pila33.setSaltos(32);
		pila34.setSaltos(33);
		pila35.setSaltos(34);
		pila36.setSaltos(35);
		pila37.setSaltos(36);
		pila38.setSaltos(37);
		pila39.setSaltos(38);
		pila40.setSaltos(39);
	}
	public void nuevoClasico() {
		getContentPane().removeAll();
		tipo = 1;
		movimientos = new ArrayList<char[]>();
		Pilas = new ArrayList<Pila>();
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
		btn2.setName("2_1");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.gridx = 0;
		gbc_btn2.gridy = 0;
		panel2.add(btn2, gbc_btn2);
		
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
		
		btn3.setName("3_1");
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
		
		btn4.setName("4_1");
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
		
		btn5.setName("5_1");
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
		
		btn6.setName("6_1");
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
		btn6_2.setName("6_2");
		btn6_3.setName("6_3");
		btn6_4.setName("6_4");
		btn6_5.setName("6_5");
		btn6_6.setName("6_6");
		btn6_7.setName("6_7");
		btn6_8.setName("6_8");
		btn6_9.setName("6_9");
		btn6_10.setName("6_10");
		btn6_11.setName("6_11");
		btn6_12.setName("6_12");
		btn6_13.setName("6_13");
		btn6_14.setName("6_14");
		
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
		btn7.setName("7_1");
		
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
		btn7_2.setName("7_2");
		btn7_3.setName("7_3");
		btn7_4.setName("7_4");
		btn7_5.setName("7_5");
		btn7_6.setName("7_6");
		btn7_7.setName("7_7");
		btn7_8.setName("7_8");
		btn7_9.setName("7_9");
		btn7_10.setName("7_10");
		btn7_11.setName("7_11");
		btn7_12.setName("7_12");
		btn7_13.setName("7_13");
		btn7_14.setName("7_14");
		btn7_15.setName("7_15");
	
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
		btn8.setName("8_1");
		
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
		crearBotonesClasico(panel8,btn8_12,12,11,3,8);
		
		btn8_13 = new JButton("");
		crearBotonesClasico(panel8,btn8_13,13,12,3,8);
		
		btn8_14 = new JButton("");
		crearBotonesClasico(panel8,btn8_14,14,13,3,8);
		
		btn8_15 = new JButton("");
		crearBotonesClasico(panel8,btn8_15,15,14,3,8);
		
		btn8_16 = new JButton("");
		crearBotonesClasico(panel8,btn8_16,16,15,3,8);
		btn8_2.setName("8_2");
		btn8_3.setName("8_3");
		btn8_4.setName("8_4");
		btn8_5.setName("8_5");
		btn8_6.setName("8_6");
		btn8_7.setName("8_7");
		btn8_8.setName("8_8");
		btn8_9.setName("8_9");
		btn8_10.setName("8_10");
		btn8_11.setName("8_11");
		btn8_12.setName("8_12");
		btn8_13.setName("8_13");
		btn8_14.setName("8_14");
		btn8_15.setName("8_15");
		btn8_16.setName("8_16");
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
		
		btn9.setName("9_1");
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
		btn9_2.setName("9_2");
		btn9_3.setName("9_3");
		btn9_4.setName("9_4");
		btn9_5.setName("9_5");
		btn9_6.setName("9_6");
		btn9_7.setName("9_7");
		btn9_8.setName("9_8");
		btn9_9.setName("9_9");
		btn9_10.setName("9_10");
		btn9_11.setName("9_11");
		btn9_12.setName("9_12");
		btn9_13.setName("9_13");
		btn9_14.setName("9_14");
		btn9_15.setName("9_15");
		btn9_16.setName("9_16");
		btn9_17.setName("9_17");
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
		
		btn10.setName("10_1");
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
		btn10_2.setName("10_2");
		btn10_3.setName("10_3");
		btn10_4.setName("10_4");
		btn10_5.setName("10_5");
		btn10_6.setName("10_6");
		btn10_7.setName("10_7");
		btn10_8.setName("10_8");
		btn10_9.setName("10_9");
		btn10_10.setName("10_10");
		btn10_11.setName("10_11");
		btn10_12.setName("10_12");
		btn10_13.setName("10_13");
		btn10_14.setName("10_14");
		btn10_15.setName("10_15");
		btn10_16.setName("10_16");
		btn10_17.setName("10_17");
		btn10_18.setName("10_18");
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
		
		btn11.setName("11_1");
		
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
		btn11_2.setName("11_2");
		btn11_3.setName("11_3");
		btn11_4.setName("11_4");
		btn11_5.setName("11_5");
		btn11_6.setName("11_6");
		btn11_7.setName("11_7");
		btn11_8.setName("11_8");
		btn11_9.setName("11_9");
		btn11_10.setName("11_10");
		btn11_11.setName("11_11");
		btn11_12.setName("11_12");
		btn11_13.setName("11_13");
		btn11_14.setName("11_14");
		btn11_15.setName("11_15");
		btn11_16.setName("11_16");
		btn11_17.setName("11_17");
		btn11_18.setName("11_18");
		btn11_19.setName("11_19");
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
		btn12.setName("12_1");
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
		btn12_2.setName("12_2");
		btn12_3.setName("12_3");
		btn12_4.setName("12_4");
		btn12_5.setName("12_5");
		btn12_6.setName("12_6");
		btn12_7.setName("12_7");
		btn12_8.setName("12_8");
		btn12_9.setName("12_9");
		btn12_10.setName("12_10");
		btn12_11.setName("12_11");
		btn12_12.setName("12_12");
		btn12_13.setName("12_13");
		btn12_14.setName("12_14");
		btn12_15.setName("12_15");
		btn12_16.setName("12_16");
		btn12_17.setName("12_17");
		btn12_18.setName("12_18");
		btn12_19.setName("12_19");
		btn12_20.setName("12_20");
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
		
		
		
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

