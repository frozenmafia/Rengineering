package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import o.DefaultSpecialEffectsController;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class FacebookInitProvider extends ContentProvider {
    private static final String ah$a;
    public static final values valueOf = new values(null);

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        runAnimators.ag$a(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        runAnimators.ag$a(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        runAnimators.ag$a(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        runAnimators.ag$a(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        runAnimators.ag$a(uri, "uri");
        return 0;
    }

    /* loaded from: classes6.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }

    static {
        runAnimators.ah$a("FacebookInitProvider", "FacebookInitProvider::class.java.simpleName");
        ah$a = "FacebookInitProvider";
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Context context = getContext();
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            DefaultSpecialEffectsController.AnonymousClass8.ag$a(context);
            return false;
        } catch (Exception e) {
            Log.i(ah$a, "Failed to auto initialize the Facebook SDK", e);
            return false;
        }
    }
}
