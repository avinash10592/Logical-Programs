package Day43_logicalprograms.LinkedHashSet1;

public class Customer1 {
    String name;

    int id;

    public Customer1(String name, int id) {
        this.name = name;

        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Customer1 customer = (Customer1) obj;

        return (id == customer.id);
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
