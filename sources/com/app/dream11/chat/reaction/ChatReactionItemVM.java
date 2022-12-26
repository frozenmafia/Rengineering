package com.app.dream11.chat.reaction;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import o.runAnimators;
import o.setAlarmClock;
/* loaded from: classes.dex */
public final class ChatReactionItemVM extends BaseObservable {
    private final IReactionListener handler;
    private final ObservableBoolean isSelfReaction;
    private final ObservableField<setAlarmClock> reaction;

    public ChatReactionItemVM(setAlarmClock setalarmclock, IReactionListener iReactionListener) {
        runAnimators.ag$a(setalarmclock, "reaction");
        this.handler = iReactionListener;
        this.isSelfReaction = new ObservableBoolean(false);
        this.reaction = new ObservableField<>(setalarmclock);
    }

    public final IReactionListener getHandler() {
        return this.handler;
    }

    public final ObservableBoolean isSelfReaction() {
        return this.isSelfReaction;
    }

    public final ObservableField<setAlarmClock> getReaction() {
        return this.reaction;
    }
}
