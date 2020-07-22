package models;


public class DaoFactory {

    private static Ads adsDao;

//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new ListAdsDao();
//        }
//        return adsDao;
//    }

    public static Ads getAdsDao() {
        Config config = new Config();
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

}
