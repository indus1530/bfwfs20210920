package edu.aku.hassannaqvi.foodfortificationsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.form;
import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import edu.aku.hassannaqvi.foodfortificationsurvey.databinding.ActivitySectionA32Binding;
import edu.aku.hassannaqvi.foodfortificationsurvey.ui.EndingActivity;


public class SectionA32Activity extends AppCompatActivity {
    private static final String TAG = "SectionA32Activity";
    ActivitySectionA32Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a32);
        bi.setCallback(this);
        bi.setForm(form);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
        db = MainApp.appInfo.getDbHelper();
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SA3, form.sA3toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db_form + e.getMessage());
            Toast.makeText(this, R.string.upd_db_form + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionB1Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
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