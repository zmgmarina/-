package seminarOOP_4.bank1;

public class Person implements PersonalData{

    private final String fio;
    private final String inn;

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return inn;
    }

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }


    @Override
    public String toString() {
        return String.format("%s; %s", inn, fio);
    }
}
