package main.bot.keyboards.nomainmusclkeyboard;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Press {
    public ReplyKeyboardMarkup getPressKeyboard(){
        ReplyKeyboardMarkup pressKeyboard = new ReplyKeyboardMarkup();
        List<KeyboardRow> row = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("ВЕРХНИЙ ПРЕСС"));


        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("НИЖНИЙ ПРЕСС"));


        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("КОСЫЕ МЫШЦЫ"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("НАЗАД К ГРУППАМ МЫШЦ"));

        row.add(row1);
        row.add(row2);
        row.add(row3);
        row.add(row4);


        pressKeyboard.setKeyboard(row);
        pressKeyboard.setResizeKeyboard(true);
        pressKeyboard.setOneTimeKeyboard(false);
        pressKeyboard.setSelective(true);

        return pressKeyboard;







    }
}
