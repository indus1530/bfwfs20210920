package edu.aku.hassannaqvi.foodfortificationsurvey.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.foodfortificationsurvey.BR;
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts.FoodConsumptionTable;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;


public class FoodConsumption extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String ebCode = StringUtils.EMPTY;
    private String hhid = StringUtils.EMPTY;
    private String sno = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;


    // SECTION VARIABLES

    private String sC1 = StringUtils.EMPTY;

    private String sG1 = StringUtils.EMPTY;
    private String sG2 = StringUtils.EMPTY;
    private String sG3 = StringUtils.EMPTY;
    private String sG4 = StringUtils.EMPTY;
    private String sG5 = StringUtils.EMPTY;
    private String sG6 = StringUtils.EMPTY;
    private String sG7 = StringUtils.EMPTY;


    // FIELD VARIABLES

    private String c1res = StringUtils.EMPTY;
    private String c1011 = StringUtils.EMPTY;
    private String c1012 = StringUtils.EMPTY;
    private String c1013 = StringUtils.EMPTY;
    private String c1021 = StringUtils.EMPTY;
    private String c1022 = StringUtils.EMPTY;
    private String c1023 = StringUtils.EMPTY;
    private String c1031 = StringUtils.EMPTY;
    private String c1032 = StringUtils.EMPTY;
    private String c1033 = StringUtils.EMPTY;
    private String c1041 = StringUtils.EMPTY;
    private String c1042 = StringUtils.EMPTY;
    private String c1043 = StringUtils.EMPTY;
    private String c1051 = StringUtils.EMPTY;
    private String c1052 = StringUtils.EMPTY;
    private String c1053 = StringUtils.EMPTY;
    private String c1061 = StringUtils.EMPTY;
    private String c1062 = StringUtils.EMPTY;
    private String c1063 = StringUtils.EMPTY;
    private String c1071 = StringUtils.EMPTY;
    private String c1072 = StringUtils.EMPTY;
    private String c1073 = StringUtils.EMPTY;
    private String c1081 = StringUtils.EMPTY;
    private String c1082 = StringUtils.EMPTY;
    private String c1083 = StringUtils.EMPTY;
    private String c1091 = StringUtils.EMPTY;
    private String c1092 = StringUtils.EMPTY;
    private String c1093 = StringUtils.EMPTY;
    private String c1101 = StringUtils.EMPTY;
    private String c1102 = StringUtils.EMPTY;
    private String c1103 = StringUtils.EMPTY;
    private String c1111 = StringUtils.EMPTY;
    private String c1112 = StringUtils.EMPTY;
    private String c1113 = StringUtils.EMPTY;
    private String c1121 = StringUtils.EMPTY;
    private String c1122 = StringUtils.EMPTY;
    private String c1123 = StringUtils.EMPTY;
    private String c1131 = StringUtils.EMPTY;
    private String c1132 = StringUtils.EMPTY;
    private String c1133 = StringUtils.EMPTY;

    private String g10101 = StringUtils.EMPTY;
    private String g10102 = StringUtils.EMPTY;
    private String g10103 = StringUtils.EMPTY;
    private String g10201 = StringUtils.EMPTY;
    private String g10202 = StringUtils.EMPTY;
    private String g10203 = StringUtils.EMPTY;
    private String g10301 = StringUtils.EMPTY;
    private String g10302 = StringUtils.EMPTY;
    private String g10401 = StringUtils.EMPTY;
    private String g10402 = StringUtils.EMPTY;
    private String g105 = StringUtils.EMPTY;
    private String g10601 = StringUtils.EMPTY;
    private String g10602 = StringUtils.EMPTY;
    private String g201 = StringUtils.EMPTY;
    private String g202 = StringUtils.EMPTY;
    private String g203 = StringUtils.EMPTY;
    private String g204 = StringUtils.EMPTY;
    private String g20501 = StringUtils.EMPTY;
    private String g20502 = StringUtils.EMPTY;
    private String g20601 = StringUtils.EMPTY;
    private String g20602 = StringUtils.EMPTY;
    private String g20603 = StringUtils.EMPTY;
    private String g20604 = StringUtils.EMPTY;
    private String g207 = StringUtils.EMPTY;
    private String g208 = StringUtils.EMPTY;
    private String g20901 = StringUtils.EMPTY;
    private String g20902 = StringUtils.EMPTY;
    private String g210 = StringUtils.EMPTY;
    private String g30101 = StringUtils.EMPTY;
    private String g30102 = StringUtils.EMPTY;
    private String g30103 = StringUtils.EMPTY;
    private String g30201 = StringUtils.EMPTY;
    private String g30202 = StringUtils.EMPTY;
    private String g30203 = StringUtils.EMPTY;
    private String g30301 = StringUtils.EMPTY;
    private String g30302 = StringUtils.EMPTY;
    private String g30303 = StringUtils.EMPTY;
    private String g30401 = StringUtils.EMPTY;
    private String g30402 = StringUtils.EMPTY;
    private String g30403 = StringUtils.EMPTY;
    private String g30501 = StringUtils.EMPTY;
    private String g30502 = StringUtils.EMPTY;
    private String g30503 = StringUtils.EMPTY;
    private String g30601 = StringUtils.EMPTY;
    private String g30602 = StringUtils.EMPTY;
    private String g30603 = StringUtils.EMPTY;
    private String g30701 = StringUtils.EMPTY;
    private String g30702 = StringUtils.EMPTY;
    private String g30703 = StringUtils.EMPTY;
    private String g30801 = StringUtils.EMPTY;
    private String g30802 = StringUtils.EMPTY;
    private String g30803 = StringUtils.EMPTY;
    private String g30901 = StringUtils.EMPTY;
    private String g30902 = StringUtils.EMPTY;
    private String g30903 = StringUtils.EMPTY;
    private String g31001 = StringUtils.EMPTY;
    private String g31002 = StringUtils.EMPTY;
    private String g31003 = StringUtils.EMPTY;
    private String g31101 = StringUtils.EMPTY;
    private String g31102 = StringUtils.EMPTY;
    private String g31103 = StringUtils.EMPTY;
    private String g401 = StringUtils.EMPTY;
    private String g402 = StringUtils.EMPTY;
    private String g403 = StringUtils.EMPTY;
    private String g404 = StringUtils.EMPTY;
    private String g405 = StringUtils.EMPTY;
    private String g501 = StringUtils.EMPTY;
    private String g502 = StringUtils.EMPTY;
    private String g503 = StringUtils.EMPTY;
    private String g504 = StringUtils.EMPTY;
    private String g505 = StringUtils.EMPTY;
    private String g506 = StringUtils.EMPTY;
    private String g507 = StringUtils.EMPTY;
    private String g601 = StringUtils.EMPTY;
    private String g602 = StringUtils.EMPTY;
    private String g603 = StringUtils.EMPTY;
    private String g604 = StringUtils.EMPTY;
    private String g605 = StringUtils.EMPTY;
    private String g606 = StringUtils.EMPTY;
    private String g607 = StringUtils.EMPTY;
    private String g608 = StringUtils.EMPTY;
    private String g609 = StringUtils.EMPTY;
    private String g610 = StringUtils.EMPTY;
    private String g611 = StringUtils.EMPTY;
    private String g701 = StringUtils.EMPTY;


    public FoodConsumption() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Bindable
    public String getEbCode() {
        return ebCode;
    }

    public void setEbCode(String ebCode) {
        this.ebCode = ebCode;
        notifyPropertyChanged(BR.ebCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }


    public String getsC1() {
        return sC1;
    }

    public void setsC1(String sC1) {
        this.sC1 = sC1;
    }


    public String getsG1() {
        return sG1;
    }

    public void setsG1(String sG1) {
        this.sG1 = sG1;
    }


    public String getsG2() {
        return sG2;
    }

    public void setsG2(String sG2) {
        this.sG2 = sG2;
    }


    public String getsG3() {
        return sG3;
    }

    public void setsG3(String sG3) {
        this.sG3 = sG3;
    }


    public String getsG4() {
        return sG4;
    }

    public void setsG4(String sG4) {
        this.sG4 = sG4;
    }


    public String getsG5() {
        return sG5;
    }

    public void setsG5(String sG5) {
        this.sG5 = sG5;
    }


    public String getsG6() {
        return sG6;
    }

    public void setsG6(String sG6) {
        this.sG6 = sG6;
    }


    public String getsG7() {
        return sG7;
    }

    public void setsG7(String sG7) {
        this.sG7 = sG7;
    }


    @Bindable
    public String getC1res() {
        return c1res;
    }

    public void setC1res(String c1res) {
        this.c1res = c1res;
        notifyPropertyChanged(BR.c1res);
    }

    @Bindable
    public String getC1011() {
        return c1011;
    }

    public void setC1011(String c1011) {
        this.c1011 = c1011;
        setC1012(c1011.equals("2") ? "" : this.c1012);
        setC1013(c1011.equals("2") ? "" : this.c1013);
        notifyPropertyChanged(BR.c1011);
    }

    @Bindable
    public String getC1012() {
        return c1012;
    }

    public void setC1012(String c1012) {
        this.c1012 = c1012;
        notifyPropertyChanged(BR.c1012);
    }

    @Bindable
    public String getC1013() {
        return c1013;
    }

    public void setC1013(String c1013) {
        this.c1013 = c1013;
        notifyPropertyChanged(BR.c1013);
    }

    @Bindable
    public String getC1021() {
        return c1021;
    }

    public void setC1021(String c1021) {
        this.c1021 = c1021;
        setC1022(c1021.equals("2") ? "" : this.c1022);
        setC1023(c1021.equals("2") ? "" : this.c1023);
        notifyPropertyChanged(BR.c1021);
    }

    @Bindable
    public String getC1022() {
        return c1022;
    }

    public void setC1022(String c1022) {
        this.c1022 = c1022;
        notifyPropertyChanged(BR.c1022);
    }

    @Bindable
    public String getC1023() {
        return c1023;
    }

    public void setC1023(String c1023) {
        this.c1023 = c1023;
        notifyPropertyChanged(BR.c1023);
    }

    @Bindable
    public String getC1031() {
        return c1031;
    }

    public void setC1031(String c1031) {
        this.c1031 = c1031;
        setC1032(c1031.equals("2") ? "" : this.c1032);
        setC1033(c1031.equals("2") ? "" : this.c1033);
        notifyPropertyChanged(BR.c1031);
    }

    @Bindable
    public String getC1032() {
        return c1032;
    }

    public void setC1032(String c1032) {
        this.c1032 = c1032;
        notifyPropertyChanged(BR.c1032);
    }

    @Bindable
    public String getC1033() {
        return c1033;
    }

    public void setC1033(String c1033) {
        this.c1033 = c1033;
        notifyPropertyChanged(BR.c1033);
    }

    @Bindable
    public String getC1041() {
        return c1041;
    }

    public void setC1041(String c1041) {
        this.c1041 = c1041;
        setC1042(c1041.equals("2") ? "" : this.c1042);
        setC1043(c1041.equals("2") ? "" : this.c1043);
        notifyPropertyChanged(BR.c1041);
    }

    @Bindable
    public String getC1042() {
        return c1042;
    }

    public void setC1042(String c1042) {
        this.c1042 = c1042;
        notifyPropertyChanged(BR.c1042);
    }

    @Bindable
    public String getC1043() {
        return c1043;
    }

    public void setC1043(String c1043) {
        this.c1043 = c1043;
        notifyPropertyChanged(BR.c1043);
    }

    @Bindable
    public String getC1051() {
        return c1051;
    }

    public void setC1051(String c1051) {
        this.c1051 = c1051;
        setC1052(c1051.equals("2") ? "" : this.c1052);
        setC1053(c1051.equals("2") ? "" : this.c1053);
        notifyPropertyChanged(BR.c1051);
    }

    @Bindable
    public String getC1052() {
        return c1052;
    }

    public void setC1052(String c1052) {
        this.c1052 = c1052;
        notifyPropertyChanged(BR.c1052);
    }

    @Bindable
    public String getC1053() {
        return c1053;
    }

    public void setC1053(String c1053) {
        this.c1053 = c1053;
        notifyPropertyChanged(BR.c1053);
    }

    @Bindable
    public String getC1061() {
        return c1061;
    }

    public void setC1061(String c1061) {
        this.c1061 = c1061;
        setC1062(c1061.equals("2") ? "" : this.c1062);
        setC1063(c1061.equals("2") ? "" : this.c1063);
        notifyPropertyChanged(BR.c1061);
    }

    @Bindable
    public String getC1062() {
        return c1062;
    }

    public void setC1062(String c1062) {
        this.c1062 = c1062;
        notifyPropertyChanged(BR.c1062);
    }

    @Bindable
    public String getC1063() {
        return c1063;
    }

    public void setC1063(String c1063) {
        this.c1063 = c1063;
        notifyPropertyChanged(BR.c1063);
    }

    @Bindable
    public String getC1071() {
        return c1071;
    }

    public void setC1071(String c1071) {
        this.c1071 = c1071;
        setC1072(c1071.equals("2") ? "" : this.c1072);
        setC1073(c1071.equals("2") ? "" : this.c1073);
        notifyPropertyChanged(BR.c1071);
    }

    @Bindable
    public String getC1072() {
        return c1072;
    }

    public void setC1072(String c1072) {
        this.c1072 = c1072;
        notifyPropertyChanged(BR.c1072);
    }

    @Bindable
    public String getC1073() {
        return c1073;
    }

    public void setC1073(String c1073) {
        this.c1073 = c1073;
        notifyPropertyChanged(BR.c1073);
    }

    @Bindable
    public String getC1081() {
        return c1081;
    }

    public void setC1081(String c1081) {
        this.c1081 = c1081;
        setC1082(c1081.equals("2") ? "" : this.c1082);
        setC1083(c1081.equals("2") ? "" : this.c1083);
        notifyPropertyChanged(BR.c1081);
    }

    @Bindable
    public String getC1082() {
        return c1082;
    }

    public void setC1082(String c1082) {
        this.c1082 = c1082;
        notifyPropertyChanged(BR.c1082);
    }

    @Bindable
    public String getC1083() {
        return c1083;
    }

    public void setC1083(String c1083) {
        this.c1083 = c1083;
        notifyPropertyChanged(BR.c1083);
    }

    @Bindable
    public String getC1091() {
        return c1091;
    }

    public void setC1091(String c1091) {
        this.c1091 = c1091;
        setC1092(c1091.equals("2") ? "" : this.c1092);
        setC1093(c1091.equals("2") ? "" : this.c1093);
        notifyPropertyChanged(BR.c1091);
    }

    @Bindable
    public String getC1092() {
        return c1092;
    }

    public void setC1092(String c1092) {
        this.c1092 = c1092;
        notifyPropertyChanged(BR.c1092);
    }

    @Bindable
    public String getC1093() {
        return c1093;
    }

    public void setC1093(String c1093) {
        this.c1093 = c1093;
        notifyPropertyChanged(BR.c1093);
    }

    @Bindable
    public String getC1101() {
        return c1101;
    }

    public void setC1101(String c1101) {
        this.c1101 = c1101;
        setC1102(c1101.equals("2") ? "" : this.c1102);
        setC1103(c1101.equals("2") ? "" : this.c1103);
        notifyPropertyChanged(BR.c1101);
    }

    @Bindable
    public String getC1102() {
        return c1102;
    }

    public void setC1102(String c1102) {
        this.c1102 = c1102;
        notifyPropertyChanged(BR.c1102);
    }

    @Bindable
    public String getC1103() {
        return c1103;
    }

    public void setC1103(String c1103) {
        this.c1103 = c1103;
        notifyPropertyChanged(BR.c1103);
    }

    @Bindable
    public String getC1111() {
        return c1111;
    }

    public void setC1111(String c1111) {
        this.c1111 = c1111;
        setC1112(c1111.equals("2") ? "" : this.c1112);
        setC1113(c1111.equals("2") ? "" : this.c1113);
        notifyPropertyChanged(BR.c1111);
    }

    @Bindable
    public String getC1112() {
        return c1112;
    }

    public void setC1112(String c1112) {
        this.c1112 = c1112;
        notifyPropertyChanged(BR.c1112);
    }

    @Bindable
    public String getC1113() {
        return c1113;
    }

    public void setC1113(String c1113) {
        this.c1113 = c1113;
        notifyPropertyChanged(BR.c1113);
    }

    @Bindable
    public String getC1121() {
        return c1121;
    }

    public void setC1121(String c1121) {
        this.c1121 = c1121;
        setC1122(c1121.equals("2") ? "" : this.c1122);
        setC1123(c1121.equals("2") ? "" : this.c1123);
        notifyPropertyChanged(BR.c1121);
    }

    @Bindable
    public String getC1122() {
        return c1122;
    }

    public void setC1122(String c1122) {
        this.c1122 = c1122;
        notifyPropertyChanged(BR.c1122);
    }

    @Bindable
    public String getC1123() {
        return c1123;
    }

    public void setC1123(String c1123) {
        this.c1123 = c1123;
        notifyPropertyChanged(BR.c1123);
    }

    @Bindable
    public String getC1131() {
        return c1131;
    }

    public void setC1131(String c1131) {
        this.c1131 = c1131;
        setC1132(c1131.equals("2") ? "" : this.c1132);
        setC1133(c1131.equals("2") ? "" : this.c1133);
        notifyPropertyChanged(BR.c1131);
    }

    @Bindable
    public String getC1132() {
        return c1132;
    }

    public void setC1132(String c1132) {
        this.c1132 = c1132;
        notifyPropertyChanged(BR.c1132);
    }

    @Bindable
    public String getC1133() {
        return c1133;
    }

    public void setC1133(String c1133) {
        this.c1133 = c1133;
        notifyPropertyChanged(BR.c1133);
    }

    @Bindable
    public String getG10101() {
        return g10101;
    }

    public void setG10101(String g10101) {
        this.g10101 = g10101;
        notifyPropertyChanged(BR.g10101);
    }

    @Bindable
    public String getG10102() {
        return g10102;
    }

    public void setG10102(String g10102) {
        this.g10102 = g10102;
        notifyPropertyChanged(BR.g10102);
    }

    @Bindable
    public String getG10103() {
        return g10103;
    }

    public void setG10103(String g10103) {
        this.g10103 = g10103;
        notifyPropertyChanged(BR.g10103);
    }

    @Bindable
    public String getG10201() {
        return g10201;
    }

    public void setG10201(String g10201) {
        this.g10201 = g10201;
        notifyPropertyChanged(BR.g10201);
    }

    @Bindable
    public String getG10202() {
        return g10202;
    }

    public void setG10202(String g10202) {
        this.g10202 = g10202;
        notifyPropertyChanged(BR.g10202);
    }

    @Bindable
    public String getG10203() {
        return g10203;
    }

    public void setG10203(String g10203) {
        this.g10203 = g10203;
        notifyPropertyChanged(BR.g10203);
    }

    @Bindable
    public String getG10301() {
        return g10301;
    }

    public void setG10301(String g10301) {
        this.g10301 = g10301;
        notifyPropertyChanged(BR.g10301);
    }

    @Bindable
    public String getG10302() {
        return g10302;
    }

    public void setG10302(String g10302) {
        this.g10302 = g10302;
        notifyPropertyChanged(BR.g10302);
    }

    @Bindable
    public String getG10401() {
        return g10401;
    }

    public void setG10401(String g10401) {
        this.g10401 = g10401;
        notifyPropertyChanged(BR.g10401);
    }

    @Bindable
    public String getG10402() {
        return g10402;
    }

    public void setG10402(String g10402) {
        this.g10402 = g10402;
        notifyPropertyChanged(BR.g10402);
    }

    @Bindable
    public String getG105() {
        return g105;
    }

    public void setG105(String g105) {
        this.g105 = g105;
        notifyPropertyChanged(BR.g105);
    }

    @Bindable
    public String getG10601() {
        return g10601;
    }

    public void setG10601(String g10601) {
        this.g10601 = g10601;
        notifyPropertyChanged(BR.g10601);
    }

    @Bindable
    public String getG10602() {
        return g10602;
    }

    public void setG10602(String g10602) {
        this.g10602 = g10602;
        notifyPropertyChanged(BR.g10602);
    }

    @Bindable
    public String getG201() {
        return g201;
    }

    public void setG201(String g201) {
        this.g201 = g201;
        notifyPropertyChanged(BR.g201);
    }

    @Bindable
    public String getG202() {
        return g202;
    }

    public void setG202(String g202) {
        this.g202 = g202;
        notifyPropertyChanged(BR.g202);
    }

    @Bindable
    public String getG203() {
        return g203;
    }

    public void setG203(String g203) {
        this.g203 = g203;
        notifyPropertyChanged(BR.g203);
    }

    @Bindable
    public String getG204() {
        return g204;
    }

    public void setG204(String g204) {
        this.g204 = g204;
        notifyPropertyChanged(BR.g204);
    }

    @Bindable
    public String getG20501() {
        return g20501;
    }

    public void setG20501(String g20501) {
        this.g20501 = g20501;
        notifyPropertyChanged(BR.g20501);
    }

    @Bindable
    public String getG20502() {
        return g20502;
    }

    public void setG20502(String g20502) {
        this.g20502 = g20502;
        notifyPropertyChanged(BR.g20502);
    }

    @Bindable
    public String getG20601() {
        return g20601;
    }

    public void setG20601(String g20601) {
        this.g20601 = g20601;
        notifyPropertyChanged(BR.g20601);
    }

    @Bindable
    public String getG20602() {
        return g20602;
    }

    public void setG20602(String g20602) {
        this.g20602 = g20602;
        notifyPropertyChanged(BR.g20602);
    }

    @Bindable
    public String getG20603() {
        return g20603;
    }

    public void setG20603(String g20603) {
        this.g20603 = g20603;
        notifyPropertyChanged(BR.g20603);
    }

    @Bindable
    public String getG20604() {
        return g20604;
    }

    public void setG20604(String g20604) {
        this.g20604 = g20604;
        notifyPropertyChanged(BR.g20604);
    }

    @Bindable
    public String getG207() {
        return g207;
    }

    public void setG207(String g207) {
        this.g207 = g207;
        notifyPropertyChanged(BR.g207);
    }

    @Bindable
    public String getG208() {
        return g208;
    }

    public void setG208(String g208) {
        this.g208 = g208;
        notifyPropertyChanged(BR.g208);
    }

    @Bindable
    public String getG20901() {
        return g20901;
    }

    public void setG20901(String g20901) {
        this.g20901 = g20901;
        notifyPropertyChanged(BR.g20901);
    }

    @Bindable
    public String getG20902() {
        return g20902;
    }

    public void setG20902(String g20902) {
        this.g20902 = g20902;
        notifyPropertyChanged(BR.g20902);
    }

    @Bindable
    public String getG210() {
        return g210;
    }

    public void setG210(String g210) {
        this.g210 = g210;
        notifyPropertyChanged(BR.g210);
    }

    @Bindable
    public String getG30101() {
        return g30101;
    }

    public void setG30101(String g30101) {
        this.g30101 = g30101;
        notifyPropertyChanged(BR.g30101);
    }

    @Bindable
    public String getG30102() {
        return g30102;
    }

    public void setG30102(String g30102) {
        this.g30102 = g30102;
        notifyPropertyChanged(BR.g30102);
    }

    @Bindable
    public String getG30103() {
        return g30103;
    }

    public void setG30103(String g30103) {
        this.g30103 = g30103;
        notifyPropertyChanged(BR.g30103);
    }

    @Bindable
    public String getG30201() {
        return g30201;
    }

    public void setG30201(String g30201) {
        this.g30201 = g30201;
        notifyPropertyChanged(BR.g30201);
    }

    @Bindable
    public String getG30202() {
        return g30202;
    }

    public void setG30202(String g30202) {
        this.g30202 = g30202;
        notifyPropertyChanged(BR.g30202);
    }

    @Bindable
    public String getG30203() {
        return g30203;
    }

    public void setG30203(String g30203) {
        this.g30203 = g30203;
        notifyPropertyChanged(BR.g30203);
    }

    @Bindable
    public String getG30301() {
        return g30301;
    }

    public void setG30301(String g30301) {
        this.g30301 = g30301;
        notifyPropertyChanged(BR.g30301);
    }

    @Bindable
    public String getG30302() {
        return g30302;
    }

    public void setG30302(String g30302) {
        this.g30302 = g30302;
        notifyPropertyChanged(BR.g30302);
    }

    @Bindable
    public String getG30303() {
        return g30303;
    }

    public void setG30303(String g30303) {
        this.g30303 = g30303;
        notifyPropertyChanged(BR.g30303);
    }

    @Bindable
    public String getG30401() {
        return g30401;
    }

    public void setG30401(String g30401) {
        this.g30401 = g30401;
        notifyPropertyChanged(BR.g30401);
    }

    @Bindable
    public String getG30402() {
        return g30402;
    }

    public void setG30402(String g30402) {
        this.g30402 = g30402;
        notifyPropertyChanged(BR.g30402);
    }

    @Bindable
    public String getG30403() {
        return g30403;
    }

    public void setG30403(String g30403) {
        this.g30403 = g30403;
        notifyPropertyChanged(BR.g30403);
    }

    @Bindable
    public String getG30501() {
        return g30501;
    }

    public void setG30501(String g30501) {
        this.g30501 = g30501;
        notifyPropertyChanged(BR.g30501);
    }

    @Bindable
    public String getG30502() {
        return g30502;
    }

    public void setG30502(String g30502) {
        this.g30502 = g30502;
        notifyPropertyChanged(BR.g30502);
    }

    @Bindable
    public String getG30503() {
        return g30503;
    }

    public void setG30503(String g30503) {
        this.g30503 = g30503;
        notifyPropertyChanged(BR.g30503);
    }

    @Bindable
    public String getG30601() {
        return g30601;
    }

    public void setG30601(String g30601) {
        this.g30601 = g30601;
        notifyPropertyChanged(BR.g30601);
    }

    @Bindable
    public String getG30602() {
        return g30602;
    }

    public void setG30602(String g30602) {
        this.g30602 = g30602;
        notifyPropertyChanged(BR.g30602);
    }

    @Bindable
    public String getG30603() {
        return g30603;
    }

    public void setG30603(String g30603) {
        this.g30603 = g30603;
        notifyPropertyChanged(BR.g30603);
    }

    @Bindable
    public String getG30701() {
        return g30701;
    }

    public void setG30701(String g30701) {
        this.g30701 = g30701;
        notifyPropertyChanged(BR.g30701);
    }

    @Bindable
    public String getG30702() {
        return g30702;
    }

    public void setG30702(String g30702) {
        this.g30702 = g30702;
        notifyPropertyChanged(BR.g30702);
    }

    @Bindable
    public String getG30703() {
        return g30703;
    }

    public void setG30703(String g30703) {
        this.g30703 = g30703;
        notifyPropertyChanged(BR.g30703);
    }

    @Bindable
    public String getG30801() {
        return g30801;
    }

    public void setG30801(String g30801) {
        this.g30801 = g30801;
        notifyPropertyChanged(BR.g30801);
    }

    @Bindable
    public String getG30802() {
        return g30802;
    }

    public void setG30802(String g30802) {
        this.g30802 = g30802;
        notifyPropertyChanged(BR.g30802);
    }

    @Bindable
    public String getG30803() {
        return g30803;
    }

    public void setG30803(String g30803) {
        this.g30803 = g30803;
        notifyPropertyChanged(BR.g30803);
    }

    @Bindable
    public String getG30901() {
        return g30901;
    }

    public void setG30901(String g30901) {
        this.g30901 = g30901;
        notifyPropertyChanged(BR.g30901);
    }

    @Bindable
    public String getG30902() {
        return g30902;
    }

    public void setG30902(String g30902) {
        this.g30902 = g30902;
        notifyPropertyChanged(BR.g30902);
    }

    @Bindable
    public String getG30903() {
        return g30903;
    }

    public void setG30903(String g30903) {
        this.g30903 = g30903;
        notifyPropertyChanged(BR.g30903);
    }

    @Bindable
    public String getG31001() {
        return g31001;
    }

    public void setG31001(String g31001) {
        this.g31001 = g31001;
        notifyPropertyChanged(BR.g31001);
    }

    @Bindable
    public String getG31002() {
        return g31002;
    }

    public void setG31002(String g31002) {
        this.g31002 = g31002;
        notifyPropertyChanged(BR.g31002);
    }

    @Bindable
    public String getG31003() {
        return g31003;
    }

    public void setG31003(String g31003) {
        this.g31003 = g31003;
        notifyPropertyChanged(BR.g31003);
    }

    @Bindable
    public String getG31101() {
        return g31101;
    }

    public void setG31101(String g31101) {
        this.g31101 = g31101;
        notifyPropertyChanged(BR.g31101);
    }

    @Bindable
    public String getG31102() {
        return g31102;
    }

    public void setG31102(String g31102) {
        this.g31102 = g31102;
        notifyPropertyChanged(BR.g31102);
    }

    @Bindable
    public String getG31103() {
        return g31103;
    }

    public void setG31103(String g31103) {
        this.g31103 = g31103;
        notifyPropertyChanged(BR.g31103);
    }

    @Bindable
    public String getG401() {
        return g401;
    }

    public void setG401(String g401) {
        this.g401 = g401;
        notifyPropertyChanged(BR.g401);
    }

    @Bindable
    public String getG402() {
        return g402;
    }

    public void setG402(String g402) {
        this.g402 = g402;
        notifyPropertyChanged(BR.g402);
    }

    @Bindable
    public String getG403() {
        return g403;
    }

    public void setG403(String g403) {
        this.g403 = g403;
        notifyPropertyChanged(BR.g403);
    }

    @Bindable
    public String getG404() {
        return g404;
    }

    public void setG404(String g404) {
        this.g404 = g404;
        notifyPropertyChanged(BR.g404);
    }

    @Bindable
    public String getG405() {
        return g405;
    }

    public void setG405(String g405) {
        this.g405 = g405;
        notifyPropertyChanged(BR.g405);
    }

    @Bindable
    public String getG501() {
        return g501;
    }

    public void setG501(String g501) {
        this.g501 = g501;
        notifyPropertyChanged(BR.g501);
    }

    @Bindable
    public String getG502() {
        return g502;
    }

    public void setG502(String g502) {
        this.g502 = g502;
        notifyPropertyChanged(BR.g502);
    }

    @Bindable
    public String getG503() {
        return g503;
    }

    public void setG503(String g503) {
        this.g503 = g503;
        notifyPropertyChanged(BR.g503);
    }

    @Bindable
    public String getG504() {
        return g504;
    }

    public void setG504(String g504) {
        this.g504 = g504;
        notifyPropertyChanged(BR.g504);
    }

    @Bindable
    public String getG505() {
        return g505;
    }

    public void setG505(String g505) {
        this.g505 = g505;
        notifyPropertyChanged(BR.g505);
    }

    @Bindable
    public String getG506() {
        return g506;
    }

    public void setG506(String g506) {
        this.g506 = g506;
        notifyPropertyChanged(BR.g506);
    }

    @Bindable
    public String getG507() {
        return g507;
    }

    public void setG507(String g507) {
        this.g507 = g507;
        notifyPropertyChanged(BR.g507);
    }

    @Bindable
    public String getG601() {
        return g601;
    }

    public void setG601(String g601) {
        this.g601 = g601;
        notifyPropertyChanged(BR.g601);
    }

    @Bindable
    public String getG602() {
        return g602;
    }

    public void setG602(String g602) {
        this.g602 = g602;
        notifyPropertyChanged(BR.g602);
    }

    @Bindable
    public String getG603() {
        return g603;
    }

    public void setG603(String g603) {
        this.g603 = g603;
        notifyPropertyChanged(BR.g603);
    }

    @Bindable
    public String getG604() {
        return g604;
    }

    public void setG604(String g604) {
        this.g604 = g604;
        notifyPropertyChanged(BR.g604);
    }

    @Bindable
    public String getG605() {
        return g605;
    }

    public void setG605(String g605) {
        this.g605 = g605;
        notifyPropertyChanged(BR.g605);
    }

    @Bindable
    public String getG606() {
        return g606;
    }

    public void setG606(String g606) {
        this.g606 = g606;
        notifyPropertyChanged(BR.g606);
    }

    @Bindable
    public String getG607() {
        return g607;
    }

    public void setG607(String g607) {
        this.g607 = g607;
        notifyPropertyChanged(BR.g607);
    }

    @Bindable
    public String getG608() {
        return g608;
    }

    public void setG608(String g608) {
        this.g608 = g608;
        notifyPropertyChanged(BR.g608);
    }

    @Bindable
    public String getG609() {
        return g609;
    }

    public void setG609(String g609) {
        this.g609 = g609;
        notifyPropertyChanged(BR.g609);
    }

    @Bindable
    public String getG610() {
        return g610;
    }

    public void setG610(String g610) {
        this.g610 = g610;
        notifyPropertyChanged(BR.g610);
    }

    @Bindable
    public String getG611() {
        return g611;
    }

    public void setG611(String g611) {
        this.g611 = g611;
        notifyPropertyChanged(BR.g611);
    }

    @Bindable
    public String getG701() {
        return g701;
    }

    public void setG701(String g701) {
        this.g701 = g701;
        notifyPropertyChanged(BR.g701);
    }


    public FoodConsumption Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_UUID));
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_ENUM_BLOCK));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SYNCED_DATE));


        sC1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SC1)));

        sG1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SG1)));
        sG2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SG2)));
        sG3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SG3)));
        sG4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SG4)));
        sG5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SG5)));
        sG6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SG6)));
        sG7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FoodConsumptionTable.COLUMN_SG7)));

        return this;
    }


    public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c1res = json.getString("c1res");
            this.c1011 = json.getString("c1011");
            this.c1012 = json.getString("c1012");
            this.c1013 = json.getString("c1013");
            this.c1021 = json.getString("c1021");
            this.c1022 = json.getString("c1022");
            this.c1023 = json.getString("c1023");
            this.c1031 = json.getString("c1031");
            this.c1032 = json.getString("c1032");
            this.c1033 = json.getString("c1033");
            this.c1041 = json.getString("c1041");
            this.c1042 = json.getString("c1042");
            this.c1043 = json.getString("c1043");
            this.c1051 = json.getString("c1051");
            this.c1052 = json.getString("c1052");
            this.c1053 = json.getString("c1053");
            this.c1061 = json.getString("c1061");
            this.c1062 = json.getString("c1062");
            this.c1063 = json.getString("c1063");
            this.c1071 = json.getString("c1071");
            this.c1072 = json.getString("c1072");
            this.c1073 = json.getString("c1073");
            this.c1081 = json.getString("c1081");
            this.c1082 = json.getString("c1082");
            this.c1083 = json.getString("c1083");
            this.c1091 = json.getString("c1091");
            this.c1092 = json.getString("c1092");
            this.c1093 = json.getString("c1093");
            this.c1101 = json.getString("c1101");
            this.c1102 = json.getString("c1102");
            this.c1103 = json.getString("c1103");
            this.c1111 = json.getString("c1111");
            this.c1112 = json.getString("c1112");
            this.c1113 = json.getString("c1113");
            this.c1121 = json.getString("c1121");
            this.c1122 = json.getString("c1122");
            this.c1123 = json.getString("c1123");
            this.c1131 = json.getString("c1131");
            this.c1132 = json.getString("c1132");
            this.c1133 = json.getString("c1133");
        }
    }


    public void sG1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g10101 = json.getString("g10101");
            this.g10102 = json.getString("g10102");
            this.g10103 = json.getString("g10103");
            this.g10201 = json.getString("g10201");
            this.g10202 = json.getString("g10202");
            this.g10203 = json.getString("g10203");
            this.g10301 = json.getString("g10301");
            this.g10302 = json.getString("g10302");
            this.g10401 = json.getString("g10401");
            this.g10402 = json.getString("g10402");
            this.g105 = json.getString("g105");
            this.g10601 = json.getString("g10601");
            this.g10602 = json.getString("g10602");
        }
    }

    public void sG2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g201 = json.getString("g201");
            this.g202 = json.getString("g202");
            this.g203 = json.getString("g203");
            this.g204 = json.getString("g204");
            this.g20501 = json.getString("g20501");
            this.g20502 = json.getString("g20502");
            this.g20601 = json.getString("g20601");
            this.g20602 = json.getString("g20602");
            this.g20603 = json.getString("g20603");
            this.g20604 = json.getString("g20604");
            this.g207 = json.getString("g207");
            this.g208 = json.getString("g208");
            this.g20901 = json.getString("g20901");
            this.g20902 = json.getString("g20902");
            this.g210 = json.getString("g210");
        }
    }

    public void sG3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g30101 = json.getString("g30101");
            this.g30102 = json.getString("g30102");
            this.g30103 = json.getString("g30103");
            this.g30201 = json.getString("g30201");
            this.g30202 = json.getString("g30202");
            this.g30203 = json.getString("g30203");
            this.g30301 = json.getString("g30301");
            this.g30302 = json.getString("g30302");
            this.g30303 = json.getString("g30303");
            this.g30401 = json.getString("g30401");
            this.g30402 = json.getString("g30402");
            this.g30403 = json.getString("g30403");
            this.g30501 = json.getString("g30501");
            this.g30502 = json.getString("g30502");
            this.g30503 = json.getString("g30503");
            this.g30601 = json.getString("g30601");
            this.g30602 = json.getString("g30602");
            this.g30603 = json.getString("g30603");
            this.g30701 = json.getString("g30701");
            this.g30702 = json.getString("g30702");
            this.g30703 = json.getString("g30703");
            this.g30801 = json.getString("g30801");
            this.g30802 = json.getString("g30802");
            this.g30803 = json.getString("g30803");
            this.g30901 = json.getString("g30901");
            this.g30902 = json.getString("g30902");
            this.g30903 = json.getString("g30903");
            this.g31001 = json.getString("g31001");
            this.g31002 = json.getString("g31002");
            this.g31003 = json.getString("g31003");
            this.g31101 = json.getString("g31101");
            this.g31102 = json.getString("g31102");
            this.g31103 = json.getString("g31103");
        }
    }

    public void sG4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g401 = json.getString("g401");
            this.g402 = json.getString("g402");
            this.g403 = json.getString("g403");
            this.g404 = json.getString("g404");
            this.g405 = json.getString("g405");
        }
    }

    public void sG5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g501 = json.getString("g501");
            this.g502 = json.getString("g502");
            this.g503 = json.getString("g503");
            this.g504 = json.getString("g504");
            this.g505 = json.getString("g505");
            this.g506 = json.getString("g506");
            this.g507 = json.getString("g507");
        }
    }

    public void sG6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g601 = json.getString("g601");
            this.g602 = json.getString("g602");
            this.g603 = json.getString("g603");
            this.g604 = json.getString("g604");
            this.g605 = json.getString("g605");
            this.g606 = json.getString("g606");
            this.g607 = json.getString("g607");
            this.g608 = json.getString("g608");
            this.g609 = json.getString("g609");
            this.g610 = json.getString("g610");
            this.g611 = json.getString("g611");
        }
    }

    public void sG7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g701 = json.getString("g701");
        }
    }


    public String sC1toString() throws JSONException {
        Log.d(TAG, "sC1toString: ");
        JSONObject json = new JSONObject();

        json.put("c1res", c1res)
                .put("c1011", c1011)
                .put("c1012", c1012)
                .put("c1013", c1013)
                .put("c1021", c1021)
                .put("c1022", c1022)
                .put("c1023", c1023)
                .put("c1031", c1031)
                .put("c1032", c1032)
                .put("c1033", c1033)
                .put("c1041", c1041)
                .put("c1042", c1042)
                .put("c1043", c1043)
                .put("c1051", c1051)
                .put("c1052", c1052)
                .put("c1053", c1053)
                .put("c1061", c1061)
                .put("c1062", c1062)
                .put("c1063", c1063)
                .put("c1071", c1071)
                .put("c1072", c1072)
                .put("c1073", c1073)
                .put("c1081", c1081)
                .put("c1082", c1082)
                .put("c1083", c1083)
                .put("c1091", c1091)
                .put("c1092", c1092)
                .put("c1093", c1093)
                .put("c1101", c1101)
                .put("c1102", c1102)
                .put("c1103", c1103)
                .put("c1111", c1111)
                .put("c1112", c1112)
                .put("c1113", c1113)
                .put("c1121", c1121)
                .put("c1122", c1122)
                .put("c1123", c1123)
                .put("c1131", c1131)
                .put("c1132", c1132)
                .put("c1133", c1133);
        return json.toString();
    }


    public String sG1toString() throws JSONException {
        Log.d(TAG, "sG1toString: ");
        JSONObject json = new JSONObject();

        json.put("g10101", g10101)
                .put("g10102", g10102)
                .put("g10103", g10103)
                .put("g10201", g10201)
                .put("g10202", g10202)
                .put("g10203", g10203)
                .put("g10301", g10301)
                .put("g10302", g10302)
                .put("g10401", g10401)
                .put("g10402", g10402)
                .put("g105", g105)
                .put("g10601", g10601)
                .put("g10602", g10602);
        return json.toString();
    }

    public String sG2toString() throws JSONException {
        Log.d(TAG, "sG2toString: ");
        JSONObject json = new JSONObject();

        json.put("g201", g201)
                .put("g202", g202)
                .put("g203", g203)
                .put("g204", g204)
                .put("g20501", g20501)
                .put("g20502", g20502)
                .put("g20601", g20601)
                .put("g20602", g20602)
                .put("g20603", g20603)
                .put("g20604", g20604)
                .put("g207", g207)
                .put("g208", g208)
                .put("g20901", g20901)
                .put("g20902", g20902)
                .put("g210", g210);
        return json.toString();
    }

    public String sG3toString() throws JSONException {
        Log.d(TAG, "sG3toString: ");
        JSONObject json = new JSONObject();

        json.put("g30101", g30101)
                .put("g30102", g30102)
                .put("g30103", g30103)
                .put("g30201", g30201)
                .put("g30202", g30202)
                .put("g30203", g30203)
                .put("g30301", g30301)
                .put("g30302", g30302)
                .put("g30303", g30303)
                .put("g30401", g30401)
                .put("g30402", g30402)
                .put("g30403", g30403)
                .put("g30501", g30501)
                .put("g30502", g30502)
                .put("g30503", g30503)
                .put("g30601", g30601)
                .put("g30602", g30602)
                .put("g30603", g30603)
                .put("g30701", g30701)
                .put("g30702", g30702)
                .put("g30703", g30703)
                .put("g30801", g30801)
                .put("g30802", g30802)
                .put("g30803", g30803)
                .put("g30901", g30901)
                .put("g30902", g30902)
                .put("g30903", g30903)
                .put("g31001", g31001)
                .put("g31002", g31002)
                .put("g31003", g31003)
                .put("g31101", g31101)
                .put("g31102", g31102)
                .put("g31103", g31103);
        return json.toString();
    }

    public String sG4toString() throws JSONException {
        Log.d(TAG, "sG4toString: ");
        JSONObject json = new JSONObject();
        json.put("g401", g401)
                .put("g402", g402)
                .put("g403", g403)
                .put("g404", g404)
                .put("g405", g405);
        return json.toString();
    }

    public String sG5toString() throws JSONException {
        Log.d(TAG, "sG5toString: ");
        JSONObject json = new JSONObject();
        json.put("g501", g501)
                .put("g502", g502)
                .put("g503", g503)
                .put("g504", g504)
                .put("g505", g505)
                .put("g506", g506)
                .put("g507", g507);
        return json.toString();
    }

    public String sG6toString() throws JSONException {
        Log.d(TAG, "sG6toString: ");
        JSONObject json = new JSONObject();
        json.put("g601", g601)
                .put("g602", g602)
                .put("g603", g603)
                .put("g604", g604)
                .put("g605", g605)
                .put("g606", g606)
                .put("g607", g607)
                .put("g608", g608)
                .put("g609", g609)
                .put("g610", g610)
                .put("g611", g611);
        return json.toString();
    }

    public String sG7toString() throws JSONException {
        Log.d(TAG, "sG7toString: ");
        JSONObject json = new JSONObject();
        json.put("g701", g701);
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FoodConsumptionTable.COLUMN_ID, this.id);
        json.put(FoodConsumptionTable.COLUMN_UID, this.uid);
        json.put(FoodConsumptionTable.COLUMN_UUID, this.uuid);
        json.put(FoodConsumptionTable.COLUMN_ENUM_BLOCK, this.ebCode);
        json.put(FoodConsumptionTable.COLUMN_HHID, this.hhid);
        json.put(FoodConsumptionTable.COLUMN_SNO, this.sno);
        json.put(FoodConsumptionTable.COLUMN_USERNAME, this.userName);
        json.put(FoodConsumptionTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FoodConsumptionTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FoodConsumptionTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FoodConsumptionTable.COLUMN_ISTATUS, this.iStatus);

        json.put(FoodConsumptionTable.COLUMN_SC1, new JSONObject(sC1toString()));

        json.put(FoodConsumptionTable.COLUMN_SG1, new JSONObject(sG1toString()));
        json.put(FoodConsumptionTable.COLUMN_SG2, new JSONObject(sG2toString()));
        json.put(FoodConsumptionTable.COLUMN_SG3, new JSONObject(sG3toString()));
        json.put(FoodConsumptionTable.COLUMN_SG4, new JSONObject(sG4toString()));
        json.put(FoodConsumptionTable.COLUMN_SG5, new JSONObject(sG5toString()));
        json.put(FoodConsumptionTable.COLUMN_SG6, new JSONObject(sG6toString()));
        json.put(FoodConsumptionTable.COLUMN_SG7, new JSONObject(sG7toString()));
        return json;
    }


}
