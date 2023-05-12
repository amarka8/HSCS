public class BuffonNeedle{
    public static void main(String[] args){
        int value=100;
        for (int options=0;options<=5;options++){
            double hit=0;
            double drop=0;
            for (int limit=0;limit<= value-1;limit++){
                double y1=  Math.random() * 2;
                double a=Math.random()*Math.PI;
                double yTop=y1+Math.sin(a);
                if(yTop>=2){     
                    hit+=1;
                    drop+=1;
                } 
                else { 
                    drop+=1; 
                } 
            }
            double result= drop/hit;
            System.out.println(result+" "+drop+" "+hit);
            value=value*10;
            }
        }
}
