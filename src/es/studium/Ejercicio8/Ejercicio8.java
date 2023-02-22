package es.studium.Ejercicio8;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio8 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	Menu mnuArticulos = new Menu("Artículos");
	Menu mnuClientes = new Menu("Clientes");
	Menu mnuFacturas = new Menu("Facturas");
	MenuItem mniArticulosNuevo = new MenuItem("Nuevo Artículo");
	MenuItem mniArticulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem mniArticulosConsultar = new MenuItem("Consultar Artículo");
	MenuItem mniClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem mniClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem mniClientesConsultar = new MenuItem("Consultar Cliente");
	MenuItem mniFacturasNueva = new MenuItem("Nueva Factura");
	MenuItem mniFacturasConsultar = new MenuItem("Consultar Factura");
	Label lblMensaje = new Label();
	Dialog dlgMensaje = new Dialog(ventana, "Diálogo con mensaje", true);

	public Ejercicio8()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setMenuBar(barraMenu);
		mnuArticulos.add(mniArticulosNuevo);
		mnuArticulos.add(mniArticulosEliminar);
		mnuArticulos.add(mniArticulosConsultar);
		mnuClientes.add(mniClientesNuevo);
		mnuClientes.add(mniClientesEliminar);
		mnuClientes.add(mniClientesConsultar);
		mnuFacturas.add(mniFacturasNueva);
		mnuFacturas.add(mniFacturasConsultar);
		barraMenu.add(mnuArticulos);
		barraMenu.add(mnuClientes);
		barraMenu.add(mnuFacturas);
		ventana.setSize(350, 200);
		mniArticulosNuevo.addActionListener(this);
		mniArticulosEliminar.addActionListener(this);
		mniArticulosConsultar.addActionListener(this);
		mniClientesNuevo.addActionListener(this);
		mniClientesEliminar.addActionListener(this);
		mniClientesConsultar.addActionListener(this);
		mniFacturasNueva.addActionListener(this);
		mniFacturasConsultar.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		dlgMensaje.setSize(150, 75);
		dlgMensaje.addWindowListener(this);
		dlgMensaje.setLayout(new FlowLayout());
		dlgMensaje.add(lblMensaje);
		dlgMensaje.setLocationRelativeTo(null);
		dlgMensaje.setResizable(false);
	}

	public static void main(String[] args)
	{
		new Ejercicio8();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(mniArticulosNuevo))
		{
			lblMensaje.setText(mniArticulosNuevo.getLabel());
			dlgMensaje.setVisible(true);
		}
		if(e.getSource().equals(mniArticulosEliminar))
		{
			lblMensaje.setText(mniArticulosEliminar.getLabel());
			dlgMensaje.setVisible(true);
		}
		if(e.getSource().equals(mniArticulosConsultar))
		{
			lblMensaje.setText(mniArticulosConsultar.getLabel());
			dlgMensaje.setVisible(true);
		}
		if(e.getSource().equals(mniClientesNuevo))
		{
			lblMensaje.setText(mniClientesNuevo.getLabel());
			dlgMensaje.setVisible(true);
		}
		if(e.getSource().equals(mniClientesEliminar))
		{
			lblMensaje.setText(mniClientesEliminar.getLabel());
			dlgMensaje.setVisible(true);
		}
		if(e.getSource().equals(mniClientesConsultar))
		{
			lblMensaje.setText(mniClientesConsultar.getLabel());
			dlgMensaje.setVisible(true);
		}
		if(e.getSource().equals(mniFacturasNueva))
		{
			lblMensaje.setText(mniClientesConsultar.getLabel());
			dlgMensaje.setVisible(true);
		}
		if(e.getSource().equals(mniFacturasConsultar))
		{
			lblMensaje.setText(mniFacturasConsultar.getLabel());
			dlgMensaje.setVisible(true);
		}
	}
	
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
	
	public void windowOpened(WindowEvent e){}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}

}
