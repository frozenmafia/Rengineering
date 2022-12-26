package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NextRewards implements Serializable {
    private final List<NextRewardsEdge> edges;

    public NextRewards(List<NextRewardsEdge> list) {
        runAnimators.ag$a(list, "edges");
        this.edges = list;
    }

    public final List<NextRewardsEdge> getEdges() {
        return this.edges;
    }
}
