package es.studium.Ejercicio7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio7 implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Baloncesto");
	List lisEquipos = new List(5, false);
	TextField txtCiudad = new TextField(15);
	String[] equipos = {"Seleccione un equipo", "Real Madrid","Barça","Iberoestar Tenerife","TD Systems Baskonia","Hereda San Pablo Burgos","Valencia Basket","Club Joventut de Badalona","Unicaja","UCAM Murcia","Baxi Manresa","MoraBanc Andorra","Herbalife Gran Canaria","Monbus Obradoiro","Movistar Estudiantes","Casademont Zaragoza","Urbas Fuenlabrada","Coosur Real Betis","RETAbet Bilbao Basket","Acunsa Gipuzkoa Basket"};
	String[] ciudades = {"No ha elegido ninguna opción", "Madrid", "Barcelona", "Tenerife", "Vitoria", "Burgos", "Valencia", "Badalona", "Malaga", "Murcia", "Manresa", "Andorra", "Las Palmas de Gran Canaria", "Santiago de Compostela", "Madrid", "Zaragoza", "Fuenlabrada", "Sevilla", "Bilbao", "San Sebastián"};
	
	public Ejercicio7()
	{
		ventana.setLayout(new FlowLayout());
		for (String equipo : equipos)
		{
			lisEquipos.add(equipo);
		}
		ventana.add(lisEquipos);
		ventana.add(txtCiudad);
		lisEquipos.addItemListener(this);
		ventana.setSize(250, 160);
		ventana.setResizable(false);
		txtCiudad.setEnabled(false);
		ventana.addWindowListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio7();
	}

	public void itemStateChanged(ItemEvent e)
	{
		txtCiudad.setText(ciudades[lisEquipos.getSelectedIndex()]);
	}

	public void windowOpened(WindowEvent e){}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}
}
