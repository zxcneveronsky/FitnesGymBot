package main.bot.keyboards.nomainmusclkeyboard;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Nog {
    public ReplyKeyboardMarkup getNogKeyboard(){
        ReplyKeyboardMarkup nogKeyboard = new ReplyKeyboardMarkup();
        List<KeyboardRow> row = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("КВАДРИЦЕПС"));


        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("ЯГОДИЦЫ"));


        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("БИЦЕПС БЕДРА"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("ИКРЫ"));

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("ПРИВОДЯЩИЕ"));


        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("НАЗАД К ГРУППАМ МЫШЦ"));

        row.add(row1);
        row.add(row2);
        row.add(row3);
        row.add(row4);
        row.add(row5);
        row.add(row6);


        nogKeyboard.setKeyboard(row);
        nogKeyboard.setResizeKeyboard(true);
        nogKeyboard.setOneTimeKeyboard(false);
        nogKeyboard.setSelective(true);

        return nogKeyboard;







    }
}
