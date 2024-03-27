package za.ac.cput.domain;

public class Inventory {
    private String inventoryId;
    private String name;
    private String location;
    private String stockItemId ;

    private Inventory() {
    }
private Inventory(Builder builder){
        this.inventoryId = builder.inventoryId;
        this.name = builder.name;
        this.location = builder.location;
        this.stockItemId = builder.stockItemId;


}

    public String getInventoryId() {
        return inventoryId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getStockItemId() {
        return stockItemId;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId='" + inventoryId + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", stockItemId='" + stockItemId + '\'' +
                '}';
    }

    public void setName(String updatedInventory) {
    }

    public static class Builder{
        private String inventoryId;
        private String name;
        private String location;
        private String stockItemId ;


        public Builder setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setStockItemId(String stockItemId) {
            this.stockItemId = stockItemId;
            return this;
        }
        public Builder copy(Inventory e){
            this.inventoryId = e.inventoryId;
            this.name = e.name;
            this.location = e.location;
            this.stockItemId = e.stockItemId;
            return this;
        }
         public  Inventory build(){
            return new Inventory(this);
         }

    }
}
