package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.bjf;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class ca implements UiElement {
    public static final bjf<ca> GSON_TYPE_ADAPTER = new bz();
    private final String name;

    public ca(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ca)) {
            return this.name.equals(((ca) obj).name);
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.api.UiElement
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name});
    }

    public String toString() {
        String str = this.name;
        return "UiElementImpl[name=" + str + "]";
    }
}
