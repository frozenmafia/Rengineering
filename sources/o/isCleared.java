package o;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class isCleared extends FragmentPagerAdapter {
    private final getSnapshot HaptikSDK$a;
    private final int[] HaptikSDK$b;

    public isCleared(ReadableMap readableMap, getSnapshot getsnapshot) {
        this.HaptikSDK$a = getsnapshot;
        ReadableArray array = readableMap.getArray("input");
        this.HaptikSDK$b = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.HaptikSDK$b;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = array.getInt(i);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");
     */
    @Override // o.commitNow.Cdefault
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ah$a() {
        /*
            r6 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6.ah$b = r0
            r0 = 0
        L5:
            int[] r1 = r6.HaptikSDK$b
            int r2 = r1.length
            if (r0 >= r2) goto L2f
            o.getSnapshot r2 = r6.HaptikSDK$a
            r1 = r1[r0]
            o.commitNow$default r1 = r2.toString(r1)
            if (r1 == 0) goto L27
            boolean r2 = r1 instanceof o.FragmentPagerAdapter
            if (r2 == 0) goto L27
            double r2 = r6.ah$b
            o.FragmentPagerAdapter r1 = (o.FragmentPagerAdapter) r1
            double r4 = r1.HaptikSDK$c()
            double r2 = r2 * r4
            r6.ah$b = r2
            int r0 = r0 + 1
            goto L5
        L27:
            com.facebook.react.bridge.JSApplicationCausedNativeException r0 = new com.facebook.react.bridge.JSApplicationCausedNativeException
            java.lang.String r1 = "Illegal node ID set as an input for Animated.multiply node"
            r0.<init>(r1)
            throw r0
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isCleared.ah$a():void");
    }

    @Override // o.FragmentPagerAdapter, o.commitNow.Cdefault
    public String values() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiplicationAnimatedNode[");
        sb.append(this.valueOf);
        sb.append("]: input nodes: ");
        int[] iArr = this.HaptikSDK$b;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.values());
        return sb.toString();
    }
}
