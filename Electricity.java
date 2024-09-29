//Program to calculate Electricity bill 
class Electricity {  
     
    int consumerNo;  
    String consumerName, connectionType;
    float rate;
    int prevReading, currReading;  
    float amount;

   
    Electricity(int no, String name, int p_r, int c_r, String ctype) {  
        this.consumerNo = no;
        this.consumerName = name;
        this.prevReading = p_r;
        this.currReading = c_r;
        this.connectionType = ctype;
    }  

   
    double getAmount() {  
        int unitsConsumed = currReading - prevReading;

        
        if (connectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                rate = 2.0f; //  <= 100 units
            } else if (unitsConsumed <= 200) {
                rate = 3.0f; //  101-200 units
            } else {
                rate = 5.0f; //  > 200 units
            }
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                rate = 4.0f; //  <= 100 units
            } else if (unitsConsumed <= 200) {
                rate = 6.0f; // 101-200 units
            } else {
                rate = 8.0f; //  > 200 units
            }
        }

      
        amount = unitsConsumed * rate;
        return amount;
    }

    
    void display() {
        System.out.println("Electricity Bill");
        System.out.println("----------------");
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Previous Reading: " + prevReading);
        System.out.println("Current Reading: " + currReading);
        System.out.println("Units Consumed: " + (currReading - prevReading));
        System.out.printf("Total Bill Amount: %.2f%n", getAmount());
    }

    public static void main(String[] args) {
        Electricity e = new Electricity(1074, "Priya", 95, 101, "domestic");
        e.display();
    }
}
