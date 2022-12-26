package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sendbird.android.constant.StringSet;
import java.util.Set;
import kotlin.text.Regex;
import o.generateActivityResultKey;
import o.getTargetTypes;
import o.isStateAtLeast;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {
    private static BoltsMeasurementEventListener values;
    private final Context toString;
    public static final values valueOf = new values(null);
    private static final String ah$a = "com.parse.bolts.measurement_event";

    public /* synthetic */ BoltsMeasurementEventListener(Context context, getTargetTypes gettargettypes) {
        this(context);
    }

    public static final /* synthetic */ void valueOf(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (isStateAtLeast.values(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.ah$a();
        } catch (Throwable th) {
            isStateAtLeast.values(th, BoltsMeasurementEventListener.class);
        }
    }

    public static final /* synthetic */ BoltsMeasurementEventListener values() {
        if (isStateAtLeast.values(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return values;
        } catch (Throwable th) {
            isStateAtLeast.values(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ void values(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (isStateAtLeast.values(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            values = boltsMeasurementEventListener;
        } catch (Throwable th) {
            isStateAtLeast.values(th, BoltsMeasurementEventListener.class);
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        runAnimators.ah$a(applicationContext, "context.applicationContext");
        this.toString = applicationContext;
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final BoltsMeasurementEventListener ah$a(Context context) {
            runAnimators.ag$a(context, "context");
            if (BoltsMeasurementEventListener.values() != null) {
                return BoltsMeasurementEventListener.values();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.valueOf(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.values(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.values();
        }
    }

    private final void ah$a() {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.toString);
            runAnimators.ah$a(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.registerReceiver(this, new IntentFilter(ah$a));
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    private final void valueOf() {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.toString);
            runAnimators.ah$a(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.unregisterReceiver(this);
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    public final void finalize() throws Throwable {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            valueOf();
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            generateActivityResultKey generateactivityresultkey = new generateActivityResultKey(context);
            Set<String> set = null;
            String values2 = runAnimators.values("bf_", (Object) (intent == null ? null : intent.getStringExtra("event_name")));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String str : set) {
                    runAnimators.ah$a(str, StringSet.key);
                    Regex regex = new Regex("[^0-9a-zA-Z _-]");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(regex.replace(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            generateactivityresultkey.valueOf(values2, bundle);
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }
}
