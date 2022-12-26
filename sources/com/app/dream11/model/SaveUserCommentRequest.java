package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class SaveUserCommentRequest extends CommonRequest {
    private String comment;
    private String type;

    public SaveUserCommentRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
