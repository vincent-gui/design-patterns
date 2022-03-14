package top.ss007.builder.simple;

public class Demo {
    public static void main(String[] args) {
        PersonalComputer computer=new PersonalComputer.Builder("因特尔","三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
    }
}
