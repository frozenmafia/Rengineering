package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.InputStream;
import o.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzna implements zzne {
    private static int toString = 1;
    private static int values;
    private final /* synthetic */ Context val$context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzna(Context context) {
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzne
    public final InputStream open(String str) throws IOException {
        int i = values + 67;
        toString = i % 128;
        int i2 = i % 2;
        try {
            try {
                Object[] objArr = null;
                InputStream inputStream = (InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(Color.red(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 87)).getMethod("ah$a", AssetManager.class, String.class).invoke(null, this.val$context.getAssets(), str);
                int i3 = toString + 25;
                values = i3 % 128;
                if ((i3 % 2 != 0 ? (char) 6 : 'K') != 6) {
                    return inputStream;
                }
                int length = objArr.length;
                return inputStream;
            } catch (Throwable th) {
                try {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
