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

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FitnessBot extends TelegramLongPollingBot {

    private MainMenuKeyboard mainMenuKeyboard = new MainMenuKeyboard();
    private MusclMenuKeyboard musclMenuKeyboard = new MusclMenuKeyboard();
    private ExerciseData exerciseData = new ExerciseData();


    private Set<String>  gruppMuscl = new HashSet<>(Arrays.asList("ГРУДЬ", "СПИНА", "НОГИ", "БИЦЕПС", "ТРИЦЕПС", "ПЛЕЧИ", "ПРЕСС"));





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


    private void sendMessage(Long chatId,String text){
        try {
            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            message.setText(text);
            execute(message);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
    private void sendAnswerFindExercise(Long serChatId, String extUser, List<Exercise> ewExercises){
        if (!ewExercises.isEmpty()) {
            StringBuilder answer = new StringBuilder();
            answer.append("УПРАЖНЕНИЯ ДЛЯ МЫШЦЫ: ").append(extUser).append(":\n\n");

            for (Exercise ex : ewExercises) {
                answer.append("НАЗВАНИЕ: ").append(ex.getName()).append("\n");
                answer.append("ОБОРУДОВАНИЕ: ").append(ex.getEquipment()).append("\n");
                answer.append("ИНСТРУКЦИЯ: ").append(ex.getInstructions()).append("\n\n");
            }
            sendMessage(serChatId, String.valueOf(answer));
        } else {
            sendMessage(serChatId,"УПРАЖНЕНИЯ ЕЩЕ НЕ ДОБАВЛЕНЫ ! :( ");
        }
    }



    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText() ){

            String textUser = update.getMessage().getText();

            Long userChatId = update.getMessage().getChat().getId();

            if (textUser.equals("/start")) {

                sendMessage(userChatId,"Приветсвую Вас Спортсмен или Спортсменка \n\n В нашем FitnessGymBot !!! \n\n Ссылка для друзей @FitnesGymBot");


//                sendMessage(userChatId,"ВЫБЕРИТЕ ДЕЙСТВИЕ : ");


                sendMessageAndKeyboard(userChatId,"ВЫБЕРИТЕ ДЕЙСТВИЕ: ", mainMenuKeyboard.getKeyboard());
//                SendMessage textMessageMenu = new SendMessage();
//                textMessageMenu.setChatId(userChatId);
//                textMessageMenu.setText("ВЫБЕРИТЕ ДЕЙСТВИЕ:");
//
//                ReplyKeyboardMarkup keyboard = mainMenuKeyboard.getKeyboard();
//                textMessageMenu.setReplyMarkup(keyboard);

            } else if (textUser.equals("НАЙТИ УПРАЖНЕНИЕ ПО ГРУППЕ МЫШЦ")) {
                    sendMessageAndKeyboard(userChatId,"ВЫБЕРИТЕ ГРУППУ МЫШЦ", musclMenuKeyboard.getKeyboard());

            } else if (textUser.equals("НАЙТИ ГРУППУ МЫШЦ ПО УПРАЖНЕНИЮ")) {
                sendMessage(userChatId,"заглушка");
            } else if (textUser.equals("РАСЧЕТ МАКСИМАЛЬНОГО ВЕСА В УПРАЖНЕНИИ")) {
                sendMessage(userChatId,"заглушка");
            } else if (textUser.equals("РАСПИСАНИЕ ТРЕНИРОВОК")) {
                sendMessage(userChatId,"заглушка");
            } else if (textUser.equals("РЕКОМЕНДАЦИИ ПО ПИТАНИЮ")) {
                sendMessage(userChatId,"заглушка");
            } else if (textUser.equals("ОБНОВИТЬ МЕНЮ")) {
                sendMessageAndKeyboard(userChatId,"ВЫБЕРИТЕ ДЕЙСТВИЕ",mainMenuKeyboard.getKeyboard());
            } else if (gruppMuscl.contains(textUser)){ // equals -> говно
//  (textUser.equals("ГРУДЬ") ||
//   textUser.equals("СПИНА") ||
//   textUser.equals("НОГИ") ||
//   textUser.equals("БИЦЕПС") ||
//   textUser.equals("ТРИЦЕПС") ||
//   textUser.equals("ПЛЕЧИ") ||
//   textUser.equals("ПРЕСС")) {
//   так было до оптимизации
                List<Exercise> newExercises = exerciseData.findExerciseForMuscl(textUser); // обращаемся к методу из дата упражнений с джсон
                sendAnswerFindExercise(userChatId,textUser,newExercises);
//
//                SendMessage newMessage = new SendMessage();
//                newMessage.setChatId(userChatId);
//                newMessage.setText(String.valueOf(answer));
//                try{
//                    execute(newMessage);
//                } catch (TelegramApiException e){
//                    e.printStackTrace();
//
            }

        }
    }


    @Override
    public String getBotUsername() {
        return "FitnesGymBot";
    }

    @Override
    public String getBotToken() {
        return "8387559059:AAHGkiyEuF7a9dkvE03bNaAT0zF471N-0Do";
    }
}
