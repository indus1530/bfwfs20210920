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
    private String s1 = StringUtils.EMPTY;

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


    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }


    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
    }


    public FamilyMembers Hydrate(Cursor cursor) {
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

        s1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_S1)));

        return this;
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

            json.put(FamilyMemberListTable.COLUMN_S1, new JSONObject(s1toString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "toJSONObject: " + e.getMessage());
            return null;
        }
    }
}
