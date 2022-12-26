package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
/* loaded from: classes3.dex */
final class ae extends av<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(Context context) {
        super(context, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.av
    /* renamed from: valueOf */
    public String AFInAppEventParameterName() {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.values.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.valueOf);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex("aid"));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String AFInAppEventType() {
        new Thread(this.AFInAppEventParameterName).start();
        return (String) super.values();
    }

    @Override // com.appsflyer.internal.av
    public final /* synthetic */ String values() {
        new Thread(this.AFInAppEventParameterName).start();
        return (String) super.values();
    }
}
