package es.studium.Ejercicio6;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio6 implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Provincias españolas");
	Choice choProvincias = new Choice();
	TextField txtGentil	= new TextField(20);
	String[ ] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres",
			"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
			"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
			"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
			"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
	String[]  gentilicios={"No ha elegido ninguna opción","Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na","Almeriense, Urcitano/na","Asturiano/na, Astur","Abulense, Avilés/esa", "Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña", "Gaditano/na", "Cántabro/a","Castellonense", "Ciudadrealeño/ña", "Cordobés/esa","Coruñés", "Conquense", "Gerundense, Gironés/esa", "Granadino/na","Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na", "Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense","Leonés/esa","Leridano","Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na", "Palmense", "Pontevedrés/esa","Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense", "Soriano/na","Tarracconense/a","Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na","Pucelano/na", "Vizcaíno/na",
			"Zamorano/na", "Zaragozano/na"};
	
	Ejercicio6()
	{
		ventana.setSize(250, 100);
		ventana.setLayout(new FlowLayout());
		for(String provincia: provincias)
		{
		     choProvincias.add(provincia);
		}
		choProvincias.addItemListener(this);
		ventana.add(choProvincias);
		ventana.add(txtGentil);
		txtGentil.setEnabled(false);
		ventana.setResizable(false);
		ventana.addWindowListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio6();
	}

	public void itemStateChanged(ItemEvent e)
	{
		txtGentil.setText(gentilicios[choProvincias.getSelectedIndex()]);
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
