package com.app.dream11.model.viewmodel;

import com.app.dream11.model.viewmodel.SearchVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SearchVM$onCancelClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ SearchVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchVM$onCancelClicked$1(SearchVM searchVM) {
        super(0);
        this.this$0 = searchVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SearchVM.ISearchTextHandler iSearchTextHandler;
        this.this$0.onClearRequest();
        iSearchTextHandler = this.this$0.searchTextHandler;
        if (iSearchTextHandler == null) {
            return;
        }
        iSearchTextHandler.onSearchCancelled();
    }
}
