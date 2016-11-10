## Prerequisite 
Please install and configure Maven 3.x 
## To run
### Challenge 1 (KattaFizz problem with only Stage 1)
use the following command in the home directory of the project
### example
mvn exec:java -Dexec.mainClass="kata.fizz.KataFizzBuzz"

### Challenge 2 (KattaOcr problem with UserStory 1 and User Story2 )
use the following command in the home directory of the project
mvn exec:java -Dexec.mainClass="kata.fizz.KataOcr" -Dexec.args="%InputFilePath%"
### example
mvn exec:java -Dexec.mainClass="kata.fizz.KataOcr" -Dexec.args="testinput"

use the following command in the home directory of the project
##To run Test
mvn test

