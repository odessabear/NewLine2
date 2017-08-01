/**
 * Created by X501A on 25.04.2017.
 */
public class Massives {

    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0){
            if (beerNum ==1){
                word = "bootle";
            }
            System.out.println(beerNum +" " + word+ " of the beer on the wall");
           // beerNum--;
            System.out.println(beerNum + " " + word + " of the beer.");
            System.out.println("Take one yet.");
            System.out.println("Go arround");
            beerNum--;
            if (beerNum == 0){
              //  System.out.println(beerNum + " " + word + " of the beer on the wall");
           // }
            //else {
                System.out.println("Tere are no bottles on the wall.");
            }

        }

    }
}
