import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay game = new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BRICK BREAKER");
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(game);
        obj.setVisible(true);
        obj.setResizable(false);


    }

}