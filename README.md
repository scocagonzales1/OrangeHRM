# Orange automation tests

## Requirements
update the BaseTest.java the driver path

## Install allure commandline
we need to install the allrule command line in order to show the results or reports for these
follow the next steps:

```bash
1. Download the latest version as zip archive from Maven Central.
https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/
2. Unpack the archive to allure-commandline directory.
3. Navigate to bin directory.
4. Use allure.bat for Windows or allure for other Unix platforms.
5. Add allure to system environment  PATH. 
```
Execute allure --version in console to make sure that allure is now available:
```bash
$ allure --version
2.0.1
```
## Generate the results or test
Execute the command like:
```bash
 ./gradlew clean test -Dusername=Admin -Dpassword=admin123
```
the results will be saved to `/build/allure-results` folder

## serve the results at allure
open the terminal and execute the follow command
```bash
allure serve build\allure-results
```