
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
    private static Singleton instance = null;

    String[] chessPieces = {"pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn","pawn",
            "knigth","knigth","knigth","knigth","bishop","bishop","bishop","bishop","rook","rook","rook","rook","queen","queen","king","king"};

    private LinkedList<String> pieces = new LinkedList<>(Arrays.asList(chessPieces));

    static boolean firstThread = true;

    private Singleton(){    }

    public static Singleton getInstance(){
        if(instance == null) {
            if(firstThread){
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            instance = new Singleton();
            Collections.shuffle(instance.pieces);
        }
        return instance;
    }
    public LinkedList<String> getPieceList(){
        return instance.pieces;
    }
    public LinkedList<String> lostPieces(int lostPiecesCount){
        LinkedList<String> missingPieces = new LinkedList<String>();
        for(int i= 0; i <= lostPiecesCount; i++){
            missingPieces.add(instance.pieces.remove(0));
        }
        return missingPieces;
    }

}
