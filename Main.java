public class Main {
    public static void main(String[] args) {
        int start = 17_500;
        int add = 1_800;

        int bonus = 0;
        if (add > 1000) {
            bonus = add / 100;

        }
        int end = start + add + bonus;

        System.out.println("Итоговый бонус: " + end);
        System.out.println("Бонус: " + bonus);

    }

