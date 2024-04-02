/*
 * Copyright (C) 2015 The CyanogenMod Project
 *               2017-2020 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

import org.lineageos.settings.thermal.ThermalUtils;
import org.lineageos.settings.touchsampling.TouchSamplingUtils;

public class BootCompletedReceiver extends BroadcastReceiver {

    private static final boolean DEBUG = false;
    private static final String TAG = "XiaomiParts";

    @Override
    public void onReceive(final Context context, Intent intent) {
        if (DEBUG) Log.d(TAG, "Received boot completed intent");
        ThermalUtils.startService(context);
        TouchSamplingUtils.restoreSamplingValue(context);
    }
}
