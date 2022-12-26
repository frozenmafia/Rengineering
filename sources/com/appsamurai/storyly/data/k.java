package com.appsamurai.storyly.data;

import android.graphics.Color;
import o.clearCache;
/* loaded from: classes3.dex */
public enum k {
    COLOR_189FFF("#189FFF"),
    COLOR_434343("#434343"),
    COLOR_EFEFEF("#EFEFEF"),
    COLOR_16C898("#16C898"),
    COLOR_FE3F9C("#FE3F9C"),
    COLOR_262626("#262626"),
    COLOR_141414("#141414"),
    COLOR_6A6A6A("#6A6A6A"),
    COLOR_FF4D50("#FF4D50"),
    COLOR_51C41A("#51C41A"),
    COLOR_7A7A7A("#7A7A7A"),
    COLOR_F1F1F1("#F1F1F1"),
    COLOR_BFBFBF("#BFBFBF"),
    COLOR_C4C4C4("#C4C4C4"),
    COLOR_3D3D3D("#3D3D3D"),
    COLOR_E0E0E0("#E0E0E0"),
    COLOR_ADADAD("#ADADAD"),
    COLOR_212121("#212121"),
    COLOR_757575("#757575");
    
    public final String a;

    k(String str) {
        this.a = str;
    }

    public final clearCache a() {
        return new clearCache(Color.parseColor(this.a));
    }
}
