package main.bot.keyboards.nomainmusclkeyboard;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Grud {
    public ReplyKeyboardMarkup getGrudKeyboard(){
        ReplyKeyboardMarkup grudKeyboard = new ReplyKeyboardMarkup();
        List<KeyboardRow> row = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("ВЕРХНЯЯ ГРУДЬ"));


        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("СРЕДНЯЯ ГРУДЬ"));


        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("НИЖНЯЯ ГРУДЬ"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("НАЗАД К ГРУППАМ МЫШЦ"));

        row.add(row1);
        row.add(row2);
        row.add(row3);
        row.add(row4);


        grudKeyboard.setKeyboard(row);
        grudKeyboard.setResizeKeyboard(true);
        grudKeyboard.setOneTimeKeyboard(false);
        grudKeyboard.setSelective(true);

        return grudKeyboard;







    }
}
