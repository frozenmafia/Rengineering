package o;

import kotlinx.coroutines.channels.BufferOverflow;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class onPageScrollStateChanged extends resolveClass<Integer> implements deprecatedIds<Integer> {
    public onPageScrollStateChanged(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        toString((onPageScrollStateChanged) Integer.valueOf(i));
    }

    public final boolean valueOf(int i) {
        boolean onpagescrollstatechanged;
        synchronized (this) {
            onpagescrollstatechanged = toString((onPageScrollStateChanged) Integer.valueOf(HaptikSDK$a().intValue() + i));
        }
        return onpagescrollstatechanged;
    }
}
