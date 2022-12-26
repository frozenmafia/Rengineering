package com.app.dream11.chat.presenters;

import com.app.dream11.chat.viewmodels.FriendsListVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FriendsListPresenter$onRefresh$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ FriendsListPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendsListPresenter$onRefresh$1(FriendsListPresenter friendsListPresenter) {
        super(0);
        this.this$0 = friendsListPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object obj;
        Object obj2;
        obj = this.this$0.pageVM;
        if (((FriendsListVM) obj) == null) {
            return;
        }
        FriendsListPresenter friendsListPresenter = this.this$0;
        friendsListPresenter.setNextPage(0);
        obj2 = friendsListPresenter.pageVM;
        ((FriendsListVM) obj2).isRefreshing().set(true);
        friendsListPresenter.loadPhoneBookContacts(true);
    }
}
