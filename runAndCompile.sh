#!/bin/bash

rm -rf build
javac -d build --release 8 $(find src -name "*.java")
javac -d build/META-INF/versions/9 --release 9 $(find src9 -name "*.java")
jar --create --file talks.jar --manifest MANIFEST.MF --main-class=com.senacor.demo.Main -C build .


echo $(java -version)
java -jar talks.jar
echo $(/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/bin/java -version)
/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/bin/java -jar talks.jar

