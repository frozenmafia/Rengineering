package com.apxor.androidsdk.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.apxor.androidsdk.core.utils.Logger;
/* loaded from: classes6.dex */
public class ApxorInitProvider extends ContentProvider {
    private static final String a = "ApxorInitProvider";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Bundle bundle = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("APXOR_APP_ID", null);
                if (string != null && !string.isEmpty()) {
                    ApxorSDK.initialize(string, getContext().getApplicationContext());
                }
                Logger.e(a, "App Id is empty or null, couldn't initialize ApxorSDK", null);
                return false;
            }
            Logger.e(a, "Metadata is null, couldn't initialize ApxorSDK", null);
            Logger.i(a, "ApxorInitProvider init");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
