public class BloodData {

    private String bloodType;

    private String rhFactor;

    public BloodData() {

    }

    public BloodData(String bType, String rh){

    }

    public void setBloodType(String bType) {

    }

    public String getBloodType() {

    }

    public void setRhFactor(String rh) {

    }

    public String getRhFactor() {

    }

}

public class Patient {

    private String id;

    private int age;

    private BloodData bloodData;

    public Patient() {

    }

    public Patient(String id, int age, StringbType, String rhFactor) {

    }

    public String getId() {

    }

    public void setId(String id) {

    }

    public int getAge() {

    }

    public void setAge(int age) {

    }

    public BloodData getBloodData() {

    }

    public void setBloodData(BloodData b) {

    }

}



public class TestPatient {

    public static void main(String[] args) {

        Patient p1 = newPatient();

        Patient p2 = newPatient("1234", 35, "B", "+");

        BloodData b2 = newBloodData("A", "-");

        display(p1);

        display(p2);

        p1.setId("3456");

        p1.setAge(42);

        BloodData b = newBloodData("AB", "-");

       p1.setBloodData(b);

        display(p1);

    }

    public static void display(Patient p) {

        BloodData bt =p.getBloodData();

       System.out.println("Patient #" + p.getId() + " age: " + +p.getAge() + "n   The blood is type " +bt.getBloodType() + bt.getRhFactor());

    }

}