package com.google.ads.interactivemedia.v3.impl.data;
/* loaded from: classes4.dex */
public abstract class cd {
    public abstract ce build();

    public abstract cd volume(float f);

    public cd volumePercentage(int i) {
        return volume(i / 100.0f);
    }
}
