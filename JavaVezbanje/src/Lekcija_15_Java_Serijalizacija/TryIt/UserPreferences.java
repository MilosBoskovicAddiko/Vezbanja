package Lekcija_15_Java_Serijalizacija.TryIt;

import java.io.Serializable;

public class UserPreferences implements Serializable {

    public static final long serialVersionUID =1;
    private String color;
    private String font;
    private int fontSize;

    public String getColor() {
        return color;
    }

    public String getFont() {
        return font;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
