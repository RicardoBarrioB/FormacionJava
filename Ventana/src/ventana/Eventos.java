package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Eventos extends JFrame{

	private JPanel panel; // crear objeto panel	
	private JLabel saludo;
	private JTextField cajaTexto;
	private JButton boton;
	private JTextArea areaTexto;
	
	
	public Eventos() {
		this.setSize(800, 500);  // Tamaño de la ventana
		setTitle("Titulo");	//poner titulo ventana
	//	setLocation(400,200); // Donde se genera la pantalla
	//	setBounds(400,200, 800, 500); // Hace lo mismo que setSize y setLocation, pero con la misma funcion
		setLocationRelativeTo(null); //Establecemos la ventana  en el centro
		
		setMinimumSize(new Dimension(300,200)); // Establecemos el tamaño minimo de la ventana
		
	//	this.getContentPane().setBackground(Color.GRAY); //Establecemos el color de la ventana
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// Al cerrar la ventana nos finaliza el programa
		
	}
	
	private void iniciarComponentes() {
		colocarPaneles();
		//colocarEtiquetas();
		//colocarBotones();
		//colocarRadioBotones();
		colocarCajasdeDeTexto();
		colocarAreasDeTexto();
		//colocarListasDesplegables();
		//eventoOyenteDeRaton();
		
	}
	
	private void colocarPaneles() {
		panel = new JPanel(); // crear objeto panel
		panel.setBackground(Color.GRAY); //Establecemos color panel
		panel.setLayout(null); //desactivamos el layout (el diseño)
		this.getContentPane().add(panel); // Agregamos el panel a la ventana
	}
	
/*	private void colocarEtiquetas(){

		//ETIQUETAS TIPO TEXTO:
		
		//JLabel etiqueta = new JLabel("Bienvenido!!"); //creamos una etiqueta, en este caso de texto
		//panel.add(etiqueta); //Agregamos la etiqueta al panel
		
		JLabel etiqueta = new JLabel("Ingrese su nombre:", SwingConstants.CENTER); // Indicar posicion del texto dentro de la etiqueta
		//etiqueta.setText("Bienvenido!!"); //Poner texto despues de crear la etiqueta
		etiqueta.setBounds(10,10,200,35); //Donde colocar el mensaje
		//etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Otra forma de indicar la posicion horizontal del texto dentro de la etiqueta
		etiqueta.setForeground(Color.WHITE); //Poner color a la letra
		etiqueta.setOpaque(false); //Para que la etiqueta no sea invisible
		//etiqueta.setBackground(Color.BLACK);
		etiqueta.setFont(new Font("mv boli", Font.BOLD, 20)); //Establecer la fuente del texto
		panel.add(etiqueta);
	}
	
	private void colocarBotones() {
		//Boton1 - boton de texto
		boton = new JButton("¡Pulsa aqui!");
		boton.setBounds(100, 100, 150, 40);
		boton.setEnabled(true); //Establecemos si se puede presionar o no
		boton.setForeground(Color.GRAY);
		boton.setFont(new Font("arial", 3, 15));
		panel.add(boton);
		
		//Creo etiqueta:
		saludo = new JLabel();
		saludo.setBounds(50, 200, 300, 40);
		saludo.setFont(new Font("arial", 1, 20));
		panel.add(saludo);
		
		//Agregar Evento tipo ActionListener:
		ActionListener oyenteDeAccion = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saludo.setText("Hola " + cajaTexto.getText());
			}
		};
		
		boton.addActionListener(oyenteDeAccion);
		
		
	}
	
/*	private void colocarCajasdeDeTexto() {
		cajaTexto = new JTextField();
		cajaTexto.setBounds(20, 50, 300, 30);
		cajaTexto.setText("");
		panel.add(cajaTexto);
	}	*/
	
	/*
	private void colocarRadioBotones() {
		JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
		radioBoton1.setBounds(50, 100, 100, 50);
		panel.add(radioBoton1);
		
		JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
		radioBoton2.setBounds(50, 150, 100, 50);
		panel.add(radioBoton2);
		
		JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
		radioBoton3.setBounds(50, 200, 100, 50);
		panel.add(radioBoton3);
		
		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(radioBoton1);
		grupoRadioBotones.add(radioBoton2);
		grupoRadioBotones.add(radioBoton3);
	}

	private void colocarAreasDeTexto() {
		areaTexto = new JTextArea();
		areaTexto.setBounds(20, 20, 300, 200);
		areaTexto.setEditable(true); //Poder editar el texto por defecto o no
		System.out.println("El texto es: " + areaTexto.getText());
		panel.add(areaTexto);
	}

	private void colocarListasDesplegables() {
		String[] paises = {"Peru", "Colombia", "España", "Ecuador"};
		JComboBox listaDesplegable1 = new JComboBox(paises);
		listaDesplegable1.setBounds(20, 20, 100, 30);
		listaDesplegable1.addItem("Argentina"); //Añadir objetos a la lista desplegable
		listaDesplegable1.setSelectedItem("España"); //Seleccionar primer objeto visto
		panel.add(listaDesplegable1);
		
	}*/

	/*
	private void colocarBotones() {
		//Boton1 - boton de texto
		boton = new JButton("¡Pulsa aqui!");
		boton.setBounds(100, 250, 150, 40);
		boton.setEnabled(true); //Establecemos si se puede presionar o no
		boton.setForeground(Color.GRAY);
		boton.setFont(new Font("arial", 3, 15));
		panel.add(boton);		
	}
	
	private void eventoOyenteDeRaton() {
		MouseListener oyenteDeRaton = new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				areaTexto.append("mouseClicked\n");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				areaTexto.append("mousePressed\n");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				areaTexto.append("mouseReleased\n");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				areaTexto.append("mouseEntered\n");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				areaTexto.append("mouseExited\n");
			}
				
		};
		
		
	}*/
	
	private void colocarCajasdeDeTexto() {
		cajaTexto = new JTextField();
		cajaTexto.setBounds(20, 30, 150, 30);
		panel.add(cajaTexto);
		
		eventosDelTeclado();
	}
	
	private void colocarAreasDeTexto() {
		areaTexto = new JTextArea();
		areaTexto.setBounds(230, 30, 200, 300);
		areaTexto.setEditable(true); //Poder editar el texto por defecto o no
		System.out.println("El texto es: " + areaTexto.getText());
		panel.add(areaTexto);
	}
	
	
	private void eventosDelTeclado() {
		KeyListener eventoTeclado = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//areaTexto.append("keyTyped\n"); //Solo se ejecuta con los caracteres unicode
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				areaTexto.append("keyReleased\n"); // Se ejecuta al presionar y soltar
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//areaTexto.append("keyPressed\n"); //Se ejecuta al presionar cualquier tecla
			}
		};
		
		cajaTexto.addKeyListener(eventoTeclado);
	}
	
}







