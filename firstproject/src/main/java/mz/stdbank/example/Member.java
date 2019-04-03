package mz.stdbank.example;

import java.io.Serializable;

/**
 * @author Mário Júnior
 */
public class Member implements Serializable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
