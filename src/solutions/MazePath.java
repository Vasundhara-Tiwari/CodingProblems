package solutions;


//Constraint:- allowed moves, Right or Down
public class MazePath  {
    public static void main(String[] args) {
        mazePath(0,0,2,2,"");
    }
    public static void mazePath(int currentx, int currenty, int destinationx, int destinationy, String ans){
        if(currentx>destinationx || currenty>destinationy){
            return;
        }

        if(currentx==destinationx && currenty==destinationy){
            System.out.println(ans);
            return;
        }

        mazePath(currentx+1, currenty, destinationx, destinationy, ans+"D");
        mazePath(currentx, currenty+1, destinationx, destinationy, ans+"R");
    }
}
