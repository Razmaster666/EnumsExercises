public class Task1_2 {
    public static void main(String[] args) {
        Day day = Day.CATURDAY;

        whatsTheSituation(day);

    }
    public static void whatsTheSituation(Day x){
        switch(x){
            case MONDAY -> System.out.println("Ah, finally it’s Monday again!");
            case TUESDAY -> System.out.println("Terrific Tuesday!");
            case WEDNESDAY -> System.out.println("We like Wednesday fika!");
            case LITTLE_SATURDAY -> System.out.println("See you at Ugglan!");
            case THURSDAY -> System.out.println("Almost there!");
            case FRIDAY -> System.out.println("WHOOP WHOOP!");
            case CATURDAY -> System.out.println(":3");
            case SATURDAY -> System.out.println("See you in town!");
            case SUNDAY -> System.out.println("Edward Blom and online pizza");
            case SUITDAY -> System.out.println("Haters gonna hate");
        }
    }
}