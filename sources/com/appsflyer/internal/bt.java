package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;
/* loaded from: classes3.dex */
public final class bt extends bn {
    public bt(Runnable runnable) {
        super("samsung", runnable);
    }

    @Override // com.appsflyer.internal.bs
    public final void AFInAppEventParameterName(Context context) {
        values(context, new av<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.bt.5
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
                if (r3 != null) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
                if (0 == 0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
                r0 = ((android.content.pm.PackageItemInfo) r11.values.getPackageManager().resolveContentProvider(r11.valueOf, 128)).packageName;
                r11.AFInAppEventType.values.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.aa.valueOf(r11.values, r0)));
                r11.AFInAppEventType.values.put("api_ver_name", com.appsflyer.internal.aa.AFInAppEventParameterName(r11.values, r0));
                r11.AFInAppEventType.values();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0111, code lost:
                return r11.AFInAppEventType.values;
             */
            @Override // com.appsflyer.internal.av
            /* renamed from: valueOf */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.Map<java.lang.String, java.lang.Object> AFInAppEventParameterName() {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.bt.AnonymousClass5.AFInAppEventParameterName():java.util.Map");
            }

            private static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
