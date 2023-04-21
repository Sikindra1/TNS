package day3;
public class CustomerBaseClass {
    // parametrized and non parameterizsed constructor
      private String CustomerName;
      private String address;
      private int contactNO;
      public CustomerBaseClass(){
          System.out.println("default constructor");
      }
      public CustomerBaseClass(String cusName,String add,int no){
          this.CustomerName=cusName;
          this.address=add;
          this.contactNO=no;

      }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNO() {
        return contactNO;
    }

    public void setContactNO(int contactNO) {
        this.contactNO = contactNO;
    }

    @Override
    public String toString() {
        return "CustomerBaseClass{" +
                "CustomerName='" + CustomerName + '\'' +
                ", address='" + address + '\'' +
                ", contactNO=" + contactNO +
                '}';
    }
}
