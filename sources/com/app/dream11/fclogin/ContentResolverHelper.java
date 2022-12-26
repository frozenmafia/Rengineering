package com.app.dream11.fclogin;

import com.sendbird.android.constant.StringSet;
import o.getTargetTypes;
/* loaded from: classes.dex */
public final class ContentResolverHelper {
    public static final values ag$a = new values(null);

    /* loaded from: classes.dex */
    public enum ContentResolverData {
        REFRESH_TOKEN("refresh_token"),
        ACCESS_TOKEN("access_token"),
        USER_ID(StringSet.user_id);
        
        private final String data;

        ContentResolverData(String str) {
            this.data = str;
        }

        public final String getData() {
            return this.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
            if (r5 == null) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.HashMap<java.lang.String, java.io.Serializable> values(android.content.Context r10) {
            /*
                r9 = this;
                java.lang.String r0 = "context"
                o.runAnimators.ag$a(r10, r0)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1 = 2131886917(0x7f120345, float:1.9408426E38)
                r2 = 0
                java.lang.String r1 = r10.getString(r1)     // Catch: android.os.RemoteException -> Lc0
                android.net.Uri r4 = android.net.Uri.parse(r1)     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r1 = "refresh_token"
                java.lang.String r3 = "access_token"
                java.lang.String r5 = "user_id"
                java.lang.String[] r5 = new java.lang.String[]{r1, r3, r5}     // Catch: android.os.RemoteException -> Lc0
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: android.os.RemoteException -> Lc0
                if (r10 != 0) goto L28
                r3 = r2
                goto L2d
            L28:
                android.content.ContentProviderClient r10 = r10.acquireContentProviderClient(r4)     // Catch: android.os.RemoteException -> Lc0
                r3 = r10
            L2d:
                if (r3 == 0) goto Lbf
                r6 = 0
                r7 = 0
                r8 = 0
                android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: android.os.RemoteException -> Lc0
                if (r10 == 0) goto Lbf
                boolean r1 = r10.moveToFirst()     // Catch: android.os.RemoteException -> Lc0
                if (r1 == 0) goto Lbf
                com.facebook.react.bridge.WritableNativeMap r1 = new com.facebook.react.bridge.WritableNativeMap     // Catch: android.os.RemoteException -> Lc0
                r1.<init>()     // Catch: android.os.RemoteException -> Lc0
                com.facebook.react.bridge.WritableMap r1 = (com.facebook.react.bridge.WritableMap) r1     // Catch: android.os.RemoteException -> Lc0
                r3 = 0
                int r4 = r10.getColumnCount()     // Catch: android.os.RemoteException -> Lc0
            L4a:
                if (r3 >= r4) goto L5a
                java.lang.String r5 = r10.getColumnName(r3)     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r6 = r10.getString(r3)     // Catch: android.os.RemoteException -> Lc0
                r1.putString(r5, r6)     // Catch: android.os.RemoteException -> Lc0
                int r3 = r3 + 1
                goto L4a
            L5a:
                com.app.dream11.fclogin.ContentResolverHelper$ContentResolverData r10 = com.app.dream11.fclogin.ContentResolverHelper.ContentResolverData.USER_ID     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r10 = r10.getData()     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r10 = r1.getString(r10)     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r3 = "\""
                java.lang.String r4 = ""
                if (r10 != 0) goto L6b
                goto L74
            L6b:
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r10 = o.Visibility.Mode.ag$a(r10, r5)     // Catch: android.os.RemoteException -> Lc0
                if (r10 != 0) goto L75
            L74:
                r10 = r4
            L75:
                com.app.dream11.fclogin.ContentResolverHelper$ContentResolverData r5 = com.app.dream11.fclogin.ContentResolverHelper.ContentResolverData.ACCESS_TOKEN     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r5 = r5.getData()     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r5 = r1.getString(r5)     // Catch: android.os.RemoteException -> Lc0
                if (r5 != 0) goto L82
                goto L8b
            L82:
                r6 = r3
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r5 = o.Visibility.Mode.ag$a(r5, r6)     // Catch: android.os.RemoteException -> Lc0
                if (r5 != 0) goto L8c
            L8b:
                r5 = r4
            L8c:
                com.app.dream11.fclogin.ContentResolverHelper$ContentResolverData r6 = com.app.dream11.fclogin.ContentResolverHelper.ContentResolverData.REFRESH_TOKEN     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r6 = r6.getData()     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r1 = r1.getString(r6)     // Catch: android.os.RemoteException -> Lc0
                if (r1 != 0) goto L99
                goto La3
            L99:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r1 = o.Visibility.Mode.ag$a(r1, r3)     // Catch: android.os.RemoteException -> Lc0
                if (r1 != 0) goto La2
                goto La3
            La2:
                r4 = r1
            La3:
                com.app.dream11.fclogin.ContentResolverHelper$ContentResolverData r1 = com.app.dream11.fclogin.ContentResolverHelper.ContentResolverData.USER_ID     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r1 = r1.getData()     // Catch: android.os.RemoteException -> Lc0
                r0.put(r1, r10)     // Catch: android.os.RemoteException -> Lc0
                com.app.dream11.fclogin.ContentResolverHelper$ContentResolverData r10 = com.app.dream11.fclogin.ContentResolverHelper.ContentResolverData.ACCESS_TOKEN     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r10 = r10.getData()     // Catch: android.os.RemoteException -> Lc0
                r0.put(r10, r5)     // Catch: android.os.RemoteException -> Lc0
                com.app.dream11.fclogin.ContentResolverHelper$ContentResolverData r10 = com.app.dream11.fclogin.ContentResolverHelper.ContentResolverData.REFRESH_TOKEN     // Catch: android.os.RemoteException -> Lc0
                java.lang.String r10 = r10.getData()     // Catch: android.os.RemoteException -> Lc0
                r0.put(r10, r4)     // Catch: android.os.RemoteException -> Lc0
                return r0
            Lbf:
                return r2
            Lc0:
                r10 = move-exception
                r10.printStackTrace()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.fclogin.ContentResolverHelper.values.values(android.content.Context):java.util.HashMap");
        }
    }
}
