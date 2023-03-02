package ro.sda.fundamentals._2_conditional_statements;

public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(2500);
    }

    // 5 % 3 = 2;
    // 10 % 100 = 10;
    // 7 % 2 = 1
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("invalid value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int reminder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + reminder + " KB ");
        }
    }
}

