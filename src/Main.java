public class Main {
    public static void main(String[] args) {
        //task 1
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int x = 10; x > 0; x--){
            System.out.print(x + " ");
        }

        //task 2
        int friday = 3; //число пятницы

        while (friday <= 31){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }

        //task3

        int pastYear = 1822;
        int forwardYear = 2122;
        for (int y = 0; y <= forwardYear; y+=79){
            if (y >= pastYear && y <= forwardYear){
                System.out.println(y);
            }
        }

    }
}
