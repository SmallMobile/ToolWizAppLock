/*******************************************************************************
 * Copyright (c) 2015 btows.com.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.cleanwiz.applock.data.TimeManagerInfoDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cleanwiz.applock.data.TimeManagerInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table TimeManager.
*/
public class TimeManagerInfoDao extends AbstractDao<TimeManagerInfo, Long> {

    public static final String TABLENAME = "TimeManager";

    /**
     * Properties of entity TimeManagerInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TimeIsOn = new Property(1, Boolean.class, "timeIsOn", false, "TIME_IS_ON");
        public final static Property TimeName = new Property(2, String.class, "timeName", false, "TIME_NAME");
        public final static Property IsRepeact = new Property(3, Boolean.class, "isRepeact", false, "IS_REPEACT");
        public final static Property RepeactDetail = new Property(4, String.class, "repeactDetail", false, "REPEACT_DETAIL");
        public final static Property StartTime = new Property(5, Long.class, "startTime", false, "START_TIME");
        public final static Property EndTime = new Property(6, Long.class, "endTime", false, "END_TIME");
    };


    public TimeManagerInfoDao(DaoConfig config) {
        super(config);
    }
    
    public TimeManagerInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'TimeManager' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'TIME_IS_ON' INTEGER," + // 1: timeIsOn
                "'TIME_NAME' TEXT," + // 2: timeName
                "'IS_REPEACT' INTEGER," + // 3: isRepeact
                "'REPEACT_DETAIL' TEXT," + // 4: repeactDetail
                "'START_TIME' INTEGER," + // 5: startTime
                "'END_TIME' INTEGER);"); // 6: endTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'TimeManager'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TimeManagerInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Boolean timeIsOn = entity.getTimeIsOn();
        if (timeIsOn != null) {
            stmt.bindLong(2, timeIsOn ? 1l: 0l);
        }
 
        String timeName = entity.getTimeName();
        if (timeName != null) {
            stmt.bindString(3, timeName);
        }
 
        Boolean isRepeact = entity.getIsRepeact();
        if (isRepeact != null) {
            stmt.bindLong(4, isRepeact ? 1l: 0l);
        }
 
        String repeactDetail = entity.getRepeactDetail();
        if (repeactDetail != null) {
            stmt.bindString(5, repeactDetail);
        }
 
        Long startTime = entity.getStartTime();
        if (startTime != null) {
            stmt.bindLong(6, startTime);
        }
 
        Long endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindLong(7, endTime);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TimeManagerInfo readEntity(Cursor cursor, int offset) {
        TimeManagerInfo entity = new TimeManagerInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getShort(offset + 1) != 0, // timeIsOn
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // timeName
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0, // isRepeact
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // repeactDetail
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // startTime
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6) // endTime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TimeManagerInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTimeIsOn(cursor.isNull(offset + 1) ? null : cursor.getShort(offset + 1) != 0);
        entity.setTimeName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIsRepeact(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
        entity.setRepeactDetail(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStartTime(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setEndTime(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TimeManagerInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TimeManagerInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}