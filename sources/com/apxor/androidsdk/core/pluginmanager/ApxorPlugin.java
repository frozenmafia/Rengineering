package com.apxor.androidsdk.core.pluginmanager;

import android.content.Context;
import android.util.Pair;
import com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class ApxorPlugin {
    public void deRegisterFromPluginComponent(String str, ApxorPluginCallback apxorPluginCallback) {
    }

    public abstract ArrayList<Pair<String, ? extends ApxorBaseSQLiteWrapper>> getPluginDatabasesFrom(Context context, String str);

    public boolean initialize(Context context) {
        return false;
    }

    public abstract boolean initialize(Context context, JSONObject jSONObject) throws JSONException;

    public void registerToPlugin(ApxorPluginCallback apxorPluginCallback) {
    }

    public void registerToPluginComponent(String str, ApxorPluginCallback apxorPluginCallback) {
    }

    public abstract boolean start(Context context);

    public abstract boolean stop();
}
