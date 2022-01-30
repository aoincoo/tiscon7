package com.tiscon.domain;

import java.io.Serializable;

public class TruckCapacity {
    private int truckId;
    private String truckType;
    private int maxBox;
    private int price;

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getMaxBox() {
        return maxBox;
    }

    public void setMaxBox(int maxBox) {
        this.maxBox = maxBox;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
