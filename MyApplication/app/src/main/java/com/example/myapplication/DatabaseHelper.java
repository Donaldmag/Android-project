


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


interface DatabaseHelper{
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "smartQuizz_db";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create table notes
        db.execSQL(Tables.CREATE_TABLE);
        db.execSQL(Question.CREATE_TABLE1);
        db.execSQL(Choice.CREATE_TABLE3);
        db.execSQL(correctChoice.CREATE_TABLE4);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {

        db.execSQL(" drop table if exists " + Tables.TABLE_NAME);
        db.execSQL(" drop table if exists " + Question.TABLE_NAME1);
        db.execSQL(" drop table if exists " + Choice.TABLE_NAME2);
        db.execSQL(" drop table if exists " + correctChoice.TABLE_NAME3);


    }

    public List<Tables> getAllCategories() {
        List<Tables> subjects = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from " + Tables.subject_column,null);

        while (cursor.moveToNext()) {
            Tables content = new Tables(

                    cursor.getString(cursor.getColumnIndex(Tables.subject_column))
            );
            subjects.add(content);
        }
        cursor.close();
        return subjects;

    }

    public List<Question> getAllQuestions() {
        List<Question> question = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from " + Question.question_column,null);

        while (cursor.moveToNext()) {
            Question content = new Question(
                    cursor.getInt(cursor.getColumnIndex(Question.id_column)),

                    cursor.getString(cursor.getColumnIndex(Question.question_column))
            );

            question.add(content);
        }
        cursor.close();
        return question;
    }

    public List<Choice> getAllchoices() {
        List<Choice> choice = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from " + Choice.choice_column,null);

        while (cursor.moveToNext()) {
            Choice content = new Choice(
                    cursor.getInt(cursor.getColumnIndex(Choice.id_column)),

                    cursor.getString(cursor.getColumnIndex(Choice.choice_column))
            );

            choice.add(content);
        }
        cursor.close();
        return choice;
    }

    public List<correctChoice> getAllCorrectChoices() {
        List<correctChoice> choice = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from " + Choice.choice_column,null);

        while (cursor.moveToNext()) {
            correctChoice content = new correctChoice(
                    cursor.getInt(cursor.getColumnIndex(correctChoice.id_column)),

                    cursor.getString(cursor.getColumnIndex(correctChoice.choice_column))
            );

            choice.add(content);

            return choice;

        }

//    public String getQuestion(Tables category){
//         String value = Tables.subject_column
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery("select ")
//        Tables content = new Tables(
//
//                cursor.getString(cursor.getColumnIndex(Tables.subject_column)),
//                Tables.getSubject(cursor.getColumnIndex((Tables.subject_column)))
//    }

    }
}