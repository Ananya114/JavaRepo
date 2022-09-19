class Holiday{
    private final String name;
    private final int day;
    private final String month;

    public Holiday(String name, int day, String month) {
        this.name=name;
        this.day = day;
        this.month=month;
    }
    public boolean inSameMonth(Holiday holiday){
        if (holiday.month.equals(month))
            return true;
        else
            return false;
    }
    public double avgDate(Holiday[] holidayList){
        double sumOfDays=0;
        for (Holiday h: holidayList)
            sumOfDays+=h.day;
        return (sumOfDays/(holidayList.length));
    }
}

public class HolidayCalender {

    public static void main(String[] args) {
        Holiday holiday1=new Holiday("Independence day", 4, "July");
        Holiday holiday2=new Holiday("New Year", 31, "July");
        Holiday[] holidayList=new Holiday[2];
        holidayList[0]=holiday1; holidayList[1]=holiday2;
        System.out.println(holiday1.inSameMonth(holiday2));
        System.out.println(holidayList[0].avgDate(holidayList));
    }
}
