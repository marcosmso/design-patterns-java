package Singleton;

class Singleton {
	
	private static Singleton instance;

	private Singleton(){
  
	}

	public static Singleton getInstance() {
		if (instance == null) {
      //lock here
			instance = new Singleton();
		}
    return instance;

	}

}