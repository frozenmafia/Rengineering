package com.app.dream11.chat.chatlist;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;
import com.app.dream11.social.pendingrequest.RequestComponentType;
import o.setPublicVersion;
import o.setSettingsText;
import o.setShowWhen;
/* loaded from: classes.dex */
public final class PendingRequestCarousalVM extends BaseObservable {
    private final setSettingsText pendingRequestCarousalData;
    private final ObservableField<Boolean> refreshPendingCarousalRequestData = new ObservableField<>(false);
    private final ObservableField<Boolean> chatListFilled = new ObservableField<>(false);
    private final setShowWhen requestCountRefreshListener = new setShowWhen() { // from class: com.app.dream11.chat.chatlist.PendingRequestCarousalVM$requestCountRefreshListener$1
        @Override // o.setShowWhen
        public void onRefreshStarted() {
            PendingRequestCarousalVM.this.getRefreshPendingCarousalRequestData().set(false);
        }
    };

    public PendingRequestCarousalVM(setPublicVersion setpublicversion) {
        this.pendingRequestCarousalData = new setSettingsText("chat_list", RequestComponentType.REQUEST_CAROUSAL, setpublicversion);
    }

    public final setSettingsText getPendingRequestCarousalData() {
        return this.pendingRequestCarousalData;
    }

    public final ObservableField<Boolean> getRefreshPendingCarousalRequestData() {
        return this.refreshPendingCarousalRequestData;
    }

    public final ObservableField<Boolean> getChatListFilled() {
        return this.chatListFilled;
    }

    public final void refreshPendingRequest() {
        this.refreshPendingCarousalRequestData.set(true);
    }

    public final setShowWhen getRequestCountRefreshListener() {
        return this.requestCountRefreshListener;
    }
}
