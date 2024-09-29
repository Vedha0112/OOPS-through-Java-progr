
 class Invoice {  

     String No;  
    String Desc;  
  int quan;  
    double price;  

    
 Invoice(String n, String d, int q, double p) {  
        this.No=n ;  
       this.Desc=d ;  
        this.quan=q;  
        this.price=p; 
    }  
    double getInvoiceAmount() {  
        if (quan < 0) {  
            quan = 0;  
        }  
        if (price < 0) {  
            price = 0.0;  
        }  
        return quan * price;  
    }  
     String getPartNumber() {  
        return No;  
    }  
     String getPartDescription() {  
        return Desc;  
    }  
     int getQuantity() {  
        return quan;  
    }
   double getPricePerItem() {  
        return price;  
    }    
    public static void main(String[] args) {  
              Invoice i = new Invoice("12345", "book", 3, 15.75);   
        System.out.printf("Invoice Amount: $%.2f%n", i.getInvoiceAmount());  
    }  
}  
