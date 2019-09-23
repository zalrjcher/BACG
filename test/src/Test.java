import java.util.Random;

/**
 * @author zlj
 * @introduce
 */
public class Test {
    private   static int  State = -1 ;
    public static void main(String[] args) {
       for (int i = 0 ; i < 30 ; i ++){
           try {
               int a = Test.randInt(1,11);
               System.out.println(a);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    }


    public static int randInt(int max)
    {
        return randInt() % (max + 1);
    }
    public static int randInt()
    {
        if (State < 0)
        {
            Random random = new Random(System.currentTimeMillis());
            State = random.nextInt();
        }
        int tmpState = 48271 * (State % 44488) - 3399 * (State / 44488);
        System.out.println("tmpState :"+tmpState);
        if (tmpState >= 0) {
            State = tmpState;
        } else {
            State = tmpState + 2147483647;
        }
        return State;
    }

    public static int randInt(int low, int high)
            throws Exception
    {
        if (low > high) {
            throw new Exception("random range error");
        }
        return randInt(high - low) + low;
    }
}
