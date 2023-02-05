package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;//as gamepanel is in another file

public class MouseInputs implements MouseListener, MouseMotionListener {
    
    private GamePanel gamePanel;
    public MouseInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        //System.out.println("drag");
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       // System.out.println("moved");
       // gamePanel.setRectPos(e.getX(), e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("ok");
        gamePanel.checkPos(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // todo auto-generated events by event
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        
    }
    
}
