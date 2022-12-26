package o;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class getViewModelStores extends FragmentPagerAdapter {
    private final int[] HaptikSDK$a;
    private final getSnapshot HaptikSDK$c;

    public getViewModelStores(ReadableMap readableMap, getSnapshot getsnapshot) {
        this.HaptikSDK$c = getsnapshot;
        ReadableArray array = readableMap.getArray("input");
        this.HaptikSDK$a = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.HaptikSDK$a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = array.getInt(i);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
     */
    @Override // o.commitNow.Cdefault
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ah$a() {
        /*
            r6 = this;
            r0 = 0
            r6.ah$b = r0
            r0 = 0
        L5:
            int[] r1 = r6.HaptikSDK$a
            int r2 = r1.length
            if (r0 >= r2) goto L2e
            o.getSnapshot r2 = r6.HaptikSDK$c
            r1 = r1[r0]
            o.commitNow$default r1 = r2.toString(r1)
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof o.FragmentPagerAdapter
            if (r2 == 0) goto L26
            double r2 = r6.ah$b
            o.FragmentPagerAdapter r1 = (o.FragmentPagerAdapter) r1
            double r4 = r1.HaptikSDK$c()
            double r2 = r2 + r4
            r6.ah$b = r2
            int r0 = r0 + 1
            goto L5
        L26:
            com.facebook.react.bridge.JSApplicationCausedNativeException r0 = new com.facebook.react.bridge.JSApplicationCausedNativeException
            java.lang.String r1 = "Illegal node ID set as an input for Animated.Add node"
            r0.<init>(r1)
            throw r0
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getViewModelStores.ah$a():void");
    }

    @Override // o.FragmentPagerAdapter, o.commitNow.Cdefault
    public String values() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionAnimatedNode[");
        sb.append(this.valueOf);
        sb.append("]: input nodes: ");
        int[] iArr = this.HaptikSDK$a;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.values());
        return sb.toString();
    }
}
