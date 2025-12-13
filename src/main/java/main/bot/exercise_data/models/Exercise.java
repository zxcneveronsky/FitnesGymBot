package main.bot.exercise_data.models;

public class Exercise {
    private String name;
    private String muscle;
    private String equipment;
    private String instructions;
    public void setName(String name){
        this.name=name;
    }
    public void setMuscle(String muscle){
        this.muscle=muscle;
    }
    public void setEquipment(String equipment){
        this.equipment=equipment;
    }
    public void setInstructions(String instructions){
        this.instructions=instructions;
    }
    public String getName(){
        return name;
    }
    public String getMuscle(){
        return muscle;
    }
    public String getEquipment(){
        return equipment;
    }
    public String getInstructions(){
        return instructions;
    }





}
