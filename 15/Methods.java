public class Methods { // Amar
    public static double getVolumeRectangularPrism(double l, double w, double h){
        return l*w*h;
    }
    public static double getCircumferenceCircle(double r){
        return Math.PI*r*2;
    }
    public static double getVolumeSphere(double r){
        return (4*Math.PI*Math.pow(r, 3))/3;
    }
    public static String removeVowels(String string){
        string=string.replace("a","");
        string=string.replace("e","");
        string=string.replace("i","");
        string=string.replace("o","");
        string=string.replace("u","");
        return string;
    }
    public static String transformString(String string){
        return string.substring(1, string.length()-1).toLowerCase();
    }
    public static void main (String[] args){
        System.out.println(Methods.removeVowels("amar"));
        System.out.println(Methods.transformString("LOL"));
        System.out.println(Methods.getVolumeRectangularPrism(1,2,3));
        System.out.println(Methods.getVolumeSphere(2));
        System.out.println(Methods.getCircumferenceCircle(2));
    }
}
