import java.util.*;
import java.lang.*;

public class Code{
    public static void main(String args[]){
        int wwid = 1000;
        int hhig = 500;

        int bdia = 20;

        boolean running = true;
        
        Ball[] balls = new Ball[6];
        balls[0] = new Ball();
        balls[1] = new Ball();
        balls[2] = new Ball();
        balls[3] = new Ball();
        balls[4] = new Ball();
        balls[5] = new Ball();


        GameArena game = new GameArena(wwid, hhig);

        Random rand = new Random();
        for(Ball ba : balls){
            System.out.println("ball created");
            ba.iniBall(rand.nextInt(wwid), rand.nextInt(hhig), bdia, "CYAN");
            game.addBall(ba);
        }
        
        
        long timeSinceStart = System.nanoTime() / 1000;
        long oldTimeSinceStart = timeSinceStart;
        long deltaTime = 1;

        boolean spaceP = false;

        while(running){
            
            timeSinceStart = System.nanoTime() / 1000;
            deltaTime = timeSinceStart - oldTimeSinceStart;
            oldTimeSinceStart = timeSinceStart;
            
            
            if(game.spacePressed()){
                if(!spaceP){
                    System.out.println("pressed");
                    for (Ball ba : balls){
                        ba.setPosition(rand.nextInt(wwid), rand.nextInt(hhig));
                        ba.randSpeed();
                    }
                    spaceP = true;
                }
            }else{
                spaceP = false;
            }
            
            for (Ball ba : balls){
                
                ba.updatePos(deltaTime);

                if(ba.getXPosition()>wwid || ba.getXPosition()<0){
                    ba.flipx();
                }
                if(ba.getYPosition()<0){
                    ba.flipy();
                }
                if(ba.getYPosition()>hhig){
                    ba.bounce();
                }
            }
            
        }

        }
}