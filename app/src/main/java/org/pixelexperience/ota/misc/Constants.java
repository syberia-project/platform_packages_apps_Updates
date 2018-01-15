/*
 * Copyright (C) 2012 The CyanogenMod Project
 * Copyright (C) 2017 The LineageOS Project
 * Copyright (C) 2018 Pixel Experience (jhenrique09)
 *
 * * Licensed under the GNU GPLv2 license
 *
 * The text of the license can be found in the LICENSE file
 * or at https://www.gnu.org/licenses/gpl-2.0.txt
 */
package org.pixelexperience.ota.misc;

public class Constants {
    // Download related
    public static final String UPDATES_FOLDER = "PixelExperience-Updates";
    public static final String DOWNLOAD_ID = "download_id";
    public static final String DOWNLOAD_NAME = "download_name";
    public static final String DOWNLOAD_TMP_EXT = ".tmp";
    public static final String DOWNLOAD_CHANNEL_ID = "org.pixelexperience.ota.DOWNLOAD_CHANNEL";
    public static final String DOWNLOADING_CHANNEL_ID = "org.pixelexperience.ota.DOWNLOADING_CHANNEL";
    // Preferences
    public static final String UPDATE_CHECK_PREF = "pref_update_check_interval";
    public static final String LAST_UPDATE_CHECK_PREF = "pref_last_update_check";
    public static final String MOBILE_DATA_WARNING_PREF = "pref_mobile_data_warning";
    public static final String DELETE_AFTER_INSTALL_PREF = "pref_delete_after_install";
    public static final String WIPE_CACHE_PREF = "pref_wipe_cache";
    public static final String WIPE_DALVIK_PREF = "pref_wipe_dalvik";
    public static final String WIPE_DATA_PREF = "pref_wipe_data";
    // Update Check items
    public static final String BOOT_CHECK_COMPLETED = "boot_check_completed";
    public static final int UPDATE_FREQ_NONE = -2;
    public static final int UPDATE_FREQ_DAILY = 86400;
    // Build vars
    public static final String CURRENT_DEVICE_NAME = "ro.product.device";
    public static final String CURRENT_VERSION = "org.pixelexperience.version";
    public static final String CURRENT_BUILD_TYPE = "org.pixelexperience.build_type";
    public static final String OTA_URL = "https://dev.pixelexperience.org/ota/%s";
    // Expressions
    public static final String FILENAME_DATE_FORMAT = "yyyyMMdd-Hm";
    public static final String PATTERN_FILENAME_DATE_FORMAT = "(\\d{4}\\d{2}\\d{2}-\\d{2}\\d{2})";
    // Default wipe options
    public static final boolean DELETE_AFTER_INSTALL_DEFAULT = false;
    public static final boolean WIPE_CACHE_BY_DEFAULT = true;
    public static final boolean WIPE_DALVIK_BY_DEFAULT = true;
    public static final boolean WIPE_DATA_BY_DEFAULT = false;
    // intent extras
    public static final String EXTRA_UPDATE_LIST_UPDATED = "update_list_updated";
    public static final String EXTRA_FINISHED_DOWNLOAD_ID = "download_id";
    public static final String EXTRA_FINISHED_DOWNLOAD_PATH = "download_path";
    public static int DOWNLOAD_REQUEST_CODE = 4009487;
}
