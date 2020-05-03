
public class AdapterPattern {
    //This is the client class.
        public static void main(String args[]){
            Extension targetInterface=new parkingCustomer();
            targetInterface.giveVehicleDetails();
            System.out.print(targetInterface.getFeeDetails());
        }
    }//End of the BankCustomer class.
