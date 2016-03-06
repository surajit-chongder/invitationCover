javac -cp src:out/PrintGuestLabel -d out src/PrintGuestLabel.java
java -cp out/ PrintGuestLabel firstNameFirst $@
