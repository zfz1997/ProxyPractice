
public class Client {
       public static void main(String[] args) {
		     Dog dog=new Dog();
		     
		     TimeProxy proxy=new TimeProxy(dog);
		     LogProxy log=new LogProxy(proxy);
		     log.run();
		     
	}
}
