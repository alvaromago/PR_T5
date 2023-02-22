package es.studium.PrimerEjemploEventos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PrimerEjemploEventos implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Eventos");
	Button btnCerrar = new Button("Cerrar");
	Button btnMensaje = new Button("Mensaje");
	
	PrimerEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		ventana.setSize(250,100);
		btnCerrar.addActionListener(this);
		btnMensaje.addActionListener(this);
		ventana.add(btnCerrar);
		ventana.add(btnMensaje);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new PrimerEjemploEventos();
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(btnCerrar))
		{
			System.exit(0);
		}
		else if(e.getSource().equals(btnMensaje))
		{
			System.out.println("Mensaje por consola");
		}
	}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	
	public void windowOpened(WindowEvent e){}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}

}
