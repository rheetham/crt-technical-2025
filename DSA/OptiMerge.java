class OptiMerge {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 7, 9, 10, 11, 12, 13 };
        int arr2[] = { 3, 5, 7, 15 };
        int sorted[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int z = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                sorted[z] = arr2[j];
                j++;
            } else {
                sorted[z] = arr1[i];
                i++;
            }
            z++;
        }

        if (i != arr1.length) {
            while (i < arr1.length) {
                sorted[z] = arr1[i];
                i++;
                z++;
            }
        }

        if (j != arr2.length) {
            while (j < arr2.length) {
                sorted[z] = arr2[j];
                j++;
                z++;
            }
        }
        for (int k : sorted) {
            System.out.println(k);
        }
    }
}