package es.studium.Ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio2 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Button btn1 = new Button("Celsius a Fahrenheit");
	Button btn2 = new Button("Fahrenheit a Celsius");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txt1 = new TextField(10);
	TextField txt2 = new TextField(10);
	
	Ejercicio2()
	{
		ventana.setSize(400,150);
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblCelsius);
		ventana.add(txt1);
		ventana.add(lblFahrenheit);
		ventana.add(txt2);
		ventana.add(btn1);
		ventana.add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio2();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(btn1))
		{
			if(!txt1.getText().equals(""))
			{
				float g = (Float.parseFloat(txt1.getText()) * 9/5) + 32;
				txt2.setText(g+"");
			}
		}
		else if(e.getSource().equals(btn2))
		{
			if(!txt2.getText().equals(""))
			{
				float g = (Float.parseFloat(txt2.getText()) - 32) * 5/9;
				txt1.setText(g+"");
			}
		}
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
