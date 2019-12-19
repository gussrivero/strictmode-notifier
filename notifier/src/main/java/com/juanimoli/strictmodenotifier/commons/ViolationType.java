package com.juanimoli.strictmodenotifier.commons;

public enum ViolationType {

    // ThreadPolicy
    CUSTOM_SLOW_CALL,
    NETWORK,
    RESOURCE_MISMATCHES,

    // VmPolicy
    CLASS_INSTANCE_LIMIT,
    CLEARTEXT_NETWORK,
    FILE_URI_EXPOSURE,
    LEAKED_CLOSABLE_OBJECTS,
    ACTIVITY_LEAKS,
    LEAKED_REGISTRATION_OBJECTS,
    LEAKED_SQL_LITE_OBJECTS,

    //UNKNOWN
    UNKNOWN
}
