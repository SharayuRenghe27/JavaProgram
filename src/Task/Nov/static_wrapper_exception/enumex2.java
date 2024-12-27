package Task.Nov.static_wrapper_exception;

public class enumex2
{
    public static void main(String[] args) {
        System.out.println(colors.RED.gethexcode());
        if (colors.Green.gethexcode()=="#61FF33")
            System.out.println("Colour is green");

    }
}


enum colors {
    RED("#FF0000"),
    Green("#61FF33"),
    Blue("#3377FF");

    private String hexcode;

    colors(String hexcode) {
        this.hexcode = hexcode;
    }

    String gethexcode() {
        return this.hexcode;
    }
}
