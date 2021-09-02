public class VorC {
    public static void main(String[] args) {
       char ch = 'w';
         if(ch =='a'||ch == 'd'||ch == 'k'||ch == 'w') 
        System.out.println("consonant" +ch);
        else
        System.out.println("vowel"+ch);      

      switch (ch){
        case  'a':
        case  'e':
        case  'i':
        case  'o':
        System.out.println("vowel" +ch );
        break;
        default:
        System.out.println("consonant" +ch);
      }

    }
    
}
