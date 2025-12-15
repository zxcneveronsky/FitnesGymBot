package main.bot.keyboards;


import com.google.gson.Gson;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExerciseMenuKeyboard {
    private static final String KEYBOARD_FILE="/exercises/exercises_keyboard.json";
    private Gson gson;


    public ExerciseMenuKeyboard(){
        this.gson=new Gson();
    }
    public ReplyKeyboardMarkup loadKeyboard(){
        try {
            InputStream pot = ExerciseMenuKeyboard.class.getResourceAsStream(KEYBOARD_FILE);
            InputStreamReader liss = new InputStreamReader(pot);
            ReplyKeyboardMarkup keyboardMarkup = gson.fromJson(liss,ReplyKeyboardMarkup.class);
            liss.close();
            return keyboardMarkup;

        } catch (Exception e){
            System.out.println("Ошибка при чтении JSON"+e.getMessage());
            return setNoneKey();


        }
    }
    private ReplyKeyboardMarkup setNoneKey(){
        ReplyKeyboardMarkup key = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("ОШИБКА"));
        rows.add(row);

        key.setKeyboard(rows);
        key.setResizeKeyboard(true);
        key.setOneTimeKeyboard(false);
        key.setSelective(true);


        return key;

    }

}
