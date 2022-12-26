package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class AvailableRewards implements Serializable {
    private final List<AvailableRewardsEdge> edges;

    public AvailableRewards(List<AvailableRewardsEdge> list) {
        runAnimators.ag$a(list, "edges");
        this.edges = list;
    }

    public final List<AvailableRewardsEdge> getEdges() {
        return this.edges;
    }
}
