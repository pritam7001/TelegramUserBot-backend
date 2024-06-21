package telegram.bot.UBotProject.service.component;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "https://t.me/zeerosbot";
    }

    @Override
    public String getBotToken() {
        return "6968796956:AAFATURAjaIyfVm_ariwqdDU_zPEK_r4sTg";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }
}
