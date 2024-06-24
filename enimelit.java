int[] block = {1, 2, 3, 4, 5};
int[] derivedBytes = new int[10];
int numberOfDerivedWords = 2;

System.arraycopy(block, 0, derivedBytes, numberOfDerivedWords * 4, 5);
