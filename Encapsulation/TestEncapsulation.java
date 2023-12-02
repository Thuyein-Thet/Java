package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_no(7502394124L);
        acc.setName("Thuyein Thet");
        acc.setEmail("thuyein@gmail.com");
        acc.setAmount(5000000f);

        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
