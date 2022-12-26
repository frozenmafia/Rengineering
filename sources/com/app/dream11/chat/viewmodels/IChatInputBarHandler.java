package com.app.dream11.chat.viewmodels;

import o.measureChildView;
/* loaded from: classes.dex */
public interface IChatInputBarHandler {
    void onAddGIFClick();

    void onAddImageClick();

    void onCreateContestClick();

    void onSendTextMessageRequested(String str, measureChildView measurechildview);

    void onUserMessageTyping(CharSequence charSequence);

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void onSendTextMessageRequested$default(IChatInputBarHandler iChatInputBarHandler, String str, measureChildView measurechildview, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSendTextMessageRequested");
            }
            if ((i & 2) != 0) {
                measurechildview = null;
            }
            iChatInputBarHandler.onSendTextMessageRequested(str, measurechildview);
        }
    }
}
