package Task.Nov.Encapsulation;

public class part2 {
    public static void main(String[] args) {
        details d1=new details();
        d1.setName("pushpa");
        d1.getName();
    }
}

class details{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    private String name;
    private int phoneno;

}
