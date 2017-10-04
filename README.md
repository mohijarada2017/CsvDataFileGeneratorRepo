# CsvDataFileGeneratorRepo
CSV data file generator Java tool for testing BigData stuff like Data Visualizations, BI tools' performance, etc.

Quick small command-line tool to generate CSV dummy data files for testing BigData Data Visualizations tools like 
Tableau, Ms-PowerBI, Tibco Spotfire v7, etc. Or can be used for any BI programming language like R or Python for data load-testing.
It uses 7 CSV columns and fake data is inside it like (id, first name, last name, age, city, district, country).

Program usage (built with Oracle JDK 1.8):

    java -jar CsvDataGeneratorTool_Project.jar <,||;> Example usage: java -jar CsvDataGeneratorTool_Project.jar 10000000 ,

For JVM heap performance issues, please run it with this JVM memory arguments:

    java -Xmx100g -jar CsvDataGeneratorTool_Project.jar 15000000 ,

Thank you for using my small CSV data file generation tool. (c)2017 October - Mohee Jarada
E-Mail: jarada.mohee@gmail.com

