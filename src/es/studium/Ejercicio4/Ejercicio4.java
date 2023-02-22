package es.studium.Ejercicio4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Aficiones");
	Panel pnlNorte = new Panel();
	Panel pnlSur = new Panel();
	Button btnComprobar = new Button("Comprobar");
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFútbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");

	Ejercicio4()
	{
		ventana.setSize(300, 150);
		ventana.setLayout(new BorderLayout());
		pnlNorte.setLayout(new FlowLayout());
		pnlSur.setLayout(new FlowLayout());
		pnlNorte.add(chkCorrer);
		pnlNorte.add(chkNadar);
		pnlNorte.add(chkLeer);
		pnlNorte.add(chkCine);
		pnlNorte.add(chkBailar);
		pnlNorte.add(chkFútbol);
		pnlNorte.add(chkTenis);
		pnlNorte.add(chkBaloncesto);
		pnlNorte.add(chkVela);
		pnlSur.add(btnComprobar);
		ventana.add(pnlNorte, "Center");
		ventana.add(pnlSur, "South");
		ventana.addWindowListener(this);
		btnComprobar.addActionListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio4();
	}

	public void actionPerformed(ActionEvent e)
	{

		if (chkCorrer.getState())
		{
			System.out.println("Correr");
		} 
		if (chkNadar.getState())
		{
			System.out.println("Nadar");
		}
		if (chkLeer.getState())
		{
			System.out.println("Leer");
		}
		if (chkCine.getState())
		{
			System.out.println("Ir al Cine");
		}
		if (chkBailar.getState())
		{
			System.out.println("Bailar");
		}
		if (chkFútbol.getState())
		{
			System.out.println("Fútbol");
		}
		if (chkTenis.getState())
		{
			System.out.println("Tenis");
		}
		if (chkBaloncesto.getState())
		{
			System.out.println("Baloncesto");
		}
		if (chkVela.getState())
		{
			System.out.println("Deportes de Vela");
		}
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

	public void windowIconified(WindowEvent e)
	{
	}

	public void windowDeiconified(WindowEvent e)
	{
	}

	public void windowActivated(WindowEvent e)
	{
	}

	public void windowDeactivated(WindowEvent e)
	{
	}
}
