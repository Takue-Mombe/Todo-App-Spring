package com.todoapp.todoapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter

@Table(name = "Notes")
public class home {

    @Column(name = "value")
    String value;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
