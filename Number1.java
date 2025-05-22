
package number1;
public class Number1 {
    public static void main(String[] args) {
        String a="Vadagara,Chennai";
        if(a.endsWith("Chennai")){
            if(a.contains("palakadu")){
                System.out.println("you are in pakaladu");
            }
            else if(a.contains("Chennai")){
                System.out.println("you are in chennai");
            }
            else{
                System.out.println(a.split(",")[0]);
            }
        }
        else {
            System.out.println("you are not in chennai");
        }
       
    }
    
}
