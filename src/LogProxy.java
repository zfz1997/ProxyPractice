
public class LogProxy implements RunnableAnimal{
       RunnableAnimal animal=null;
       public LogProxy(RunnableAnimal animal) {
    	   this.animal=animal;
       }
       public void run() {
    	   System.out.println("had been logged");
    	   animal.run();
    	   System.out.println("had been logged");
       }
}
