package util;

/**
 * Created by Thomas on 5/26/2014.
 */
public class Constants {

    public static class Configuration {

        public static String MONGO_DB_URI = "mongohq.db.uri";

        public static String YOUTUBE_APIKEY = "google.api.youtube.apikey";

        public static String AMAZON_EC2_IP = "amazon.ec2.proxy.ip";

        public static String AMAZON_EC2_PORT = "amazon.ec2.proxy.port";

        public static String AMAZON_EC2_USERNAME = "amazon.ec2.proxy.username";

        public static String AMAZON_EC2_PASSWORD = "amazon.ec2.proxy.password";



    }
    public static class Security {

        public static final String USER_ROLE = "user";

    }

    public static class Servlet {

        public static final String FLASH_ERROR_KEY = "error";

    }

    public static class Snips {

        public static final String SNIPLIST = "sniplist";

        public static final String USER = "user";
    }

    public static class User {

        public static final int MAX_FOLLOWING = 100;
    }
}
