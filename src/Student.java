public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name.toLowerCase();
        }else{
            System.out.println("ad kicik herfler olmalidir");
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("yas 0-dan boyuk olmalidir");
        }
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        if(grade >= 1 && grade <= 11){
            this.grade = grade;
        }else{
            System.out.println("sinif 1 ile 11 arasinda olmalidir");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
