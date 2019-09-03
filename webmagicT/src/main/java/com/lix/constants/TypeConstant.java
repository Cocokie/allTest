package com.lix.constants;

public class TypeConstant {
    public final static String SHANGHAI = "上证A股-主板";
    public final static String akc = "上证A股-科创板";
    public final static String SHANGHAIB = "上证B股-主板";
    public final static String SHENZHEN = "深证A股-主板";
    public final static String sd = "深证A股-中小板";
    public final static String sd2 = "深证A股-创业板";
    public final static String SHENZHENB = "深证B股-主板";
    public final static String XINSANB = "全国股转-新三板";
    public final static String HONGKONG = "港股";
    public final static String OUT = "美股-中概股";

    public static class GetUrl {
        public final static String SS = "http://f10.eastmoney.com/CompanySurvey/CompanySurveyAjax?code=";
        public final static String shanghaiUrl = "http://f10.eastmoney.com/CompanySurvey/CompanySurveyAjax?code=SH";
        public final static String shenzhenUrl = "http://f10.eastmoney.com/CompanySurvey/CompanySurveyAjax?code=SZ";

        public final static String xinsanbUrl = "http://xinsanban.eastmoney.com/F10/";
        public final static String hongkongUrl = "http://emweb.securities.eastmoney.com/PC_HKF10/CompanyProfile/PageAjax?code=";

        public final static String OUTUrlFir = "http://quote.eastmoney.com/us/";
        public final static String OUTUrlSec = "http://emweb.eastmoney.com/pc_usf10/CompanyInfo/PageAjax?fullCode=";
        //public final static String OUTUrlSec = "http://emweb.eastmoney.com/pc_usf10/CompanyInfo/index?color=web&code=";
    }

}
