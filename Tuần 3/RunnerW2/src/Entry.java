class Entry {
    private Date date;
    private double distance;
    private int durationInMinutes;
    private String postRunFeeling;

    Entry(Date date, double distance, int durationInMinutes, String postRunFeeling) {
        this.date = date;
        this.distance = distance;
        this.durationInMinutes = durationInMinutes;
        this.postRunFeeling = postRunFeeling;
    }
    public double pace(){
        return this.durationInMinutes / this.distance;
    }
}
