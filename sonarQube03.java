package main;
public class SonarQube03 {
    int calcNumbers(int start){
        int accumulator = start;
        boolean success = true;
        while(success){
            accumulator = accumulator + start;
        }
        return accumulator;
    }
}
