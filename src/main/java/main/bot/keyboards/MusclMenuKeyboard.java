package main.bot.keyboards;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MusclMenuKeyboard {
    public ReplyKeyboardMarkup getKeyboard(){
        ReplyKeyboardMarkup musclKeyboard = new ReplyKeyboardMarkup();
        List<KeyboardRow> row = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("ГРУДЬ"));
        row1.add(new KeyboardButton("СПИНА"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("НОГИ"));
        row2.add(new KeyboardButton("БИЦЕПС"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("ТРИЦЕПС"));
        row3.add(new KeyboardButton("ПЛЕЧИ"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("ПРЕСС"));

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("ОБНОВИТЬ МЕНЮ"));

        row.add(row1);
        row.add(row2);
        row.add(row3);
        row.add(row4);
        row.add(row5);

        musclKeyboard.setKeyboard(row);
        musclKeyboard.setResizeKeyboard(true);
        musclKeyboard.setOneTimeKeyboard(false);
        musclKeyboard.setSelective(true);

        return musclKeyboard;







    }
}
