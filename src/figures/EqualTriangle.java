package figures;

/**
 * Created by X501A on 08.07.2017.
 */
public class EqualTriangle extends Triangle {

  public EqualTriangle(int side){
      super(side,side,side);
  }


    @Override
    public void printToconsol() {
        System.out.println("Equasides triangle " + this.getSide1());
    }

}
