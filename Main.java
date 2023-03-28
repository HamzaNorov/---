import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int bonAquaPrice = 50;
        boolean isCunBuy = false;
        System.out.println("Ввудите кол-во денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();
        if (moneyAmount >= twixPrice){
            System.out.println("Вы можете купить Твикс!");
            isCunBuy = true;
        }
        if (moneyAmount >= marsPrice){
            System.out.println("Вы можете купить Марс!");
            isCunBuy = true;
        }
        if (moneyAmount >= snickersPrice){
            System.out.println("Вы можете купить Сникерс!");
            isCunBuy = true;
        }
        if (moneyAmount >= bonAquaPrice){
            System.out.println("Вы можете купить Воду!");
            isCunBuy = true;
        }
        if (isCunBuy == false){
            System.out.println("У вас недостаточно средств!");
        }
    }
}