// This is the adapter class
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class parkingCustomer extends parkingDetails implements Extension{
    public void giveVehicleDetails(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the customer's name :");
            String customerName=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the total parking fee:");
            long parkingFee=Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the Vehicle Make :");
            String VehicleMake=br.readLine();

            setCustomerName(customerName);
            setTotalFee(parkingFee);
            setVehicleMake(VehicleMake);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String getFeeDetails() {
        long totalFee=getTotalFee();
        String customerName=getCustomerName();
        String VehicleMake=getVehicleMake();

        return ("Customer "+customerName+" parked "+VehicleMake+" in Red Raider Parking Garage and paid "+totalFee+ " as parking fee.... ");
    }
}//End of the BankCustomer class.