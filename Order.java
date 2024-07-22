import java.util.ArrayList;

public class Order {
    String customerID;
    String warehouseID;
    String PersonnelID;
    final String orderID;
    static int orderIDCount=0;
    ArrayList<int> productList;

    Order(String customerID, String warehouseID, String personnelID){
        this.customerID=customerID;
        this.warehouseID=warehouseID;
        PersonnelID=personnelID;

        orderIDCount++;
        orderID=Warehouse.getWarehouseID()+String.format("%03d",orderIDCount);
    }


    public void addProduct(int productID, int quantity){
        productList.add(productID);
        productList.add(quantity);
    }
    public void removeProduct(int i){
        if (productList.contains(i))
        productList.remove(productList.indexOf(i));
    }
    public String getOrderID(){
        return orderID;
    }

    public String rawData() {
        String data = orderID+","+customerID+","+warehouseID+","+PersonnelID;
        for (int i : productList) {
            data+=","+(2*i)+","+(i+1);
        }
        return data;
    }
}
