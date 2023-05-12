public class SeatingChart extends Attendees{
    private Employee[][] chart;
    private static final int ROWS=5;
    private static final int COLUMNS=5;
    private final int totalRows;
    public SeatingChart(Attendees attendees){
        totalRows=attendees.getTotalAttendees()/5;
        chart= new Employee[ROWS][COLUMNS];
        for (int row=0; row<totalRows;row++){
            for (int col=0; col<chart[row].length;col++){
                    chart[row][col]=attendees.getAttendees().get(col+(row*5));
                // else{
                //     chart[row][col]=null;
                // }
            }
        }
    }
    public int getRows (){
        return totalRows;
    }
    public String toString(){
        String s="";
        for (int row=0; row<chart.length;row++){
            s+="Row " +(row+1)+ "\n";
            if (row<totalRows){
                for (int col=0; col<chart[row].length;col++){
                    s+= "Seat "+ (col+1) + " : "+ chart[row][col].getName()+"\n";
                    // if(chart[row][j]!=null){
                        // s+="Seat "+ (j+1)+ " : " + "\n";
                        // s+=chart[row][j]+"\n";
                }
                    // else{
                    //     s+="No Seat"+ "\n";
                    // }
            }
        }
        return s;
    }
}

