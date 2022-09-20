import java.util.*;

enum Colors{
    RED, GREEN, PURPLE, WHITE;
    public static final Random colorPicker=new Random();
    public static Colors pickRandomColor(){
        Colors[] colorsArray=values();
        return colorsArray[colorPicker.nextInt(4)];
    }
}
class ghost{
    String color;
    public ghost() {
        color=Colors.pickRandomColor().toString();
    }
}

public class GhostClass {
    public static void main(String[] args) {
        ghost color1=new ghost();
        ghost color2=new ghost();
        ghost color3=new ghost();
        ghost color4=new ghost();
        ghost color5=new ghost();
        System.out.println(color1.color);
        System.out.println(color2.color);
        System.out.println(color3.color);
        System.out.println(color4.color);
        System.out.println(color5.color);
    }
}
