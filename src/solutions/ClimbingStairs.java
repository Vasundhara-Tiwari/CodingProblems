package solutions;


public class ClimbingStairs {
    public static void main(String[] args) {
        printPossibleSteps(0,10,"");
    }
    public static void printPossibleSteps( int currentStep, int finalStep,String ans){
        if(currentStep>finalStep){      //-ve base case
            return;
        }

        if(currentStep==finalStep){     //+ve base case
            System.out.println(ans);
            return;
        }
        printPossibleSteps(currentStep+1,finalStep,ans+1);
        printPossibleSteps(currentStep+2,finalStep, ans+2);
        printPossibleSteps(currentStep+3,finalStep,ans+3);
    }
}
