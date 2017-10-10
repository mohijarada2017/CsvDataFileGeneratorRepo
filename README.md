# CsvDataFileGeneratorRepo
CSV fake data file generator Java tool for testing BigData stuff like Data Visualizations (DV), BI tools' performance, etc.
Attached PDF presentation benchmarking guide, how tool was used with different DV tools.

* In less than 5 seconds, you can generate a CSV data file of 5 million CSV rows (i.e. having fake data of 7 columns)

* Better to use it with a machine (PC, Notebook) equipped with 4GB or more RAM (Linux or Ms-Windows).

* No installations are required, just copy Java JAR file to your machine and run it from command-line window/Terminal. Please make sure to install JRE v8+ in prior.

Quick small command-line tool to generate CSV dummy data files for testing BigData Data Visualizations tools like 
Tableau, Ms-PowerBI, Tibco Spotfire v7, etc. Or can be used for any BI programming language like R or Python for data load-testing.
It uses 7 CSV columns and fake data is inside it like (id, first name, last name, age, city, district, country).

Program usage (built with Oracle JDK 1.8):

    java -jar CsvDataGeneratorTool_Project.jar <comma or semicolon> 
    Example usage: java -jar CsvDataGeneratorTool_Project.jar 10000000 ,

For JVM heap performance issues, please run it with this JVM memory arguments:

// Below command line will generate 15 millions records of CSV data file:
    java -Xmx100g -jar CsvDataGeneratorTool_Project.jar 15000000 ,
    
// Below command line will generate 20 millions records of CSV data file:
    java -Xmx250g -jar CsvDataGeneratorTool_Project.jar 20000000 ,

Thank you for using my small CSV fake data file generation tool.<br/>
(c)2017 October - Mohee Jarada. E-Mail: jarada.mohee@gmail.com

