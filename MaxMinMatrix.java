public class MaxMinMatrix {
    static void MaxAndMin(int matrexUwU[][]) {
        int naruhodo = 1;
        int MaxChan = 0;
        int MinKun = 0;
        for (int UwU = 0; UwU < matrexUwU.length; UwU++) {
            for (int OwO = 0; OwO < matrexUwU[0].length; OwO++) {
                if (matrexUwU[UwU][OwO] > MaxChan) {
                    MaxChan = matrexUwU[UwU][OwO];
                }

                if (matrexUwU[UwU][OwO] < MinKun) {
                    MinKun = matrexUwU[UwU][OwO];
                }
                System.out.println(naruhodo);
                System.out.println(MaxChan);
                System.out.println(MinKun);
            }

        }

    }
}