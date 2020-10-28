import java.io.Serializable;
import java.time.LocalDate;

public class CanBo implements Serializable {
    String name;
    LocalDate dateOfBirth;
    String hometown;

    public CanBo() {
    }

    public CanBo(String name, LocalDate dateOfBirth, String hometown) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Thong tin ca nhan{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
