enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class Enums {
    public static void main(String[] args) {
        Day today=Day.SATURDAY;
        //System.out.println("Today is: "+today);
        switch(today){
            case SUNDAY:
                System.out.println("It's Sunday, time to relax!");
                break;
            case MONDAY:
                System.out.println("It's Monday, back to work!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday, keep going!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday, halfway there!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday, almost the weekend!");
                break;
            case FRIDAY:
                System.out.println("It's Friday, the weekend is here!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday, enjoy your day off!");
                break;
        }

    }
}
