package es.studium.Ejercicio1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Horas");
	Button btnCalcular = new Button("Calcular");
	Label lblHH1 = new Label("HH");
	Label lblHH2 = new Label("HH");
	Label lblMM1 = new Label("MM");
	Label lblMM2 = new Label("MM");
	TextField txtNumero1 = new TextField(10);
	TextField txtNumero2 = new TextField(10);
	TextField txtNumero3 = new TextField(10);
	TextField txtNumero4 = new TextField(10);
	TextField txtResultado = new TextField(10);
	
	Ejercicio1()
	{
		ventana.setSize(300, 150);
		ventana.setLayout(new GridLayout(3,4));
		btnCalcular.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.add(lblHH1);
		ventana.add(txtNumero1);
		ventana.add(lblMM1);
		ventana.add(txtNumero2);
		ventana.add(lblHH2);
		ventana.add(txtNumero3);
		ventana.add(lblMM2);
		ventana.add(txtNumero4);
		ventana.add(btnCalcular);
		ventana.add(txtResultado);
		txtResultado.setEnabled(false);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio1();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e)
	{
		int hh1 = Integer.parseInt(txtNumero1.getText());
		int hh2 = Integer.parseInt(txtNumero3.getText());
		int mm1 = Integer.parseInt(txtNumero2.getText());
		int mm2 = Integer.parseInt(txtNumero4.getText());
		int resultado = Math.abs((hh1*60+mm1)-(hh2*60+mm2));
		txtResultado.setText(String.format("%02d:%02d", resultado/60, resultado%60));
	}

}
