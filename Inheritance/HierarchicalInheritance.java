package Inheritance;
class Bank{

    void Interest(){
        System.out.println("Max interest we should pay is:");
    }
}
class SBI extends Bank{
    void Interest(){
        super.Interest();
        System.out.println("0.5% is regular interest for sbi");
    }

}
class HDFC extends Bank{
    void Interest(){
        super.Interest();
        System.out.println("1.5 is the regular interest for hdfc ");
    }
}
public class HierarchicalInheritance{
    public static void main(String[] args){
        HDFC bank1 = new HDFC();
        bank1.Interest();
        System.out.println("------------------------");
        SBI bank2 = new SBI();
        bank2.Interest();
    }
}
