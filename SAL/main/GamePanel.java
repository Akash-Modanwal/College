package main;
//import java.util.*;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import inputs.MouseInputs;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
public class GamePanel extends JPanel{
    private MouseInputs mouse;
    private Random random;//'random' to access Random
    private int player1 = 1, player2 = 1;
    
    private java.awt.image.BufferedImage bg;
    private java.awt.image.BufferedImage bg1;
    private java.awt.image.BufferedImage bg2;
    private java.awt.image.BufferedImage bg3;
    private java.awt.image.BufferedImage bg4;
    private java.awt.image.BufferedImage img;
    private java.awt.image.BufferedImage img1;
    private java.awt.image.BufferedImage img2;
    private java.awt.image.BufferedImage last;
    private java.awt.image.BufferedImage last1;
    private java.awt.image.BufferedImage last2;
    private java.awt.image.BufferedImage last3;
    private java.awt.image.BufferedImage last4;
    private java.awt.image.BufferedImage last5;
    private java.awt.image.BufferedImage last6;
    private java.awt.image.BufferedImage last7;

    private float xDelta = 40, yDelta=610;//red in motion
    private float xDel = 10, yDel = 610;//green in motion//ludo token
    private int level1=1,level2=1;
    private int value1,value2;
    private int hurray=0;

      public GamePanel(){
        //new SnakeAndLadder();
        // System.out.println("\n\nYou are going to play a SNAKE AND LADDER game against pc");
        random = new Random();//Random will not work without this initialisation
        mouse = new MouseInputs(this);//this is a keyword to import mouse inputs in gamepanel
        importImage();
        setPanelSize();

        addMouseListener(mouse);
        addMouseMotionListener(mouse); 
        
      }

