package Triangle;

public class TriangleClassifier {
    public static String getTriangle(int a,int b,int c){
        if (a==b && a == c){
            return "Equilateral triangle";
        }else if (a+b>c && b+c>a || a+c>b && b+c>a){
            if (a!=b && a!=c && b!=c ){
                return "Regular triangle";
            }
            else if(a == b || a ==c || b == c){
                return "Isosceles triangle";
            }
        }
        return "Not a triangle";
    }
}
