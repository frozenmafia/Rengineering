package com.app.dream11.chat.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FriendsListVM$onRefresh$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Styleable.ArcMotion<setAnimationMatrix> $onRefreshListener;
    final /* synthetic */ FriendsListVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendsListVM$onRefresh$1(FriendsListVM friendsListVM, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        super(0);
        this.this$0 = friendsListVM;
        this.$onRefreshListener = arcMotion;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.isRefreshing().set(true);
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.$onRefreshListener;
        if (arcMotion == null) {
            return;
        }
        arcMotion.invoke();
    }
}
