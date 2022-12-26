package com.app.dream11.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class WhatsAppFeaturesResponse {
    private List<String> features = new ArrayList();
    private boolean isWhatsAppEnabled;

    public List<String> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<String> list) {
        this.features = list;
    }

    public void addFeature(String str) {
        this.features.add(str);
    }

    public boolean isWhatsAppEnabled() {
        return this.isWhatsAppEnabled;
    }

    public void setWhatsAppEnabled(boolean z) {
        this.isWhatsAppEnabled = z;
    }
}
