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