package oop.inheritance;

public class InClient {
    public static void main(String[] args) {
        ModArrayList mArr = new ModArrayList();
        mArr.add(10);
        mArr.add(20);
        mArr.add(30);
        mArr.add(40);

        System.out.println(mArr.getUsingMod(2));

    }
}
