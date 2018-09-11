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



OUTPUT from the pipeline:
Started by user B. Smith
Obtained ./ci/Jenkinsfile from git https://github.com/Aempyre/temperature-pipeline.git/
Running in Durability level: MAX_SURVIVABILITY
[Pipeline] node
Running on Jenkins in C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline
[Pipeline] {
[Pipeline] echo
Start Jenkins build process...
[Pipeline] stage
[Pipeline] { (Checkout)
[Pipeline] echo
Stage is Checkout
[Pipeline] checkout
 > git.exe rev-parse --is-inside-work-tree # timeout=10
Fetching changes from the remote Git repository
 > git.exe config remote.origin.url https://github.com/Aempyre/temperature-pipeline.git/ # timeout=10
Fetching upstream changes from https://github.com/Aempyre/temperature-pipeline.git/
 > git.exe --version # timeout=10
 > git.exe fetch --tags --progress https://github.com/Aempyre/temperature-pipeline.git/ +refs/heads/*:refs/remotes/origin/*
 > git.exe rev-parse "refs/remotes/origin/master^{commit}" # timeout=10
 > git.exe rev-parse "refs/remotes/origin/origin/master^{commit}" # timeout=10
Checking out Revision 5e8b5e885e1c99c34d1008c236c1345e0164d10a (refs/remotes/origin/master)
 > git.exe config core.sparsecheckout # timeout=10
 > git.exe checkout -f 5e8b5e885e1c99c34d1008c236c1345e0164d10a
Commit message: "Fix the test running batch file to work on Jenkins."
 > git.exe rev-list --no-walk bcbd8c18b63181c2eebea8ab912fd10d7463c8a1 # timeout=10
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Build)
[Pipeline] echo
Stage is Build
[Pipeline] bat
[temperature-pipeline] Running batch script

C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline>dir src 
 Volume in drive C is OS
 Volume Serial Number is C2BB-CE8E

 Directory of C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline\src

09/10/2018  11:31 PM    <DIR>          .
09/10/2018  11:31 PM    <DIR>          ..
09/10/2018  10:35 PM                 0 TemperatureConverter.java
09/10/2018  11:31 PM             2,440 TUCGrader.class
09/10/2018  11:31 PM             3,364 TUCGrader.java
09/10/2018  10:35 PM    <DIR>          userinterface
09/10/2018  11:56 PM    <DIR>          utility
               3 File(s)          5,804 bytes
               4 Dir(s)  650,930,593,792 bytes free
[Pipeline] bat
[temperature-pipeline] Running batch script

C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline>buildit.bat

C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline>"C:\Program Files\Java\jdk1.8.0_181\bin\javac" -cp ./src;./src/utility;./src/userinterface src/TUCGrader.java 
[Pipeline] echo
After build bat
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Test)
[Pipeline] echo
Stage is Test
[Pipeline] bat
[temperature-pipeline] Running batch script

C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline>testit.bat

C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline>"C:\Program Files\Java\jdk1.8.0_181\bin\javac" -cp ./src;./src/utility;./junit/junit-4.10.jar;./junit/hamcrest-core-1.3.jar src/utility/MathOpsTest.java 

C:\Program Files (x86)\Jenkins\workspace\temperature-pipeline>"C:\Program Files\Java\jdk1.8.0_181\bin\java" -cp ./src;./src/utility;./junit/junit-4.10.jar;./junit/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MathOpsTest 
JUnit version 4.10
.
Time: 0

OK (1 test)

[Pipeline] echo
After testit.bat
[Pipeline] }
[Pipeline] // stage
[Pipeline] echo
Jenkins build complete...
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS