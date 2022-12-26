package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class AllContestInviteHeaderVM extends BaseObservable {
    private final Styleable.ArcMotion<setAnimationMatrix> onBackClickListener;
    private final Styleable.ArcMotion<setAnimationMatrix> onBackClicked;
    private final ObservableField<RoundDetails> roundDetails;

    public AllContestInviteHeaderVM(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(arcMotion, "onBackClickListener");
        this.onBackClickListener = arcMotion;
        this.roundDetails = new ObservableField<>();
        this.onBackClicked = new AllContestInviteHeaderVM$onBackClicked$1(this);
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnBackClickListener() {
        return this.onBackClickListener;
    }

    public final ObservableField<RoundDetails> getRoundDetails() {
        return this.roundDetails;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnBackClicked() {
        return this.onBackClicked;
    }
}
