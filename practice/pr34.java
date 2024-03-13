package practice;

//연습문제 - 싱글톤 만들기
//클래스 이름 : HanaAccount
//  필드 : 계좌번호(1234), 고객이름(홍길동), 잔액(1000), 이자율(년3%)
//  메소드 : 입금(+100), 출금(-100), 이자계산(1년후 잔액), 잔액조회
//싱글톤을 호출후
//1. 입금 메소드 호출
//2. 출금 메소드 호출
//3. 이자계산은 이자율을 읽어서 참조한다.
//   이자계산후 잔액 증가한다.
//4. 최종 잔액을 출력한다.

class HanaAccount {
    private static HanaAccount singleton;

    String accountNumber;
    String name;
    double balance;
    double interestRate;

    private HanaAccount() {}

    public static HanaAccount getInstance() {
        if (singleton == null)
            singleton = new HanaAccount();
        return singleton;
    }

    void deposit(int amount) {
        System.out.println(amount+"원 입금");
        balance += amount;
    }

    void withdraw(int amount) {
        System.out.println(amount+"원 출금");
        balance -= amount;
    }

    void calculateInterest() {
        balance *= (1 + interestRate);
        System.out.println("이자 계산 완료!");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

public class pr34 {
    public static void main(String[] args) {
        //싱글톤을 호출후
        HanaAccount hanaAccount = HanaAccount.getInstance();
        hanaAccount.setAccountNumber("1234");
        hanaAccount.setName("홍길동");
        hanaAccount.setBalance(1000);
        hanaAccount.setRate(0.03);
        //1. 입금 메소드 호출
        hanaAccount.deposit(100);
        //2. 출금 메소드 호출
        hanaAccount.withdraw(-100);
        //3. 이자계산은 이자율을 읽어서 참조한다.
        //   이자계산후 잔액 증가한다.
        hanaAccount.calculateInterest();
        //4. 최종 잔액을 출력한다.
        System.out.println("잔액 : "+hanaAccount.getBalance()+"원");
    }
}