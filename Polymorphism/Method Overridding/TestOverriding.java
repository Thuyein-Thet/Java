class Bank{
    int getInterestRate(){
        return 0;
    }
}

class SBI extends Bank{
    int getInterestRate(){
        return 8;
    }
}

class ICICI extends Bank{
    int getInterestRate(){
        return 7;
    }
}

class AXIS extends Bank{
    int getInterestRate(){
        return 6;
    }
}

class TestOveriding{
    public static void main(String args[]){
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("SBI Rate of Interest:"+sbi.getInterestRate());
        System.out.println("ICICI Rate of Interest:"+icici.getInterestRate());
        System.out.println("AXIS Rate of Interest:"+axis.getInterestRate());
    }
}