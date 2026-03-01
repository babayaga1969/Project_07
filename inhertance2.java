class Animal{
    void cat(){
        System.out.println("meow");
    }
}
class dog extends Animal{
    void breed(){
        System.out.println("german");
    }
}
class lion extends dog{

}

public class inhertance2 {
    public static void main(String[] args) {
      lion obj=new lion();  
      obj.breed();
      obj.cat();
    }
}
