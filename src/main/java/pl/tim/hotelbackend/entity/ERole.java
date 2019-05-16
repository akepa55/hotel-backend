package pl.tim.hotelbackend.entity;

public enum ERole {

    USER ("USER"),
    ADMIN ("ADMIN");

    private String name;

    ERole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
