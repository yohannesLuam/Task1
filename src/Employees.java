import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    public static void main(String[] args) throws IOException {
        List<String> EmployeeNames = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("employeeList.txt"))) {

            String name;
            while ((name = br.readLine()) != null) {
                EmployeeNames.add(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Size of the collection is: " + EmployeeNames.size());

        for (String name : EmployeeNames
        ) {
            System.out.println(name);
        }

        for (int i = 0; i < EmployeeNames.size(); i++) {
            System.out.println(EmployeeNames.get(i));
        }

        Iterator<String> it = EmployeeNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

