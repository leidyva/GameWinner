//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Robot {

    public static int[] calcularCoordenadas(int[] pasos) {

        int x = 0;
        int y = 0;

        int direccion = 0;

        for (int i = 0; i < pasos.length; i++) {
            int paso = pasos[i];

            switch (direccion) {
                case 0:
                    y += paso;
                    break;
                case 1:
                    x -= paso;
                    break;
                case 2:
                    y -= paso;
                    break;
                case 3:
                    x += paso;
                    break;
            }

            direccion = (direccion + 1) % 4;

        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        // Caso de prueba 1
        int[] pasos1 = {10, 5, -2};
        int[] coordenadas1 = calcularCoordenadas(pasos1);
        System.out.println("Coordenadas finales: (x: " + coordenadas1[0] + ", y: " + coordenadas1[1] + ")"); // Debería imprimir (x: -5, y: 12)
    }
}