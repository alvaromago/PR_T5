package es.studium.SegundoEjemploStudium;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PaginaCalculadora implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Calculadora");
	TextField txtNumero1 = new TextField(20);
	TextField txtNumero2 = new TextField(20);
	TextField txtNumero3 = new TextField(20);
	Button btnSumar = new Button("Sumar");
	Button btnRestar = new Button("Restar");
	Button btnMultiplicar = new Button("Multiplicar");
	Button btnDividir = new Button("Dividir");
	
	PaginaCalculadora()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(200, 200);
		ventana.setLocationRelativeTo(null);
		txtNumero3.setEditable(false);
		ventana.addWindowListener(this);
		btnSumar.addActionListener(this);
		btnRestar.addActionListener(this);
		btnMultiplicar.addActionListener(this);
		btnDividir.addActionListener(this);
		ventana.add(txtNumero1);
		ventana.add(txtNumero2);
		ventana.add(btnSumar);
		ventana.add(btnRestar);
		ventana.add(btnMultiplicar);
		ventana.add(btnDividir);
		ventana.add(txtNumero3);
		ventana.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new PaginaCalculadora();
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

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(btnSumar))
		{
			int uno = Integer.parseInt(txtNumero1.getText());
			int dos = Integer.parseInt(txtNumero2.getText());
			int resultado = uno + dos;
			txtNumero3.setText(resultado+""); /* int + "" y lo convierte todo en cadena */
		}
		else if(e.getSource().equals(btnRestar))
		{
			int uno = Integer.parseInt(txtNumero1.getText());
			int dos = Integer.parseInt(txtNumero2.getText());
			int resultado = uno - dos;
			txtNumero3.setText(resultado+"");
		}
		else if(e.getSource().equals(btnMultiplicar))
		{
			int uno = Integer.parseInt(txtNumero1.getText());
			int dos = Integer.parseInt(txtNumero2.getText());
			int resultado = uno * dos;
			txtNumero3.setText(resultado+"");
		}
		else if(e.getSource().equals(btnDividir))
		{
			float uno = Integer.parseInt(txtNumero1.getText());
			float dos = Integer.parseInt(txtNumero2.getText());
			if(dos==0)
			{
				txtNumero3.setText("Error");
			}
			else
			{
				float resultado = uno / dos;
				txtNumero3.setText(resultado+"");
			}
		}
	}

}
