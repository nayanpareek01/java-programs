import java.util.*;
class animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class dog extends animal{
    //  function overriding
    @Override
    void eat(){
        System.out.println("eat is now overridden");
    }
    void bark(){
        System.out.println("dog is barking");

    }
    // function overloading
    void bark(String whoIsBarking){
        System.out.println("dog is barking"+whoIsBarking);

    }
}

public class functions{
    static String name;
     static void getName(){
        System.out.println("inside get name");
    }
    static String setName(String name){
        return name;
    }
 
    public static void  main(String[] args){
        // System.out.println("this is functional program");
        // getName();
        dog sumeet = new dog();
        sumeet.bark();
        sumeet.bark("nayan is akal ka dushman");
        sumeet.eat();
        Scanner sc = new Scanner(System.in);
        System.out.println(setName(sc.nextLine()));
                                                                                                                                                                                                                                                                                                                                                                                      
    }
}