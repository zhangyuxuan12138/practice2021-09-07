package com.zhangyuxuan.cglib.beancopy;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/9/26 上午6:46 周日
 */
public class Teacher {
    private String id;
    private String name;
    private String s;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", s='" + s + '\'' +
                '}';
    }
}
