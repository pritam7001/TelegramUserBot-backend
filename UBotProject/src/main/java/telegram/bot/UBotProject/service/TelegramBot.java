package telegram.bot.UBotProject.service;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import telegram.bot.UBotProject.proxy.UserMessageHandler;


import java.util.ArrayList;
import java.util.List;

@Service
public class TelegramBot extends TelegramLongPollingBot {
    @Autowired
    UserMessageHandler userMessageHandler;


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
        if (update.hasMessage()) {
            setMarkupKeyboard(update);
         //   userMessageHandler.deposite();

        }
    }

    public void setMarkupKeyboard(Update update) {
        User user = update.getMessage().getFrom();
        String firstName = user.getFirstName();
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardList = new ArrayList<>();
        KeyboardButton keyboardButton1 = new KeyboardButton();
        KeyboardButton keyboardButton2 = new KeyboardButton();
        KeyboardButton keyboardButton3 = new KeyboardButton();
        KeyboardButton keyboardButton4 = new KeyboardButton();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardButton1.setText("💵 Deposit");
        keyboardButton2.setText("💳 Withdraw");
        keyboardButton3.setText("🆔 My Ids");
        keyboardButton4.setText("📞 Contact Us");
        keyboardRow1.add(keyboardButton1);
        keyboardRow1.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);
        keyboardRow2.add(keyboardButton4);
        keyboardList.add(keyboardRow1);
        keyboardList.add(keyboardRow2);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(
                "👋 Hello " + firstName + "!\n\n" +
                        "✨ I am 🤖 AG-BOT, your friendly assistant. " +
                        "I am here to help you with the following options:\n\n" +
                        "💵 Deposit - Deposit to your userId.\n" +
                        "💳 Withdraw - Withdraw out money from userid.\n" +
                        "🆔 My Ids - View your User IDs.\n" +
                        "📞 Contact Us - Get in touch with support.\n\n" +
                        "Please click on one of the options below 👇 to proceed. 😊"
        );        sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));
        replyKeyboardMarkup.setKeyboard(keyboardList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


//    public static SendMessage sendInlineKeyBoardMessage(long chatId) {
//        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
//        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
//        inlineKeyboardButton1.setText("ठेव");
//        inlineKeyboardButton1.setCallbackData("d");
//        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
//        keyboardButtonsRow1.add(inlineKeyboardButton1);
//        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
//        rowList.add(keyboardButtonsRow1);
//        inlineKeyboardMarkup.setKeyboard(rowList);
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.setChatId(String.valueOf(chatId));
//        sendMessage.setText("Show button sale: ");
//        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
//        return sendMessage;
//    }

}
