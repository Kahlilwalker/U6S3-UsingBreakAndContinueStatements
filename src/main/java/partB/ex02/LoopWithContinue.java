package partB.ex02;

public class LoopWithContinue {
    public static String loopWithContinue() {
        String response = "";


        for( int i = 1 ; i < 10 ; i++ ) {

            if( i < 9 && i > 4) {
                continue;

            }

            response += ("The number is " + i +"\n" );

            if( i == 10 ) {
                break;
            }

        }


        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithContinue();
        System.out.print(loopOutput);
    }

}
