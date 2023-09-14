public class _55_Насколько_ты_хорош_на_самом_деле_8 {
    public static void main(String[] args) {
        int[] classPoints = {5, 7, 8, 9};
        int yourPoints = 8;
        System.out.println(betterThanAverage(classPoints, yourPoints));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int avarage = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }

        avarage = sum / classPoints.length;
        if (yourPoints > avarage) {
            return true;
        } else {
            return false;
        }
    }

}


