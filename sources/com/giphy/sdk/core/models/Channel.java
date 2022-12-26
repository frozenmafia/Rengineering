package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.core.models.enums.MediaType;
import java.util.ArrayList;
import java.util.List;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Channel implements Parcelable {
    public static final Parcelable.Creator<Channel> CREATOR = new Creator();
    private List<Channel> ancestors;
    @isFullSpan(valueOf = "banner_image")
    private String bannerImage;
    @isFullSpan(valueOf = "content_type")
    private MediaType contentType;
    @isFullSpan(valueOf = "description")
    private String descriptionText;
    @isFullSpan(valueOf = "display_name")
    private String displayName;
    @isFullSpan(valueOf = "featured_gif")
    private Media featuredGif;
    private int id;
    @isFullSpan(valueOf = "short_display_name")
    private String shortDisplayName;
    private String slug;
    private List<ChannelTag> tags;
    private String type;
    private User user;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Channel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Channel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            runAnimators.ag$a(parcel, "in");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList arrayList2 = null;
            MediaType mediaType = parcel.readInt() != 0 ? (MediaType) Enum.valueOf(MediaType.class, parcel.readString()) : null;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Media createFromParcel = parcel.readInt() != 0 ? Media.CREATOR.createFromParcel(parcel) : null;
            User createFromParcel2 = parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add(ChannelTag.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList2.add(Channel.CREATOR.createFromParcel(parcel));
                    readInt3--;
                }
            }
            return new Channel(readInt, readString, readString2, readString3, readString4, mediaType, readString5, readString6, createFromParcel, createFromParcel2, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Channel[] newArray(int i) {
            return new Channel[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeInt(this.id);
        parcel.writeString(this.slug);
        parcel.writeString(this.displayName);
        parcel.writeString(this.shortDisplayName);
        parcel.writeString(this.type);
        MediaType mediaType = this.contentType;
        if (mediaType != null) {
            parcel.writeInt(1);
            parcel.writeString(mediaType.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.descriptionText);
        parcel.writeString(this.bannerImage);
        Media media = this.featuredGif;
        if (media != null) {
            parcel.writeInt(1);
            media.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        User user = this.user;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<ChannelTag> list = this.tags;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ChannelTag channelTag : list) {
                channelTag.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<Channel> list2 = this.ancestors;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        for (Channel channel : list2) {
            channel.writeToParcel(parcel, 0);
        }
    }

    public Channel(int i, String str, String str2, String str3, String str4, MediaType mediaType, String str5, String str6, Media media, User user, List<ChannelTag> list, List<Channel> list2) {
        this.id = i;
        this.slug = str;
        this.displayName = str2;
        this.shortDisplayName = str3;
        this.type = str4;
        this.contentType = mediaType;
        this.descriptionText = str5;
        this.bannerImage = str6;
        this.featuredGif = media;
        this.user = user;
        this.tags = list;
        this.ancestors = list2;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final String getShortDisplayName() {
        return this.shortDisplayName;
    }

    public final void setShortDisplayName(String str) {
        this.shortDisplayName = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public /* synthetic */ Channel(int i, String str, String str2, String str3, String str4, MediaType mediaType, String str5, String str6, Media media, User user, List list, List list2, int i2, getTargetTypes gettargettypes) {
        this(i, str, str2, str3, str4, (i2 & 32) != 0 ? null : mediaType, str5, str6, media, user, list, list2);
    }

    public final MediaType getContentType() {
        return this.contentType;
    }

    public final void setContentType(MediaType mediaType) {
        this.contentType = mediaType;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final void setDescriptionText(String str) {
        this.descriptionText = str;
    }

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final void setBannerImage(String str) {
        this.bannerImage = str;
    }

    public final Media getFeaturedGif() {
        return this.featuredGif;
    }

    public final void setFeaturedGif(Media media) {
        this.featuredGif = media;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final List<ChannelTag> getTags() {
        return this.tags;
    }

    public final void setTags(List<ChannelTag> list) {
        this.tags = list;
    }

    public final List<Channel> getAncestors() {
        return this.ancestors;
    }

    public final void setAncestors(List<Channel> list) {
        this.ancestors = list;
    }
}
