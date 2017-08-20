package t4;

/**
 * Created by X501A on 13.07.2017.
 */
public class Student {
    private int age;

    public void setAge(int agee) throws Exception {
        if (age >150 || age < 0){
            throw new Exception("age must notbe age >150 || age < 0");
        }
        this.age = agee;
    }

}
