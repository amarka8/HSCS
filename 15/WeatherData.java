public class WeatherData { // Amar
    private double rain;
    private int days;
    private String name;
    public WeatherData(String name,float rain,int days){
        this.name=name;
        this.rain=rain;
        this.days=days;
    }
    public double getTotalRainfall(){
        return rain;
    }
    public int getNumberofDays(){
        return days;
    }
    public String getStationName(){
        return name;
    }
    public void addRainfall(double increment){
        rain+=increment;
        days++;
    }
    public long getAverageDailyRainfall(){
        return Math.round(rain/days);
    }
    public static void main (String[] args){
        WeatherData day= new WeatherData("station delta", 0, 0);
        day.addRainfall(1);
        day.addRainfall(1);
        day.addRainfall(1);
        System.out.println("The total amount of rain fall for "+ day.getStationName()+ ", " +day.getTotalRainfall()+ " inches, over a period of " + day.getNumberofDays()+ " days, averages to " + day.getAverageDailyRainfall() + " inch per day");
    }
}
