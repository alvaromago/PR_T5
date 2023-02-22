package es.studium.Ejercicio5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Vehículos");
	Panel pnlNorte = new Panel();
	Panel pnlSur = new Panel();
	TextField txtPresupuesto = new TextField(18);
	Button btnPresupuesto = new Button("Calcular presupuesto");
	Label lblMotorizacion = new Label("Tipo de motorización:");
	Label lblPuertas = new Label("Número de puertas:");
	Label lblPintura = new Label("Pintura Metalizada:");
	CheckboxGroup cgbMotorizacion = new CheckboxGroup();
	Checkbox chkGasolina = new Checkbox("Gasolina", cgbMotorizacion, false);
	Checkbox chkDiesel = new Checkbox("Diésel", cgbMotorizacion, false);
	Checkbox chkHibrido = new Checkbox("Híbrido", cgbMotorizacion, false);
	Checkbox chkElectrico = new Checkbox("Eléctrico", cgbMotorizacion, false);
	CheckboxGroup cgbPuertas = new CheckboxGroup();
	Checkbox chk3P = new Checkbox("3 puertas", cgbPuertas, false);
	Checkbox chk4P = new Checkbox("4 puertas", cgbPuertas, false);
	Checkbox chk5P = new Checkbox("5 puertas", cgbPuertas, false);
	CheckboxGroup cgbPintura = new CheckboxGroup();
	Checkbox chkSi = new Checkbox("Sí", cgbPintura, false);
	Checkbox chkNo = new Checkbox("No", cgbPintura, false);
	
	Ejercicio5()
	{
		ventana.setSize(452, 152);
		ventana.setLayout(new BorderLayout());
		pnlNorte.setLayout(new FlowLayout());
		pnlSur.setLayout(new FlowLayout());
		pnlNorte.add(lblMotorizacion);
		pnlNorte.add(chkGasolina);
		pnlNorte.add(chkDiesel);
		pnlNorte.add(chkHibrido);
		pnlNorte.add(chkElectrico);
		pnlNorte.add(lblPuertas);
		pnlNorte.add(chk3P);
		pnlNorte.add(chk4P);
		pnlNorte.add(chk5P);
		pnlNorte.add(lblPintura);
		pnlNorte.add(chkSi);
		pnlNorte.add(chkNo);
		pnlSur.add(btnPresupuesto);
		pnlSur.add(txtPresupuesto);
		txtPresupuesto.setEnabled(false);
		ventana.add(pnlNorte, "Center");
		ventana.add(pnlSur, "South");
		btnPresupuesto.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio5();
	}

	public void actionPerformed(ActionEvent e)
	{
		int presupuesto = 0;
		if(chkGasolina.getState())
		{
			presupuesto = presupuesto + 7000;
		}
		else if(chkDiesel.getState())
		{
			presupuesto = presupuesto + 8000;
		}
		else if(chkHibrido.getState())
		{
			presupuesto = presupuesto + 9000;
		}
		else if(chkElectrico.getState())
		{
			presupuesto = presupuesto + 8500;
		}
		if(chk3P.getState())
		{
			presupuesto = presupuesto + 2000;
		}
		else if(chk4P.getState())
		{
			presupuesto = presupuesto + 3000;
		}
		else if(chk5P.getState())
		{
			presupuesto = presupuesto + 2500;
		}
		if(chkSi.getState())
		{
			presupuesto = presupuesto + 1500;
		}
		else if(chkNo.getState())
		{
			presupuesto = presupuesto + 0;
		}
		txtPresupuesto.setText(presupuesto+"€");
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
