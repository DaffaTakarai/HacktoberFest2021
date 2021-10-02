public class Tugas1Nomor1 {
    public static void main(String[] args) {
        int[] bilangan = new int[15];
        int kuadrat;
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 != 0) {
                kuadrat = bilangan[i] * bilangan[i];
                System.out.println(bilangan[i] + " kuadrat = " + kuadrat);
            }
        }
    }
}
