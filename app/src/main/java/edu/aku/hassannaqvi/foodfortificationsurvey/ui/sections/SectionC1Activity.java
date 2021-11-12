package edu.aku.hassannaqvi.foodfortificationsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.foodIndex;
import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.foodfortificationsurvey.R;
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortificationsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortificationsurvey.databinding.ActivitySectionC1Binding;
import edu.aku.hassannaqvi.foodfortificationsurvey.models.FoodConsumption;
import edu.aku.hassannaqvi.foodfortificationsurvey.ui.EndingActivity;


public class SectionC1Activity extends AppCompatActivity {
    private static final String TAG = "SectionC1Activity";
    ActivitySectionC1Binding bi;
    private DatabaseHelper db;
    //public String c1res = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c1);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
        MainApp.foodIndex++;
        // Mother
        if (MainApp.foodIndex == 0) {
            bi.c1res01.setVisibility(View.VISIBLE);
            bi.c1res02.setVisibility(View.GONE);
        }
        // Child
        else if (MainApp.foodIndex == 1) {
            bi.c1res01.setVisibility(View.GONE);
            bi.c1res02.setVisibility(View.VISIBLE);
        }
        // Otherwise
        else {
            bi.c1res01.setVisibility(View.VISIBLE);
            bi.c1res02.setVisibility(View.VISIBLE);
        }

        if (MainApp.foodConsumption.size() < MainApp.foodIndex + 1)
            MainApp.foodConsumption.add(new FoodConsumption());
        bi.setFoodConsumption(MainApp.foodConsumption.get(MainApp.foodIndex));
    }


    private boolean insertNewRecord() {
        if (!MainApp.foodConsumption.get(MainApp.foodIndex).getUid().equals("")) return true;
        if (MainApp.superuser) return true;

        MainApp.foodConsumption.get(MainApp.foodIndex).populateMeta();
        String memberPosition = "";
        switch (MainApp.foodIndex) {
            case 0:
                memberPosition = MainApp.selectedMWRA;
                break;
            case 1:
                memberPosition = MainApp.selectedChild;
                break;
            default:
                memberPosition = "0";
        }


        MainApp.foodConsumption.get(MainApp.foodIndex).setFmuid(MainApp.familyList.get(Integer.parseInt(memberPosition)).getUid());

        long rowId = 0;
        try {

            MainApp.foodConsumption.get(MainApp.foodIndex).setUuid(MainApp.form.getUid());
            MainApp.foodConsumption.get(MainApp.foodIndex).setUserName(MainApp.form.getUserName());
            MainApp.foodConsumption.get(MainApp.foodIndex).setSysDate(MainApp.form.getSysDate());
            MainApp.foodConsumption.get(MainApp.foodIndex).setEbCode(MainApp.form.getEbCode());
            MainApp.foodConsumption.get(MainApp.foodIndex).setHhid(MainApp.form.getHhid());
            MainApp.foodConsumption.get(MainApp.foodIndex).setSno(String.valueOf(foodIndex));
            MainApp.foodConsumption.get(MainApp.foodIndex).setDeviceId(MainApp.form.getDeviceId());
            MainApp.foodConsumption.get(MainApp.foodIndex).setAppver(MainApp.form.getAppver());

            /*
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
            */

            rowId = db.addFoodConsumption(MainApp.foodConsumption.get(MainApp.foodIndex));
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.foodConsumption.get(MainApp.foodIndex).setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.foodConsumption.get(MainApp.foodIndex).setUid(MainApp.foodConsumption.get(MainApp.foodIndex).getDeviceId() + MainApp.foodConsumption.get(MainApp.foodIndex).getId());
            db.updatesFoodConsumptionColumn(TableContracts.FoodConsumptionTable.COLUMN_UID, MainApp.foodConsumption.get(MainApp.foodIndex).getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesFoodConsumptionColumn(TableContracts.FoodConsumptionTable.COLUMN_SC1, MainApp.foodConsumption.get(MainApp.foodIndex).sC1toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        // saveDraft();
        if (updateDB()) {

            finish();
            if (MainApp.foodIndex > 0) {
                // GOTO next C2 if both Mother and Child have been entered
                startActivity(new Intent(this, SectionC2Activity.class));
            } else {
                // Repeat this C1 for Child
                startActivity(new Intent(this, SectionC1Activity.class));

            }
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {

        // Allow BackPress
        // super.onBackPressed();

        // Dont Allow BackPress
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();

    }


}