package edu.aku.hassannaqvi.foodfortificationsurvey.ui.sections;

import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.form;
import static edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp.sharedPref;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.foodfortificationsurvey.R;
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortificationsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.foodfortificationsurvey.databinding.ActivitySectionB2Binding;
import edu.aku.hassannaqvi.foodfortificationsurvey.models.FamilyMembers;
import edu.aku.hassannaqvi.foodfortificationsurvey.ui.EndingActivity;
import edu.aku.hassannaqvi.foodfortificationsurvey.ui.LoginActivity;
import edu.aku.hassannaqvi.foodfortificationsurvey.ui.TakePhoto;
import edu.aku.hassannaqvi.foodfortificationsurvey.ui.lists.FamilyMambersListActivity;


public class SectionB2Activity extends AppCompatActivity {
    private static final String TAG = "SectionB2Activity";
    ActivitySectionB2Binding bi;
    private DatabaseHelper db;
    private int PhotoSerial = 0;
    ActivityResultLauncher<Intent> takePhotoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        //Intent data = result.getData();
                        Intent data = result.getData();

                        Toast.makeText(SectionB2Activity.this, "Photo Taken", Toast.LENGTH_SHORT).show();

                        String fileName = data.getStringExtra("FileName");
                        //   photolist = photolist + fileName + ";";
                        PhotoSerial++;

                        bi.b117.setText(bi.b117.getText().toString() + PhotoSerial + " - " + fileName + ";\r\n");
                    } else {
                        Toast.makeText(SectionB2Activity.this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                        //TODO: Implement functionality below when photo was not taken
                        // ...
                        bi.b117.setText("Photo not taken.");
                    }

                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(SectionB2Activity.this, "No family member added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });
    private String photolist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b2);
        bi.setCallback(this);
        bi.setForm(form);
        db = MainApp.appInfo.getDbHelper();
    }


    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SB1, form.sB1toString());
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
            try {
                MainApp.foodConsumption = db.getFoodConsumptionBYUID(MainApp.form.getUid());
            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(this, "JSONException(FoodConsumption): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
            MainApp.foodIndex = -1;
            finish();

            startActivity(new Intent(this, SectionC1Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) {
            return false;
        }

        if (!bi.b110d.getText().toString().equals("") && !bi.b110w.getText().toString().equals("") && !bi.b110m.getText().toString().equals("")) {
            int b110Sum = Integer.parseInt(form.getB110d()) + Integer.parseInt(form.getB110w()) + Integer.parseInt(form.getB110m());

            if (b110Sum < 1) {
                Validator.emptyCustomTextBox(this, bi.b110d, "All values can't be zero.");
                return false;
            }

        }
        return true;
    }

    public void TakePhoto(View view) {
  /*      if(!Validator.emptyCheckingContainer(this, bi.GrpName)) return
                val intent = Intent(this, TakePhoto::class.java)*/
        Intent intent = new Intent(this, TakePhoto.class);
        intent.putExtra("picID", form.getEbCode() + "_" + form.getHhid());
        intent.putExtra("id", form.getHhid());
        if (PhotoSerial == 0) {


            intent.putExtra("picView", "Brand/logo");
        } else {
            intent.putExtra("picView", "Ingredients");
        }
        takePhotoLauncher.launch(intent);

    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }

}