/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvdatageneratortool_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Mohee_Jarada
 */
public class CsvDataGeneratorTool_MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args != null && args.length == 2) {
            
            System.out.println("CSV data file generation process is started....");
            
            String csvFileNameStr = "";
            PrintWriter pw;
            long m1 = System.currentTimeMillis();
            ArrayList<String> cityList = new ArrayList<>();
            cityList.add("Budapest");
            cityList.add("Berlin");
            cityList.add("Bucharest");

            ArrayList<String> countryList = new ArrayList<>();
            countryList.add("Hungary");
            countryList.add("Germany");
            countryList.add("Romania");

            int intRandom = 0;

            try {
                long rowsNeededRef = Long.parseLong(args[0]);
                char separaterCharRef = args[1].charAt(0); // comma or semicolon
                
                csvFileNameStr = System.getProperty("user.home")
                        + "/CsvDataFile_" + rowsNeededRef + "_recs.csv";

                // PrintWriter by default is buffered:
                pw = new PrintWriter(new File(csvFileNameStr));

                // StringBuilder is faster than StringBuffer:
                StringBuilder sb = new StringBuilder();

                sb.append("id");
                sb.append(separaterCharRef);
                sb.append("First_Name");
                sb.append(separaterCharRef);
                sb.append("Last_Name");
                sb.append(separaterCharRef);
                sb.append("Age");
                sb.append(separaterCharRef);
                sb.append("City");
                sb.append(separaterCharRef);
                sb.append("District");
                sb.append(separaterCharRef);
                sb.append("Country");
                sb.append('\n');

                double randRef;

                for (int index = 1; index <= rowsNeededRef; index++) {
                    sb.append(index);
                    sb.append(separaterCharRef);
                    sb.append("XYZf").append(index);
                    sb.append(separaterCharRef);
                    sb.append("KwCNJrXYZ").append(index);
                    sb.append(separaterCharRef);
                    
                    randRef = Math.random() * 100 + 1;
                    sb.append(Math.round(randRef));
                    sb.append(separaterCharRef);

                    intRandom = (int) (Math.random() * 3);

                    sb.append(cityList.get(intRandom));
                    sb.append(separaterCharRef);
                    
                    sb.append("districtNo" + index);
                    sb.append(separaterCharRef);
                    sb.append(countryList.get(intRandom));

                    if (index != rowsNeededRef) {
                        sb.append('\n');
                    } // end if
                } // end for loop

                pw.write(sb.toString());
                pw.flush();
                pw.close();
                
                System.out.println("CSV file created and reside at: " + csvFileNameStr);
                System.out.println("CSV file separator character used: " + separaterCharRef);
                System.out.println("Total CSV data rows created now: " + rowsNeededRef + " records");
                
            } catch (FileNotFoundException e) {
                System.err.println("Exception in coding:\n" + e.getMessage());
            } // end catch

            long m2 = System.currentTimeMillis();
            System.out.println("CSV data file generation is done successfully and took: " + ((m2 - m1) / 1000) + " seconds");            
        } // end if for having command line argument
        else {
           System.out.println("Program usage:\n >java -jar CsvDataGeneratorTool_Project.jar <total rows to generate in CSV file> <,||;>");
           System.out.println("Example usage:\n >java -jar CsvDataGeneratorTool_Project.jar 10000000 ,\n");
           System.out.println("For JVM heap performance issues, please run it with this JVM memory arguments:");
           System.out.println(">java -Xmx200g -jar CsvDataGeneratorTool_Project.jar 15000000 ,\n");
           System.out.println("Thank you for using my small CSV data file generation tool. (c)2017 October - Mohee Jarada <Budapest-Hungary>");
        } // end else
        
    } // end main()    
} // end class
