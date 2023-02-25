package oodms.oop;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseHover {
    public void mouseHoverEffect(String[] componentTexts, JPanel[] allJPanel) {
        Font plainKarla = new Font("Karla", Font.PLAIN, 14);
        Font boldKarla = new Font("Karla", Font.BOLD, 14);
        
        for(JPanel jPanel : allJPanel) {
            Component[] components = jPanel.getComponents();

            for(Component component : components) {
                if(component instanceof JLabel jLabel) {
                    var componentDisplayText = ((JLabel) component).getText();

                    for(String componentText : componentTexts) {
                        if(componentDisplayText.equals(componentText)) {
                            JLabel label = jLabel;
                            label.addMouseListener(new MouseAdapter() {
                               @Override
                               public void mouseEntered(MouseEvent e) {
                                   label.setFont(boldKarla);
                               }

                               @Override
                               public void mouseExited(MouseEvent e) {
                                   label.setFont(plainKarla);
                               }
                            });
                        }
                    }
                }
            }
        }
    }
}
