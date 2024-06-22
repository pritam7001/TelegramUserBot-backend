package botUserManagement.messageHandler.repository;

import botUserManagement.messageHandler.domain.BUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BUserRepository extends JpaRepository<BUser,Integer> {
    BUser findByUserId(Long userId);
}
