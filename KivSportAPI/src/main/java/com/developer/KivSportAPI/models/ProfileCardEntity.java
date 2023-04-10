package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ProfileCard")
public class ProfileCardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profile_card", nullable = false)
    private Long id;

    @Column(name = "card_id", nullable = false)
    private Long cardid;

    @Column(name = "profile_id", nullable = false)
    private Long profileid;

    public ProfileCardEntity() {
    }

    public ProfileCardEntity(Long id, Long cardid, Long profileid) {
        this.id = id;
        this.cardid = cardid;
        this.profileid = profileid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCardid() {
        return cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    public Long getProfileid() {
        return profileid;
    }

    public void setProfileid(Long profileid) {
        this.profileid = profileid;
    }
}
