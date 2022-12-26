package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class bt {
    public abstract bw build();

    public bt friendlyObstructions(Collection<FriendlyObstruction> collection) {
        ArrayList arrayList = new ArrayList();
        for (FriendlyObstruction friendlyObstruction : collection) {
            arrayList.add(bv.builder().view(friendlyObstruction.getView()).purpose(friendlyObstruction.getPurpose()).detailedReason(friendlyObstruction.getDetailedReason()).build());
        }
        return obstructions(arrayList);
    }

    public abstract bt obstructions(List<bv> list);
}
