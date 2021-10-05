package edu.aku.hassannaqvi.foodfortificationsurvey.models

import android.database.Cursor
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts.RandomTable
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class RandomHH {
    var ID: Long = 0
    var sno: String = StringUtils.EMPTY
    var ebcode: String = StringUtils.EMPTY
    var hhno: String = StringUtils.EMPTY
    var headhh: String = StringUtils.EMPTY

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): RandomHH {
        ID = jsonObject.getLong(RandomTable.COLUMN_ID)
        sno = jsonObject.getString(RandomTable.COLUMN_SNO)
        ebcode = jsonObject.getString(RandomTable.COLUMN_ENUM_BLOCK_CODE)
        hhno = jsonObject.getString(RandomTable.COLUMN_HH_NO)
        headhh = jsonObject.getString(RandomTable.COLUMN_HEAD_HH)
        return this
    }

    fun hydrate(cursor: Cursor): RandomHH {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(RandomTable.COLUMN_ID))
        sno = cursor.getString(cursor.getColumnIndexOrThrow(RandomTable.COLUMN_SNO))
        ebcode = cursor.getString(cursor.getColumnIndexOrThrow(RandomTable.COLUMN_ENUM_BLOCK_CODE))
        hhno = cursor.getString(cursor.getColumnIndexOrThrow(RandomTable.COLUMN_HH_NO))
        headhh = cursor.getString(cursor.getColumnIndexOrThrow(RandomTable.COLUMN_HEAD_HH))
        return this
    }


}