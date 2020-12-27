package chapter_6.reference_variable_and_object_type;

public class ReferenceVariableTest {
    public static void main(String[] args) {

    }

    static void objectCreationByOwnTypeAndPrint(){
        HRExecutive hrExecutive = new HRExecutive();
        hrExecutive.specialization = new String[]{"Staffing"};
        System.out.println(hrExecutive.specialization[0]);
        hrExecutive.name = "Shetu";
        System.out.println(hrExecutive.name);
        hrExecutive.conductInterview();
    }

    static void objectCreationBySuperClassAndPrint(){
        Employee emp = new HRExecutive();
        // Compilation error since not inside employee
//        emp.specialization = new String[] {"Staffing"};
//        System.out.println(emp.specialization[0]);
        emp.name = "Pavni Gupta";
        System.out.println(emp.name);
        // Compilation error since not inside employee
//        emp.conductInterview();
    }

    static void objectCreationByImplementingInterfaceAndPrint(){}
}
