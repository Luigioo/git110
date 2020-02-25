import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Game implements ActionListener{
	JFrame frame = new JFrame("week17");
	JPanel panel = new JPanel();
	JPanel midp = new JPanel();
	BorderLayout lay = new BorderLayout();
	GridLayout gri = new GridLayout(1,3);

	JButton top = new JButton("top");
	JButton left = new JButton(">");
	JButton center = new JButton("<");
	JButton right = new JButton("=");
	JButton buttom = new JButton("reset");

	int[] nums = new int[4];

    /*public static void main(String[] args){
        
		

	}*/
	public Game(){
		panel.setLayout(lay);
		frame.setContentPane(panel);

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

		
		panel.add("North", top);
		//panel.add("East", left);
		panel.add("Center", midp);
		//panel.add("West", right);
		panel.add("South", buttom);
		midp.add(left);
		midp.add(center);
		midp.add(right);
		midp.setLayout(gri);

		top.addActionListener(this);
		left.addActionListener(this);
		center.addActionListener(this);
		right.addActionListener(this);
		buttom.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		//System.out.println(e.getSource().toString());
		if (e.getSource() == left){
			if(nums[0]+nums[1] > nums[2]+nums[3]){
				top.setText("CORRECT");
			}else{
				top.setText("WROOONNNGG!!!!");
			}
		}
		if (e.getSource() == center){
			if(nums[0]+nums[1] < nums[2]+nums[3]){
				top.setText("CORRECT");
			}else{
				top.setText("WROOONNNGG!!!!");
			}
		}
		if (e.getSource() == right){
			if((nums[0]+nums[1]) == (nums[2]+nums[3])){
				top.setText("CORRECT");
			}else{
				top.setText("WROOONNNGG!!!!");
			}
		}
		if (e.getSource() == buttom){
			for(int i=0; i<nums.length; i++){
				nums[i] = (int)(Math.random()*100)%3;
			}
			top.setText(nums[0] + " " + nums[1] + "compare to " + nums[2] + " " + nums[3]);
		}
	}

	public static void main(String[] args){
        Game ga = new Game();
        
    }
}