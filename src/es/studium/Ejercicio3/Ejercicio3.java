package es.studium.Ejercicio3;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Calcular el IVA");
	Button btnCalcular = new Button("Calcular");
	Label lblCantidad = new Label("Introduzca la cantidad");
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	Label lblResultado = new Label("Resultado");
	Label lblMensaje = new Label("¡Debes meter un número!");
	TextField txt1 = new TextField(15);
	TextField txt2 = new TextField(15);
	TextField txt3 = new TextField (15);
	Dialog dlgMensaje = new Dialog(ventana, "Error", true);
	float cantidad;
	float iva;
	float resultado;
	
	Ejercicio3()
	{
		ventana.setSize(900, 70);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblCantidad);
		ventana.add(txt1);
		ventana.add(lblPorcentaje);
		ventana.add(txt2);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		ventana.add(txt3);
		txt3.setEnabled(false);
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		dlgMensaje.setSize(175,75);
		dlgMensaje.addWindowListener(this);
		dlgMensaje.setLayout(new FlowLayout());
		dlgMensaje.add(lblMensaje);
		dlgMensaje.setLocationRelativeTo(null);
		dlgMensaje.setResizable(false);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio3();
	}

	public void actionPerformed(ActionEvent e)
	{
		try
		{
			cantidad = Float.parseFloat(txt1.getText());
			iva = Float.parseFloat(txt2.getText());
			resultado = cantidad / (1+(iva/100));
			txt3.setText((cantidad-resultado)+"");
		}
		catch(NumberFormatException nfe)
		{
			dlgMensaje.setVisible(true);
		}
	}

	public void windowOpened(WindowEvent e){}

	public void windowClosing(WindowEvent e)
	{
		if(dlgMensaje.isActive())
		{
			dlgMensaje.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}

}
