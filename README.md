# temperature-pipeline
A basic continuous integration/continuous deploy pipeline.

**Note:** The approach taken, though working, was supposed to be a time saver but it probably *would have* been faster to rent another cloud server and set up Jenkins there.  Anyhow, the thinking was:
...* Save time and money by running Jenkins locally on my windows laptop!
.....(Turns out it was a bit different than setting it up in the normal, server way.)
...* Make it compact to set up and evaluate:  Just install Jenkins, pull the repo. & go!
.....(It turned out somewhat like that after all -- with caveats).

Caveats:
1.  On windows you have to use "bat" not "sh" to run scripts -- couldn't seem to get these to change directories (don't recall this being a problem with "sh" but maybe I forgot), hence the extra try hard in the .bat files for buildit, runit, testit -- they are forced to run from the project directory.
2.  Jenkins seems to want Java 1.8 -- not 100% sure but during trouble shooting I saw some jenkins chat that mentioned it, changed down from java 1.10 to 1.8 and got past problem, but honestly was hurrying and changed some other things too at same time so the official jenkins chat I saw could still be just FUD.
3.  THIS was a real problem and a real headache:  No clue in any error messages, but just by guessing learned that had to upgrade my laptop from Git 1.8.x for Windows.  Put on the latest available, 2.18.0.windows.1 and the checkout from the remote repo started working.
4.  Finally.  I seem to recall that one could set up Jenkins to poll the repo for changes in order to automatically kick off the build.  Not desireable of course as it could lead to crushing the remote repo server, but I assumed this option, which still exists in Jenkins, would still work and allow showing off checkin-triggers-build.  Turns out "polling" involves setting up hooks on the target repo. to http post back to your Jenkins server -- the documentation is not all all clear on this, never found where they actually confess this, but it is a fact.  So in this project, as my laptop (and presumably your workstation/laptop as well), is not exposed on the internet and thus couldn't recieve http post, you have to use the Jenkins control panel to trigger the build.

## How to setup:
1.  Install Jenkins locally:  https://jenkins.io/
2.  Create a pipeline set up to use ./ci/Jenkinsfile from the repo.
...* NOTE:  See videos under "videos" directory.

## How to run:
In the project root directory run buildit, then runit to run the app.
To run the unit test run testit

## What to expect:
For the app see the video.
For the unit test see usual junit output (plus look at the test code please)

## How to make changes:
1.  git clone the repo into your usual project directory structure.
2.  make a change, merge to local master, then push to remote master.
3.  manually trigger the build in Jenkins (why it doesn't auto-"poll" explained already).  NOTE that jenkins pulls another copy of the repo into its own workspace area for building and running tests (as is usual for that tool).


That's all,
Thanks for this test, it was a hearty stew!

Best regards,
Brian