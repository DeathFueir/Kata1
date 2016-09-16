package kata1;

import java.util.Date;


public class Person {
    private final String name;
    private final Date birthday;
    private final int age;
    
    public Person(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
        this.age = getAge();
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime()- birthday.getTime())/31536000000L);
    }
}
