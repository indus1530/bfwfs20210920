package edu.aku.hassannaqvi.foodfortificationsurvey.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.foodfortificationsurvey.BR;
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts.FamilyMemberListTable;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;

public class FamilyMembers extends BaseObservable {

    private final String TAG = "FamilyMembers";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private String ebCode = StringUtils.EMPTY;
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
    private String a202 = StringUtils.EMPTY;
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
    private String a211 = StringUtils.EMPTY;
    private String a212 = StringUtils.EMPTY;
    private String a213 = StringUtils.EMPTY;
    private String ageInMonth = StringUtils.EMPTY;
    private boolean expanded;
    private boolean mwra;


    public FamilyMembers() {

        //  setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        // setUserName(MainApp.user.getUserName());
        //  setUuid(MainApp.form.getUid());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        //  setAppver(MainApp.appInfo.getAppVersion());
        //
        //

    }

    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
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
    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
        notifyPropertyChanged(BR.expanded);
    }

    @Bindable
    public boolean isMwra() {
        return mwra;
    }

    public void setMwra(boolean mwra) {
        this.mwra = mwra;

        notifyPropertyChanged(BR.mwra);
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
    public String getA202() {
        return a202;
    }

    public void setA202(String a202) {
        this.a202 = a202;
        notifyPropertyChanged(BR.a202);
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
        CaluculateAge();

        notifyPropertyChanged(BR.a205d);
    }

    @Bindable
    public String getA205m() {
        return a205m;
    }

    public void setA205m(String a205m) {
        this.a205m = a205m;
        if (a205m.equals("98")) {
            setA205d("98");
            //  setA206("");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.a205m);
    }

    @Bindable
    public String getA205y() {
        return a205y;
    }

    public void setA205y(String a205y) {
        this.a205y = a205y;

        if (a205y.equals("9998")) {
            setA205m("98");
            setA206("");
        }
        // Calculate age
        CaluculateAge();

        notifyPropertyChanged(BR.a205y);
    }

    @Bindable
    public String getA206() {
        return a206;
    }

    public void setA206(String a206) {
        this.a206 = a206;
        if (!a206.equals("")) {
            setA207t(Integer.valueOf(a206) >= 10 ? this.a207t : "2");
            setA208t(Integer.valueOf(a206) >= 3 ? this.a208t : "2");
            setA210(Integer.valueOf(a206) > 10 ? this.a210 : "");
            if (a205y.equals("9998")) {
                setAgeInMonth(String.valueOf(Integer.parseInt(this.a206) * 12));
            }
        } else {
            setA207t("");
            setA208t("");
            setAgeInMonth("");
        }


        notifyPropertyChanged(BR.a206);
    }

    @Bindable
    public String getAgeInMonth() {
        return ageInMonth;
    }

    public void setAgeInMonth(String ageInMonth) {
        this.ageInMonth = ageInMonth;
        if (!ageInMonth.equals("")) {
            if (Integer.parseInt(ageInMonth) >= 6 && Integer.parseInt(ageInMonth) <= 216) {
        /*    setA207t(this.a207t);
            setA208t(this.a208t);*/
            } else {
/*                setA207t("");
                setA208t("");*/
            }
        }

        notifyPropertyChanged(BR.ageInMonth);
    }

    @Bindable
    public String getA207t() {
        return a207t;
    }

    public void setA207t(String a207t) {
        this.a207t = a207t;

        if (!this.a204.equals("") && !this.a206.equals("") && !this.a207t.equals("")) {
            int ageInYears = Integer.parseInt(getA206());
            boolean genderCheck = getA204().equals("2");
            boolean maritalCheck = !getA207t().equals("2");
            setMwra(maritalCheck && genderCheck && ageInYears > 18);
        }
        notifyPropertyChanged(BR.a207t);
    }

    @Bindable
    public String getA208t() {
        return a208t;
    }

    public void setA208t(String a208t) {
        this.a208t = a208t;
        setA209t(a208t.equals("2") ? "" : this.a209t);
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
    public String getA211() {
        return a211;
    }

    public void setA211(String a211) {
        this.a211 = a211;
        notifyPropertyChanged(BR.a211);
    }

    @Bindable
    public String getA212() {
        return a212;
    }

    public void setA212(String a212) {
        this.a212 = a212;
        notifyPropertyChanged(BR.a212);
    }

    @Bindable
    public String getA213() {
        return a213;
    }

    public void setA213(String a213) {
        this.a213 = a213;
        notifyPropertyChanged(BR.a213);
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
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMemberListTable.COLUMN_EB_CODE));
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
            this.a202 = json.getString("a202");
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
            this.a211 = json.getString("a211");
            this.a212 = json.getString("a212");
            this.a213 = json.getString("a213");

            if (!this.a204.equals("") && !this.a206.equals("") && !this.a207t.equals("")) {
                int ageInYears = Integer.parseInt(getA206());
                boolean genderCheck = getA204().equals("2");
                boolean maritalCheck = !getA207t().equals("2");
                setMwra(maritalCheck && genderCheck && ageInYears > 18);
            }
        }
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FamilyMemberListTable.COLUMN_ID, this.id);
        json.put(FamilyMemberListTable.COLUMN_UID, this.uid);
        json.put(FamilyMemberListTable.COLUMN_UUID, this.uuid);
        json.put(FamilyMemberListTable.COLUMN_EB_CODE, this.ebCode);
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

    }

    public String sA2toString() throws JSONException {
        Log.d(TAG, "sA2toString: ");
        JSONObject json = new JSONObject();
        json.put("a201", a201)
                .put("a202", a202)
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
                .put("a210", a210)
                .put("a211", a211)
                .put("a212", a212)
                .put("a213", a213);
        return json.toString();
    }


    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.a205y + "-" + this.a205m + "-" + this.a205d);

        if (!this.a205y.equals("") && !this.a205y.equals("9998") && !this.a205m.equals("") && !this.a205d.equals("")) {

            if ((Integer.parseInt(this.a205m) > 12 && !this.a205m.equals("98")) || (Integer.parseInt(this.a205d) > 31 && !this.a205d.equals("98")) || Integer.parseInt(this.a205y) < 1920) {
                setA206("");
                return;
            }

            int day = !this.a205d.equals("98") ? Integer.parseInt(this.a205d) : 15;
            int month = !this.a205m.equals("98") ? Integer.parseInt(this.a205m) : 6;
            int year = Integer.parseInt(this.a205y);

            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
            String todayDate = df.format(Calendar.getInstance().getTime());
            Calendar cal = Calendar.getInstance();
            Calendar cur = Calendar.getInstance();

            try {
                cal.setTime(df.parse(year + " " + month + " " + day));
                long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                setAgeInMonth(String.valueOf(MILLISECONDS.toDays(millis) / 30));
                long tYear = MILLISECONDS.toDays(millis) / 365;
                long tMonth = (MILLISECONDS.toDays(millis) - (tYear * 365)) / 30;
                long tDay = MILLISECONDS.toDays(millis) - ((tYear * 365) + (tMonth * 30));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/

                setA206(String.valueOf(tYear));
                if (tYear < 0)
                    setA206("");
                //setAge(String.valueOf(((tYear) * 12) + tMonth));


        /*        String.format("%d min, %d sec",
                        ,
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );*/

            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }
}
