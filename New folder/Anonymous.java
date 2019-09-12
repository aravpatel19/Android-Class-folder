import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Anonymous2 extends JPanel{

	public Anonymous2(){

		JFrame frame = new JFrame();
		frame.add(this);
		frame.setVisible(true);
		setFocusable(true);

		MouseListener key = new KeyboardInterface();

		addMouseListener( key);
	}

	public static void main(String[]args){

		Anonymous2 demo = new Anonymous2();

	}

	public class KeyboardInterface implements MouseListener{

		private double distance;
		private int xRel;
		private int yRel;
		private int xPres;
		private int yPres;

		public void mouseExited(MouseEvent e){
		}
		public void mouseEntered(MouseEvent e){

		}
		public void mouseClicked(MouseEvent e){

		}
		public void mouseReleased(MouseEvent e){
			xRel = e.getX();
			yRel = e.getY();

			System.out.println(e.getLocationOnScreen());
			System.out.println(Math.sqrt(((xRel-xPres)*(xRel-xPres)) + ((yRel-yPres)*(yRel-yPres))));
		}
		public void mousePressed(MouseEvent e){

			xPres = e.getX();
			yPres = e.getY();

			System.out.println(e.getLocationOnScreen());

		}
	}
}
