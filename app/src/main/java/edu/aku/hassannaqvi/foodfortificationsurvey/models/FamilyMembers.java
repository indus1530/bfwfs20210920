package edu.aku.hassannaqvi.foodfortificationsurvey.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;

import edu.aku.hassannaqvi.foodfortificationsurvey.BR;
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts.FamilyMemberListTable;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;

public class FamilyMembers extends BaseObservable {

    private final String TAG = "MWRA";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private String cluster = StringUtils.EMPTY;
    private String hhid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String indexed = StringUtils.EMPTY;

    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;

    // SECTION VARIABLES
    private String sA2 = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String a201 = StringUtils.EMPTY;
    private String a203t = StringUtils.EMPTY;
    private String a20396x = StringUtils.EMPTY;
    private String a204 = StringUtils.EMPTY;
    private String a205d = StringUtils.EMPTY;
    private String a205m = StringUtils.EMPTY;
    private String a205y = StringUtils.EMPTY;
    private String a206 = StringUtils.EMPTY;
    private String a207t = StringUtils.EMPTY;
    private String a208t = StringUtils.EMPTY;
    private String a209t = StringUtils.EMPTY;
    private String a210 = StringUtils.EMPTY;

    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    private boolean expanded;


    public FamilyMembers() {
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
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
        notifyPropertyChanged(BR.cluster);
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
    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
        notifyPropertyChanged(BR.expanded);
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


    public String getsA2() {
        return sA2;
    }

    public void setsA2(String sA2) {
        this.sA2 = sA2;
    }

    @Bindable
    public String getA201() {
        return a201;
    }

    public void setA201(String a201) {
        this.a201 = a201;
        notifyPropertyChanged(BR.a201);
    }

    @Bindable
    public String getA203t() {
        return a203t;
    }

    public void setA203t(String a203t) {
        this.a203t = a203t;
        setA20396x(a203t.equals("96") ? this.a20396x : "");
        notifyPropertyChanged(BR.a203t);
    }

    @Bindable
    public String getA20396x() {
        return a20396x;
    }

    public void setA20396x(String a20396x) {
        this.a20396x = a20396x;
        notifyPropertyChanged(BR.a20396x);
    }

    @Bindable
    public String getA204() {
        return a204;
    }

    public void setA204(String a204) {
        this.a204 = a204;
        notifyPropertyChanged(BR.a204);
    }

    @Bindable
    public String getA205d() {
        return a205d;
    }

    public void setA205d(String a205d) {
        this.a205d = a205d;
        notifyPropertyChanged(BR.a205d);
    }

    @Bindable
    public String getA205m() {
        return a205m;
    }

    public void setA205m(String a205m) {
        this.a205m = a205m;
        notifyPropertyChanged(BR.a205m);
    }

    @Bindable
    public String getA205y() {
        return a205y;
    }

    public void setA205y(String a205y) {
        this.a205y = a205y;
        notifyPropertyChanged(BR.a205y);
    }

    @Bindable
    public String getA206() {
        return a206;
    }

    public void setA206(String a206) {
        this.a206 = a206;
        notifyPropertyChanged(BR.a206);
    }

    @Bindable
    public String getA207t() {
        return a207t;
    }

    public void setA207t(String a207t) {
        this.a207t = a207t;
        notifyPropertyChanged(BR.a207t);
    }

    @Bindable
    public String getA208t() {
        return a208t;
    }

    public void setA208t(String a208t) {
        this.a208t = a208t;
        notifyPropertyChanged(BR.a208t);
    }

    @Bindable
    public String getA209t() {
        return a209t;
    }

    public void setA209t(String a209t) {
        this.a209t = a209t;
        notifyPropertyChanged(BR.a209t);
    }

    @Bindable
    public String getA210() {
        return a210;
    }

    public void setA210(String a210) {
        this.a210 = a210;
        notifyPropertyChanged(BR.a210);
    }


    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
    }


    public FamilyMembers Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_UUID));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_CLUSTER));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_SYSDATE));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_INDEXED));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_SYNCED_DATE));

        sA2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_SA2)));

        return this;
    }

    public void sA2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a201 = json.getString("a201");
            this.a203t = json.getString("a203t");
            this.a20396x = json.getString("a20396x");
            this.a204 = json.getString("a204");
            this.a205d = json.getString("a205d");
            this.a205m = json.getString("a205m");
            this.a205y = json.getString("a205y");
            this.a206 = json.getString("a206");
            this.a207t = json.getString("a207t");
            this.a208t = json.getString("a208t");
            this.a209t = json.getString("a209t");
            this.a210 = json.getString("a210");
        }
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FamilyMemberListTable.COLUMN_ID, this.id);
            json.put(FamilyMemberListTable.COLUMN_UID, this.uid);
            json.put(FamilyMemberListTable.COLUMN_UUID, this.uuid);
            json.put(FamilyMemberListTable.COLUMN_CLUSTER, this.cluster);
            json.put(FamilyMemberListTable.COLUMN_HHID, this.hhid);
            json.put(FamilyMemberListTable.COLUMN_USERNAME, this.userName);
            json.put(FamilyMemberListTable.COLUMN_SYSDATE, this.sysDate);
            json.put(FamilyMemberListTable.COLUMN_INDEXED, this.indexed);
            json.put(FamilyMemberListTable.COLUMN_DEVICEID, this.deviceId);
            json.put(FamilyMemberListTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(FamilyMemberListTable.COLUMN_ISTATUS, this.iStatus);
            //  json.put(FamilyMemberListTable.COLUMN_SYNCED, this.synced);
            //  json.put(FamilyMemberListTable.COLUMN_SYNCED_DATE, this.syncDate);

            json.put(FamilyMemberListTable.COLUMN_SA2, new JSONObject(sA2toString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "toJSONObject: " + e.getMessage());
            return null;
        }
    }

    public String sA2toString() throws JSONException {
        Log.d(TAG, "sA2toString: ");
        JSONObject json = new JSONObject();
        json.put("a201", a201)
                .put("a203t", a203t)
                .put("a20396x", a20396x)
                .put("a204", a204)
                .put("a205d", a205d)
                .put("a205m", a205m)
                .put("a205y", a205y)
                .put("a206", a206)
                .put("a207t", a207t)
                .put("a208t", a208t)
                .put("a209t", a209t)
                .put("a210", a210);
        return json.toString();
    }
}
