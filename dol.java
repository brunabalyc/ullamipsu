public static boolean contain(int[] lottoticket, int num) {
    for (int i = 0; i < lottoticket.length; i++) {
        if (lottoticket[i] == num) {
            return true;
        }
    }
    return false;
}
