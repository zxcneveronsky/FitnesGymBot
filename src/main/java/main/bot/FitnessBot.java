package main.bot;

import main.bot.exercise_data.ExerciseData;
import main.bot.exercise_data.models.Exercise;
import main.bot.keyboards.MainMenuKeyboard;
import main.bot.keyboards.MusclMenuKeyboard;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class FitnessBot extends TelegramLongPollingBot {

    private MainMenuKeyboard mainMenuKeyboard = new MainMenuKeyboard();
    private MusclMenuKeyboard musclMenuKeyboard = new MusclMenuKeyboard();
    private ExerciseData exerciseData = new ExerciseData();
    private void sendMessageAndKeyboard(Long chatId, String text, ReplyKeyboardMarkup keyboard){

        try{
            SendMessage message = new SendMessage();
            message.setText(text);
            message.setChatId(chatId);
            message.setReplyMarkup(keyboard);
            execute(message);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }



    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText() ){

            String textUser = update.getMessage().getText();

            Long userChatId = update.getMessage().getChat().getId();

            if (textUser.equals("/start")) {

                SendMessage textMessageHello = new SendMessage();
                textMessageHello.setChatId(userChatId);
                textMessageHello.setText("Приветствую Вас в Нашем Фитнес Боте!");

                try {
                    execute(textMessageHello);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

                SendMessage textMessageMenu = new SendMessage();
                textMessageMenu.setChatId(userChatId);
                textMessageMenu.setText("ВЫБЕРИТЕ ДЕЙСТВИЕ:");

                ReplyKeyboardMarkup keyboard = mainMenuKeyboard.getKeyboard();
                textMessageMenu.setReplyMarkup(keyboard);

                try {
                    execute(textMessageMenu);
                }catch (TelegramApiException e){
                    e.printStackTrace();
                }
            } else if (textUser.equals("НАЙТИ УПРАЖНЕНИЕ ПО ГРУППЕ МЫШЦ")) {
                    sendMessageAndKeyboard(userChatId,"ВЫБЕРИТЕ ГРУППУ МЫШЦ", musclMenuKeyboard.getKeyboard());

            } else if (textUser.equals("НАЙТИ ГРУППУ МЫШЦ ПО УПРАЖНЕНИЮ")) {
                SendMessage textMessageTren = new SendMessage();
                textMessageTren.setChatId(userChatId);
                textMessageTren.setText("заглушка");
                try{
                    execute(textMessageTren);
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
            } else if (textUser.equals("РАСЧЕТ МАКСИМАЛЬНОГО ВЕСА В УПРАЖНЕНИИ")) {
                SendMessage textMessageCalc = new SendMessage();
                textMessageCalc.setChatId(userChatId);
                textMessageCalc.setText("заглушка");
                try{
                    execute(textMessageCalc);
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
            } else if (textUser.equals("РАСПИСАНИЕ ТРЕНИРОВОК")) {
                SendMessage textMessageTime = new SendMessage();
                textMessageTime.setChatId(userChatId);
                textMessageTime.setText("заглушка");
                try{
                    execute(textMessageTime);
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
            } else if (textUser.equals("РЕКОМЕНДАЦИИ ПО ПИТАНИЮ")) {
                SendMessage textMessageRecomend = new SendMessage();
                textMessageRecomend.setChatId(userChatId);
                textMessageRecomend.setText("заглушка");
                try{
                    execute(textMessageRecomend);
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
            } else if (textUser.equals("ОБНОВИТЬ МЕНЮ")) {
                String text = "ВЫБЕРИТЕ ДЕЙСТВИЕ";
                sendMessageAndKeyboard(userChatId,text,mainMenuKeyboard.getKeyboard());
            } else if (textUser.equals("ГРУДЬ") ||
                    textUser.equals("СПИНА") ||
                    textUser.equals("НОГИ") ||
                    textUser.equals("БИЦЕПС") ||
                    textUser.equals("ТРИЦЕПС") ||
                    textUser.equals("ПЛЕЧИ") ||
                    textUser.equals("ПРЕСС")) {
                List<Exercise> newExercises = exerciseData.findExerciseForMuscl(textUser);

                StringBuilder answer = new StringBuilder();
                answer.append("УПРАЖНЕНИЯ ДЛЯ МЫШЦЫ: ").append(textUser).append(":\n\n");

                for (Exercise ex:newExercises ) {
                    answer.append("НАЗВАНИЕ: ").append(ex.getName()).append("\n");
                    answer.append("ОБОРУДОВАНИЕ: ").append(ex.getEquipment()).append("\n");
                    answer.append("ИНСТРУКЦИЯ: ").append(ex.getInstructions()).append("\n\n");
                }
                SendMessage newMessage = new SendMessage();
                newMessage.setChatId(userChatId);
                newMessage.setText(String.valueOf(answer));
                try{
                    execute(newMessage);
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }




            }


        }
    }


    @Override
    public String getBotUsername() {
        return "FitnesGymBot";
    }

    @Override
    public String getBotToken() {
        return "8387559059:AAHbJmrlbKR9B5tR5QMzRGHAzj5EEbONEVg";
    }
}
