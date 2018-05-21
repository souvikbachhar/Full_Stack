----creating project----

mvn archetype:generate -DgroupId=com.wipro.topgear -DartifactId=souvik -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

----building project----

mvn clean package

----running project----

go to directory .\target\classes
java com.wipro.topgear.App

----Testing project----

mvn test

To run a specific test class

mvn -Dtest=AppTest1 test


----Inserting dependencies in pom.xml----

<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.0</version>
</dependency>

----For using Library property----

  <properties>
		<junit.version>3.8.1</junit.version>
		<apache.version>3.0</apache.version>
  </properties>

 <dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>${apache.version}</version>
 </dependency>