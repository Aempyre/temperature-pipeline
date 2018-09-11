# temperature-pipline
A basic continuous integration/continuous deploy pipeline

How to install:

How to run:

What to expect:

How to make changes:



NOtes on running the unit test:
(from src)

build:
>javac -cp .;../junit/junit-4.10.jar;./junit/hamcrest-core-1.3.jar utility/MathOpsTest.java

run:
>java -cp .;./utility;../junit/junit-4.10.jar;../junit/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MathOpsTest


Notes on building the app: (from project dir like Jenkins does:)
C:\Users\worterschmidt\areas_of_interest\projects_troutmoon\Flexion\temperature-pipeline>"C:
\Program Files\Java\jdk1.8.0_181\bin\javac" -cp ./src;./src/utility;./src/userinterface src/
TUCGrader.java

Building from the src dir:
C:\Users\worterschmidt\areas_of_interest\projects_troutmoon\Flexion\temperature-pipeline\src
>"C:\Program Files\Java\jdk1.8.0_181\bin\javac" TUCGrader.java