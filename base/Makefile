Main.class: Main.java Attributes.class Hunger.class Mood.class Energy.class Pet.class Dog.class
	javac -g Main.java

Pet.class: Pet.java Hunger.class Mood.class Energy.class
	javac -g Pet.java

Hunger.class: Hunger.java Attributes.class
	javac -g Hunger.java

Mood.class: Mood.java Attributes.class
	javac -g Mood.java

Energy.class: Energy.java Attributes.class
	javac -g Energy.java

Dog.class: Dog.java Pet.class
	javac -g Dog.java

Attributes.class: Attributes.java
	javac -g Attributes.java

clean:
	rm *.class

run: Petjar.jar
	java -jar Petjar.jar

jar:
	jar cmf manifest.mf Petjar.jar Main.class Main.java Attributes.class Attributes.java Hunger.class Hunger.java Mood.class Mood.java Energy.class Energy.java Pet.class Pet.java Dog.class Dog.java algorithm.md Final.png
