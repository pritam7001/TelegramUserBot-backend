package telegram.bot.UBotProject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
