package edu.aku.hassannaqvi.foodfortificationsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.memberCount;
import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.sharedPref;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.foodfortificationsurvey.R;
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortificationsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortificationsurvey.databinding.ActivitySectionA2Binding;
import edu.aku.hassannaqvi.foodfortificationsurvey.models.FamilyMembers;


public class SectionA2Activity extends AppCompatActivity {
    private static final String TAG = "SectionA2Activity";
    ActivitySectionA2Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> fatherNames;
    private ArrayList<String> fatherCodes;
    private ArrayList<String> motherNames;
    private ArrayList<String> motherCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a2);
        bi.setCallback(this);
        familyMember.setA201(String.valueOf(memberCount + 1));


        bi.setMember(familyMember);
        db = MainApp.appInfo.dbHelper;
        bi.btnContinue.setText(MainApp.familyMember.getUid().equals("") ? "Save" : "Update");


        populateSpinner();
    }


    private void populateSpinner() {

        fatherNames = new ArrayList<>();
        fatherCodes = new ArrayList<>();

        motherNames = new ArrayList<>();
        motherCodes = new ArrayList<>();

        fatherNames.add("...");
        fatherCodes.add("...");
        for (FamilyMembers fl : MainApp.fatherList) {
            fatherNames.add(fl.getA202());
            fatherCodes.add(fl.getA201());
        }
        fatherNames.add("Not Available/Died");
        fatherCodes.add("97");

        motherNames.add("...");
        motherCodes.add("...");
        for (FamilyMembers fl : MainApp.motherList) {
            motherNames.add(fl.getA202());
            motherCodes.add(fl.getA201());
        }
        motherNames.add("Not Available/Died");
        motherCodes.add("97");

        // Apply the adapter to the Father spinner
        bi.a212.setAdapter(new ArrayAdapter<>(SectionA2Activity.this, R.layout.custom_spinner, fatherNames));

        bi.a212.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setA212(fatherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        // Apply the adapter to the Mother spinner
        bi.a213.setAdapter(new ArrayAdapter<>(SectionA2Activity.this, R.layout.custom_spinner, motherNames));

        bi.a213.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setA213(motherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


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