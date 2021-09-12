package NestedClasses;
public class TopLevelClass {

    void accessMembers(OuterClass outer) {     
        
        System.out.println(outer.outer);
        System.out.println(OuterClass.staticOuter);
    }  
}
