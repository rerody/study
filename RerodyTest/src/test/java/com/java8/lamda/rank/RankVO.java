package com.java8.lamda.rank;

public class RankVO {

    private int id;

    private int type;

    private long date;

    private long value;

    private String humanId;

    private String humanName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public RankVO() {
    }

    public RankVO(int id, int type, long date, long value, String humanId, String humanName) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.value = value;
        this.humanId = humanId;
        this.humanName = humanName;
    }
}
