package org.koreait;

public class Saying {
    private int id;
    private String regdate;
    private String say;
    private String name;

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Saying (int id, String regdate, String say, String name) {
        this.id = id;
        this.regdate = regdate;
        this.say = say;
        this.name = name;
    }

}
