package o;

import com.facebook.react.bridge.WritableMap;
/* loaded from: classes6.dex */
public class FragmentStatePagerAdapter {
    private final long ag$a;
    private final boolean ah$a;
    private final setFragmentManagerState toString;
    private final String valueOf;
    private final WritableMap values;

    public FragmentStatePagerAdapter(String str, WritableMap writableMap, long j, boolean z, setFragmentManagerState setfragmentmanagerstate) {
        this.valueOf = str;
        this.values = writableMap;
        this.ag$a = j;
        this.ah$a = z;
        this.toString = setfragmentmanagerstate;
    }

    public FragmentStatePagerAdapter(FragmentStatePagerAdapter fragmentStatePagerAdapter) {
        this.valueOf = fragmentStatePagerAdapter.valueOf;
        this.values = fragmentStatePagerAdapter.values.copy();
        this.ag$a = fragmentStatePagerAdapter.ag$a;
        this.ah$a = fragmentStatePagerAdapter.ah$a;
        setFragmentManagerState setfragmentmanagerstate = fragmentStatePagerAdapter.toString;
        if (setfragmentmanagerstate != null) {
            this.toString = setfragmentmanagerstate.ah$a();
        } else {
            this.toString = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String valueOf() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WritableMap values() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long ag$a() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean HaptikSDK$a() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFragmentManagerState ah$a() {
        return this.toString;
    }
}
