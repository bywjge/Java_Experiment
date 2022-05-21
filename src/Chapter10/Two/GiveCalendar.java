package Chapter10.Two;

import java.time.LocalDate;

public class GiveCalendar {
    public LocalDate[] getCalendar(LocalDate date){
        date = date.withDayOfMonth(1);
        //date从1开始
        int days =date.lengthOfMonth();
        LocalDate[] dataArrays = new LocalDate[days];
        for (int i =0 ; i < days; i++){
            dataArrays[i] = date.plusDays(i);
        }
        return dataArrays;
    }
}
