package br.com.abc.introducao;

public class Arrays6 {
    public static void main(String[] args) {
//        int[][] dias = new int[3][];
//        dias[0] = new int[2];
//        dias[1] = new int[]{1, 2, 3};
//        dias[2] = new int[4];

//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println(dias[i][j]);
//            }
//        }

        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};

        for(int[] arr : dias) {
            for(int num : arr) {
                System.out.println(num);
            }
        }


    }
}
