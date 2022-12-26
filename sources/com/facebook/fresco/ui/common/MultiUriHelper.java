package com.facebook.fresco.ui.common;

import android.net.Uri;
import o.Fragment;
/* loaded from: classes4.dex */
public abstract class MultiUriHelper {
    public static <T> Uri getMainUri(T t, T t2, T[] tArr, Fragment.AnonymousClass6<T, Uri> anonymousClass6) {
        Uri apply;
        Uri apply2;
        if (t == null || (apply2 = anonymousClass6.apply(t)) == null) {
            if (tArr == null || tArr.length <= 0 || tArr[0] == null || (apply = anonymousClass6.apply(tArr[0])) == null) {
                if (t2 != null) {
                    return anonymousClass6.apply(t2);
                }
                return null;
            }
            return apply;
        }
        return apply2;
    }
}
