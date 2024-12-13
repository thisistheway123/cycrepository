public class StepTracker{
    private int steps;
    private int days;
    public StepTracker(){
        this.steps = 0;
        this.days = 0;
    }
    public StepTracker(int steps){
        steps = this.steps;
    }
    public int activeDays(){
        return this.days;
    }
    public double averageSteps(){
        return this.steps/this.days;
    }
    public void addDailySteps(int steps){
        this.steps = this.steps + steps;
    }
}