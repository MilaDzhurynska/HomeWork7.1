public class Array {
    public static void main(String[] args) {

        //Створіть масив цілих чисел з 20 елементами.
        int[] array = new int[20];

        //Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
        int minRandome = -100;
        int maxRandome = 100;
        for (int i = 0; i < array.length; i++){
            array[i] =  minRandome + (int)(Math.random()*((maxRandome-minRandome) + 1));
        }
        System.out.print("Елементи масиву: ");
        for (int num : array) {
            System.out.print(num + ", ");
        }

        //Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
        int negativeSum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeSum += num;
            }
        }
            System.out.println("Сума від'ємних чисел " + negativeSum);

        //Знайдіть та виведіть кількість парних і непарних чисел в масиві.
        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount + "; непарних: " + oddCount);

        //Знайдіть найбільший та найменший елементи масиву та їхні індекси.
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найбільший елемент : " + max + ", його індекс " + maxIndex);
        System.out.println("Найменший елемент : " + min + ", його індекс " + minIndex);

        /*
        Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого
        від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
         */
        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex != -1 && firstNegativeIndex < array.length - 1){
            int sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++){
                sum += array[i];
                count++;
            }
            double average = (double)sum/count;
            System.out.print("Cереднє арифметичне після першого від'ємного: " + average);
        }else{
            System.out.println("Від'ємних чисел немає");
        }

    }
}