      public void checkPos(int x,int y){
        if(x>755 && y>500){
          change();
        }
      }
      private void importImage() {
        InputStream is = getClass().getResourceAsStream("/res/Board1.jpg");
        try {
          bg1 =ImageIO.read(is);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream s = getClass().getResourceAsStream("/res/pawnr.jpg");
        try {
          img1 =ImageIO.read(s);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream si = getClass().getResourceAsStream("/res/pawng.jpg");
        try {
          img2 =ImageIO.read(si);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream b = getClass().getResourceAsStream("/res/bg3.jpg");
        try {
          bg =ImageIO.read(b);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bi = getClass().getResourceAsStream("/res/smb.jpg");
        try {
          bg2 =ImageIO.read(bi);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bj = getClass().getResourceAsStream("/res/play.jpg");
        try {
          img =ImageIO.read(bj);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bk = getClass().getResourceAsStream("/res/santa.png");
        try {
          bg3 =ImageIO.read(bk);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bl = getClass().getResourceAsStream("/res/fr1.png");
        try {
          bg4 =ImageIO.read(bl);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bo = getClass().getResourceAsStream("/res/trophy.png");
        try {
          last =ImageIO.read(bo);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bp = getClass().getResourceAsStream("/res/win.png");
        try {
          last1 =ImageIO.read(bp);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bm = getClass().getResourceAsStream("/res/try.png");
        try {
          last2 =ImageIO.read(bm);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream bn = getClass().getResourceAsStream("/res/fireball.png");
        try {
          last3 =ImageIO.read(bn);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream nb = getClass().getResourceAsStream("/res/sorrow.png");
        try {
          last4 =ImageIO.read(nb);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream mb = getClass().getResourceAsStream("/res/sprinklers.png");
        try {
          last5 =ImageIO.read(mb);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream kb = getClass().getResourceAsStream("/res/tiles.png");
        try {
          last6 =ImageIO.read(kb);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
        InputStream lb = getClass().getResourceAsStream("/res/cloud.png");
        try {
          last7 =ImageIO.read(lb);
        } catch (IOException e) {
          
          e.printStackTrace();
        }
      }

      private void setPanelSize() {
        Dimension size = new Dimension(1000,700);
        setPreferredSize(size);
      }

      private void win(){
        if(player1==100){
          System.out.println("HURRAY YOU WON!!");
          hurray=1;
        }
        if(player2==100){
          System.out.println("YOU LOSE!!");
          hurray=2;
        }
        repaint();
      }
      private void sal(){
        //Snake
        if(player1==16){
          player1=6;
          level1=1;
          yDelta += 70;
          xDelta +=70;
        }
        else if(player1==47){
          player1=26;
          level1=3;
          yDelta += 2*70;
          xDelta -=70;
        }
        else if(player1==49){
          player1=30;
          level1=3;
          yDelta += 2*70;
          xDelta +=70;
        }
        else if(player1==56){
          player1=53;
          level1=6;
          yDelta += 0;
          xDelta += 3*70;
        }
        else if(player1==62){
          player1=19;
          level1=2;
          yDelta += 5*70;
          xDelta -= 0;
        }
        else if(player1==63){
          player1=60;
          level1=6;
          yDelta += 70;
          xDelta -= 2*70;
        }
        else if(player1==87){
          player1=24;
          level1=3;
          yDelta += 6*70;
          xDelta -= 3*70;
        }
        else if(player1==93){
          player1=73;
          level1=8;
          yDelta += 2*70;
          xDelta -= 0;
        }
        else if(player1==95){
          player1=75;
          level1=8;
          yDelta += 2*70;
          xDelta -= 0;
        }
        else if(player1==98){
          player1= 78;
          level1=8;
          yDelta += 2*70;
          xDelta -=0;
        }
        if(player2==16){
          player2=6;
          level2=1;
          yDel += 70;
          xDel +=70;
        }
        else if(player2==47){
          player2=26;
          level2=3;
          yDel += 2*70;
          xDel -=70;
        }
        else if(player2==49){
          player2=30;
          level2=3;
          yDel += 2*70;
          xDel +=70;
        }
        else if(player2==56){
          player2=53;
          level2=6;
          yDel += 0;
          xDel += 3*70;
        }
        else if(player2==62){
          player2=19;
          level2=2;
          yDel += 5*70;
          xDel -= 0;
        }
        else if(player2==63){
          player2=60;
          level2=6;
          yDel += 70;
          xDel -= 2*70;
        }
        else if(player2==87){
          player2=24;
          level2=3;
          yDel += 6*70;
          xDel -= 3*70;
        }
        else if(player2==93){
          player2=73;
          level2=8;
          yDel += 2*70;
          xDel -= 0;
        }
        else if(player2==95){
          player2=75;
          level2=8;
          yDel += 2*70;
          xDel -= 0;
        }
        else if(player2==98){
          player2= 78;
          level2=8;
          yDel += 2*70;
          xDel -=0;
        }
        //Ladder
        if(player1==4){
          player1=14;
          level1=2;
          yDelta -= 70;
          xDelta +=  3*70;
        }
        else if(player1==9){
          player1=31;
          level1=4;
          yDelta -= 3*70;
          xDelta += 70;
        }
        else if(player1==20){
          player1=38;
          level1=4;
          yDelta -= 2*70;
          xDelta += 2*70;
        }
        else if(player1==21){
          player1=42;
          level1=5;
          yDelta -= 2*70;
          xDelta += 70;
        }
        else if(player1==28){
          player1=84;
          level1=9;
          yDelta -= 6*70;
          xDelta -= 4*70;
        }
        else if(player1==36){
          player1=44;
          level1=5;
          yDelta -= 70;
          xDelta -= 70;
        }
        else if(player1==51){
          player1=67;
          level1=7;
          yDelta -= 70;
          xDelta -= 3*70;
        }
        else if(player1==71){
          player1=91;
          level1=10;
          yDelta -= 2*70;
          xDelta += 0;
        }
        else if(player1==80){ 
          player1=81;
          level1=9;
          yDelta -= 70;
          xDelta += 0;
        }
        if(player2==4){
          player2=14;
          level2=2;
          yDel -= 70;
          xDel +=  3*70;
        }
        else if(player2==9){
          player2=31;
          level2=4;
          yDel -= 3*70;
          xDel += 70;
        }
        else if(player2==20){
          player2=38;
          level2=4;
          yDel -= 2*70;
          xDel += 2*70;
        }
        else if(player2==21){
          player2=42;
          level2=5;
          yDel -= 2*70;
          xDel += 70;
        }
        else if(player2==28){
          player2=84;
          level2=9;
          yDel -= 6*70;
          xDel -= 4*70;
        }
        else if(player2==36){
          player2=44;
          level2=5;
          yDel -= 70;
          xDel -= 70;
        }
        else if(player2==51){
          player2=67;
          level2=7;
          yDel -= 70;
          xDel -= 3*70;
        }
        else if(player2==71){
          player2=91;
          level2=10;
          yDel -= 2*70;
          xDel += 0;
        }
        else if(player2==80){ 
          player2=81;
          level2=9;
          yDel -= 70;
          xDel += 0;
        }
        win();
      }

      private void motion(){
          if((player1+value1)<=100){
          for(int i=1;i<=value1;i++){
            if((player1%10)==0){
              yDelta -=70;
              level1++;
              player1++;
              continue;
            }
            if((level1%2)==0){
            xDelta -=70;
            player1++;
            }
            else{
            xDelta += 70;
            player1++;
            }
          }
        }
        if((player2+value2)<=100){
          for(int i=1;i<=value2;i++){
            if((player2%10)==0){
              yDel -=70;
              level2++;
              player2++;
              continue;
            }
            if((level2%2)==0){
            xDel -=70;
            player2++;
            }
            else{
            xDel += 70;
            player2++;
            }
          }
        }
        sal();
      }

      public int change() {
        value1=random.nextInt(6)+1;//0-5  so add 1 makes 1-6
        value2=random.nextInt(6)+1;
        System.out.print("\nPLAYER  "+value1+"  VS  ");
        System.out.println("COMPUTER  "+value2);
        motion();
        System.out.println("Score : "+player1+"               "+player2);
        repaint();
        return 0;
      }
      
      public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg, 700, 0, 300, 700,null);//background
        g.drawImage(bg3, 670, 320, 370, 450, null);//santa
        g.drawImage(bg1, 0, 0, 700, 700, null);//board
        g.drawImage(bg2, 770, 50, 170, 100, null);//sal
        g.drawImage(img, 755, 500, 220, 160, null);//play
        g.drawImage(bg4, 700, 0, 300, 700, null);//wall
        g.drawImage(img2, (int)xDel, (int)yDel, 35, 55, null);//green
        g.drawImage(img1, (int)xDelta, (int)yDelta, 35, 55, null);//red//int compulsory
        if(hurray==1){
          g.drawImage(last6, 0, 0, 700, 700, null);//tiles
          g.drawImage(last5, 150, 150, 400, 400, null);//sprinklers
          g.drawImage(last7, 0,0, 700, 700, null);//cloud
          g.drawImage(last3, 150, 150, 400, 400, null);//fireball
          g.drawImage(last, 250, 150, 200, 450, null);//trophy
          g.drawImage(last1, 150, 250, 400, 150, null);//win
        }
        else if(hurray==2){
          g.drawImage(last6, 0, 0, 700, 700, null);
          g.drawImage(last7, 0, 0, 700, 700, null);
          g.drawImage(last4, 150, 150, 400, 400, null);
          g.drawImage(last2, 150, 150, 400, 400, null);//try
        }
      }
}