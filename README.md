### #description
Project "Smart House".

### #task 1
#### radio station
1. Ability to set the number of radio stations when creating an object (by default - 10).
1. The current radio station number ranges from 0 to the number of radio stations specified during creation.
1. If current radio station is maximum one, and the client pressed on the ``next`` button on the remote control
   then current one should become the 0th one.
1. If current radio station is 0th, and the client pressed the ``prev`` button on the remote control then current radio
   station should become maximum.    
1. The client should be to have ability to set number of radio station on the remote control 
   (entering numbers 0 - quantity radio stations).   
   
#### sound
1. The client should be to have ability to increase and to reduce the level of the sound (range 0 to 100).
1. If the sound volume level reaches maximum value
   then further pressing on ``+`` should not lead to anything.
1. If the sound volume level reaches minimum value
then further pressing on ``-`` should not lead to anything.
   
#### project
1. Connect Surefire plugin.
1. Connect JaCoCo plugin.
1. Realize autotests for methods containing 
   achieving 100% coverage for branches.
1. Connect CI on Github Action.
1. Make Pull Request.

### #task 2
1. Create the branch 'lombok'.
1. Connect Lombok.
1. Rewrite all classes with Lombok.
1. Make Pull Request and sure CI builds successfully.

### #tools
Java, Maven, JUnit Jupiter, Lombok, Surefire, JaCoCo.