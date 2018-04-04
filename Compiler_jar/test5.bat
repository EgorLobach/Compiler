start Compiler.jar  prog5.txt
timeout /t 2
"C:\Program Files\Java\jdk1.8.0_121\bin\javac.exe" Program.java
@echo on 
java Program 
pause 
del *.class 
del *.java
