package indi.Test.jdbc;

import java.util.Date;

public class Orders {
    private int id;
    private String name;
    private Date birth;

    public Orders() {
    }

    public Orders(int id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
