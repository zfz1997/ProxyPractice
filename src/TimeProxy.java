
public class TimeProxy implements RunnableAnimal{
        
	    RunnableAnimal animal=null;
	public TimeProxy(RunnableAnimal animal) {
		this.animal=animal;
	}
	@Override
	public void run() {
		System.out.println(System.currentTimeMillis());
		animal.run();
		System.out.println(System.currentTimeMillis());
	}
       
}
