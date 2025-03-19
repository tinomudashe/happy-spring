package com.url.shortener.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="click_event")
public class ClickEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private LocalDateTime clickDate;

    @ManyToOne
    @JoinColumn(name = "url_mapping_id")
    private urlMapping urlMapping;
}
