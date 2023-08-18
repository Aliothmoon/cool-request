package com.hxl.plugin.springboot.invoke.net;

public class FormDataInfo {
    private String name;
    private String value;
    private String type;

    public FormDataInfo(String name, String value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public FormDataInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}