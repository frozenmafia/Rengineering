package com.app.dream11.chat.viewmodels;

import androidx.databinding.BaseObservable;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class SelectedContactItemVm extends BaseObservable {
    private final SelectedContactListener handler;
    private boolean isContactsListItem;
    private final String name;
    private final Styleable.ArcMotion<setAnimationMatrix> onCancelClicked;
    private final String profilePic;
    private final int userId;

    /* loaded from: classes.dex */
    public interface SelectedContactListener {
        void onCancelClicked(SelectedContactItemVm selectedContactItemVm);
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public SelectedContactItemVm(int i, String str, String str2, SelectedContactListener selectedContactListener) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "profilePic");
        this.userId = i;
        this.name = str;
        this.profilePic = str2;
        this.handler = selectedContactListener;
        this.onCancelClicked = new SelectedContactItemVm$onCancelClicked$1(this);
        this.isContactsListItem = true;
    }

    public final SelectedContactListener getHandler() {
        return this.handler;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnCancelClicked() {
        return this.onCancelClicked;
    }

    public final boolean isContactsListItem() {
        return this.isContactsListItem;
    }

    public final void setContactsListItem(boolean z) {
        this.isContactsListItem = z;
    }
}
