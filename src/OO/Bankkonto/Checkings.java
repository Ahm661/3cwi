package OO.Bankkonto;

public class Checkings {

    public class CheckingsAccount extends Bankkonto{
        private int limit;

        public CheckingsAccount(int limit) {
            this.limit = limit;
        }


        public double withdraw(double amount) {
            if ((getBalance() - amount)>(limit * -1)){
                System.out.println("Widthdrawn " + amount + " Euros");
                return super.withdraw(amount);
            }
            else {
                System.out.println("Leider keine Deckung");
                return 0;
            }


        }
    }

}