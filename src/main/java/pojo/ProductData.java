package pojo;

public class ProductData {
private String searchKey;
private String productName;
private int  imageCount;
private String brand;

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public String getProductName() {
        return productName;
    }

    public int getImageCount() {
        return imageCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
