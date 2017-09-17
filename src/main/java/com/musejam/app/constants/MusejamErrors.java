package com.musejam.app.constants;

public enum MusejamErrors {

    Exception(1011,"Exception");

    private final int code;
    private final String description;

    private MusejamErrors(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }

}
