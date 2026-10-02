public class Account {
    private Integer id;
    private Long balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void deposit(Long amount){
        if(amount >= 0){
            this.balance += amount;
        }else{
            System.out.println("musbet olmalidir");
        }
    }

    public void withDraw(Long amount){
        if(amount > 0){
            if(amount <= this.balance){
                this.balance -= amount;
                System.out.println("pul ugurla cekildi");
            }else{
                System.out.println("cekilecek pul balansdan boyuk olmamalidir");
            }
        }else{
            System.out.println("musbet olmalidir");
        }
    }
}
