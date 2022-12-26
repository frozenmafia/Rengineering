package o;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
/* loaded from: classes5.dex */
public abstract class SidecarCompat$HaptikSDK$d extends SidecarCompat {
    protected final int ag$a;
    protected final int ah$a;

    protected abstract int ag$a(Element element, Element element2);

    protected abstract String valueOf();

    public SidecarCompat$HaptikSDK$d(int i, int i2) {
        this.ah$a = i;
        this.ag$a = i2;
    }

    @Override // o.SidecarCompat
    public boolean values(Element element, Element element2) {
        Element onMessageChannelReady = element2.onMessageChannelReady();
        if (onMessageChannelReady != null && !(onMessageChannelReady instanceof Document)) {
            int ag$a = ag$a(element, element2);
            int i = this.ah$a;
            if (i == 0) {
                return ag$a == this.ag$a;
            }
            int i2 = ag$a - this.ag$a;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.ah$a == 0 ? String.format(":%s(%d)", valueOf(), Integer.valueOf(this.ag$a)) : this.ag$a == 0 ? String.format(":%s(%dn)", valueOf(), Integer.valueOf(this.ah$a)) : String.format(":%s(%dn%+d)", valueOf(), Integer.valueOf(this.ah$a), Integer.valueOf(this.ag$a));
    }
}
