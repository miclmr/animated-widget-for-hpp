package mobi.intuitit.android.example.widget.animated;

/**
 * 
 * @author bo
 * 
 */
public final class HppIntent {

    /**
     * 
     */
    public static final String PNAME = "mobi.intuitit.android.hpp.";

    /**
     * 
     * @author bo
     * 
     */
    public static final class BROADCAST {

        public static final String BROADCAST_HOME_PAUSE = PNAME + "BROADCAST_HOME_PAUSE";
        public static final String BROADCAST_HOME_RESUME = PNAME + "BROADCAST_HOME_RESUME";

    }

    /**
     * 
     * @author bo
     * 
     */
    public static final class NOTIFICATION {

        public static final String NOTIFICATION_IN_VIEWPORT = PNAME + "NOTIFICATION_IN_VIEWPORT";
        public static final String NOTIFICATION_OUT_VIEWPORT = PNAME + "NOTIFICATION_OUT_VIEWPORT";

        public static final String NOTIFICATION_WIDGET_SETTINGS_CHANGED = PNAME
                + "NOTIFICATION_WIDGET_SETTINGS_CHANGED";

        public static final String NOTIFICATION_FRAME_ANIMATION_STARTED = PNAME
                + "NOTIFICATION_FRAME_ANIMATION_STARTED";
        public static final String NOTIFICATION_FRAME_ANIMATION_STOPPED = PNAME
                + "NOTIFICATION_FRAME_ANIMATION_STOPPED";

        public static final String NOTIFICATION_TWEEN_ANIMATION_STARTED = PNAME
                + "NOTIFICATION_TWEEN_ANIMATION_STARTED";
        public static final String NOTIFICATION_TWEEN_ANIMATION_REPEATED = PNAME
                + "NOTIFICATION_TWEEN_ANIMATION_REPEATED";
        public static final String NOTIFICATION_TWEEN_ANIMATION_ENDED = PNAME
                + "NOTIFICATION_TWEEN_ANIMATION_ENDED";

    }

    /**
     * 
     * @author bo
     * 
     */
    public static final class ACTION {

        public static final String ACTION_READY = PNAME + "ACTION_READY";

        public static final String ACTION_START_FRAME_ANIMATION = PNAME
                + "ACTION_START_FRAME_ANIMATION";
        public static final String ACTION_STOP_FRAME_ANIMATION = PNAME
                + "ACTION_STOP_FRAME_ANIMATION";

        public static final String ACTION_START_TWEEN_ANIMATION = PNAME
                + "ACTION_START_TWEEN_ANIMATION";

    }

    /**
     * 
     * @author bo
     * 
     */
    public static final class ERROR {

        public static final String ERROR_FRAME_ANIMATION = PNAME + "ERROR_FRAME_ANIMATION";
        public static final String ERROR_TWEEN_ANIMATION = PNAME + "ERROR_TWEEN_ANIMATION";

    }

    /**
     * 
     * @author bo
     * 
     */
    public static final class EXTRA {

        public static final String EXTRA_APPWIDGET_ID = PNAME + "EXTRA_APPWIDGET_ID";
        public static final String EXTRA_IMAGEVIEW_ID = PNAME + "EXTRA_IMAGEVIEW_ID";
        public static final String EXTRA_ANIMATION_ID = PNAME + "EXTRA_ANIMATION_ID";
        public static final String EXTRA_VIEW_ID = PNAME + "EXTRA_VIEW_ID";

        public static final String EXTRA_ERROR_MESSAGE = PNAME + "EXTRA_ERROR_MESSAGE";

    }
}