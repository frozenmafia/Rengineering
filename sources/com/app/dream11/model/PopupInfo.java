package com.app.dream11.model;

import java.io.Serializable;
import java.util.Arrays;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PopupInfo implements Serializable {
    private final String[] message;
    private final String name;

    public static /* synthetic */ PopupInfo copy$default(PopupInfo popupInfo, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupInfo.name;
        }
        if ((i & 2) != 0) {
            strArr = popupInfo.message;
        }
        return popupInfo.copy(str, strArr);
    }

    public final String component1() {
        return this.name;
    }

    public final String[] component2() {
        return this.message;
    }

    public final PopupInfo copy(String str, String[] strArr) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(strArr, "message");
        return new PopupInfo(str, strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PopupInfo) {
            PopupInfo popupInfo = (PopupInfo) obj;
            return runAnimators.values((Object) this.name, (Object) popupInfo.name) && runAnimators.values(this.message, popupInfo.message);
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Arrays.hashCode(this.message);
    }

    public String toString() {
        String str = this.name;
        String arrays = Arrays.toString(this.message);
        return "PopupInfo(name=" + str + ", message=" + arrays + ")";
    }

    public PopupInfo(String str, String[] strArr) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(strArr, "message");
        this.name = str;
        this.message = strArr;
    }

    public final String getName() {
        return this.name;
    }

    public final String[] getMessage() {
        return this.message;
    }
}
