package style;

import java.awt.Font;

public class FontStyle {
    public Font mont(int fontSize) {
        Font mont = new Font("Montserrat", Font.BOLD, fontSize);
        
        return mont;
    }
    
    public Font karla(int fontSize) {
        Font karla = new Font("Karla", Font.BOLD, fontSize);
        
        return karla;
    }
}
