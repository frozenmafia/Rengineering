package com.app.dream11.integration;

import java.io.Serializable;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class ProductAnalyticsObject implements Serializable {
    private HashMap<String, Serializable> productDataMap = new HashMap<>();

    public ProductAnalyticsObject setItemId(String str) {
        this.productDataMap.put("item_id", str);
        return this;
    }

    public ProductAnalyticsObject setItemName(String str) {
        this.productDataMap.put("item_name", str);
        return this;
    }

    public ProductAnalyticsObject setItemCategory(String str) {
        this.productDataMap.put("item_category", str);
        return this;
    }

    public ProductAnalyticsObject setItemVariant(String str) {
        this.productDataMap.put("item_variant", str);
        return this;
    }

    public ProductAnalyticsObject setItemBrand(String str) {
        this.productDataMap.put("item_brand", str);
        return this;
    }

    public ProductAnalyticsObject setItemPrice(Double d) {
        this.productDataMap.put("price", d);
        return this;
    }

    public ProductAnalyticsObject setItemCurrency(String str) {
        this.productDataMap.put("currency", str);
        return this;
    }

    public ProductAnalyticsObject setItemQty(Long l) {
        this.productDataMap.put("quantity", l);
        return this;
    }

    public ProductAnalyticsObject setValue(Serializable serializable) {
        this.productDataMap.put("value", serializable);
        return this;
    }

    public ProductAnalyticsObject setIndex(Double d) {
        this.productDataMap.put("index", d);
        return this;
    }

    public HashMap<String, Serializable> getProductDataMap() {
        return this.productDataMap;
    }
}
