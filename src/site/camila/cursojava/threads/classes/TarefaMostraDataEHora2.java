package site.camila.cursojava.threads.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextField;

public class TarefaMostraDataEHora2 implements Runnable {

	private JTextField mostrarTempo2;

	public TarefaMostraDataEHora2(JTextField mostrarTempo2) {
		this.mostrarTempo2 = mostrarTempo2;
	}

	@Override
	public void run() {
		while(true) {
			mostrarTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
