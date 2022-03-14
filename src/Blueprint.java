package src;

//Defining this as the main class that other classes will share later. Making this the parent class

// We are using abstract becyuase this is a good way to make sure that whenever a child class in created, that it can be adopted from this class
public abstract class Blueprint {
    //creating a string which will be outuped when the main.java file code is ran
    String words;

    //In this main class, we are not defning the run function, becuase it extends for each class and we will have to define it differently for every class

    public abstract void run();

    public abstract String getwords();
}