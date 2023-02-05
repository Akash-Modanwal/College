package main;

public class Game implements Runnable{
    private GamePanel gamePanel;
    private Thread gameThread;
    //private final int fps_set=120;

    public Game(){
       gamePanel = new GamePanel();
       new GameWindow(gamePanel);
       gamePanel.requestFocus();
       startGameLoop();
    }

    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
  /*      double timePerFrame = 1000000000.0 / fps_set;
        long lastFrame = System.nanoTime();
        long now =System.nanoTime();
        int frames = 0;
        long lastCheck =System.currentTimeMillis();
        while(true){   
            now = System.nanoTime();
            if(now - lastFrame >= timePerFrame){
                gamePanel.repaint();
                lastFrame = now;
                frames++;
            }
        if (System.currentTimeMillis() - lastCheck >= 1000) { 
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS:" + frames);
            frames = 0;
        }  
        
    }
    */
}
}