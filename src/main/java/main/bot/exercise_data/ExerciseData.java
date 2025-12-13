package main.bot.exercise_data;


import main.bot.exercise_data.models.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ExerciseData {
    private Exercise createExercise(
            String name,
            String muscle,
            String equipment,
            String instructions) {
        Exercise exercise = new Exercise();
        exercise.setName(name);
        exercise.setMuscle(muscle);
        exercise.setEquipment(equipment);
        exercise.setInstructions(instructions);
        return exercise;
    }

    public List<Exercise> findExerciseForMuscl(String muscl){
        List<Exercise> exercises = new ArrayList<>();

        if (muscl.equals("ГРУДЬ")) {
            exercises.add(createExercise(
                    "Жим штанги лежа",
                    "ГРУДЬ",
                    "Штанга, скамья",
                    "Лягте на скамью, снимите штангу, опустите к груди, мощно выжмите вверх. 3-4 подхода по 8-12 повторений."
            ));
            exercises.add(createExercise(
                    "Жим гантелей лежа",
                    "ГРУДЬ",
                    "Гантели, скамья",
                    "Лягте, гантели на уровне груди, выжмите вверх, сведите в верхней точке. 3x10-12."
            ));
            exercises.add(createExercise(
                    "Разводка гантелей лежа",
                    "ГРУДЬ",
                    "Гантели, скамья",
                    "Лежа на скамье, разводите гантели в стороны, чувствуя растяжение грудных. 3x12-15."
            ));
            exercises.add(createExercise(
                    "Отжимания на брусьях",
                    "ГРУДЬ",
                    "Брусья",
                    "Удерживайте корпус прямо, опускайтесь до растяжения грудных, мощно отжимайтесь. 3xмакс."
            ));
            exercises.add(createExercise(
                    "Кроссовер через верхние блоки",
                    "ГРУДЬ",
                    "Кроссовер, тросы",
                    "Стоя между блоками, сведите рукоятки перед собой. Идеально для детализации. 3x12-15."
            ));




        } else if (muscl.equals("СПИНА")) {
            exercises.add(createExercise(
                    "Подтягивания широким хватом",
                    "СПИНА",
                    "Турник",
                    "Широкий хват, подтягивайтесь до касания перекладины грудью. 3-4 подхода до отказа."
            ));
            exercises.add(createExercise(
                    "Тяга штанги в наклоне",
                    "СПИНА",
                    "Штанга",
                    "Наклон 45°, тяните штангу к поясу, сводите лопатки. 4x8-10."
            ));
            exercises.add(createExercise(
                    "Горизонтальная тяга блока",
                    "СПИНА",
                    "Тренажер, рукоять",
                    "Тяните рукоять к поясу, отводите локти назад, сводите лопатки. 3x12-15."
            ));
            exercises.add(createExercise(
                    "Гиперэкстензия",
                    "СПИНА",
                    "Скамья для гиперэкстензии",
                    "Разгибание корпуса с акцентом на поясницу. 3x15-20."
            ));
            exercises.add(createExercise(
                    "Разводка гантелей лежа",
                    "ГРУДЬ",
                    "Гантели, скамья",
                    "Лежа на скамье, разводите гантели в стороны, чувствуя растяжение грудных. 3x12-15."
            ));




        } else if (muscl.equals("НОГИ")) {
            exercises.add(createExercise(
                    "Жим ногами в тренажере",
                    "НОГИ",
                    "Тренажер для жима ногами",
                    "Поставьте ноги на платформу, жмите, не разгибая колени полностью. 3x12-15."
            ));
            exercises.add(createExercise(
                    "Приседания со штангой",
                    "НОГИ",
                    "Штанга, стойки",
                    "Штанга на трапециях, приседайте до параллели бедра с полом. 4x8-10."
            ));
        } else if (muscl.equals("БИЦЕПС")) {
            exercises.add(createExercise(
                    "Подъем штанги на бицепс",
                    "БИЦЕПС",
                    "Штанга EZ-гриф",
                    "Стоя, поднимайте штанги к груди, не раскачиваясь. 3x10-12."
            ));
            exercises.add(createExercise(
                    "Молотки с гантелями",
                    "БИЦЕПС",
                    "Гантели",
                    "Подъем гантелей нейтральным хватом, работают брахиалис и бицепс. 3x12-15."
            ));
        } else if (muscl.equals("ТРИЦЕПС")) {
            exercises.add(createExercise(
                    "Жим штанги узким хватом",
                    "ТРИЦЕПС",
                    "Штанга, скамья",
                    "Узкий хват, опускайте штангу к груди, выжимайте за счет трицепса. 3x8-10."
            ));
            exercises.add(createExercise(
                    "Французский жим",
                    "ТРИЦЕПС",
                    "EZ-штанга, скамья",
                    "Лежа, опускайте штангу ко лбу, разгибайте в локтях. 3x10-12."
            ));
        } else if (muscl.equals("ПЛЕЧИ")) {
            exercises.add(createExercise(
                    "Армейский жим",
                    "ПЛЕЧИ",
                    "Штанга, стойка",
                    "Стоя или сидя, выжимайте штангу над головой. 4x8-10."
            ));
            exercises.add(createExercise(
                    "Махи гантелями в стороны",
                    "ПЛЕЧИ",
                    "Гантели",
                    "Стоя, поднимайте гантели через стороны до уровня плеч. 3x12-15."
            ));
        } else if (muscl.equals("ПРЕСС")) {
            exercises.add(createExercise(
                    "Скручивания на полу",
                    "ПРЕСС",
                    "Коврик",
                    "Лежа на спине, поднимайте корпус, скручиваясь. 3x20-25."
            ));
            exercises.add(createExercise(
                    "Подъем ног в висе",
                    "ПРЕСС",
                    "Турник",
                    "В висе поднимайте ноги до параллели с полом или выше. 3x15-20."
            ));
        }

        return exercises;
    }

}
