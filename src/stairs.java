public class stairs
{
    public static void dibujarEscalera(int numEscalones) {

        if (numEscalones > 0) {
            for (int i = 0; i < numEscalones; i++) {

                for (int j = 0; j < numEscalones - i - 1; j++) {
                    System.out.print(" ");
                }

                System.out.print("_|");
                System.out.println();
            }
        }

        else if (numEscalones < 0) {
            for (int i = 0; i < Math.abs(numEscalones); i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("_|");
                System.out.println();
            }
        }
        else {
            System.out.println("__");
        }
    }

    public static void main(String[] args) {

        dibujarEscalera(4);
    }
}