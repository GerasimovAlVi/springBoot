package ru.gerasimov.se.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "app_message")
public class Message extends AbstractEntity {

    @Column(name = "creation_date", nullable=false)
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User user;

    private String text;

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
