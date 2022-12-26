package com.app.dream11.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class VersionUpdateModel implements Serializable {
    @isFullSpan(valueOf = "appUrl")
    private String appUrl = "https://fantasycricket.dream11.com/dream11.apk";
    @isFullSpan(valueOf = "imageUrl")
    private String imageUrl = "http://d11.s3.amazonaws.com/contain/newsletter/template-04-03-16/force-update-android-new.png";
    @isFullSpan(valueOf = "latestVersion")
    private int latestVersion;
    @isFullSpan(valueOf = "minimumSupportedVersion")
    private int minimumSupportedVersion;
    @isFullSpan(valueOf = "upgradeMessage")
    private List<String> newFeatureList;
    @isFullSpan(valueOf = "overrideVersionConfig")
    private HashMap<Integer, Boolean> overrideVersionConfig;
    @isFullSpan(valueOf = "Percentage")
    private Integer percentage;
    @isFullSpan(valueOf = "recommendedVersion")
    private int recommendedVersion;
    @isFullSpan(valueOf = "upgradeDescription")
    private String upgradeDescription;
    @isFullSpan(valueOf = "upgradeMessageTitle")
    private String upgradeMessageTitle;

    public final String getAppUrl() {
        return this.appUrl;
    }

    public final void setAppUrl(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.appUrl = str;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.imageUrl = str;
    }

    public final int getMinimumSupportedVersion() {
        return this.minimumSupportedVersion;
    }

    public final void setMinimumSupportedVersion(int i) {
        this.minimumSupportedVersion = i;
    }

    public final int getRecommendedVersion() {
        return this.recommendedVersion;
    }

    public final void setRecommendedVersion(int i) {
        this.recommendedVersion = i;
    }

    public final int getLatestVersion() {
        return this.latestVersion;
    }

    public final void setLatestVersion(int i) {
        this.latestVersion = i;
    }

    public final HashMap<Integer, Boolean> getOverrideVersionConfig() {
        return this.overrideVersionConfig;
    }

    public final void setOverrideVersionConfig(HashMap<Integer, Boolean> hashMap) {
        this.overrideVersionConfig = hashMap;
    }

    public final String getUpgradeMessageTitle() {
        return this.upgradeMessageTitle;
    }

    public final void setUpgradeMessageTitle(String str) {
        this.upgradeMessageTitle = str;
    }

    public final List<String> getNewFeatureList() {
        return this.newFeatureList;
    }

    public final void setNewFeatureList(List<String> list) {
        this.newFeatureList = list;
    }

    public final String getUpgradeDescription() {
        return this.upgradeDescription;
    }

    public final void setUpgradeDescription(String str) {
        this.upgradeDescription = str;
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final void setPercentage(Integer num) {
        this.percentage = num;
    }

    public final boolean isVersionOverridenForForceUpdate(int i) {
        Boolean bool;
        try {
            HashMap<Integer, Boolean> hashMap = this.overrideVersionConfig;
            if (hashMap != null && hashMap.containsKey(Integer.valueOf(i)) && (bool = hashMap.get(Integer.valueOf(i))) != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
