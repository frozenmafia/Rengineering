package com.app.dream11.model;

import com.app.dream11.firebase.FirebaseConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.isFullSpan;
import o.loadFont;
/* loaded from: classes.dex */
public class AppInit implements Serializable {
    private static final long serialVersionUID = 121;
    @isFullSpan(valueOf = "firebaseConfigs")
    private ArrayList<FirebaseConfig> firebaseConfigList;
    @isFullSpan(valueOf = "androidfull")
    private VersionUpdateModel versionUpdateModel;

    public String getAppUrl() {
        return this.versionUpdateModel.getAppUrl();
    }

    public String getUpgradeDescription() {
        return this.versionUpdateModel.getUpgradeDescription();
    }

    public String getUpgradeMessageTitle() {
        return this.versionUpdateModel.getUpgradeMessageTitle();
    }

    public int getAppVersion() {
        return this.versionUpdateModel.getRecommendedVersion();
    }

    public String getImageUrl() {
        return this.versionUpdateModel.getImageUrl();
    }

    public List<String> getUpgradeMessage() {
        if (loadFont.ag$a(this.versionUpdateModel.getNewFeatureList())) {
            return this.versionUpdateModel.getNewFeatureList();
        }
        return Collections.emptyList();
    }

    public VersionUpdateModel getVersionUpdateModel() {
        return this.versionUpdateModel;
    }

    public ArrayList<FirebaseConfig> getFirebaseConfigList() {
        return this.firebaseConfigList;
    }
}
