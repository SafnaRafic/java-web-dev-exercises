package exercises.Inheritance.Technology.main;

public class Program {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone(1500,500,"2021",true);
        smartPhone.makePhoneCall("31323233");
        int result = smartPhone.processTWoTwo();
        System.out.println("The Smart phone result is  "+result);
        System.out.println("Smart phone Id: "+smartPhone.getId());

        Laptop laptop = new Laptop(1500,500,"2021");
//        laptop.openIntellij();
        System.out.println("The laptop result is: "+laptop.processTWoTwo());
        System.out.println("Laptop Id: "+laptop.getId());

        Computer computer = new Computer(1500,500,"2021");
        System.out.println("The computer result is "+computer.processTWoTwo());
        System.out.println("Computer Id: "+computer.getId());
        System.out.println("Smart phone Id: "+smartPhone.getId());


    }
}
