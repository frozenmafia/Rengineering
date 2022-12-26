package o;

import java.util.Map;
/* loaded from: classes3.dex */
public abstract class getCollectionItemInfo extends getLabeledBy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCollectionItemInfo(Map<String, ? extends setAction<? extends Object>> map) {
        super(map);
        runAnimators.ag$a(map, "keys");
    }
}
