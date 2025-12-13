package main.bot.keyboards;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MainMenuKeyboard {
    public ReplyKeyboardMarkup getKeyboard(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardRow = new ArrayList<KeyboardRow>();

        KeyboardRow firstRow = new KeyboardRow();
        KeyboardRow secondRow = new KeyboardRow();
        KeyboardRow thirdRow = new KeyboardRow();
        KeyboardRow fourthRow = new KeyboardRow();
        KeyboardRow fifthRow = new KeyboardRow();
        KeyboardRow sixthRow  = new KeyboardRow();


        KeyboardButton firstButton = new KeyboardButton();
        KeyboardButton secondButton = new KeyboardButton();
        KeyboardButton thirdButton = new KeyboardButton();
        KeyboardButton fourthButton = new KeyboardButton();
        KeyboardButton fifthButton = new KeyboardButton();
        KeyboardButton sixthButton = new KeyboardButton();





        firstButton.setText("НАЙТИ УПРАЖНЕНИЕ ПО ГРУППЕ МЫШЦ");
        firstRow.add(firstButton);

        secondButton.setText("НАЙТИ ГРУППУ МЫШЦ ПО УПРАЖНЕНИЮ");
        secondRow.add(secondButton);

        thirdButton.setText("РАСЧЕТ МАКСИМАЛЬНОГО ВЕСА В УПРАЖНЕНИИ");
        thirdRow.add(thirdButton);

        fourthButton.setText("РАСПИСАНИЕ ТРЕНИРОВОК");
        fourthRow.add(fourthButton);

        fifthButton.setText("РЕКОМЕНДАЦИИ ПО ПИТАНИЮ");
        fifthRow.add(fifthButton);

        sixthButton.setText("ОБНОВИТЬ МЕНЮ");
        sixthRow.add(sixthButton);



        keyboardRow.add(firstRow);
        keyboardRow.add(secondRow);
        keyboardRow.add(thirdRow);
        keyboardRow.add(fourthRow);
        keyboardRow.add(fifthRow);
        keyboardRow.add(sixthRow);




        replyKeyboardMarkup.setKeyboard(keyboardRow);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        replyKeyboardMarkup.setSelective(true);


        return replyKeyboardMarkup;

    }
}
