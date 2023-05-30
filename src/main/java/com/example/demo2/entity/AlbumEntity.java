package com.example.demo2.entity;

import javax.persistence.*;

@Entity
@Table(name = "album_table")
public class AlbumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false)
    private String songName;
    @Column(length = 50,nullable = false)
    private String songAlbum;
    @Column
    private int songPlaytime;
    @Column(length = 50,nullable = false)
    private String songArtist;
    @Column(length = 500)
    private String songIyrics;
}
