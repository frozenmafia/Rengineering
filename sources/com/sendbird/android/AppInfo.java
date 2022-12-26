package com.sendbird.android;

import android.support.v4.media.session.PlaybackStateCompat;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class AppInfo {
    private final long UNIT_MB = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    private String emojiHash = "";
    private long uploadSizeLimit = Long.MAX_VALUE;
    private boolean useReaction = false;
    private final List<String> premiumFeatureList = new ArrayList();
    private final List<String> attributesInUse = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppInfo(JsonObject jsonObject) {
        upsert(jsonObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void upsert(JsonObject jsonObject) {
        if (jsonObject.has(StringSet.emoji_hash)) {
            this.emojiHash = jsonObject.get(StringSet.emoji_hash).getAsString();
        }
        if (jsonObject.has(StringSet.file_upload_size_limit)) {
            this.uploadSizeLimit = jsonObject.get(StringSet.file_upload_size_limit).getAsInt() * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        if (jsonObject.has(StringSet.use_reaction)) {
            this.useReaction = jsonObject.get(StringSet.use_reaction).getAsBoolean();
        }
        if (jsonObject.has(StringSet.premium_feature_list)) {
            this.premiumFeatureList.clear();
            Iterator<JsonElement> it = jsonObject.getAsJsonArray(StringSet.premium_feature_list).iterator();
            while (it.hasNext()) {
                this.premiumFeatureList.add(it.next().getAsString());
            }
        }
        if (jsonObject.has(StringSet.application_attributes)) {
            this.attributesInUse.clear();
            Iterator<JsonElement> it2 = jsonObject.getAsJsonArray(StringSet.application_attributes).iterator();
            while (it2.hasNext()) {
                this.attributesInUse.add(it2.next().getAsString());
            }
        }
    }

    public String getEmojiHash() {
        return this.emojiHash;
    }

    public long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    public boolean useReaction() {
        return this.useReaction;
    }

    public List<String> getPremiumFeatureList() {
        return Collections.unmodifiableList(this.premiumFeatureList);
    }

    public List<String> getAttributesInUse() {
        return Collections.unmodifiableList(this.attributesInUse);
    }

    public boolean needUpdateEmoji(String str) {
        String str2 = this.emojiHash;
        return str2 == null || !str2.equals(str);
    }

    public String toString() {
        return "AppInfo{emojiHash='" + this.emojiHash + "', uploadSizeLimit=" + this.uploadSizeLimit + ", useReaction=" + this.useReaction + ", premiumFeatureList=" + this.premiumFeatureList + ", attributesInUse=" + this.attributesInUse + '}';
    }
}
