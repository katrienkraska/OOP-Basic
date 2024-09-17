package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Machine[] machines = {
        new Truck(),
        new Bulldozer(),
        new Excavator()
};

for (Machine machine : machines){
    machine.doWork();
    machine.stopWork();
}
    }
}