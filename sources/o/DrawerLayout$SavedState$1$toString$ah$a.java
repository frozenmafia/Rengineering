package o;

import com.facebook.react.bridge.WritableNativeMap;
import java.io.Serializable;
import java.util.HashMap;
import o.DrawerLayout;
/* loaded from: classes.dex */
public final class DrawerLayout$SavedState$1$toString$ah$a extends DrawerLayout.SavedState.AnonymousClass1.toString {
    private final WritableNativeMap valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerLayout$SavedState$1$toString$ah$a(WritableNativeMap writableNativeMap) {
        super(null);
        runAnimators.ag$a(writableNativeMap, "map");
        this.valueOf = writableNativeMap;
    }

    public final WritableNativeMap ag$a() {
        return this.valueOf;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DrawerLayout$SavedState$1$toString$ah$a(HashMap<String, Serializable> hashMap) {
        this(addAnimationFrameCallback.ah$a(hashMap));
        runAnimators.ag$a(hashMap, "map");
    }

    public DrawerLayout$SavedState$1$toString$ah$a() {
        this(new WritableNativeMap());
    }
}
