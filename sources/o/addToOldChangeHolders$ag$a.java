package o;

import java.util.List;
/* loaded from: classes5.dex */
final class addToOldChangeHolders$ag$a extends addToOldChangeHolders {
    private addToOldChangeHolders$ag$a() {
        super();
    }

    @Override // o.addToOldChangeHolders
    <L> List<L> ah$a(Object obj, long j) {
        ViewInfoStore$HaptikSDK$b ag$a = ag$a(obj, j);
        if (ag$a.ag$a()) {
            return ag$a;
        }
        int size = ag$a.size();
        ViewInfoStore$HaptikSDK$b valueOf = ag$a.valueOf(size == 0 ? 10 : size * 2);
        lambda$insert$4.valueOf(obj, j, valueOf);
        return valueOf;
    }

    @Override // o.addToOldChangeHolders
    void valueOf(Object obj, long j) {
        ag$a(obj, j).valueOf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.ViewInfoStore$HaptikSDK$b] */
    @Override // o.addToOldChangeHolders
    <E> void values(Object obj, Object obj2, long j) {
        ViewInfoStore$HaptikSDK$b<E> ag$a = ag$a(obj, j);
        ViewInfoStore$HaptikSDK$b<E> ag$a2 = ag$a(obj2, j);
        int size = ag$a.size();
        int size2 = ag$a2.size();
        ViewInfoStore$HaptikSDK$b<E> viewInfoStore$HaptikSDK$b = ag$a;
        viewInfoStore$HaptikSDK$b = ag$a;
        if (size > 0 && size2 > 0) {
            boolean ag$a3 = ag$a.ag$a();
            ViewInfoStore$HaptikSDK$b<E> viewInfoStore$HaptikSDK$b2 = ag$a;
            if (!ag$a3) {
                viewInfoStore$HaptikSDK$b2 = ag$a.valueOf(size2 + size);
            }
            viewInfoStore$HaptikSDK$b2.addAll(ag$a2);
            viewInfoStore$HaptikSDK$b = viewInfoStore$HaptikSDK$b2;
        }
        if (size > 0) {
            ag$a2 = viewInfoStore$HaptikSDK$b;
        }
        lambda$insert$4.valueOf(obj, j, ag$a2);
    }

    static <E> ViewInfoStore$HaptikSDK$b<E> ag$a(Object obj, long j) {
        Object invoke;
        invoke = lambda$insert$4.onXdkEvent.invoke(obj, j);
        return (ViewInfoStore$HaptikSDK$b) invoke;
    }
}
