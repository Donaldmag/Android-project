
interface  Tables {
    public class Tables {
        public static final String TABLE_NAME = "Data";

        public static final String subject_column = "text";
        public static final String question_column = "text";

        private int id;
        private String subject;
        private Question[] questions;

        public static final String CREATE_TABLE =
                "CREATE TABLE" + TABLE_NAME + "("
                        + subject_column + "varchar primary key not null,"
                        + question_column + "varchar not null,"
                        + ")";

        public Tables(String subject) {
            this.subject = subject;
            questions = new Question[20];

        }
        //methods

        public String getSubject() {
            return subject;
        }

        public Question[] getQuestions() {
            return questions;
        }
    }


    class Question {
        public static final String TABLE_NAME1 = "Data2";

        public static final String id_column = "id";
        public static final String question_column = "text";

        public static final String CREATE_TABLE1 =
                "CREATE TABLE" + TABLE_NAME1 + "("
                        + id_column + "int serial key,"
                        + question_column + "varchar not null,"
                        + ")";

        private int id;
        private String question;
        private Choice[] choices;

        public Question(int id,String question) {
            this.id = id;
            this.question = question;
            choices = new Choice[20];
        }

        //methods


        public int getId() {
            return id;
        }

        public String getQuestion() {
            return question;
        }

        public Choice[] getChoices() {
            return choices;
        }
    }

    class Choice {
        public static final String id_column = "id";
        public static final String choice_column = "text";

        public static final String TABLE_NAME2 = "Data3";
        public static final String CREATE_TABLE3 =
                "CREATE TABLE" + TABLE_NAME2 + "("
                        + id_column + "int serial key,"
                        + choice_column + "varchar not null,"
                        + ")";

        private int id;
        private String choice;

        public Choice(int id,String choice) {
            this.id = id;
            this.choice = choice;
        }

        //methods


        public int getId() {
            return id;
        }

        public String getChoice() {
            return choice;
        }
    }

    class correctChoice {
        public static final String id_column = "id";
        public static final String choice_column = "text";

        public static final String TABLE_NAME3 = "Data4";
        public static final String CREATE_TABLE4 =
                "CREATE TABLE" + TABLE_NAME3 + "("
                        + id_column + "int serial key,"
                        + choice_column + "varchar not null,"
                        + ")";

        private Choice choice00;
        public int id;
        public String choice01;

        public correctChoice(int anInt,String string) {
            this.choice00 = new Choice(id,choice01);
        }

        //method


        public String getChoice01() {
            return choice01;
        }
    }
}
