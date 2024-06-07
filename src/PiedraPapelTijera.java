public class PiedraPapelTijera {

    public static String calcularGanador(String[][] partidas) {
        int player1Wins = 0;
        int player2Wins = 0;

        for (int i = 0; i < partidas.length; i++) {
            String player1Move = partidas[i][0];
            String player2Move = partidas[i][1];

            if (player1Move.equals(player2Move)) {

            } else if (player1Move.equals("R") && player2Move.equals("S")) {
                player1Wins++;
            } else if (player1Move.equals("P") && player2Move.equals("R")) {
                player1Wins++;
            } else if (player1Move.equals("S") && player2Move.equals("P")) {
                player1Wins++;
            } else {
                player2Wins++;
            }
        }

        if (player1Wins > player2Wins) {
            return "Player 1";
        } else if (player2Wins > player1Wins) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }

    public static void main(String[] args) {

        String[][] partidas1 = {
                {"R", "S"},
                {"S", "R"},
                {"P", "S"}
        };
        System.out.println("Resultado: " + calcularGanador(partidas1));
    }
}
