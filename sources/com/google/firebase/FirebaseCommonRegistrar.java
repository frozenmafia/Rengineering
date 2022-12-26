package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o.MessageThreadUtil;
import o.NestedAdapterWrapper;
import o.RecyclerView;
import o.StableIdStorage;
import o.createStableIdLookup;
import o.localToGlobal;
import o.swapMoveRemove;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<MessageThreadUtil.SyncQueueItem<?>> values() {
        MessageThreadUtil.SyncQueueItem<?> ah$a;
        MessageThreadUtil.SyncQueueItem<?> ah$a2;
        MessageThreadUtil.SyncQueueItem<?> ah$a3;
        MessageThreadUtil.SyncQueueItem<?> ah$a4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StableIdStorage.IsolatedStableIdStorage.valueOf());
        arrayList.add(RecyclerView.LayoutManager.AnonymousClass2.values());
        arrayList.add(StableIdStorage.SharedPoolStableIdStorage.toString("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(StableIdStorage.SharedPoolStableIdStorage.toString("fire-core", "20.2.0"));
        arrayList.add(StableIdStorage.SharedPoolStableIdStorage.toString("device-name", valueOf(Build.PRODUCT)));
        arrayList.add(StableIdStorage.SharedPoolStableIdStorage.toString("device-model", valueOf(Build.DEVICE)));
        arrayList.add(StableIdStorage.SharedPoolStableIdStorage.toString("device-brand", valueOf(Build.BRAND)));
        ah$a = MessageThreadUtil.SyncQueueItem.values(localToGlobal.class).ag$a(swapMoveRemove.ah$a(Context.class)).ah$a(new NestedAdapterWrapper() { // from class: o.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // o.NestedAdapterWrapper
            public final Object toString(removeMessages removemessages) {
                return SharedPoolStableIdStorage.toString(r1, r2, removemessages);
            }
        }).ah$a();
        arrayList.add(ah$a);
        ah$a2 = MessageThreadUtil.SyncQueueItem.values(localToGlobal.class).ag$a(swapMoveRemove.ah$a(Context.class)).ah$a(new NestedAdapterWrapper() { // from class: o.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // o.NestedAdapterWrapper
            public final Object toString(removeMessages removemessages) {
                return SharedPoolStableIdStorage.toString(r1, r2, removemessages);
            }
        }).ah$a();
        arrayList.add(ah$a2);
        ah$a3 = MessageThreadUtil.SyncQueueItem.values(localToGlobal.class).ag$a(swapMoveRemove.ah$a(Context.class)).ah$a(new NestedAdapterWrapper() { // from class: o.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // o.NestedAdapterWrapper
            public final Object toString(removeMessages removemessages) {
                return SharedPoolStableIdStorage.toString(r1, r2, removemessages);
            }
        }).ah$a();
        arrayList.add(ah$a3);
        ah$a4 = MessageThreadUtil.SyncQueueItem.values(localToGlobal.class).ag$a(swapMoveRemove.ah$a(Context.class)).ah$a(new NestedAdapterWrapper() { // from class: o.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // o.NestedAdapterWrapper
            public final Object toString(removeMessages removemessages) {
                return SharedPoolStableIdStorage.toString(r1, r2, removemessages);
            }
        }).ah$a();
        arrayList.add(ah$a4);
        String ah$a5 = createStableIdLookup.ah$a();
        if (ah$a5 != null) {
            arrayList.add(StableIdStorage.SharedPoolStableIdStorage.toString("kotlin", ah$a5));
        }
        return arrayList;
    }

    public static /* synthetic */ String valueOf(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String ah$a(Context context) {
        return (Build.VERSION.SDK_INT < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (Build.VERSION.SDK_INT < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (Build.VERSION.SDK_INT < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    private static String valueOf(String str) {
        return str.replace(TokenParser.SP, '_').replace('/', '_');
    }
}
