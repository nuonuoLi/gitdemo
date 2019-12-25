package speak;

public class People {
    private String name;
    private Integer age;
    public People(String name,Integer age){
        this.age=age;
        this.name=name;
    }
    public void speak(){
        System.out.println("I am "+this.name);
    }
}
