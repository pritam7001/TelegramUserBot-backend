package telegram.bot.UBotProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import telegram.bot.UBotProject.service.TelegramBot;


@SpringBootApplication
@EnableFeignClients
public class UBotProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UBotProjectApplication.class, args);
	}

}
