import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataManagement {

    FileWriter writer;
    public void printToFile(Customer customer, String rawData) {
        {
            try {
                writer = new FileWriter("Customer.txt",true);
                PrintWriter pw = new PrintWriter(writer);
                pw.println(rawData);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

        public void printToFile(Order order, String rawData) {
            {
                try {
                    writer = new FileWriter("customers.txt");
                    PrintWriter pw = new PrintWriter(writer);
                    pw.println(rawData);


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


    }

    public void printToFile(LoadAssignment load, String rawData) {
        {
            try {
                writer = new FileWriter("loadassignments.txt");
                PrintWriter pw = new PrintWriter(writer);
                pw.println(rawData);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
