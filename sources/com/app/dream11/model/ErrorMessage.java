package com.app.dream11.model;
/* loaded from: classes.dex */
public class ErrorMessage {
    private String message;
    private String title;

    public ErrorMessage(String str, String str2) {
        this.title = str;
        this.message = str2;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public static ErrorMessage createFromErrorModel(ErrorModel errorModel) {
        if (errorModel == null || errorModel.getError() == null) {
            return null;
        }
        return new ErrorMessage(errorModel.getError().getMsgTitle(), errorModel.getError().getMsgText());
    }

    public String toString() {
        return "ErrorMessage{title='" + this.title + "', message='" + this.message + "'}";
    }
}
