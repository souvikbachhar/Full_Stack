----Creating webapp---

mvn archetype:generate -DgroupId=com.wipro -DartifactId=hellomaven -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

Note: It can be done from eclipse IDE also new->MavenProject-> select artidfactID and other details->finish

----Building App----

mvn clean package


---Host on server---