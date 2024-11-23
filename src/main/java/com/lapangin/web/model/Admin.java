package com.lapangin.web.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Admin extends User {
    @ElementCollection
    private List<String> privileges;

    // Getter & Setter
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }
}

