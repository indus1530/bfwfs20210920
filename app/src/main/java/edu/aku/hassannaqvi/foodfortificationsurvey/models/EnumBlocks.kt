package edu.aku.hassannaqvi.foodfortificationsurvey.models

import android.database.Cursor
import edu.aku.hassannaqvi.foodfortificationsurvey.contracts.TableContracts.EnumBlocksTable
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class EnumBlocks {
    var ID: Long = 0
    var districtName: String = StringUtils.EMPTY
    var tehsilName: String = StringUtils.EMPTY
    var enumBlock: String = StringUtils.EMPTY

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): EnumBlocks {
        districtName = jsonObject.getString(EnumBlocksTable.COLUMN_DISTRICT_NAME)
        tehsilName = jsonObject.getString(EnumBlocksTable.COLUMN_TEHSIL_NAME)
        enumBlock = jsonObject.getString(EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE)
        return this
    }

    fun hydrate(cursor: Cursor): EnumBlocks {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_ID))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_DISTRICT_NAME))
        tehsilName =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_TEHSIL_NAME))
        enumBlock =
            cursor.getString(cursor.getColumnIndexOrThrow(EnumBlocksTable.COLUMN_ENUM_BLOCK_CODE))
        return this
    }


}