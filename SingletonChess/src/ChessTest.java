
import java.util.LinkedList;

public class ChessTest {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getPieceList());

        LinkedList<String> whiteTiles = newInstance.lostPieces(3);

        System.out.println("white: " + whiteTiles);

        System.out.println(newInstance.getPieceList());

        Singleton secondInstance = Singleton.getInstance();

        System.out.println("Second instance ID: " + System.identityHashCode(newInstance));

        System.out.println(secondInstance.getPieceList());

        LinkedList<String> blackTiles = newInstance.lostPieces(3);

        System.out.println("black: " + blackTiles);

        System.out.println(newInstance.getPieceList());

    }
}
