public class PersonClass {

    private Integer age;
    private Integer height;
    private String gender;
    private String name;

    public PersonClass(Integer age, Integer height, String gender, String name) {
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        <caret>this.gender = gender;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
