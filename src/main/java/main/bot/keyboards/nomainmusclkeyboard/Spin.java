package main.bot.keyboards.nomainmusclkeyboard;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Spin {
    public ReplyKeyboardMarkup getSpinKeyboard(){
        ReplyKeyboardMarkup spinKeyboard = new ReplyKeyboardMarkup();
        List<KeyboardRow> row = new ArrayList<KeyboardRow>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("ШИРОЧАЙШАЯ МЫШЦА"));


        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("ТРАПЕЦИЯ"));


        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("РОМБОВИДНАЯ"));

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("ПОЯСНИЦА"));


        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("НАЗАД К ГРУППАМ МЫШЦ"));

        row.add(row1);
        row.add(row2);
        row.add(row3);
        row.add(row4);
        row.add(row5);


        spinKeyboard.setKeyboard(row);
        spinKeyboard.setResizeKeyboard(true);
        spinKeyboard.setOneTimeKeyboard(false);
        spinKeyboard.setSelective(true);

        return spinKeyboard;







    }
}
