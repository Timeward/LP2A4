public class Task extends Reminder{

    private Boolean repeats;
    private String description;

    public Boolean getRepeats() {
        return repeats;
    }

    public void setRepeats(Boolean repeats) {
        this.repeats = repeats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task(String title, String date, String time, Boolean repeats, String description) {
        super(title, date, time);
        this.repeats = repeats;
        this.description = description;
    }

    public Task(){}
}
