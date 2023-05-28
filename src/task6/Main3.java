package task6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        Patient patient1= new Patient("vova"," VOVA", "1","vodila");
        Patient patient2= new Patient("dima"," DIMA", "12","diareya");
        Patient patient3= new Patient("leva"," LEVA", "1","covid");
        Patient patient4= new Patient("Jeca"," JECA", "12","rvota");
        Patient patient5= new Patient("Sanek","SANEK", "12","alchogol");
        List<Patient> patientList=new ArrayList<>();
        patientList=List.of(patient1,patient2,patient3,patient4,patient5);
        Class<?>patientClass= Patient.class;
        Method[] patientMethod =patientClass.getDeclaredMethods();
        Scanner sc= new Scanner(System.in);
        String mes=sc.nextLine();
        String mes1=sc.nextLine();
        List<Patient> patientList1=new ArrayList<>();
        for (Method m:patientMethod) {

            if (m.getName().startsWith("get"+mes)){
                patientList1 = patientList.stream().filter(patient -> {
                    try {
                    return     m.invoke(patient).equals(mes1);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }}).collect(Collectors.toList());
                break;
            }

        }
        System.out.println(patientList1);


    }
}
