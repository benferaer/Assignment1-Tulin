Sorting Application - README

Installation & Setup

1. Prerequisites

Java Development Kit (JDK) 1.8 (JavaSE-1.8) or higher

Eclipse IDE (Recommended)

2. Importing the Project into Eclipse

Open Eclipse IDE.

Click on File > Import.

Select Existing Projects into Workspace under General.

Click Next and select the project folder.

Click Finish.

3. Running the Program in Eclipse

Ensure the input files (shapes1.txt, shapes2.txt, shapes3.txt) are located inside the src/res/ folder.

Locate the Run option at the top and select Run Configurations.

In the Run Configurations pop-up, select Arguments.

In the Program Arguments field, type your argument like:

-fshapes1.txt -Tv -Sb

-fshapes2.txt -Ta -Si

-fshapes3.txt -Th -Sm

Click Run to execute the program.

The output will be displayed in the console window.

Running the Program via Command Line

1. Compiling the Program (If Needed)

javac -d bin -sourcepath src src/Main.java

2. Running the Program

To execute the JAR file, use the following command:

java -jar Sort.jar -ffile_name -tv -sb

3. Navigating to the Project Folder in CMD

Method 1: Quick Navigation

Navigate to the project folder in File Explorer.

Click on the address bar, select all text, and type cmd, then press Enter.

Now type the valid commands (examples below).

Method 2: Using cd Command

Copy the full path of the project folder.

Open Command Prompt.

Type:

cd [paste the copied path]

Press Enter, then type the valid command to run the program.

4. Command-Line Arguments Format

-f or -F followed by the file name (e.g., shapes1.txt) - no spaces.

-t or -T followed by:

v for volume

h for height

a for base area

-s or -S followed by:

b for Bubble Sort

s for Selection Sort

i for Insertion Sort

m for Merge Sort

q for Quick Sort

z for **Custom Sort (Heap Sort)`

5. Examples of Valid Commands

java -jar Sort.jar -fshapes1.txt -Tv -Sb
java -jar Sort.jar -ta -sQ -f"res/shapes1.txt"
java -jar Sort.jar -tH -F"C:\temp\shapes1.txt" -sB

✅ Arguments are case-insensitive and can be entered in any order.

Expected Output Format

After sorting, the program prints:

First sorted element

Every 1000th element (if available)

Last element

Sorting time in milliseconds

Example Output (Sorting by Height)

========================================
           SORTING RESULTS
========================================

Position             Shape        Value
---------------------------------------------------
First element:       Cylinder     Height: 39,999.876
1000-th element:     Cone         Height: 37,983.086
2000-th element:     Pyramid      Height: 36,056.608
...
Last element:        Cone         Height: 2.094

Bubble Sort run time was: 2645 milliseconds
========================================

Troubleshooting & Notes

1. Incorrect Command Arguments

If an incorrect argument is entered, the program will display an error message and instructions for correct usage.

2. Input File Placement

Make sure the input file (shapes1.txt, etc.) is in the src/res/ folder for Eclipse execution.

If using command-line execution, provide an absolute or relative path to the file.