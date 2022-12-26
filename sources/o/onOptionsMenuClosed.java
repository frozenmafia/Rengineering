package o;

import android.content.SharedPreferences;
import java.util.UUID;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final class onOptionsMenuClosed {
    public static final values values = new values(null);
    private onHiddenChanged HaptikSDK$b;
    private final Long HaptikSDK$c;
    private int ag$a;
    private Long ah$a;
    private UUID toString;
    private Long valueOf;

    public onOptionsMenuClosed(Long l, Long l2, UUID uuid) {
        runAnimators.ag$a(uuid, "sessionId");
        this.HaptikSDK$c = l;
        this.ah$a = l2;
        this.toString = uuid;
    }

    public final void ah$a(Long l) {
        this.ah$a = l;
    }

    public final Long valueOf() {
        return this.ah$a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ onOptionsMenuClosed(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, o.getTargetTypes r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            o.runAnimators.ah$a(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onOptionsMenuClosed.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, o.getTargetTypes):void");
    }

    public final void valueOf(UUID uuid) {
        runAnimators.ag$a(uuid, "<set-?>");
        this.toString = uuid;
    }

    public final UUID values() {
        return this.toString;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final void values(Long l) {
        this.valueOf = l;
    }

    public final Long ag$a() {
        Long l = this.valueOf;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public final onHiddenChanged invoke() {
        return this.HaptikSDK$b;
    }

    public final void valueOf(onHiddenChanged onhiddenchanged) {
        this.HaptikSDK$b = onhiddenchanged;
    }

    public final void ah$b() {
        this.ag$a++;
    }

    public final long HaptikSDK$b() {
        Long l;
        if (this.HaptikSDK$c == null || (l = this.ah$a) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.HaptikSDK$c.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void HaptikSDK$c() {
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(DefaultSpecialEffectsController.AnonymousClass8.ag$a()).edit();
        Long l = this.HaptikSDK$c;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l == null ? 0L : l.longValue());
        Long l2 = this.ah$a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.ag$a);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.toString.toString());
        edit.apply();
        onHiddenChanged onhiddenchanged = this.HaptikSDK$b;
        if (onhiddenchanged == null || onhiddenchanged == null) {
            return;
        }
        onhiddenchanged.valueOf();
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final onOptionsMenuClosed ah$a() {
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(DefaultSpecialEffectsController.AnonymousClass8.ag$a());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            onOptionsMenuClosed onoptionsmenuclosed = new onOptionsMenuClosed(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            onoptionsmenuclosed.ag$a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            onoptionsmenuclosed.valueOf(onHiddenChanged.ah$a.valueOf());
            onoptionsmenuclosed.values(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            runAnimators.ah$a(fromString, "fromString(sessionIDStr)");
            onoptionsmenuclosed.valueOf(fromString);
            return onoptionsmenuclosed;
        }

        public final void valueOf() {
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(DefaultSpecialEffectsController.AnonymousClass8.ag$a()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            onHiddenChanged.ah$a.ag$a();
        }
    }
}
