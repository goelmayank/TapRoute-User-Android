package example.com.geofensing;
/**
 * Created by sammy on 11/11/2017.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

final class Constants {

    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";
    static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 0;
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 60*60*1000;
    static final float GEOFENCE_RADIUS_IN_METERS = (float) 50;
    static final HashMap<String, LatLng> AREA_LANDMARKS = new HashMap<>();

    static {
        AREA_LANDMARKS.put("My Room", new LatLng(28.358258, 75.589312));
        AREA_LANDMARKS.put("My Area", new LatLng(28.3618459, 75.5858668));
    }


}
