package javaPrac;

public class Songs60Sec {


    public static void main(String[] args) {

        Songs60Sec.getPairs();
    }

    private static void getPairs() {
        int pairs = 0;
        int[] songsTimesList = new int[4];

        songsTimesList = new int[]{10, 30, 20, 30};

        for(int i =0; i < songsTimesList.length; i++){

            for(int j = i+1; j < songsTimesList.length; j++) {

                if (songsTimesList[i] + songsTimesList[j] == 60) {
                    pairs +=1;
                }
            }
        }
        System.out.println(pairs);
    }

}
