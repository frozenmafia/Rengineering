package o;

import com.facebook.soloader.SoLoader;
/* loaded from: classes4.dex */
public class createInfo implements CompositeGeneratedAdaptersObserver {
    @Override // o.CompositeGeneratedAdaptersObserver
    public boolean ah$a(String str, int i) {
        return SoLoader.toString(str, ((i & 1) != 0 ? 16 : 0) | 0);
    }
}
