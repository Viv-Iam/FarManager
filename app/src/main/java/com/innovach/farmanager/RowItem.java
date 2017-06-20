package com.innovach.farmanager;


public class RowItem {

    private String produce_name;
    private int produce_pic_id;

    public RowItem(String produce_name, int produce_pic_id ) {

        this.produce_name = produce_name;
        this.produce_pic_id = produce_pic_id;
    }

    public String getProduce_name() {
        return produce_name;
    }

    public void setProduce_name(String produce_name) {
        this.produce_name = produce_name;
    }

    public int getProduce_pic_id() {
        return produce_pic_id;
    }

    public void setProduce_pic_id(int produce_pic_id) {
        this.produce_pic_id = produce_pic_id;
    }

}