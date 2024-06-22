package botUserManagement.messageHandler.domain;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Long userId;
}
