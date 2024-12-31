package Task.Nov.exceptionpart;

public class Bank {
    public Bank(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private String currency;
    private int amount;

    public  Integer add(Bank bankname) throws Exception {
        if (!bankname.currency.equalsIgnoreCase("rupees")){
            throw new Exception("Currency Mismatch, cant proceed!");
        }
         return  bankname.amount + this.amount;
    }
}
