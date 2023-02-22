package es.studium.TercerEjemploEventos;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TercerEjemploEventos implements ActionListener, WindowListener, MouseListener
{
	Frame ventana = new Frame("Ratón");
	
	TercerEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		ventana.addMouseListener(this);
		ventana.setSize(240, 200);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TercerEjemploEventos();
	}

	public void mouseClicked(MouseEvent e)
	{
		System.out.println("X:" + e.getX());
		System.out.println("Y:" + e.getY());
	}

	public void mousePressed(MouseEvent e)
	{
		
	}

	public void mouseReleased(MouseEvent e)
	{
		
	}

	public void mouseEntered(MouseEvent e)
	{
		
	}

	public void mouseExited(MouseEvent e)
	{
		
	}

	public void windowOpened(WindowEvent e)
	{
		
	}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	public void windowClosed(WindowEvent e)
	{
		
	}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}

	public void actionPerformed(ActionEvent e){}

}
