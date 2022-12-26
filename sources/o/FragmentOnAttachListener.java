package o;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import o.commitNow;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class FragmentOnAttachListener extends FragmentPagerAdapter {
    private final getSnapshot HaptikSDK$b;
    private final int[] HaptikSDK$c;

    public FragmentOnAttachListener(ReadableMap readableMap, getSnapshot getsnapshot) {
        this.HaptikSDK$b = getsnapshot;
        ReadableArray array = readableMap.getArray("input");
        this.HaptikSDK$c = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.HaptikSDK$c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = array.getInt(i);
            i++;
        }
    }

    @Override // o.commitNow.Cdefault
    public void ah$a() {
        int i = 0;
        while (true) {
            int[] iArr = this.HaptikSDK$c;
            if (i >= iArr.length) {
                return;
            }
            commitNow.Cdefault getsnapshot = this.HaptikSDK$b.toString(iArr[i]);
            if (getsnapshot == null || !(getsnapshot instanceof FragmentPagerAdapter)) {
                break;
            }
            double HaptikSDK$c = ((FragmentPagerAdapter) getsnapshot).HaptikSDK$c();
            if (i == 0) {
                this.ah$b = HaptikSDK$c;
            } else {
                this.ah$b -= HaptikSDK$c;
            }
            i++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
    }

    @Override // o.FragmentPagerAdapter, o.commitNow.Cdefault
    public String values() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubtractionAnimatedNode[");
        sb.append(this.valueOf);
        sb.append("]: input nodes: ");
        int[] iArr = this.HaptikSDK$c;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.values());
        return sb.toString();
    }
}
