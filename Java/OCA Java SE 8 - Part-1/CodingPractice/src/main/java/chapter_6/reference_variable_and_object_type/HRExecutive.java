package chapter_6.reference_variable_and_object_type;

public class HRExecutive extends Employee implements Interviewer{
    String[] specialization;
    @Override
    public void conductInterview() {
        System.out.println("HRExecutive -  conducting interview");
    }
}
