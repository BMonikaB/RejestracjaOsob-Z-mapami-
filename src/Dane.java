import java.util.Objects;

public class Dane {
    private String name;
    private String lastName;
    private long pesel;

    public Dane(String name, String lastName, long pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dane dane = (Dane) o;
        return pesel == dane.pesel &&
                Objects.equals(name, dane.name) &&
                Objects.equals(lastName, dane.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastName, pesel);
    }

    @Override
    public String toString() {
        return "Dane{" +
                "name=" + name +
                ", lastName=" + lastName +
                ", pesel=" + pesel +
                '}';
    }
}
