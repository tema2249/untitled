import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //Scanner str = new Scanner(System.in);
        //char[][] array = new char[3][3];
        //array[0][0] = 'g';
        //System.out.print(array[0][0]);
        //System.out.print("Ваш текст ffews" + str.nextLine());
        //int temp = func (3,4);
        //System.out.print(temp);
        Person vitya = new Person();
        Person andrey = new Person(190);
        andrey.say("Dad");
        vitya.say("Artem");
        System.out.println(vitya.height);
        Student Anna = new Student(190,2);
        Anna.tell();
        Computer comp1 = new Computer();
        comp1.i7aa.Start();
        comp1.transfer.Start();
        System.out.println(comp1.NameUser);
        new Computer("Suppper PC"){
            void superComp(){
                this.i7aa.Start();
                this.transfer.Start();
                System.out.println("User: " + this.NameUser);
            };
        }.superComp();

        Array a = new MyArray();
        System.out.println("Номер=" + a.Get(1));

        SimpleGUI app = new SimpleGUI("Good text");
        app.setVisible(true);
    }

    public static int func (int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return result;
    }
}