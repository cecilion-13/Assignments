package co.harsh.Assignment2.Q1;

/**
 * This class refer to the question 1 of Ass-2
 * here this class is not inheritable for two reasons
 * 1. because of no availability of public constructor
 * 2. because of final keyword
 */
final public class Q1 {
    private String name;
    private static Q1 obj;
    /**
     * create a new object of Q1 class
      * @param name is exampler parameter for the class
     */
    private Q1(String name){
        this.name = name;
    }

    /**
     * This method used to return a object of
     * Q1 type by creating if their is none and
     * return if there is already
     * @param name is exampler parameter for the class
     * @return obejct of Q1 class
     */
    public static Q1 createQ1Object(String name){
        if(obj==null){
            obj = new Q1(name);
        }
        return obj;
    }

    /**
     *
     * @return name the exampler name of the class
     */
    public String getName(){
        return name;
    }
}

