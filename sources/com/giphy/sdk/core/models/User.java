package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    @isFullSpan(valueOf = "attribution_display_name")
    private final String attributionDisplayName;
    @isFullSpan(valueOf = "avatar_url")
    private final String avatarUrl;
    @isFullSpan(valueOf = "banner_url")
    private final String bannerUrl;
    private final String description;
    @isFullSpan(valueOf = "display_name")
    private final String displayName;
    @isFullSpan(valueOf = "facebook_url")
    private final String facebookUrl;
    private final String id;
    @isFullSpan(valueOf = "instagram_url")
    private final String instagramUrl;
    @isFullSpan(valueOf = "is_public")
    private final boolean isPublic;
    @isFullSpan(valueOf = "is_staff")
    private boolean isStaff;
    @isFullSpan(valueOf = "suppress_chrome")
    private final boolean isSuppressChrome;
    private final String name;
    @isFullSpan(valueOf = "profile_url")
    private final String profileUrl;
    @isFullSpan(valueOf = "tumblr_url")
    private final String tumblrUrl;
    private final String twitter;
    @isFullSpan(valueOf = "twitter_url")
    private final String twitterUrl;
    @isFullSpan(valueOf = "user_type")
    private String userType;
    private String username;
    @isFullSpan(valueOf = "is_verified")
    private boolean verified;
    @isFullSpan(valueOf = "website_display_url")
    private final String websiteDisplayUrl;
    @isFullSpan(valueOf = "website_url")
    private final String websiteUrl;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new User(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.bannerUrl);
        parcel.writeString(this.profileUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.displayName);
        parcel.writeString(this.twitter);
        parcel.writeInt(this.isPublic ? 1 : 0);
        parcel.writeString(this.attributionDisplayName);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.facebookUrl);
        parcel.writeString(this.twitterUrl);
        parcel.writeString(this.instagramUrl);
        parcel.writeString(this.tumblrUrl);
        parcel.writeInt(this.isSuppressChrome ? 1 : 0);
        parcel.writeString(this.websiteUrl);
        parcel.writeString(this.websiteDisplayUrl);
        parcel.writeInt(this.verified ? 1 : 0);
        parcel.writeInt(this.isStaff ? 1 : 0);
        parcel.writeString(this.userType);
    }

    public User(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z2, String str15, String str16, boolean z3, boolean z4, String str17) {
        runAnimators.ag$a(str5, HintConstants.AUTOFILL_HINT_USERNAME);
        this.id = str;
        this.avatarUrl = str2;
        this.bannerUrl = str3;
        this.profileUrl = str4;
        this.username = str5;
        this.displayName = str6;
        this.twitter = str7;
        this.isPublic = z;
        this.attributionDisplayName = str8;
        this.name = str9;
        this.description = str10;
        this.facebookUrl = str11;
        this.twitterUrl = str12;
        this.instagramUrl = str13;
        this.tumblrUrl = str14;
        this.isSuppressChrome = z2;
        this.websiteUrl = str15;
        this.websiteDisplayUrl = str16;
        this.verified = z3;
        this.isStaff = z4;
        this.userType = str17;
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z2, String str15, String str16, boolean z3, boolean z4, String str17, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? false : z2, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : str16, (262144 & i) != 0 ? false : z3, (524288 & i) != 0 ? false : z4, (i & 1048576) != 0 ? null : str17);
    }

    public final String getId() {
        return this.id;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getProfileUrl() {
        return this.profileUrl;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.username = str;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getTwitter() {
        return this.twitter;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final String getAttributionDisplayName() {
        return this.attributionDisplayName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFacebookUrl() {
        return this.facebookUrl;
    }

    public final String getTwitterUrl() {
        return this.twitterUrl;
    }

    public final String getInstagramUrl() {
        return this.instagramUrl;
    }

    public final String getTumblrUrl() {
        return this.tumblrUrl;
    }

    public final boolean isSuppressChrome() {
        return this.isSuppressChrome;
    }

    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public final String getWebsiteDisplayUrl() {
        return this.websiteDisplayUrl;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }

    public final boolean isStaff() {
        return this.isStaff;
    }

    public final void setStaff(boolean z) {
        this.isStaff = z;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final void setUserType(String str) {
        this.userType = str;
    }
}
