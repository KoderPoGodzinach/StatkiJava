package pl.KoderPoGodzinach;

public class Main {

    public static void main(String[] args) {
	// tworzymy 10 tablic o długości 10
        char [][] board = new char[10][10];
        
        // metoda która będzie wypełniała tablice 
        
        fillBoard(board);
        
        printLetters();
        printBoard(board);
        printLetters();
        printBoard(board);
    }

    private static void fillBoard(char[][] board) {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                board[i][j] = getRandomShip();
            }
        }
    }

    static void printLetters() {
        System.out.print("  ");
        for (int i = 0; i <10 ; i++) {
            System.out.print((char)('A'+i));
        }
        System.out.println(" ");
    }

    static void printBoard(char [][] board) { //mimo takiej samej nazwy są to dwie inne zmienne
        for (int i = 0; i <10 ; i++) {      // ponieważ zmienne mają zasięgi
            int numberToPrint  = i+1;
            if(numberToPrint < 10) {
                System.out.print(" ");
            }
            System.out.print(numberToPrint);  // wyświetlane dla 10 dodatkowa spacja
            for (int j = 0; j < 10 ; j++) {
                char shipValue = board[i][j]; //dostęp do poszczególnego wiersza i kolumny
                System.out.print(shipValue);
            }
            System.out.print('\n');
        }
    }
    private static char getRandomShip() {
        if(Math.random() < 0.2) {
            return 'O';
        } else {
            return 'X';
        }
    }
}


