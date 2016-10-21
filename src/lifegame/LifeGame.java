package lifegame;
import javax.swing.JFrame;

public class LifeGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LifeGame(){
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setSize(480*2,380*2);  
        this.setLocationRelativeTo(null);  
        this.setTitle("LifeGameDemo");
        Map map=new Map();
        this.add(map);
        this.setVisible(true);  
        map.run();
	}
	
	public static void main(String[] args){  
        LifeGame game = new LifeGame();  
        game.setVisible(true);
   
    }  
}
