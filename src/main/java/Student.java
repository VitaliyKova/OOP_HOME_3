public class Student {
    private String name;
    private Integer age;
    private Integer yearOfAdmission;

    public Student(String name, Integer age, Integer yearOfAdmission) {
        this.name = name;
        this.age = age;
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(Integer yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    @Override
    public String toString() {
        return  name + ' ' + "age = " + age + ' ' + "Year of admission " + yearOfAdmission + "\n";
    }
}
