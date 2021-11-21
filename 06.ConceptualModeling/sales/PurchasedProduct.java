public class PurchasedProduct{
    private String customer;
    private String product;
    
    public PurchasedProduct(String customer, String product){
        this.customer = customer;
        this.product = product;
    }
    public void setBuyer(String customer){
        this.customer = customer;
    }
    
    public String getBuyer(){
        return this.customer;
    }
    
    public void setProduct(String product){
        this.product = product;
    }
    
    public String getProduct(){
        return this.product;
    }
    
    
}
