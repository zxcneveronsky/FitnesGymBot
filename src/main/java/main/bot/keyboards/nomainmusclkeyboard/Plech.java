package main.bot.keyboards.nomainmusclkeyboard;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Plech {
    public ReplyKeyboardMarkup getPlechKeyboard(){
        ReplyKeyboardMarkup plechKeyboard = new ReplyKeyboardMarkup();
        List<KeyboardRow> row = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("ПЕРЕДНЯЯ ДЕЛЬТА"));


        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("СРЕДНЯЯ ДЕЛЬТА"));


        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("ЗАДНЯЯ ДЕЛЬТА"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("НАЗАД К ГРУППАМ МЫШЦ"));

        row.add(row1);
        row.add(row2);
        row.add(row3);
        row.add(row4);


        plechKeyboard.setKeyboard(row);
        plechKeyboard.setResizeKeyboard(true);
        plechKeyboard.setOneTimeKeyboard(false);
        plechKeyboard.setSelective(true);

        return plechKeyboard;







    }
}
