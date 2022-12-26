package com.appsamurai.storyly.storylylist;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import o.ContentInfoCompat;
/* loaded from: classes3.dex */
public final class StorylyListRecyclerView$ag$a extends ContentInfoCompat.BuilderCompat {
    public final /* synthetic */ StorylyListRecyclerView valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorylyListRecyclerView$ag$a(StorylyListRecyclerView storylyListRecyclerView, RecyclerView.LayoutManager layoutManager) {
        super((LinearLayoutManager) layoutManager);
        this.valueOf = storylyListRecyclerView;
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }
}
