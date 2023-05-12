// Write a class that has a month number and year number. Include a method that returns whether the year is a
// leap year. Include a method that returns the number of days in the object’s month. Use an if statement that has
// no more than four code paths and calls the method that determines if the year is a leap year. Include a
// method that returns what season it is based on the month and day.
// Years divisible by 100 are not leap years unless they are also divisible by 400. Years divisible by 4 are leap
// years unless they excluded by the criteria described in the previous sentence.
// Spring runs from March 22 to June 21, summer from June 22 to September 21, fall from September 22 to December
// 21, and winter from December 22 to March 21.
public class Year {
    double month;
    double year;
    double days;
    double day;
    String season;
    boolean indicator;
    public Year (double month, double day, double year){
        this.month=month;
        this.day=day;
        this.year=year;
    }
    public boolean isLeapYear(){
        if (year %4==0){
            if (year%100==0){
                if (year%400==0){
                    indicator=true;
                }
                else {
                    indicator=false;
                }
            }
            else{
                indicator=true;
            }
        }
        return indicator;
    }
    public double days(){
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            days=31;
        }
        if(month==4 || month==6 || month==9 || month==11 ){
            days=30;
        }
        if(month==2){
            days=28;
        }
        return days;
    }
    public String season(){
        if (((month==12 && day>=22) || (month ==3) || month>==1){
            season="Spring"
        }
        if ((month>=3 && month <==6){
            season="Spring"
        }
        if ((month>=6 && month <==9){
            season="Spring"
        }
        if ((month>=9 && month <==12){
            season="Spring"
        }
    }
}
