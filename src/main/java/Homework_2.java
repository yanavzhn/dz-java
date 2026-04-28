import java.util.Random;

public class Homework_2 {
    public static void main(String[] args){
        Random rnd = new Random();

        int randomAgeVisitor = rnd.nextInt(10, 100);
        double randomMoneyVisitor = rnd.nextDouble(10000, 100000);
        boolean hasInvite = false;
        boolean isBlackList = false;

        boolean isAdult = randomAgeVisitor >=18;
        boolean hasInviteMoney = hasInvite || randomMoneyVisitor > 50000;
        boolean isClean = !isBlackList;
        boolean isAllowed = isAdult && hasInviteMoney && isClean;

        System.out.println(isAllowed);

        double contribution = randomMoneyVisitor * 0.075;
        System.out.printf("Добровольный взнос: %.2f%n", contribution);
    }

}
