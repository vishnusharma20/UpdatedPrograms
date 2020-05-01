public class SingleTonDemo {

    //A class which has only one object. At ont time we create only object. It creating another object it will point to same object
    // Contructor will alwasy be private
    // USe static method that has return type of object of this singleton class(Lazy intialiazation)

    private  static SingleTonDemo singleton_instance= null;    //No object is created here
    public int a;

    //Private Constructor

    private SingleTonDemo()
    {
         a=10;
    }

    public static SingleTonDemo getInstance(){     //This method will return intance of this class

        if(singleton_instance==null)
            singleton_instance=new SingleTonDemo();
        return singleton_instance;
    }

    public static void main(String[] args) {

        SingleTonDemo x=SingleTonDemo.getInstance();
        SingleTonDemo y=SingleTonDemo.getInstance();
        SingleTonDemo z=SingleTonDemo.getInstance();

        x.a=x.a+10;

        //Object sharing
        System.out.println(x.a+ "--"+y.a);
    }
}
