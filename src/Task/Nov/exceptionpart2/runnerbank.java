package Task.Nov.exceptionpart2;

public class runnerbank {
    public static void main(String[] args) throws Exception {
        Bank sbi=new Bank("rupee",100);
        Bank icic=new Bank("rupee",123);

        System.out.println(sbi.add(icic));

        Bank jpmorg=new Bank("USD",100);
        System.out.println(sbi.add(jpmorg));

    }
}
