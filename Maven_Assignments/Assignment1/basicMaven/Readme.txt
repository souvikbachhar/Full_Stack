----creating project----

mvn archetype:generate -DgroupId=com.wipro.topgear -DartifactId=basicMaven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

----building project----

mvn clean package

----running project----

go to directory .\target\classes
java com.wipro.topgear.App

----Testing project----

mvn test

To run a specific test class

mvn -Dtest=AppTest1 test