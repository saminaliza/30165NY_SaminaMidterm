package design;

public abstract class AbstractEmployee implements Employee {

    public abstract int getEmployeeAge();

    public abstract int sickLeaveTaken();

    public abstract int sickLeaveRemaining();


    public static boolean isEmployeeOfTheMonth(int performanceStar) {

        if (performanceStar == 100) {
            System.out.println("Eligible for Employee of the month award");
            return true;
        } else {
            System.out.println("Not eligible for Employee of the month award");
            return false;
        }

    }

    public void gettingBonus(boolean annualSalesGoalCompleted) {
        if (annualSalesGoalCompleted == true) {
            System.out.println(employeeName() + "will get a bonus for completing annual sales goal");
        } else {
            System.out.println(employeeName() + " must complete the annual sales goal ");
        }


    }
}




