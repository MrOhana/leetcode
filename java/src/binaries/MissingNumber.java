// Challenge: https://leetcode.com/problems/missing-number/description/

package binaries;

public class MissingNumber {
    public static void main(String[] args) {
        var arr = new int[] {3,0,1}; // Example from LeetCode
        System.out.println("Array: {3,0,1}, Missing number: " + missingNumber(arr)); // Expected: 2

        var arr2 = new int[] {6,4,2,3,5,7,0,1,9}; // Example 2
        System.out.println("Array: {6,4,2,3,5,7,0,1,9}, Missing number: " + missingNumber(arr2)); // Expected: 8

        /**
         * Números iguais em uma sequência XOR sempre vão se anular.
         * Ao percorrer com o total de elementos, no caso 'n', eu sempre
         * garanto uma primeira execução fazendo xor em todos os elementos
         * existentes no array. Quando passamos posteriormente pelo array
         * opnde há o elemento faltante, ao concluir o XOR com o último
         * elemento da lista, o faltante será o que vai sobrar.
         *
         * Segue exemplo abaixo onde forcei o primeiro elemento ser o tamanho do array
         * Os elementos seguintes são exemplo da interação de 0-4 (sem nenhum faltar)
         * E os últimos elementos são a minha lista faltando o elemento 3. Para testar
         * que funciona, troque o 3 por outro elemento da lista sem ser o 0 ou o 5 que
         * sempre estarão inclusos
         */
        System.out.println("Meu Teste >> " + (5 ^ 0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 4 ^ 5 ^ 2 ^ 1 ^ 0));
    }

    static int missingNumber(int[] nums) {
        int lenght = nums.length;
        int missing = lenght;

        for (int i = 0; i < lenght; i++) {
            missing ^= i ^ nums[i];
        }

        return missing;
    }
}