public class Event extends Reminder{

    private String endDate;
    private String endTime;
    private String location;
    private Boolean repeats;
    private String description;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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

    public Event(String title, String date, String time, String endDate, String endTime, String location, Boolean repeats, String description) {
        super(title, date, time);
        this.endDate = endDate;
        this.endTime = endTime;
        this.location = location;
        this.repeats = repeats;
        this.description = description;
    }

    public Event(){}
}
