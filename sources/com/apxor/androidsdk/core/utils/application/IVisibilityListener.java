package com.apxor.androidsdk.core.utils.application;

import android.content.Context;
/* loaded from: classes6.dex */
public interface IVisibilityListener {
    void onBecameBackground(Context context, long j);

    void onBecameForeground(Context context, long j);
}
