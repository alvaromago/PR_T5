package es.studium.CuartoEjemploEventos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CuartoEjemploEventos implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Eventos");
	Choice choLista = new Choice();
	
	CuartoEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		choLista.add("Seleccionar un color...");
		choLista.add("Rojo");
		choLista.add("Amarillo");
		choLista.add("Azul");
		choLista.add("Verde");
		choLista.addItemListener(this);
		ventana.add(choLista);
		ventana.setSize(240, 200);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new CuartoEjemploEventos();
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

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItem().equals("Amarillo"))
		{
			ventana.setBackground(Color.yellow);
		}
		else if(e.getItem().equals("Verde"))
		{
			ventana.setBackground(Color.green);
		}
		else if(e.getItem().equals("Rojo"))
		{
			ventana.setBackground(Color.red);
		}
		else if(e.getItem().equals("Azul"))
		{
			ventana.setBackground(Color.blue);
		}
		else
		{
			ventana.setBackground(Color.white);
		}
	}

}
