package com.app.dream11.chat.interfaces;
/* loaded from: classes.dex */
public interface IFileMessage extends IMessage {
    String getFileUrl();

    boolean isImageFile();

    void setFileUrl(String str);
}
