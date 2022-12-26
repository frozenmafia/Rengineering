package com.app.dream11.chat.models;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class FullScreenImagePreviewData {
    private final String caption;
    private final String imageUrl;
    private final String subTitle;
    private final String title;

    public static /* synthetic */ FullScreenImagePreviewData copy$default(FullScreenImagePreviewData fullScreenImagePreviewData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullScreenImagePreviewData.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = fullScreenImagePreviewData.title;
        }
        if ((i & 4) != 0) {
            str3 = fullScreenImagePreviewData.subTitle;
        }
        if ((i & 8) != 0) {
            str4 = fullScreenImagePreviewData.caption;
        }
        return fullScreenImagePreviewData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    public final String component4() {
        return this.caption;
    }

    public final FullScreenImagePreviewData copy(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "imageUrl");
        return new FullScreenImagePreviewData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FullScreenImagePreviewData) {
            FullScreenImagePreviewData fullScreenImagePreviewData = (FullScreenImagePreviewData) obj;
            return runAnimators.values((Object) this.imageUrl, (Object) fullScreenImagePreviewData.imageUrl) && runAnimators.values((Object) this.title, (Object) fullScreenImagePreviewData.title) && runAnimators.values((Object) this.subTitle, (Object) fullScreenImagePreviewData.subTitle) && runAnimators.values((Object) this.caption, (Object) fullScreenImagePreviewData.caption);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.imageUrl.hashCode();
        String str = this.title;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subTitle;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.caption;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.subTitle;
        String str4 = this.caption;
        return "FullScreenImagePreviewData(imageUrl=" + str + ", title=" + str2 + ", subTitle=" + str3 + ", caption=" + str4 + ")";
    }

    public FullScreenImagePreviewData(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "imageUrl");
        this.imageUrl = str;
        this.title = str2;
        this.subTitle = str3;
        this.caption = str4;
    }

    public /* synthetic */ FullScreenImagePreviewData(String str, String str2, String str3, String str4, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getCaption() {
        return this.caption;
    }

    /* loaded from: classes6.dex */
    public static final class Builder {
        private String caption;
        private String imageUrl = "";
        private String subTitle;
        private String title;

        public final Builder setImageUrl(String str) {
            runAnimators.ag$a(str, "imageUrl");
            Builder builder = this;
            builder.imageUrl = str;
            return builder;
        }

        public final Builder setTitle(String str) {
            Builder builder = this;
            builder.title = str;
            return builder;
        }

        public final Builder setSubTitle(String str) {
            Builder builder = this;
            builder.subTitle = str;
            return builder;
        }

        public final Builder setCaption(String str) {
            Builder builder = this;
            builder.caption = str;
            return builder;
        }

        public final FullScreenImagePreviewData build() {
            return new FullScreenImagePreviewData(this.imageUrl, this.title, this.subTitle, this.caption);
        }
    }
}
