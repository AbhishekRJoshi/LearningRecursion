public class PrintingNum {
    public static void main(String[] args){
        printNum(3);

    }

    static void printNum(int num){
        if (num == 0){
            return;
        }
        System.out.println(num);
        printNum(num - 1);
        System.out.println(num);
    }
}
