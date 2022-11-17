/*Runnable interface is more suitable than Thread class becuase 

public class Person extends Human{

}

In this case, we can't extends thread class becuase JAVA don't support multiple interhitances
To solve this

public class Person extends Human implments Runnable{

}

Now, we can use thread 

*/

//1. implements the Runnable interface

public class RunnableIntro implements Runnable {

    // 2. Override the run() method

    public void run() {
        System.out.println("Thread task 2");

    }

    public static void main(String[] args) {

        // 3. Create object of the class
        RunnableIntro r = new RunnableIntro();

        // 4. Create object of class Thread and pass the reference in constructor
        Thread th = new Thread(r);
        th.start();

    }

}
