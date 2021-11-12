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
    private String fmuid = StringUtils.EMPTY;
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


    public String g101 = StringUtils.EMPTY;
    public String g101b = StringUtils.EMPTY;
    public String g102 = StringUtils.EMPTY;
    public String g102b = StringUtils.EMPTY;
    public String g103 = StringUtils.EMPTY;
    public String g103b = StringUtils.EMPTY;
    public String g104 = StringUtils.EMPTY;
    public String g104b = StringUtils.EMPTY;
    public String g105 = StringUtils.EMPTY;
    public String g106 = StringUtils.EMPTY;
    public String g106b = StringUtils.EMPTY;
    public String g201 = StringUtils.EMPTY;
    public String g202 = StringUtils.EMPTY;
    public String g203 = StringUtils.EMPTY;
    public String g204 = StringUtils.EMPTY;
    public String g205 = StringUtils.EMPTY;
    public String g205b = StringUtils.EMPTY;
    public String g206 = StringUtils.EMPTY;
    public String g206b = StringUtils.EMPTY;
    public String g207 = StringUtils.EMPTY;
    public String g208 = StringUtils.EMPTY;
    public String g209 = StringUtils.EMPTY;
    public String g209b = StringUtils.EMPTY;
    public String g210 = StringUtils.EMPTY;
    public String g301 = StringUtils.EMPTY;
    public String g301b = StringUtils.EMPTY;
    public String g302 = StringUtils.EMPTY;
    public String g302b = StringUtils.EMPTY;
    public String g303 = StringUtils.EMPTY;
    public String g303b = StringUtils.EMPTY;
    public String g304 = StringUtils.EMPTY;
    public String g304b = StringUtils.EMPTY;
    public String g305 = StringUtils.EMPTY;
    public String g305b = StringUtils.EMPTY;
    public String g306 = StringUtils.EMPTY;
    public String g306b = StringUtils.EMPTY;
    public String g307 = StringUtils.EMPTY;
    public String g307b = StringUtils.EMPTY;
    public String g308 = StringUtils.EMPTY;
    public String g308b = StringUtils.EMPTY;
    public String g309 = StringUtils.EMPTY;
    public String g309b = StringUtils.EMPTY;
    public String g310 = StringUtils.EMPTY;
    public String g310b = StringUtils.EMPTY;
    public String g311 = StringUtils.EMPTY;
    public String g311b = StringUtils.EMPTY;
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
        // setAppver(MainApp.appInfo.getAppVersion());

    }

    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
        // setFmuid(MainApp.familyMember.getUid());  // implemented in Section C1 Activity after populateMeta
        setAppver(MainApp.form.getAppver());
        setEbCode(MainApp.form.getEbCode());
        setHhid(MainApp.form.getHhid());
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

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
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
    public String getG101() {
        return g101;
    }

    public void setG101(String g101) {
        this.g101 = g101;
        setG101b(this.g101.equals("97") ? "" : this.g101b);
        notifyPropertyChanged(BR.g101);
    }

    @Bindable
    public String getG101b() {
        return g101b;
    }

    public void setG101b(String g101b) {
        this.g101b = g101b;
        notifyPropertyChanged(BR.g101b);
    }

    @Bindable
    public String getG102() {
        return g102;
    }

    public void setG102(String g102) {
        this.g102 = g102;
        setG102b(this.g102.equals("97") ? "" : this.g102b);

        notifyPropertyChanged(BR.g102);
    }

    @Bindable
    public String getG102b() {
        return g102b;
    }

    public void setG102b(String g102b) {
        this.g102b = g102b;
        notifyPropertyChanged(BR.g102b);
    }

    @Bindable
    public String getG103() {
        return g103;
    }

    public void setG103(String g103) {
        this.g103 = g103;
        setG103b(this.g103.equals("97") ? "" : this.g103b);

        notifyPropertyChanged(BR.g103);
    }

    @Bindable
    public String getG103b() {
        return g103b;
    }

    public void setG103b(String g103b) {
        this.g103b = g103b;
        notifyPropertyChanged(BR.g103b);
    }

    @Bindable
    public String getG104() {
        return g104;
    }

    public void setG104(String g104) {
        this.g104 = g104;
        setG104b(this.g104.equals("97") ? "" : this.g104b);
        setG105(this.g104.equals("97") ? "" : this.g105);

        notifyPropertyChanged(BR.g104);
    }

    @Bindable
    public String getG104b() {
        return g104b;
    }

    public void setG104b(String g104b) {
        this.g104b = g104b;
        notifyPropertyChanged(BR.g104b);
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
    public String getG106() {
        return g106;
    }

    public void setG106(String g106) {
        this.g106 = g106;
        setG106b(this.g106.equals("97") ? "" : this.g106b);
        notifyPropertyChanged(BR.g106);
    }

    @Bindable
    public String getG106b() {
        return g106b;
    }

    public void setG106b(String g106b) {
        this.g106b = g106b;
        notifyPropertyChanged(BR.g106b);
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
    public String getG205() {
        return g205;
    }

    public void setG205(String g205) {
        this.g205 = g205;
        setG205b(this.g205.equals("97") ? "" : this.g205b);
        notifyPropertyChanged(BR.g205);
    }

    @Bindable
    public String getG205b() {
        return g205b;
    }

    public void setG205b(String g205b) {
        this.g205b = g205b;
        notifyPropertyChanged(BR.g205b);
    }

    @Bindable
    public String getG206() {
        return g206;
    }

    public void setG206(String g206) {
        this.g206 = g206;
        setG206b(g206.equals("97") ? "" : this.g206b);
        notifyPropertyChanged(BR.g206);
    }

    @Bindable
    public String getG206b() {
        return g206b;
    }

    public void setG206b(String g206b) {
        this.g206b = g206b;
        notifyPropertyChanged(BR.g206b);
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
    public String getG209() {
        return g209;
    }

    public void setG209(String g209) {
        this.g209 = g209;
        setG209b(this.g209.equals("97") ? "" : this.g209b);
        notifyPropertyChanged(BR.g209);
    }

    @Bindable
    public String getG209b() {
        return g209b;
    }

    public void setG209b(String g209b) {
        this.g209b = g209b;
        notifyPropertyChanged(BR.g209b);
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
    public String getG301() {
        return g301;
    }

    public void setG301(String g301) {
        this.g301 = g301;
        setG301b(this.g301.equals("97") ? "" : this.g301b);
        notifyPropertyChanged(BR.g301);
    }

    @Bindable
    public String getG301b() {
        return g301b;
    }

    public void setG301b(String g301b) {
        this.g301b = g301b;
        notifyPropertyChanged(BR.g301b);
    }

    @Bindable
    public String getG302() {
        return g302;
    }

    public void setG302(String g302) {
        this.g302 = g302;
        setG302b(this.g302.equals("97") ? "" : this.g302b);
        notifyPropertyChanged(BR.g302);
    }

    @Bindable
    public String getG302b() {
        return g302b;
    }

    public void setG302b(String g302b) {
        this.g302b = g302b;
        notifyPropertyChanged(BR.g302b);
    }

    @Bindable
    public String getG303() {
        return g303;
    }

    public void setG303(String g303) {
        this.g303 = g303;
        setG303b(this.g303.equals("97") ? "" : this.g303b);
        notifyPropertyChanged(BR.g303);
    }

    @Bindable
    public String getG303b() {
        return g303b;
    }

    public void setG303b(String g303b) {
        this.g303b = g303b;
        notifyPropertyChanged(BR.g303b);
    }

    @Bindable
    public String getG304() {
        return g304;
    }

    public void setG304(String g304) {
        this.g304 = g304;
        setG304b(this.g304.equals("97") ? "" : this.g304b);
        notifyPropertyChanged(BR.g304);
    }

    @Bindable
    public String getG304b() {
        return g304b;
    }

    public void setG304b(String g304b) {
        this.g304b = g304b;
        notifyPropertyChanged(BR.g304b);
    }

    @Bindable
    public String getG305() {
        return g305;
    }

    public void setG305(String g305) {
        this.g305 = g305;
        setG305b(this.g305.equals("97") ? "" : this.g305b);
        notifyPropertyChanged(BR.g305);
    }

    @Bindable
    public String getG305b() {
        return g305b;
    }

    public void setG305b(String g305b) {
        this.g305b = g305b;
        notifyPropertyChanged(BR.g305b);
    }

    @Bindable
    public String getG306() {
        return g306;
    }

    public void setG306(String g306) {
        this.g306 = g306;
        setG306b(this.g306.equals("97") ? "" : this.g306b);
        notifyPropertyChanged(BR.g306);
    }

    @Bindable
    public String getG306b() {
        return g306b;
    }

    public void setG306b(String g306b) {
        this.g306b = g306b;
        notifyPropertyChanged(BR.g306b);
    }

    @Bindable
    public String getG307() {
        return g307;
    }

    public void setG307(String g307) {
        this.g307 = g307;
        setG307b(this.g307.equals("97") ? "" : this.g307b);
        notifyPropertyChanged(BR.g307);
    }

    @Bindable
    public String getG307b() {
        return g307b;
    }

    public void setG307b(String g307b) {
        this.g307b = g307b;
        notifyPropertyChanged(BR.g307b);
    }

    @Bindable
    public String getG308() {
        return g308;
    }

    public void setG308(String g308) {
        this.g308 = g308;
        setG308b(this.g308.equals("97") ? "" : this.g308b);
        notifyPropertyChanged(BR.g308);
    }

    @Bindable
    public String getG308b() {
        return g308b;
    }

    public void setG308b(String g308b) {
        this.g308b = g308b;
        notifyPropertyChanged(BR.g308b);
    }

    @Bindable
    public String getG309() {
        return g309;
    }

    public void setG309(String g309) {
        this.g309 = g309;
        setG309b(this.g309.equals("97") ? "" : this.g309b);
        notifyPropertyChanged(BR.g309);
    }

    @Bindable
    public String getG309b() {
        return g309b;
    }

    public void setG309b(String g309b) {
        this.g309b = g309b;
        notifyPropertyChanged(BR.g309b);
    }

    @Bindable
    public String getG310() {
        return g310;
    }

    public void setG310(String g310) {
        this.g310 = g310;
        setG310b(this.g310.equals("97") ? "" : this.g310b);
        notifyPropertyChanged(BR.g310);
    }

    @Bindable
    public String getG310b() {
        return g310b;
    }

    public void setG310b(String g310b) {
        this.g310b = g310b;
        notifyPropertyChanged(BR.g310b);
    }

    @Bindable
    public String getG311() {
        return g311;
    }

    public void setG311(String g311) {
        this.g311 = g311;
        setG311b(this.g311.equals("97") ? "" : this.g311b);
        notifyPropertyChanged(BR.g311);
    }

    @Bindable
    public String getG311b() {
        return g311b;
    }

    public void setG311b(String g311b) {
        this.g311b = g311b;
        notifyPropertyChanged(BR.g311b);
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
            this.fmuid = json.has("fmuid") ? json.getString("fmuid") : "";
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
            this.g101 = json.getString("g101");
            this.g101b = json.getString("g101b");
            this.g102 = json.getString("g102");
            this.g102b = json.getString("g102b");
            this.g103 = json.getString("g103");
            this.g103b = json.getString("g103b");
            this.g104 = json.getString("g104");
            this.g104b = json.getString("g104b");
            this.g105 = json.getString("g105");
            this.g106 = json.getString("g106");
            this.g106b = json.getString("g106b");

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
            this.g205 = json.getString("g205");
            this.g205b = json.getString("g205b");
            this.g206 = json.getString("g206");
            this.g206b = json.getString("g206b");
            this.g207 = json.getString("g207");
            this.g208 = json.getString("g208");
            this.g209 = json.getString("g209");
            this.g209b = json.getString("g209b");
            this.g210 = json.getString("g210");
        }
    }

    public void sG3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g301 = json.getString("g301");
            this.g301b = json.getString("g301b");
            this.g302 = json.getString("g302");
            this.g302b = json.getString("g302b");
            this.g303 = json.getString("g303");
            this.g303b = json.getString("g303b");
            this.g304 = json.getString("g304");
            this.g304b = json.getString("g304b");
            this.g305 = json.getString("g305");
            this.g305b = json.getString("g305b");
            this.g306 = json.getString("g306");
            this.g306b = json.getString("g306b");
            this.g307 = json.getString("g307");
            this.g307b = json.getString("g307b");
            this.g308 = json.getString("g308");
            this.g308b = json.getString("g308b");
            this.g309 = json.getString("g309");
            this.g309b = json.getString("g309b");
            this.g310 = json.getString("g310");
            this.g310b = json.getString("g310b");
            this.g311 = json.getString("g311");
            this.g311b = json.getString("g311b");

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
                .put("fmuid", fmuid)
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

        json.put("g101", g101)
                .put("g101b", g101b)
                .put("g102", g102)
                .put("g102b", g102b)
                .put("g103", g103)
                .put("g103b", g103b)
                .put("g104", g104)
                .put("g104b", g104b)
                .put("g105", g105)
                .put("g106", g106)
                .put("g106b", g106b);
        return json.toString();
    }

    public String sG2toString() throws JSONException {
        Log.d(TAG, "sG2toString: ");
        JSONObject json = new JSONObject();

        json.put("g201", g201)
                .put("g202", g202)
                .put("g203", g203)
                .put("g204", g204)
                .put("g205", g205)
                .put("g205b", g205b)
                .put("g206", g206)
                .put("g206b", g206b)
                .put("g207", g207)
                .put("g208", g208)
                .put("g209", g209)
                .put("g209b", g209b)
                .put("g210", g210);
        return json.toString();
    }

    public String sG3toString() throws JSONException {
        Log.d(TAG, "sG3toString: ");
        JSONObject json = new JSONObject();

        json.put("g301", g301)
                .put("g301b", g301b)
                .put("g302", g302)
                .put("g302b", g302b)
                .put("g303", g303)
                .put("g303b", g303b)
                .put("g304", g304)
                .put("g304b", g304b)
                .put("g305", g305)
                .put("g305b", g305b)
                .put("g306", g306)
                .put("g306b", g306b)
                .put("g307", g307)
                .put("g307b", g307b)
                .put("g308", g308)
                .put("g308b", g308b)
                .put("g309", g309)
                .put("g309b", g309b)
                .put("g310", g310)
                .put("g310b", g310b)
                .put("g311", g311)
                .put("g311b", g311b);
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
