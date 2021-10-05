package edu.aku.hassannaqvi.foodfortificationsurvey.contracts;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.aku.hassannaqvi.foodfortificationsurvey.R;
import edu.aku.hassannaqvi.foodfortificationsurvey.core.MainApp;
import edu.aku.hassannaqvi.foodfortificationsurvey.models.FamilyMembers;


public class FamilyMembersAdapter extends RecyclerView.Adapter<FamilyMembersAdapter.ViewHolder> {
    private static final String TAG = "MWRAAdapter";
    private final Context mContext;
    private final List<FamilyMembers> member;
    private final int mExpandedPosition = -1;
    private final int completeCount;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param members List<FemaleMembersModel> containing the data to populate views to be used by RecyclerView.
     */
    public FamilyMembersAdapter(Context mContext, List<FamilyMembers> members) {
        this.member = members;
        this.mContext = mContext;
        completeCount = 0;
        MainApp.memberComplete = false;


    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");
        FamilyMembers members = this.member.get(position);        // Get element from your dataset at this position and replace the contents of the view
        // with that element

        TextView fName = viewHolder.fName;
        TextView fAge = viewHolder.fAge;
        TextView fMaritalStatus = viewHolder.fMatitalStatus;
        View indicator = viewHolder.indicator;
        View cloaked = viewHolder.cloaked;

        //String pregStatus = members.getRb07().equals("1") ? "Pregnant" : "Not Pregnant";

        MainApp.memberComplete = completeCount == MainApp.memberCount;

        fName.setText(members.getH221());
        fAge.setText(members.getH223());

    /*    String marStatus = "";
        switch (members.getRb06()) {
            case "2":
                marStatus = "Currently Married";
                break;
            case "3":
                marStatus = "Unmarried";
                break;
            default:
                marStatus = "Value Unknown";
                break;
        }



*/

        cloaked.setVisibility(members.getH227().equals("1") ? View.GONE : View.VISIBLE);
        indicator.setBackgroundColor(members.getIndexed().equals("1") ? mContext.getResources().getColor(R.color.greenLight) : mContext.getResources().getColor(R.color.gray));
        if (!MainApp.selectedMember.equals("")) {
            cloaked.setVisibility(members.getIndexed().equals("1") ? View.GONE : View.VISIBLE);
        }
        fMaritalStatus.setText("Children: " + members.getH226m() + " boy(s), " + members.getH226f() + " girl(s)");
      /*  viewHolder.itemView.setOnClickListener(v -> {
            // Get the current state of the item

            MainApp.members = MainApp.members.get(position);
            Intent intent = new Intent(mContext, SectionBActivity.class);

            intent.putExtra("position", position);

            MainApp.selectedFemale = position;

            intent.putExtra("position", position);

            ((Activity) mContext).startActivityForResult(intent, 2);


        });*/

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.famlily_member_row, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return member.size();
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView fName;
        private final TextView fAge;
        private final TextView fMatitalStatus;
        private final TextView secStatus;
        private final ImageView fmRow;
        private final View indicator;
        private final View cloaked;


        public ViewHolder(View v) {
            super(v);
            fName = v.findViewById(R.id.hh02);
            fAge = v.findViewById(R.id.hh05);
            fMatitalStatus = v.findViewById(R.id.hh06);
            secStatus = v.findViewById(R.id.secStatus);
            fmRow = v.findViewById(R.id.fmRow);
            indicator = v.findViewById(R.id.indicator);
            cloaked = v.findViewById(R.id.cloaked);

        }

        public TextView getTextView() {
            return fName;
        }
    }


}
