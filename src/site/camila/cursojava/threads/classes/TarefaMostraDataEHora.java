package site.camila.cursojava.threads.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextField;

public class TarefaMostraDataEHora implements Runnable {

	private JTextField mostrarTempo;

	public TarefaMostraDataEHora(JTextField mostrarTempo) {
		this.mostrarTempo = mostrarTempo;
	}

	@Override
	public void run() {
		while(true) {
			mostrarTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
