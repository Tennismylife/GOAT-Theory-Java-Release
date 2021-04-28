
public class Goat {

	public Variables variables;
    private static Goat istance = null;
    

    public Goat() {
    	variables = new Variables();
    }
    

    public static Goat getIstance() {
            if(istance==null)
                    istance = new Goat();
            return istance;
    }

}
