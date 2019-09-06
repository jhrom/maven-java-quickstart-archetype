# maven-java8-quickstart-archetype

Current version 1.0.3

Simple archetype to create classic java project (11). Source code encoding is set to UTF-8.

In contains this dependencies:
* slf4j-simple (1.7.26)
* junit (4.12) *test*
* assertj-core (3.12.2) *test*
* mockito-core (2.28.2) *test*

It doesn't contain any framework set up, only 1 class with main method and 1 simple test. 

How to use it:

```
git clone https://github.com/jhrom/maven-java8-quickstart-archetype.git
mvn clean install 
mvn archetype:generate -DgroupId={your_project_group} \
   -DartifactId={your_artifact_Id} \
   -DarchetypeArtifactId=maven-java8-quickstart-archetype \
   -DarchetypeGroupId=pl.jhrom.archetype \
   -DarchetypeVersion=1.0.2 
```
