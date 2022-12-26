package com.app.dream11.chat.reaction;

import android.view.View;
/* loaded from: classes.dex */
public interface IReactionListener {
    void onReactionClicked(View view, ChatReactionItemVM chatReactionItemVM);

    boolean onReactionLongClicked();
}
