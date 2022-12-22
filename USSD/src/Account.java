public abstract class Account
    {
        public String account_No = "123456789";
        public String password = "246810";
        public double balance = 2000;
        public String name_Surname = "Keoagile Phakedi";
    public Account()
        {

        }
    public Account(String account_No ,String password ,String Acc_No, double balance, String name_Surname)
        {
            this.account_No = account_No;
            this.password = password;
            this.balance = balance;
            this.name_Surname = name_Surname;;
        }

        public double getbalance()
        {
            return balance;
        }
        public String getPassword()
        {
            return password;
        }
        public abstract double calc();

        public String toString()
        {
            String str = String.format(super.toString(), balance);
            return str;
        }
    }

