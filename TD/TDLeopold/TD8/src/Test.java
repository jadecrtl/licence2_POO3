import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.Timer;

public class Test
{
	
	public static void main(String[] args)
	{
		
			try {
				(new Universite(2, 2, 2, 2)).restructuration(5,  -5,  5);
			} catch (Universite.DirectiveMinisterielleException e) {
				e.printStackTrace();
			}
			
			ActionListener heure = new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(LocalTime.now());
				}
			};

			new Timer(1000, heure).start();
			
			while(true);
	}
	
}
