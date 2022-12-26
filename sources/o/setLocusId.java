package o;
/* loaded from: classes.dex */
public final class setLocusId extends setNotificationSilent {
    private final Boolean toString;

    public /* synthetic */ setLocusId(int i, String str, int i2, Object obj, Boolean bool, setLocalOnly setlocalonly, int i3, getTargetTypes gettargettypes) {
        this(i, str, i2, (i3 & 8) != 0 ? null : obj, (i3 & 16) != 0 ? false : bool, (i3 & 32) != 0 ? null : setlocalonly);
    }

    public final Boolean HaptikSDK$a() {
        return this.toString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLocusId(int i, String str, int i2, Object obj, Boolean bool, setLocalOnly setlocalonly) {
        super(i, str, i2, obj, setlocalonly);
        runAnimators.ag$a(str, "itemTitle");
        this.toString = bool;
    }
}
