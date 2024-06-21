package telegram.bot.UBotProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import telegram.bot.UBotProject.service.component.TelegramBot;

@SpringBootApplication
public class UBotProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UBotProjectApplication.class, args);
		TelegramBot telegramBot = new TelegramBot();

		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(telegramBot);
		} catch (TelegramApiException e)
		{
			e.printStackTrace();
		}
	}

}
