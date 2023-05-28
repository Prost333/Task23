package task6;

public class Patient {
    private  String name;
    private  String surname;
    private  String  numerroom;
    private  String  diagnoz;

    public Patient(String name, String surname, String numerroom, String diagnoz) {
        this.name = name;
        this.surname = surname;
        this.numerroom = numerroom;
        this.diagnoz = diagnoz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumerroom() {
        return numerroom;
    }

    public void setNumerroom(String numerroom) {
        this.numerroom = numerroom;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numerroom='" + numerroom + '\'' +
                ", diagnoz='" + diagnoz + '\'' +
                '}';
    }
}
