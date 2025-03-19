package com.url.shortener.models;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import java.time.LocalDateTime;


@Entity
@Data

public class urlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount = 0;
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "urlMapping")
    private List<ClickEvent> clickEvents;
}
