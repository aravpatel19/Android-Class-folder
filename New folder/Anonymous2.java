import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Anonymous2 extends JPanel{

	public Anonymous2(){

		JFrame frame = new JFrame();
		frame.add(this);
		frame.setVisible(true);
		setFocusable(true);

		KeyAdapter key = new KeyboardInterface();

		addKeyListener( key);
	}

	public static void main(String[]args){

		Anonymous2 demo = new Anonymous2();

	}

	public class KeyboardInterface extends KeyAdapter{

		public void keyTyped(KeyEvent e){

			if(e.getKeyChar() == 'a' || e.getKeyChar() == 'e' || e.getKeyChar() == 'i' || e.getKeyChar() == 'o' || e.getKeyChar() == 'u'){
				System.out.println("\'"+e.getKeyChar()+"\' is a vowel");
			}
			else{
				System.out.println("\'"+e.getKeyChar()+"\' is a consonant");
			}
		}
	}
}
