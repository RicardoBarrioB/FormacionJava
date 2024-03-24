package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

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

/*
public class Ventana extends JFrame{  //extends sirve para que nuestra clase herede de la clase que indicamos, tendra todos sus metodos
	public JPanel panel; // crear objeto panel
	public Ventana() {
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
		//colocarCajasdeDeTexto();
		//colocarAreasDeTexto();
		//colocarListasDesplegables();
	}
	
	private void colocarPaneles() {
		panel = new JPanel(); // crear objeto panel
		panel.setBackground(Color.GRAY); //Establecemos color panel
		panel.setLayout(null); //desactivamos el layout (el diseño)
		this.getContentPane().add(panel); // Agregamos el panel a la ventana
	}
	
	private void colocarEtiquetas(){

		//ETIQUETAS TIPO TEXTO:
		
		//JLabel etiqueta = new JLabel("Bienvenido!!"); //creamos una etiqueta, en este caso de texto
		//panel.add(etiqueta); //Agregamos la etiqueta al panel
		
		JLabel etiqueta = new JLabel("Bienvenido!!", SwingConstants.CENTER); // Indicar posicion del texto dentro de la etiqueta
		//etiqueta.setText("Bienvenido!!"); //Poner texto despues de crear la etiqueta
		etiqueta.setBounds(10,10,200,35); //Donde colocar el mensaje
		//etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Otra forma de indicar la posicion horizontal del texto dentro de la etiqueta
		etiqueta.setForeground(Color.WHITE); //Poner color a la letra
		etiqueta.setOpaque(true); //Para que la etiqueta no sea invisible
		etiqueta.setBackground(Color.BLACK);
		etiqueta.setFont(new Font("mv boli", Font.BOLD, 20)); //Establecer la fuente del texto
		panel.add(etiqueta);
		
		
		//ETIQUETAS TIPO IMAGEN:
		
		ImageIcon imagen = new ImageIcon ("emoji.png"); //creo un objeto imagen
		// JLabel etiqueta2 = new JLabel(new ImageIcon("emoji.png")); //Al tener la imagen en la misma carpeta solo necesito poner el nombre y extencion de la imagen
		JLabel etiqueta2 = new JLabel(); //Inicializamos el objeto etiqueta2
		etiqueta2.setBounds(10,80,300,300);
		etiqueta2.setIcon(new ImageIcon (imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(), Image.SCALE_SMOOTH))); //Ponemos la imagen al tamaño que queramos, en este caso mismo de la etiqueta
		panel.add(etiqueta2);
	}
	
	private void colocarBotones() {
		//Boton1 - boton de texto
		JButton boton1 = new JButton("Click");
		boton1.setBounds(100, 100, 100, 40);
		boton1.setEnabled(true); //Establecemos si se puede presionar o no
		boton1.setMnemonic('a'); //Damos la funcion a la a que junto a alt presiona el boton
		boton1.setForeground(Color.BLUE);
		boton1.setFont(new Font("arial", 3, 15));
		panel.add(boton1);
		
		//Boton2 - boton de imagen
		JButton boton2 = new JButton ();
		boton2.setBounds(100, 200, 100, 40);
		ImageIcon clickAqui = new ImageIcon("click.jpg");
		boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
		boton2.setBackground(Color.yellow);
		panel.add(boton2);
		
		//Boton3 - boton con bordes
		JButton boton3 = new JButton();
		boton3.setBounds(100, 300, 110, 50);
		boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, false));
		panel.add(boton3);
	}
	
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

	private void colocarCajasdeDeTexto() {
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(50, 50, 100, 30);
		cajaTexto.setText("Hola");
		System.out.println("Texto en la caja: " + cajaTexto.getText());
		panel.add(cajaTexto);
	}

	private void colocarAreasDeTexto() {
		JTextArea areaTexto = new JTextArea();
		areaTexto.setBounds(20, 20, 300, 200);
		areaTexto.setText("Escriba el texto aqui..."); //El metodo añade texto, pero no puede añadir texto a otro setText
		areaTexto.append("\nEscriba el texto aqui..."); //Este metodo añade más texto al area de texto
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
		
	}

}

*/


