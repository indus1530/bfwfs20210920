package edu.aku.hassannaqvi.foodfortificationsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.memberCount;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Calendar;

import edu.aku.hassannaqvi.foodfortificationsurvey.R;
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortificationsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortificationsurvey.databinding.ActivitySectionA2Binding;


public class SectionA2Activity extends AppCompatActivity {
    private static final String TAG = "SectionA2Activity";
    ActivitySectionA2Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a2);
        bi.setCallback(this);
        familyMember.setA201(String.valueOf(memberCount + 1));


        bi.setMember(familyMember);

        db = MainApp.appInfo.dbHelper;
        bi.btnContinue.setText(MainApp.familyMember.getUid().equals("") ? "Save" : "Update");


    }

    /*public void ageInYears(CharSequence s, int i, int i1, int i2) {
        if (TextUtils.isEmpty(bi.a205y.getText())) return;
        bi.a206.setText("");
        bi.a206.setEnabled(true);

        if (i == 0) return;

        int dobYear = Integer.parseInt(s.toString());
        int curYear = Calendar.getInstance().get(Calendar.YEAR);

        if (dobYear > (curYear - 99) && dobYear < curYear && bi.a205y.getText().length() == 4) {
            String ageInYears = String.valueOf(curYear - dobYear);
            bi.a206.setText(ageInYears);
            bi.a206.setEnabled(false);
        }
    }*/


    private boolean insertNewRecord() {
        if (!familyMember.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addFamilyMembers(familyMember);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        familyMember.setId(String.valueOf(rowId));
        if (rowId > 0) {
            familyMember.setUid(familyMember.getDeviceId() + familyMember.getId());
            db.updatesfamilyListColumn(TableContracts.FamilyMemberListTable.COLUMN_UID, familyMember.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        int updcount = 0;
        try {
            updcount = db.updatesfamilyListColumn(TableContracts.FamilyMemberListTable.COLUMN_SA2, familyMember.sA2toString());
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
        if (MainApp.familyMember.getUid().equals("") ? insertNewRecord() : updateDB()) {
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


}