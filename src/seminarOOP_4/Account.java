package seminarOOP_4;

public class Account<T> {
    private  final T id;
    private double amount;

    public T getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



    public Account(T id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сумма средств на счете #%s : %.2f руб.", id, amount);
    }
}


