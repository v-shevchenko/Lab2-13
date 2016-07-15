public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nexDay() {
        if (this == SATURDAY) {
            return SUNDAY;
        }
        return MyDayOfWeek.values()[this.ordinal() + 1];
    }
}
