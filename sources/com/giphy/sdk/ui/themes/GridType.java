package com.giphy.sdk.ui.themes;
/* loaded from: classes4.dex */
public enum GridType {
    waterfall,
    carousel;

    public final boolean hasSearchBar() {
        GridType gridType = this;
        return gridType == waterfall || gridType == carousel;
    }
}
