package Task.Dec;

public class Stringpractice1 {
    public static void main(String[] args) {

        String s11= new String("Sharayu");
        String s12="Renghe";
        System.out.printf(" s1 length -> %d ",s11.length());
        //s1.charAt(10);-----> no char present so it will give error (String index out of bound exception)
        String s111=s11.concat("ABC");
        System.out.printf("\n s1 new value -> %s \n",s111);
        System.out.println(s11+s12);
        System.out.println(s11.equals(s12));

        s11.compareTo(s12);

        String temp=s11.substring(2,5);
        System.out.println("sub string->"+temp);

        String name="Aditi,roshni,chava,mava";
        System.out.println(name);
        String[]splitname= name.split(",");
        System.out.println(splitname[0]);
        System.out.println(splitname[1]);
        System.out.println(splitname[2]);
        System.out.println(splitname[3]);

        String code="202=333=4889";
        System.out.println(code);
        String[] splitcode= code.split("=");
        System.out.println("part->1"+splitcode[0]);
        System.out.println("part->2"+splitcode[1]);
        System.out.println("part->3"+splitcode[2]);

        String s5=" trimdemo  1 ";
        System.out.println(s5.trim());
        System.out.println(s5.indexOf("r"));

        System.out.println(s5.contains("de"));// will give in boolean->true or false
        System.out.println(s5.lastIndexOf("m"));
        System.out.println(s5.replace("m", "s"));
        System.out.println(s5.replace("m", "M"));
        System.out.println(s5.replaceAll("\\d+"," "));
        System.out.println(s5.replace("\\d+"," "));// see the difference of replace and replace all function (/, $ etc can be replace in replace all cause it use regx(extracting the pattern from the strings))
        System.out.println(s5.replaceAll("m", "M"));

        System.out.println(s5.startsWith(" tri")); // will give in boolean->true or false

        StringBuffer s1=new StringBuffer("Babu");
        s1.append(" moshai");
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s1.replace(1,3,"s"));
        StringBuilder s2=new StringBuilder("Bhaiya");
        s2.append(" sahab");
        System.out.println(s2);
        System.out.println(s2.reverse());






    }
}
