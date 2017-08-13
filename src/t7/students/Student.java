package t7.students;

/**
 * Created by X501A on 12.08.2017.
 */
public class Student implements Runnable{
    private int age;
    private String name;

    public  Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void printCountAge(){
        for (int i = 0;i < age;i++){
            System.out.println(name + "----------- " + i);
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        this.printCountAge();
    }
}
