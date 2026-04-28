import java.util.Random;

public class Homework_2 {
    public static void main(String[] args){
        Random rnd = new Random();

        int randomAgeVisitor = rnd.nextInt(10, 100);
        System.out.println("Возраст посетителя: " + randomAgeVisitor);

        double randomMoneyVisitor = rnd.nextDouble(10000, 100000);
        System.out.printf("Денег у посетителя: %.2f%n", randomMoneyVisitor);

        boolean hasInvite = false;
        boolean isBlackList = false;

        boolean isAdult = randomAgeVisitor >= 18;
        boolean hasInviteMoney = hasInvite || randomMoneyVisitor > 50000;
        boolean isClean = !isBlackList;
        boolean isAllowed = isAdult && hasInviteMoney && isClean;

        System.out.println("Допуск  на закрытую встречу: " + isAllowed);

        double contribution = randomMoneyVisitor * 0.075;
        System.out.printf("Добровольный взнос: %.2f%n", contribution);
    }

}
