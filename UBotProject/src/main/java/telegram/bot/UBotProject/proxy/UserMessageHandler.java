package telegram.bot.UBotProject.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jokerexch-service", url = "http://localhost:9094")
public interface UserMessageHandler {
    @GetMapping("/jokerShandom/deposite")
    ResponseEntity<?> deposite();

}
