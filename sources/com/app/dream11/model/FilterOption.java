package com.app.dream11.model;
/* loaded from: classes6.dex */
public class FilterOption {
    private boolean isEnableForCombination = true;
    private String title;
    private String value;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public boolean isEnableForCombination() {
        return this.isEnableForCombination;
    }

    public void setEnableForCombination(boolean z) {
        this.isEnableForCombination = z;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof FilterOption)) {
            if (this.value == null && ((FilterOption) obj).getValue() == null) {
                return true;
            }
            String str = this.value;
            if (str != null) {
                return str.equals(((FilterOption) obj).getValue());
            }
            return false;
        }
        return super.equals(obj);
    }
}
