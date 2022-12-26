package com.apxor.androidsdk.core.utils.a;

import com.apxor.androidsdk.core.SDKController;
/* loaded from: classes3.dex */
class b {
    private final String a = "{\n  \"Monitoring\": {},\n  \"Modules\": {},\n  \"tickinterval\": 0.1,\n  \"max_inactive_session_time\": 1800,\n  \"enable\": true,\n  \"real_time_actions_enabled\": true,\n  \"max_chunk_event_count\": 30,\n  \"max_bg_chunk_send_time\": 5,\n  \"max_fg_chunk_send_time\": 30,\n  \"additional_config\": {\n    \"use_gzip\": false\n  },\n  \"service_paths\": {\n    \"chunks_path\": \"/v2/api/" + SDKController.getInstance().getApplicationID() + "/chunks\",\n    \"gzip_chunk_path\": \"/v2/api/" + SDKController.getInstance().getApplicationID() + "/gzip-chunks\",\n    \"logs_path\": \"/v1/api/apps/" + SDKController.getInstance().getApplicationID() + "/logs\"\n  },\n  \"heartbeat\": {\n    \"enable\": true,\n    \"hour\": 23,\n    \"minute\": 0\n  }\n}";

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }
}
