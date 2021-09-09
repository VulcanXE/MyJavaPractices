
public class Enhance {
    
public static void main(String[] args) {
    String status="minor";
    int age= 17;
    switch(status){
        case "minor":
        {
            if(age==17)
                System.out.println("minor");
            else
            System.out.println("major");
            }
            break;
            case "eligible":{
                age=18;
                String output=(age>=18)? "minor":"major";
                System.out.println(output);}
                break;
                default:
                System.out.println("kid");
            }

      char ch='b';
        switch('ch'){
            case 'a','e','i','o','u':
            System.out.println("vowel");
            break;
            default:
            System.out.println("consonant");
        }
       
       int a=1;
       switch(a){
           case 1,2,3:
           System.out.println("pets");
           break;
           case 4,5,6:
           System.out.println("wild");
          break;
          default:
          System.out.println("not animals"); 
       }

    char ch='b';
       String alphabet=switch (ch) {
           case 'a':
           yield "vowel";
            case 'e':
            yield "vowel";
              case 'i':
               yield "vowel";
               case 'o':
               yield "vowel";
               case 'u':
               yield "vowel";
               default:
               yield "consonant";}
       
          char ch='Y';
           switch(ch){
               case -> 'a'|'e'|'i'|'o'|'u':
               System.out.println("is a lower case vowel");
               case -> 'A'|'E'|'I'|'O'|'U':
               System.out.println("is a upper case vowel");
               default->
               System.out.println("consonant");

           }
       

        }
    }



