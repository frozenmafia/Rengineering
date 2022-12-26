package com.apxor.androidsdk.core.pluginmanager;

import android.content.Context;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class PluginLoader {
    private static final String a = "PluginLoader";
    private static int ag$a = 1;
    private static int ah$a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, ApxorPlugin> f273b = new HashMap<>();
    public static final byte[] values = {63, 79, -69, -22, -36, -25, -6, -1, 9, 3, 70, -82, 7, 81, -81, 1, 21, -15, 0};
    public static final int valueOf = 3;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        r5 = com.apxor.androidsdk.core.pluginmanager.PluginLoader.ah$a + 53;
        com.apxor.androidsdk.core.pluginmanager.PluginLoader.ag$a = r5 % 128;
        r5 = r5 % 2;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r5 = com.apxor.androidsdk.core.pluginmanager.PluginLoader.ah$a + 47;
        com.apxor.androidsdk.core.pluginmanager.PluginLoader.ag$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
        r0 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
        r1 = com.apxor.androidsdk.core.pluginmanager.PluginLoader.ah$a + 29;
        com.apxor.androidsdk.core.pluginmanager.PluginLoader.ag$a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if ((r1 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r7 == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject a(android.content.Context r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.pluginmanager.PluginLoader.a(android.content.Context):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String ah$a(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = com.apxor.androidsdk.core.pluginmanager.PluginLoader.values
            int r6 = r6 * 4
            int r6 = r6 + 32
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 16 - r7
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L32
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L32:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + 2
            int r8 = r0 + 1
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.pluginmanager.PluginLoader.ah$a(byte, short, byte):java.lang.String");
    }

    void b(String str) {
        ApxorPlugin apxorPlugin = this.f273b.get(str);
        if (apxorPlugin != null) {
            if (apxorPlugin.stop()) {
                String str2 = a;
                Logger.i(str2, "Plugin: " + str + " stopped successfully");
                return;
            }
            String str3 = a;
            Logger.w(str3, "Plugin: " + str + " Failed to stop");
            return;
        }
        String str4 = a;
        Logger.e(str4, "Plugin: " + str + " couldn't be found to perform 'STOP' action");
    }

    public void deRegisterFromPluginComponent(String str, String str2, ApxorPluginCallback apxorPluginCallback) {
        if (this.f273b.containsKey(str)) {
            this.f273b.get(str).deRegisterFromPluginComponent(str2, apxorPluginCallback);
            return;
        }
        String str3 = a;
        Logger.w(str3, "Failed to de-register callback to the plugin: " + str + " for component name: " + str2);
    }

    public Set<String> getInitializedPlugins() {
        return this.f273b.keySet();
    }

    public void initialize(Context context, JSONObject jSONObject) {
        boolean z;
        try {
            JSONArray jSONArray = a(context).getJSONArray("plugins");
            for (int i = 0; i < jSONArray.length(); i++) {
                String str = null;
                try {
                    String string = jSONArray.getJSONObject(i).getString(Constants.CLASS);
                    str = string.substring(string.lastIndexOf(".") + 1);
                    ApxorPlugin a2 = a(string);
                    if (a2 != null) {
                        String str2 = a;
                        Logger.i(str2, "Plugin: " + str + " is loaded");
                        z = a2.initialize(context, jSONObject);
                        if (z) {
                            try {
                                this.f273b.put(str, a2);
                            } catch (ClassNotFoundException e) {
                                e = e;
                                Logger.e(a, "initialize: ", e);
                                String str3 = a;
                                Logger.i(str3, "Plugin: " + str + " initialization state: " + z);
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                Logger.e(a, "initialize: ", e);
                                String str32 = a;
                                Logger.i(str32, "Plugin: " + str + " initialization state: " + z);
                            } catch (InstantiationException e3) {
                                e = e3;
                                Logger.e(a, "initialize: ", e);
                                String str322 = a;
                                Logger.i(str322, "Plugin: " + str + " initialization state: " + z);
                            } catch (Exception e4) {
                                e = e4;
                                Logger.e(a, "initialize: ", e);
                                String str3222 = a;
                                Logger.i(str3222, "Plugin: " + str + " initialization state: " + z);
                            }
                        }
                    } else {
                        z = false;
                    }
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    z = false;
                } catch (IllegalAccessException e6) {
                    e = e6;
                    z = false;
                } catch (InstantiationException e7) {
                    e = e7;
                    z = false;
                } catch (Exception e8) {
                    e = e8;
                    z = false;
                }
                String str32222 = a;
                Logger.i(str32222, "Plugin: " + str + " initialization state: " + z);
            }
        } catch (JSONException e9) {
            Logger.e(a, "initialize: ", e9);
        }
    }

    public void registerToPlugin(String str, ApxorPluginCallback apxorPluginCallback) {
        if (this.f273b.containsKey(str)) {
            this.f273b.get(str).registerToPlugin(apxorPluginCallback);
            return;
        }
        String str2 = a;
        Logger.w(str2, "Failed to register callback to the plugin: " + str);
    }

    public void registerToPluginComponent(String str, String str2, ApxorPluginCallback apxorPluginCallback) {
        if (this.f273b.containsKey(str)) {
            this.f273b.get(str).registerToPluginComponent(str2, apxorPluginCallback);
            return;
        }
        String str3 = a;
        Logger.w(str3, "Failed to register callback to the plugin: " + str + " for component name: " + str2);
    }

    public void startAllPlugins(Context context) {
        for (Map.Entry<String, ApxorPlugin> entry : this.f273b.entrySet()) {
            a(entry.getKey(), context);
        }
    }

    public void stopAllPlugins() {
        for (Map.Entry<String, ApxorPlugin> entry : this.f273b.entrySet()) {
            b(entry.getKey());
        }
    }

    private ApxorPlugin a(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (str != null) {
            Class<?> cls = Class.forName(str);
            if (ApxorPlugin.class.isAssignableFrom(cls)) {
                return (ApxorPlugin) cls.newInstance();
            }
        }
        return null;
    }

    void a(String str, Context context) {
        ApxorPlugin apxorPlugin = this.f273b.get(str);
        if (apxorPlugin != null) {
            if (apxorPlugin.start(context)) {
                Logger.i(a, "Plugin: " + str + " started successfully");
                return;
            }
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Plugin: ");
            sb.append(str);
            byte b2 = values[18];
            byte b3 = b2;
            sb.append(ah$a(b2, b3, b3));
            Logger.w(str2, sb.toString());
            return;
        }
        Logger.e(a, "Plugin: " + str + " couldn't be found to perform 'START' action");
    }
}
