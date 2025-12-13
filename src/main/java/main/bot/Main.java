package main.bot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new FitnessBot());
            System.out.println("Фитнес Бот Запущен!");
        } catch (TelegramApiException e) {
            System.err.println("Произошла ошибка при запуске бота! :( ");
            throw new RuntimeException(e);
        }
    }
}
