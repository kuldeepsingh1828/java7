import java.util.function.Predicate;  
class PredicateInterfaceExample 
{  
    static Boolean checkAge(String age)
    {  
        if(age.equals("true"))  
            return true;  
        else return false;  
    }  
    public static void main(String[] args)
    {  
        // Using Predicate interface  
        Predicate<String> predicate =  PredicateInterfaceExample::checkAge;  
        // Calling Predicate method  
        boolean result = predicate.test("true");  
        System.out.println(result);  
    }  
}  



int -- Integer
float  - Float
double -- Double
char - Character