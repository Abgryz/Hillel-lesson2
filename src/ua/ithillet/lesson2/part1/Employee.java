package ua.ithillet.lesson2.part1;

public class Employee {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String post, String email, String phone, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName(){
        return  name;
    }
    public String getPost(){
        return  post;
    }
    public String getEmail(){
        return  email;
    }
    public String getPhone(){
        return  phone;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPost(String post) {
        this.post = post;
    }
}
