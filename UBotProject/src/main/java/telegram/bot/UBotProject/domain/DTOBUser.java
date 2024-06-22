package telegram.bot.UBotProject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DTOBUser {
    private int Id;
    private Long userId;
}
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//public class BUser {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int Id;
//    private Long userId;
//}