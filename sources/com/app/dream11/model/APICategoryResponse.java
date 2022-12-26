package com.app.dream11.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class APICategoryResponse {
    private String globalCategoryVersion = "";
    private String globalCategoryVersionKey = "globalCategoryVersion";
    private List<APICategory> apiCategoryVersion = new ArrayList();

    public List<APICategory> getAPICategoryList() {
        return this.apiCategoryVersion;
    }

    public String getGlobalCategoryVersion() {
        return this.globalCategoryVersion;
    }

    public String getGlobalCategoryVersionKey() {
        return this.globalCategoryVersionKey;
    }
}
